package com.gestion.g61.controller;

import com.gestion.g61.model.Product;
import com.gestion.g61.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
public class ProductController {
    private final ProductRepository repository;

    ProductController(ProductRepository repository){
        this.repository=repository;
    }


    @PostMapping("/Products")
    Product newProd(Product newProduct)throws IOException, ParseException {
        SimpleDateFormat dateParser = new SimpleDateFormat ("yyyy-MM-dd");
        String date=newProduct.getDateProd();
        java.util.Date dn = dateParser.parse(date);
        SimpleDateFormat dateFormatter = new SimpleDateFormat ("yyyy-MM-dd");
        newProduct.setDateProd(dateFormatter.format(dn));
        return repository.save(newProduct);
    }
}
