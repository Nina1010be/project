package com.example.project.Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Product {
    private IntegerProperty idProduct;
    private IntegerProperty idMasterProduct;
    private IntegerProperty idModelProduct;
    private IntegerProperty idStatusProduct;
    private StringProperty typeProduct;
    private StringProperty nameMasterProduct;
    private IntegerProperty quantityProduct;
    private StringProperty statusProduct;
    private IntegerProperty priceProduct;

    public Product(IntegerProperty idProduct, IntegerProperty idMasterProduct, IntegerProperty idModelProduct, IntegerProperty idStatusProduct, StringProperty typeProduct, StringProperty nameMasterProduct, IntegerProperty quantityProduct, StringProperty statusProduct, IntegerProperty priceProduct) {
        this.idProduct = idProduct;
        this.idMasterProduct = idMasterProduct;
        this.idModelProduct = idModelProduct;
        this.idStatusProduct = idStatusProduct;
        this.typeProduct = typeProduct;
        this.nameMasterProduct = nameMasterProduct;
        this.quantityProduct = quantityProduct;
        this.statusProduct = statusProduct;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct.get();
    }

    public IntegerProperty idProductProperty() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct.set(idProduct);
    }

    public int getIdMasterProduct() {
        return idMasterProduct.get();
    }

    public IntegerProperty idMasterProductProperty() {
        return idMasterProduct;
    }

    public void setIdMasterProduct(int idMasterProduct) {
        this.idMasterProduct.set(idMasterProduct);
    }

    public int getIdModelProduct() {
        return idModelProduct.get();
    }

    public IntegerProperty idModelProductProperty() {
        return idModelProduct;
    }

    public void setIdModelProduct(int idModelProduct) {
        this.idModelProduct.set(idModelProduct);
    }

    public int getIdStatusProduct() {
        return idStatusProduct.get();
    }

    public IntegerProperty idStatusProductProperty() {
        return idStatusProduct;
    }

    public void setIdStatusProduct(int idStatusProduct) {
        this.idStatusProduct.set(idStatusProduct);
    }

    public String getTypeProduct() {
        return typeProduct.get();
    }

    public StringProperty typeProductProperty() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct.set(typeProduct);
    }

    public String getNameMasterProduct() {
        return nameMasterProduct.get();
    }

    public StringProperty nameMasterProductProperty() {
        return nameMasterProduct;
    }

    public void setNameMasterProduct(String nameMasterProduct) {
        this.nameMasterProduct.set(nameMasterProduct);
    }

    public int getQuantityProduct() {
        return quantityProduct.get();
    }

    public IntegerProperty quantityProductProperty() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct.set(quantityProduct);
    }

    public String getStatusProduct() {
        return statusProduct.get();
    }

    public StringProperty statusProductProperty() {
        return statusProduct;
    }

    public void setStatusProduct(String statusProduct) {
        this.statusProduct.set(statusProduct);
    }

    public int getPriceProduct() {
        return priceProduct.get();
    }

    public IntegerProperty priceProductProperty() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct.set(priceProduct);
    }
}
