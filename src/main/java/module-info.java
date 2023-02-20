module com.example.javafxtableexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtableexample to javafx.fxml;
    exports com.example.javafxtableexample;
}