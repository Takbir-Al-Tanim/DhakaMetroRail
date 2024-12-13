module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.finalproject to javafx.fxml;
    exports com.example.finalproject;
}