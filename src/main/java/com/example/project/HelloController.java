package com.example.project;

import com.example.project.Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HelloController {

    public TableView<Client> clientTable;//При добавлении таблицы, она создается не типизированнаякакими-либо данными. Необходимо указать ей, что она будет хранить объекты классаStudent
    public TableColumn<Client, String> firstNameClient;
    public TableColumn<Client, String> lastNameClient;
    public TableColumn<Client, String> patronClient;
    public TableColumn<Client, String> phoneNumberClient;
    public TableColumn<Client, String> innClient;
    public TableColumn<Client, Integer> idClient;
    private ObservableList<Client> clients = FXCollections.observableArrayList();

    public TableView<Master> masterTable;
    public TableColumn<Master, String> firstNameMaster;
    public TableColumn<Master, String> lastNameMaster;
    public TableColumn<Master, String> patronMaster;
    public TableColumn<Master, String> phoneNumberMaster;
    public TableColumn<Master, String> innMaster;
    public TableColumn<Master, Integer> idMaster;
    private ObservableList<Master> masters = FXCollections.observableArrayList();

    public TableView<Model> modelTable;
    public TableColumn<Model, String> nameModel;
    public TableColumn<Model, String> materialModel;
    public TableColumn<Model, Integer> priceModel;
    public TableColumn<Model, String> pictureModel;
    public TableColumn<Model, Integer> idModel;
    private ObservableList<Model> models = FXCollections.observableArrayList();

    public TableView<Order> orderTable;
    public TableColumn<Order, String> nameClientOrder;
    public TableColumn<Order, String> nameMasterOrder;
    public TableColumn<Order, String> typeProductOrder;
    public TableColumn<Order, Integer> quantityProductOrder;
    public TableColumn<Order, String> statusOrder;
    public TableColumn<Order, Integer> priceOrder;
    public TableColumn<Order, Integer> idMasterOrder;
    public TableColumn<Order, Integer> idClientOrder;
    public TableColumn<Order, Integer> idModelOrder;
    public TableColumn<Order, Integer> idOrder;
    public TableColumn<Order, Integer> idStatusOrder;
    private ObservableList<Order> orders = FXCollections.observableArrayList();

    public TableView<Product> productTable;
    public TableColumn<Product, String> typeProduct;
    public TableColumn<Product, String> nameMasterProduct;
    public TableColumn<Product, Integer> quantityProduct;
    public TableColumn<Product, String> statusProduct;
    public TableColumn<Product, Integer> priceProduct;
    public TableColumn<Product, Integer> idProduct;
    public TableColumn<Product, Integer> idMasterProduct;
    public TableColumn<Product, Integer> idModelProduct;
    public TableColumn<Product, Integer> idStatusProduct;
    private ObservableList<Product> products = FXCollections.observableArrayList();

    public TableView<Purchase> purchaseTable;
    public TableColumn<Purchase, String> nameClientPurchase;
    public TableColumn<Purchase, String> typeProductPurchase;
    public TableColumn<Purchase, String> quantityProductPurchase;
    public TableColumn<Purchase, String> datePurchase;
    public TableColumn<Purchase, Integer> pricePurchase;
    public TableColumn<Purchase, Integer> idProductPurchase;
    public TableColumn<Purchase, Integer> idPurchase;
    public TableColumn<Purchase, Integer> idClientPurchase;
    private ObservableList<Purchase> purchases = FXCollections.observableArrayList();

    @FXML
    void initialize(){

        idClient.setCellValueFactory(cellData-> cellData.getValue().getIdClient().asObject());
        firstNameClient.setCellValueFactory(clientStringCellDataFeatures -> );
        lastNameClient.setCellValueFactory();
        patronClient.setCellValueFactory();
        phoneNumberClient.setCellValueFactory();
        innClient.setCellValueFactory();




    }




    public void onClickEditMaster(ActionEvent actionEvent) {
    }
}