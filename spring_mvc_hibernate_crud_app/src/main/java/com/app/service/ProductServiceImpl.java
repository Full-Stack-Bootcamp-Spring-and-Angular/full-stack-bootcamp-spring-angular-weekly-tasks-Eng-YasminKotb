package com.app.service;

import com.app.dao.ProductDAO;
import com.app.dao.ProductDAOImpl;
import com.app.model.Product;
import com.app.model.ProductDetails;
import com.app.rest.dto.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDAO productDAO;


    @Override
    public List<ProductResponseDTO> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Override
    public Product getProductById(int id) {
        return productDAO.getById(id);
    }

    @Override
    public void insert(Product product) {
        productDAO.insert(product);
    }

    @Override
    public Product update(Product product) {
        return productDAO.update(product);
    }

    @Override
    public void deleteProduct(int id) {
        productDAO.deleteById(id);
    }
}
