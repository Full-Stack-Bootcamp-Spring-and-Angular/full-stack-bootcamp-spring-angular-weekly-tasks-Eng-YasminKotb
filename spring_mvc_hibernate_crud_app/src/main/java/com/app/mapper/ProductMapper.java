package com.app.mapper;

import com.app.model.Product;
import com.app.rest.dto.ProductResponseDTO;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Component
public class ProductMapper {

    public static ProductResponseDTO toResponseDTO(Product product){
           ProductResponseDTO dto =new ProductResponseDTO();
           dto.setId(product.getId());
           dto.setProductName(product.getProductName());
           dto.setAvailable(product.getProductDetails().isAvailable());
           dto.setPrice(product.getProductDetails().getPrice());
           dto.setImagePath(product.getProductDetails().getImagePath());
           dto.setManufacturer(product.getProductDetails().getManufacturer());

           //Date conversion
           Date date=product.getProductDetails().getExpirationDate();
           SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
           String expirationDate=formatter.format(date);
           dto.setExpirationDate(expirationDate);

           return dto;
    }
}
