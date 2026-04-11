package com.app.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Entity
@Table(name = "product_details")
@Setter
@Getter
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "product_name")
    private String productName;

    @Column(name = "manufacturer")
    private String manufacturer;


    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "price")
    private double price;


    @Column(name = "available")
    private boolean available;

    @Column(name = "expiration_date")
    private Date expirationDate;
}

