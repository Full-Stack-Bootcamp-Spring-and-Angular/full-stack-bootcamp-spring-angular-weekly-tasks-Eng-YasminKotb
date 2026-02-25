package com.app.controller;

import com.app.dao.ProductDAOImpl;
import com.app.model.Product;
import com.app.model.ProductDetails;
import com.app.service.ProductService;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage() {
        return "homePage";
    }

    @RequestMapping(value = "/viewProducts", method = RequestMethod.GET)
    public String getAllProducts(Model model) {

        List<Product> products = productService.getAllProducts();

        model.addAttribute("productsList", products);

        return "viewProducts";
    }


    @RequestMapping(value = "/addProductForm", method = RequestMethod.GET)
    public String showAddProductForm(Model model) {
        //Binding product object to the form
        Product product = new Product();
        product.setProductDetails(new ProductDetails());

        model.addAttribute("productModel", product);
        return "addProductForm";
    }


    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public String saveProduct(
            @Valid @ModelAttribute("productModel") Product product,
            BindingResult bindingResult,
            @RequestParam(value = "productImage", required = false) MultipartFile file,
            HttpServletRequest request
            , Model model) {

        if (bindingResult.hasErrors()) {
            return "addProductForm";
        }

        if (file != null && !file.isEmpty()) {
            try {

                String uploadDir = request.getServletContext().getRealPath("/resources/images/products/");

                File dir = new File(uploadDir);
                if (!dir.exists()) dir.mkdirs();

                String filename = file.getOriginalFilename();

                file.transferTo(new File(uploadDir + filename));

                product.getProductDetails().setImagePath(filename);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        product.setProductName(product.getProductDetails().getProductName());

        productService.insert(product);

        return "redirect:/viewProducts";
    }

    @RequestMapping(value = "/productDetails", method = RequestMethod.GET)
    public String productDetails(@RequestParam("id") int id, Model model) {

        Product product = productService.getProductById(id);
        model.addAttribute("productDetailsModel", product);
        return "viewProductDetails";
    }

    @RequestMapping(value = "/updateProductForm", method = RequestMethod.GET)
    public String showUpdateProductForm(@RequestParam("id") int id, Model model) {

        Product product = productService.getProductById(id);

        if (product == null) {
            return "redirect:/viewProducts";
        }

        model.addAttribute("oldProductDetailsModel", product);

        return "updateProductForm";
    }

    @RequestMapping(value = "/saveUpdatedProduct", method = RequestMethod.POST)
    public String saveUpdatedProduct(
            @ModelAttribute("oldProductDetailsModel") Product product,
            @RequestParam(value = "productImage", required = false) MultipartFile file,
            @RequestParam("currentImagePath") String currentImagePath,
            HttpServletRequest request) {

        // Handle image upload
        if (file != null && !file.isEmpty()) {
            try {
                String uploadDir = request.getServletContext().getRealPath("/resources/images/products/");

                File dir = new File(uploadDir);
                if (!dir.exists()) dir.mkdirs();

                if (currentImagePath != null && !currentImagePath.isEmpty()) {
                    new File(uploadDir + currentImagePath).delete();
                }

                String filename = file.getOriginalFilename();
                file.transferTo(new File(uploadDir + filename));

                product.getProductDetails().setImagePath(filename);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            product.getProductDetails().setImagePath(currentImagePath);

        }


        product.setProductName(product.getProductDetails().getProductName());
        productService.update(product);

        return "redirect:/viewProducts";

    }

    @RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
    public String deleteProduct(@RequestParam("id") int id) {
        productService.deleteProduct(id);
        return "redirect:/viewProducts";
    }


}
