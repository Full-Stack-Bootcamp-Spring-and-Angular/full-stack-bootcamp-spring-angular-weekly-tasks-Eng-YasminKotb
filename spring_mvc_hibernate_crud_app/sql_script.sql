CREATE DATABASE product_db;
USE product_db;

CREATE TABLE product_details(
                                 id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                                 product_name varchar(255) NOT NULL,
                                 manufacturer varchar(255) NOT NULL,
                                 image_path VARCHAR(255) NOT NULL ,
                                 price DECIMAL(6,2) NOT NULL,
                                 available TINYINT(1) NOT NULL,
                                 expiration_date DATE

);

 CREATE TABLE product(
                        id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                        product_details_id INT NOT NULL ,
                        product_name VARCHAR(255) NOT NULL,
                        FOREIGN KEY (product_details_id) REFERENCES product_details(id)
                         );





ALTER TABLE product ADD COLUMN product_name VARCHAR(255);
ALTER TABLE product_details ADD COLUMN image_path VARCHAR(255);