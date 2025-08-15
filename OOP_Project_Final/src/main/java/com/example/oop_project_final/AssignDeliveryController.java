package com.example.oop_project_final;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import com.example.oop_project_final.Staff;
import java.io.IOException;

public class AssignDeliveryController {

    @FXML
    private TableView<Parcel> unassignedParcelsTableView;
    @FXML
    private TableColumn<Parcel, String> parcelIdCol;
    @FXML
    private TableColumn<Parcel, String> recipientNameCol;
    @FXML
    private TableColumn<Parcel, String> destinationCol;
    @FXML
    private ComboBox<Staff> staffComboBox;
    @FXML
    private ListView<Parcel> selectedParcelsListView;

    private ObservableList<Parcel> unassignedParcels = FXCollections.observableArrayList();
    private ObservableList<Staff> staffList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Configure TableView for unassigned parcels
        parcelIdCol.setCellValueFactory(new PropertyValueFactory<>("parcelId"));
        recipientNameCol.setCellValueFactory(new PropertyValueFactory<>("recipientName"));
        destinationCol.setCellValueFactory(new PropertyValueFactory<>("destination"));
        unassignedParcelsTableView.setItems(unassignedParcels);

        // Allow multiple selection
        unassignedParcelsTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // Listen for table selections to update the ListView
        unassignedParcelsTableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedParcelsListView.setItems(unassignedParcelsTableView.getSelectionModel().getSelectedItems());
        });

        // Load data
        loadData();
    }

    // Create a StringConverter to convert a Staff object to a displayable string.
    staffComboBox.setConverter(new StringConverter<Staff>() {
        @Override
        public String toString(Staff Staff) {
            // Return the staff member's name to be displayed in the ComboBox.
            return (Staff != null) ? Staff.getName() : "";
        }

        @Override
        public Staff fromString(String string) {
            // This method is used when the user types in the combo box,
            // which isn't needed for this use case, so we can return null.
            return null;
        }

    private void loadData() {
        // Populate with dummy data for unassigned parcels
        unassignedParcels.addAll(
                new Parcel("P004", "Gigi Hadid", "123 Oak St, City A", "Pending Assignment"),
                new Parcel("P005", "Zayn Malik", "456 Pine Ave, City B", "Pending Assignment"),
                new Parcel("P006", "Taylor Swift", "789 Elm Blvd, City A", "Pending Assignment")
        );

        // Populate with dummy staff data
        staffList.addAll(
                new Staff("E001", "John Doe", "Delivery Rider", "Active"),
                new Staff("E003", "Peter Parker", "Delivery Rider", "Active")
        );
        staffComboBox.setItems(staffList);
    }

    @FXML
    public void handleAssignSelected(ActionEvent event) {

    }

    @FXML
    public void handleReturnToDashboard(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("managerDashboard.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}