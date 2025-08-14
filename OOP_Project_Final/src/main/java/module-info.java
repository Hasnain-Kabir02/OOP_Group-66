module com.example.oop_project_final {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_project_final to javafx.fxml;
    opens com.example.oop_project_final.Inspector to javafx.fxml, javafx.base;
    opens com.example.oop_project_final.LogisticsStaff to javafx.fxml, javafx.base;
    exports com.example.oop_project_final;
}