package com.example.project.Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Purchase {
    private IntegerProperty idProductPurchase;
    private IntegerProperty idPurchase;
    private IntegerProperty idClientPurchase;
    private StringProperty nameClientPurchase;
    private StringProperty typeProductPurchase;
    private IntegerProperty quantityProductPurchase;
    private StringProperty datePurchase;
    private IntegerProperty pricePurchase;


    public Purchase(IntegerProperty idProductPurchase, IntegerProperty idPurchase, IntegerProperty idClientPurchase, StringProperty nameClientPurchase, StringProperty typeProductPurchase, IntegerProperty quantityProductPurchase, StringProperty datePurchase, IntegerProperty pricePurchase) {
        this.idProductPurchase = idProductPurchase;
        this.idPurchase = idPurchase;
        this.idClientPurchase = idClientPurchase;
        this.nameClientPurchase = nameClientPurchase;
        this.typeProductPurchase = typeProductPurchase;
        this.quantityProductPurchase = quantityProductPurchase;
        this.datePurchase = datePurchase;
        this.pricePurchase = pricePurchase;
    }



    public int getIdPurchase() {
        return idPurchase.get();
    }

    public IntegerProperty idPurchaseProperty() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase.set(idPurchase);
    }

    public int getIdProductPurchase() {
        return idProductPurchase.get();
    }

    public IntegerProperty idProductPurchaseProperty() {
        return idProductPurchase;
    }

    public void setIdProductPurchase(int idProductPurchase) {
        this.idProductPurchase.set(idProductPurchase);
    }

    public int getIdClientPurchase() {
        return idClientPurchase.get();
    }

    public IntegerProperty idClientPurchaseProperty() {
        return idClientPurchase;
    }

    public void setIdClientPurchase(int idClientPurchase) {
        this.idClientPurchase.set(idClientPurchase);
    }

    public String getNameClientPurchase() {
        return nameClientPurchase.get();
    }

    public StringProperty nameClientPurchaseProperty() {
        return nameClientPurchase;
    }

    public void setNameClientPurchase(String nameClientPurchase) {
        this.nameClientPurchase.set(nameClientPurchase);
    }

    public String getTypeProductPurchase() {
        return typeProductPurchase.get();
    }

    public StringProperty typeProductPurchaseProperty() {
        return typeProductPurchase;
    }

    public void setTypeProductPurchase(String typeProductPurchase) {
        this.typeProductPurchase.set(typeProductPurchase);
    }

    public int getQuantityProductPurchase() {
        return quantityProductPurchase.get();
    }

    public IntegerProperty quantityProductPurchaseProperty() {
        return quantityProductPurchase;
    }

    public void setQuantityProductPurchase(int quantityProductPurchase) {
        this.quantityProductPurchase.set(quantityProductPurchase);
    }

    public String getDatePurchase() {
        return datePurchase.get();
    }

    public StringProperty datePurchaseProperty() {
        return datePurchase;
    }

    public void setDatePurchase(String datePurchase) {
        this.datePurchase.set(datePurchase);
    }

    public int getPricePurchase() {
        return pricePurchase.get();
    }

    public IntegerProperty pricePurchaseProperty() {
        return pricePurchase;
    }

    public void setPricePurchase(int pricePurchase) {
        this.pricePurchase.set(pricePurchase);
    }
}
