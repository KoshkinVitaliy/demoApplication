module com.example.demoapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoapplication to javafx.fxml;
    exports com.example.demoapplication;
}