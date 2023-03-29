package com.gestion.g61.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Product {
    @jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduct;
    private String labelProduct;

    private double priceProduct;
    private String dateProd;




    public Product(String labelProduct, double priceProduct, String dateProd) {
        this.labelProduct = labelProduct;
        this.priceProduct = priceProduct;
        this.dateProd = dateProd;
    }

    public Product() {}


    public String getLabelProduct() {
        return labelProduct;
    }

    public void setLabelProduct(String labelProduct) {
        this.labelProduct = labelProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDateProd() {
        return dateProd;
    }

    public void setDateProd(String dateProd) {
        this.dateProd = dateProd;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }


}
