package com.example.project.Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Master {
    private IntegerProperty idMaster;
    private StringProperty firstNameMaster;
    private StringProperty lastNameMaster;
    private StringProperty patronMaster;
    private StringProperty phoneNumberMaster;
    private StringProperty innMaster;


    public Master(IntegerProperty idMaster, StringProperty firstNameMaster, StringProperty lastNameMaster, StringProperty patronMaster, StringProperty phoneNumberMaster, StringProperty innMaster) {
        this.idMaster = idMaster;
        this.firstNameMaster = firstNameMaster;
        this.lastNameMaster = lastNameMaster;
        this.patronMaster = patronMaster;
        this.phoneNumberMaster = phoneNumberMaster;
        this.innMaster = innMaster;


    }
    public void setIdMaster(int idMaster) {
        this.idMaster.set(idMaster);
    }

    public void setFirstNameMaster(String firstNameMaster) {
        this.firstNameMaster.set(firstNameMaster);
    }

    public void setLastNameMaster(String lastNameMaster) {
        this.lastNameMaster.set(lastNameMaster);
    }

    public void setPatronMaster(String patronMaster) {
        this.patronMaster.set(patronMaster);
    }

    public void setPhoneNumberMaster(String phoneNumberMaster) {
        this.phoneNumberMaster.set(phoneNumberMaster);
    }

    public void setInnMaster(String innMaster) {
        this.innMaster.set(innMaster);
    }

    public int getIdMaster() {
        return idMaster.get();
    }

    public IntegerProperty idMasterProperty() {
        return idMaster;
    }

    public String getFirstNameMaster() {
        return firstNameMaster.get();
    }

    public StringProperty firstNameMasterProperty() {
        return firstNameMaster;
    }

    public String getLastNameMaster() {
        return lastNameMaster.get();
    }

    public StringProperty lastNameMasterProperty() {
        return lastNameMaster;
    }

    public String getPatronMaster() {
        return patronMaster.get();
    }

    public StringProperty patronMasterProperty() {
        return patronMaster;
    }

    public String getPhoneNumberMaster() {
        return phoneNumberMaster.get();
    }

    public StringProperty phoneNumberMasterProperty() {
        return phoneNumberMaster;
    }

    public String getInnMaster() {
        return innMaster.get();
    }

    public StringProperty innMasterProperty() {
        return innMaster;
    }


}
