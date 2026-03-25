package com.app.dao;

import com.app.model.Product;
import com.app.model.ProductDetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;


    //Get
    @Override
    public List<Product> getAllProducts() {
        Query query = null;
        String hql = "FROM Product";
        Session session = sessionFactory.getCurrentSession();
        try {
            return (List<Product>) session.createQuery(hql).list();

        } catch (Exception e) {
            throw new RuntimeException("Failed fetching", e);
        }
    }

    //GetById
    @Override
    public Product getById(int id) {

        Session session = sessionFactory.getCurrentSession();
        try {

            Product product = (Product) session.get(Product.class, id);
            return product;

        } catch (Exception e) {
            throw new RuntimeException("Failed fetching!", e);
        }
    }

    //Insert
    @Override
    public void insert(Product product) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(product); // Cascade saves ProductDetails also here

        } catch (Exception e) {
            throw new RuntimeException("Failed Insertion!", e);
        }
    }


    //Update
    @Override
    public Product update(Product product) {

        Session session = sessionFactory.getCurrentSession();

        try {

            session.update(product);
            return product;

        } catch (Exception e) {
            throw new RuntimeException("Update Entity Failed!", e);
        }
    }


    //Delete
    @Override
    public void deleteById(int id) {

        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.get(Product.class, id);
        try {
            session.delete(product);
        } catch (Exception e) {
            throw new RuntimeException("Failed Deletion!", e);
        }
    }

}
