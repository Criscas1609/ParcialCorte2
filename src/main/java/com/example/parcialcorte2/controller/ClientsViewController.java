package com.example.parcialcorte2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ClientsViewController {

    ModelFactoryController mfc= ModelFactoryController.getInstance();

    String name;
    String email;
    String id;
    String phone;

    String age;
    @FXML
    private TextField ageInput;

    @FXML
    private TextField emailInput;

    @FXML
    private TextField idInput;

    @FXML
    private TextField nameInput;

    @FXML
    private TextField phoneInput;

    @FXML
    private Label tableArray;

    @FXML
    private Label tableSearch;

    @FXML
    void searchButton(ActionEvent event) {
        mfc.showSearch(tableSearch);
    }

    @FXML
    void buttonClients(ActionEvent event) {

    }

    @FXML
    void buttonEmployee(ActionEvent event) {

    }

    @FXML
    void buttonProducts(ActionEvent event) {

    }

    @FXML
    void buttonSells(ActionEvent event) {

    }
    @FXML
    void createClient(ActionEvent event) {
        getData();
        mfc.createNewClient(name, email, id, phone, age);
        showInformation();
    }

    @FXML
    void getData(){
        name = nameInput.getText();
        email = emailInput.getText();
        id = idInput.getText();
        phone = phoneInput.getText();
        age = ageInput.getText();
    }

    @FXML
    void showInformation(){
        mfc.showInformation(tableArray);
    }

}