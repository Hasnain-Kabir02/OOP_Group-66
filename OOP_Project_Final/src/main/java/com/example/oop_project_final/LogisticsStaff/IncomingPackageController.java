package com.example.oop_project_final.LogisticsStaff;

import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class IncomingPackageController
{
    @javafx.fxml.FXML
    private TextField weightTF;
    @javafx.fxml.FXML
    private TextField senderIDTF;
    @javafx.fxml.FXML
    private TextField packageIDTF;
    @javafx.fxml.FXML
    private TextField receiverIDTF;
    @javafx.fxml.FXML
    private ComboBox typeCB;
    @javafx.fxml.FXML
    private ComboBox originCB;
    @javafx.fxml.FXML
    private ComboBox destinationCB;
    @javafx.fxml.FXML
    private Button saveIncomingPKGButton;
    @javafx.fxml.FXML
    private Label incomingStatusLabel;
    @javafx.fxml.FXML
    private ComboBox assignedWarehouseCB;
    @javafx.fxml.FXML
    private AnchorPane receiveDateDP;
    @javafx.fxml.FXML
    private DatePicker recieveDP;

    @javafx.fxml.FXML
    public void initialize() {
        originCB.getItems().addAll("Dhaka", "CTG", "Khulna", "Rajshahi");
        destinationCB.getItems().addAll("Dhaka", "CTG", "Khulna", "Rajshahi");
        typeCB.getItems().addAll("Mail", "Parcel");
        assignedWarehouseCB.getItems().addAll("Warehouse DHK", "Warehouse CTG", "Warehouse KHL", "Warehouse RAJ" );
    }}