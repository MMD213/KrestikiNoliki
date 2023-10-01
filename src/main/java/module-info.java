module com.example.krestikinoliki {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.krestikinoliki to javafx.fxml;
    exports com.example.krestikinoliki;
}