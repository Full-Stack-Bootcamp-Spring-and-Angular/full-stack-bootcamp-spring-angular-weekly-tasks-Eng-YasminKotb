package com.app.model;

import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "product_details")
@Setter
@Getter
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Product's name can not be empty!")
    @Size(min = 2, max = 15)
    @Column(name = "product_name")
    private String productName;

    @NotNull(message = "Manufacturer can not be empty!")
    @Size(min = 2, max = 15)
    @Column(name = "manufacturer")
    private String manufacturer;


    @Column(name = "image_path")
    @NotNull(message = "Product's image can not be empty!")
    private String imagePath;

    @Min(value = 1, message = "Price must be positive")
    @Column(name = "price")
    private double price;


    @Column(name = "available")
    private boolean available;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Temporal(TemporalType.DATE)
    @NotNull(message = "Expiration Date can not be empty!")
    @Column(name = "expiration_date")
    private Date expirationDate;


}
