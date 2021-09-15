package com.example.project.Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Order {
    private IntegerProperty idOrder;
    private IntegerProperty idMasterOrder;
    private IntegerProperty idClientOrder;
    private IntegerProperty idModelOrder;
    private IntegerProperty idStatusOrder;
    private StringProperty nameClientOrder;
    private StringProperty nameMasterOrder;
    private StringProperty typeProductOrder;
    private IntegerProperty quantityProductOrder;
    private StringProperty statusOrder;
    private IntegerProperty priceOrder;

    public Order(IntegerProperty idOrder, IntegerProperty idMasterOrder, IntegerProperty idClientOrder, IntegerProperty idModelOrder, IntegerProperty idStatusOrder, StringProperty nameClientOrder, StringProperty nameMasterOrder, StringProperty typeProductOrder, IntegerProperty quantityProductOrder, StringProperty statusOrder, IntegerProperty priceOrder) {
        this.idOrder = idOrder;
        this.idMasterOrder = idMasterOrder;
        this.idClientOrder = idClientOrder;
        this.idModelOrder = idModelOrder;
        this.idStatusOrder = idStatusOrder;
        this.nameClientOrder = nameClientOrder;
        this.nameMasterOrder = nameMasterOrder;
        this.typeProductOrder = typeProductOrder;
        this.quantityProductOrder = quantityProductOrder;
        this.statusOrder = statusOrder;
        this.priceOrder = priceOrder;
    }

    public int getIdOrder() {
        return idOrder.get();
    }

    public IntegerProperty idOrderProperty() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder.set(idOrder);
    }

    public int getIdMasterOrder() {
        return idMasterOrder.get();
    }

    public IntegerProperty idMasterOrderProperty() {
        return idMasterOrder;
    }

    public void setIdMasterOrder(int idMasterOrder) {
        this.idMasterOrder.set(idMasterOrder);
    }

    public int getIdClientOrder() {
        return idClientOrder.get();
    }

    public IntegerProperty idClientOrderProperty() {
        return idClientOrder;
    }

    public void setIdClientOrder(int idClientOrder) {
        this.idClientOrder.set(idClientOrder);
    }

    public int getIdModelOrder() {
        return idModelOrder.get();
    }

    public IntegerProperty idModelOrderProperty() {
        return idModelOrder;
    }

    public void setIdModelOrder(int idModelOrder) {
        this.idModelOrder.set(idModelOrder);
    }

    public int getIdStatusOrder() {
        return idStatusOrder.get();
    }

    public IntegerProperty idStatusOrderProperty() {
        return idStatusOrder;
    }

    public void setIdStatusOrder(int idStatusOrder) {
        this.idStatusOrder.set(idStatusOrder);
    }

    public String getNameClientOrder() {
        return nameClientOrder.get();
    }

    public StringProperty nameClientOrderProperty() {
        return nameClientOrder;
    }

    public void setNameClientOrder(String nameClientOrder) {
        this.nameClientOrder.set(nameClientOrder);
    }

    public String getNameMasterOrder() {
        return nameMasterOrder.get();
    }

    public StringProperty nameMasterOrderProperty() {
        return nameMasterOrder;
    }

    public void setNameMasterOrder(String nameMasterOrder) {
        this.nameMasterOrder.set(nameMasterOrder);
    }

    public String getTypeProductOrder() {
        return typeProductOrder.get();
    }

    public StringProperty typeProductOrderProperty() {
        return typeProductOrder;
    }

    public void setTypeProductOrder(String typeProductOrder) {
        this.typeProductOrder.set(typeProductOrder);
    }

    public int getQuantityProductOrder() {
        return quantityProductOrder.get();
    }

    public IntegerProperty quantityProductOrderProperty() {
        return quantityProductOrder;
    }

    public void setQuantityProductOrder(int quantityProductOrder) {
        this.quantityProductOrder.set(quantityProductOrder);
    }

    public String getStatusOrder() {
        return statusOrder.get();
    }

    public StringProperty statusOrderProperty() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder.set(statusOrder);
    }

    public int getPriceOrder() {
        return priceOrder.get();
    }

    public IntegerProperty priceOrderProperty() {
        return priceOrder;
    }

    public void setPriceOrder(int priceOrder) {
        this.priceOrder.set(priceOrder);
    }
}
