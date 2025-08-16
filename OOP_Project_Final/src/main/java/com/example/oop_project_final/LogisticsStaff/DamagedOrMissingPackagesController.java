package com.example.oop_project_final.LogisticsStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class DamagedOrMissingPackagesController
{
    @javafx.fxml.FXML
    private TextField packageIDTF;
    @javafx.fxml.FXML
    private AnchorPane damagedAnchorpane;
    @javafx.fxml.FXML
    private Label statusTA;
    @javafx.fxml.FXML
    private Button submitButtonOnClick;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private ComboBox issueTypeCB;

    @javafx.fxml.FXML
    public void initialize() {
        issueTypeCB.getItems().addAll("Damaged", "Missing");

    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
    }
}