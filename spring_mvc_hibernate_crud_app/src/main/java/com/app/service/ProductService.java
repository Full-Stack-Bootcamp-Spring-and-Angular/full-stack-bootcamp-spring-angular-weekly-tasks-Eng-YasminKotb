package com.app.service;

import com.app.model.Product;
import com.app.model.ProductDetails;
import com.app.rest.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {

    List<ProductResponseDTO> getAllProducts();

    Product getProductById(int id);

    void insert(Product product);

    Product update(Product product);

    void deleteProduct(int id);

}
