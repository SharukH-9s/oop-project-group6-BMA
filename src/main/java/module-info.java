module com.example.group6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group6 to javafx.fxml;
    exports com.example.group6;
}