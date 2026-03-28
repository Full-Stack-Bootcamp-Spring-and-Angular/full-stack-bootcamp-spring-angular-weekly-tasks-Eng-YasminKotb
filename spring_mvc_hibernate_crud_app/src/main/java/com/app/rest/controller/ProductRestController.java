package com.app.rest.controller;

import com.app.mapper.ProductMapper;
import com.app.model.Product;
import com.app.rest.dto.ProductResponseDTO;
import com.app.service.ProductService;
import com.app.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductRestController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductResponseDTO> getAllProducts(){
        List<ProductResponseDTO> products = productService.getAllProducts();
        return products;
    }
}
