package com.example.oop_project_final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    public void loginOnAction(ActionEvent event) {
        String username = usernameTextField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Username and password are required.");
            return;
        }

        if (username.equals("manager") && password.equals("password")) {
            errorLabel.setText("");

            try {
                // Corrected path to the FXML file
                FXMLLoader loader = new FXMLLoader(getClass().getResource("managerDashboard.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                errorLabel.setText("Failed to load the dashboard. Please contact support.");
            }
        } else {
            errorLabel.setText("Invalid username or password.");
        }
    }
}