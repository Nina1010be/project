package com.example.project.Controller;

import com.example.project.Model.Client;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClientController {
    @FXML
    private TextField firstNameClient;
    @FXML
    private TextField lastNameClient;
    @FXML
    private TextField patronClient;
    @FXML
    private TextField phoneNumberClient;
    @FXML
    private TextField innClient;

    private Stage dialogStage;
    private Client client;

}
