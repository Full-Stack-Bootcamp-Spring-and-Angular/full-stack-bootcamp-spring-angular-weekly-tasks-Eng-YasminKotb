package com.app.dao;

import com.app.model.Product;
import com.app.model.ProductDetails;

import java.util.List;

public interface ProductDAO {
    void insert(Product product); //done

    Product getById(int id);

    void deleteById(int id); //done

    Product update(Product product); //ala3l

    List<Product> getAllProducts();//done
}
