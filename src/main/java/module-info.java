module com.example.lab17fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab17fx to javafx.fxml;
    exports com.example.lab17fx;
}