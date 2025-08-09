package com.example.oop_project_final;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewAllParcelsController {

    @FXML
    private TextField searchTextField;
    @FXML
    private TableView<Parcel> parcelsTableView;
    @FXML
    private TableColumn<Parcel, String> parcelIdCol;
    @FXML
    private TableColumn<Parcel, String> senderNameCol;
    @FXML
    private TableColumn<Parcel, String> recipientNameCol;
    @FXML
    private TableColumn<Parcel, String> statusCol;
    @FXML
    private TableColumn<Parcel, String> locationCol;
    @FXML
    private TableColumn<Parcel, String> lastUpdateCol;

    private ObservableList<Parcel> parcelList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Configure table columns
        parcelIdCol.setCellValueFactory(new PropertyValueFactory<>("parcelId"));
        senderNameCol.setCellValueFactory(new PropertyValueFactory<>("senderName"));
        recipientNameCol.setCellValueFactory(new PropertyValueFactory<>("recipientName"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        lastUpdateCol.setCellValueFactory(new PropertyValueFactory<>("lastUpdate"));

        // Load data into the table
        loadParcelData();
    }

    private void loadParcelData() {
        // This is where you would fetch data from a database or a service
        // For demonstration, we'll use dummy data
        parcelList.add(new Parcel("P001", "Alice", "Bob", "In Transit", "Warehouse A", "2025-08-06"));
        parcelList.add(new Parcel("P002", "Charlie", "David", "Delivered", "Branch B", "2025-08-05"));
        parcelList.add(new Parcel("P003", "Eve", "Frank", "Pending Pickup", "Branch C", "2025-08-06"));

        parcelsTableView.setItems(parcelList);
    }

    @FXML
    public void handleRefresh(ActionEvent event) {
        // Clear existing data and reload
        parcelList.clear();
        loadParcelData();
    }

    @FXML
    public void handleReturnToDashboard(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("managerDashboard.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}