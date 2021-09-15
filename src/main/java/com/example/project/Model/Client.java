package com.example.project.Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Client {
    private IntegerProperty idClient;//Они позволяет автоматические получать уведомления при любых изменениях переменных. Это позволяет поддерживать синхронность представления и данных.
    private StringProperty firstNameClient;
    private StringProperty lastNameClient;
    private StringProperty patronClient;
    private StringProperty phoneNumberClient;
    private StringProperty innClient;

    public Client(IntegerProperty idClient, StringProperty firstNameClient, StringProperty lastNameClient, StringProperty patronClient, StringProperty phoneNumberClient, StringProperty innClient) {
        this.idClient = idClient;
        this.firstNameClient = firstNameClient;
        this.lastNameClient = lastNameClient;
        this.patronClient = patronClient;
        this.phoneNumberClient = phoneNumberClient;
        this.innClient = innClient;
    }

    public void setIdClient(int idClient) {
        this.idClient.set(idClient);
    }

    public void setFirstNameClient(String firstNameClient) {
        this.firstNameClient.set(firstNameClient);
    }

    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient.set(lastNameClient);
    }

    public void setPatronClient(String patronClient) {
        this.patronClient.set(patronClient);
    }

    public void setPhoneNumberClient(String phoneNumberClient) {
        this.phoneNumberClient.set(phoneNumberClient);
    }

    public void setInnClient(String innClient) {
        this.innClient.set(innClient);
    }

    public int getIdClient() {
        return idClient.get();
    }

    public IntegerProperty idClientProperty() {
        return idClient;
    }

    public String getFirstNameClient() {
        return firstNameClient.get();
    }

    public StringProperty firstNameClientProperty() {
        return firstNameClient;
    }

    public String getLastNameClient() {
        return lastNameClient.get();
    }

    public StringProperty lastNameClientProperty() {
        return lastNameClient;
    }

    public String getPatronClient() {
        return patronClient.get();
    }

    public StringProperty patronClientProperty() {
        return patronClient;
    }

    public String getPhoneNumberClient() {
        return phoneNumberClient.get();
    }

    public StringProperty phoneNumberClientProperty() {
        return phoneNumberClient;
    }

    public String getInnClient() {
        return innClient.get();
    }

    public StringProperty innClientProperty() {
        return innClient;
    }
}
