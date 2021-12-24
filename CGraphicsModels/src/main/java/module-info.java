module com.example.cgraphicsmodels {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cgraphicsmodels to javafx.fxml;
    exports com.example.cgraphicsmodels;
}