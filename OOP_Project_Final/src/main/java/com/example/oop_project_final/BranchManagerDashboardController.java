package com.example.oop_project_final;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class BranchManagerDashboardController {

    @FXML
    private Label inTransitLabel;
    @FXML
    private TableColumn<Staff, String> staffStatusCol;
    @FXML
    private Label totalParcelsLabel;
    @FXML
    private TableColumn<Staff, String> staffRoleCol;
    @FXML
    private ListView<String> activityLogListView;
    @FXML
    private Label deliveredLabel;
    @FXML
    private Label pendingPickupLabel;
    @FXML
    private TableColumn<Staff, String> staffIdCol;
    @FXML
    private TableColumn<Staff, String> staffNameCol;
    @FXML
    private TableView<Staff> staffTableView;

    // A placeholder for staff data
    private ObservableList<Staff> staffList = FXCollections.observableArrayList();
    // A placeholder for activity log data
    private ObservableList<String> activityLog = FXCollections.observableArrayList();

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    public void initialize() {
        // Set up the table columns
        staffIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        staffNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        staffRoleCol.setCellValueFactory(new PropertyValueFactory<>("role"));
        staffStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Populate the table with some sample data
        staffList.add(new Staff("E001", "John Doe", "Delivery Rider", "Active"));
        staffList.add(new Staff("E002", "Jane Smith", "Warehouse Staff", "Inactive"));
        staffTableView.setItems(staffList);

        // Populate the activity log with some sample data
        activityLog.add("08:00 AM - New parcel added (ID: P12345)");
        activityLog.add("09:15 AM - Rider John Doe assigned to delivery route");
        activityLog.add("10:30 AM - Parcel P67890 marked as delivered");
        activityLogListView.setItems(activityLog);

        // Update the dashboard labels with sample data
        totalParcelsLabel.setText("50");
        inTransitLabel.setText("15");
        deliveredLabel.setText("20");
        pendingPickupLabel.setText("10");
    }

    /**
     * Handles the action of the "View All Parcels" button.
     * This would typically open a new window or a new FXML view
     * showing a detailed list of all parcels.
     */
    @FXML
    public void handleViewParcels(ActionEvent actionEvent) {
        System.out.println("View All Parcels button clicked.");

        Parent root = null; // Declare 'root' here, initialized to null

        try {
            // Assign a value to 'root' inside the try block
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewAllParcels.fxml"));
            root = loader.load();

        } catch (IOException e) {
            // Handle the exception
            e.printStackTrace();
            return; // Exit the method if the FXML file can't be loaded
        }

        // Now 'root' is accessible here
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Handles the action of the "Assign Delivery" button.
     * This would likely open a dialog or a new view for assigning
     * parcels to a delivery rider.
     */
    @FXML
    public void handleAssignDelivery(ActionEvent actionEvent) {
        System.out.println("Assign Delivery button clicked");

        Parent root = null; // Declare 'root' here, initialized to null

        try {
            // Assign a value to 'root' inside the try block
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AssignDelivery.fxml"));
            root = loader.load();

        } catch (IOException e) {
            // Handle the exception
            e.printStackTrace();
            return; // Exit the method if the FXML file can't be loaded
        }

        // Now 'root' is accessible here
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Handles the action of the "Manage Staff" button.
     * This would navigate to a detailed staff management view.
     */
    @FXML
    public void handleManageStaff(ActionEvent actionEvent) {
        System.out.println("Manage Staff button clicked.");
        // Implement navigation to the staff management view
    }

    /**
     * Handles the action of the "Logout" button.
     * This typically closes the current dashboard and returns the user to the
     * login screen.
     */
    @FXML
    public void handleLogout(ActionEvent actionEvent) throws IOException {
        System.out.println("Logout button clicked.");
        // Load the login FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent root = loader.load();

        // Get the current stage and replace the scene
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}