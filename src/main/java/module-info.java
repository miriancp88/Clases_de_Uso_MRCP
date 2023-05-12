module com.example.clasesdeuso_mrcp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clasesdeuso_mrcp to javafx.fxml;
    exports com.example.clasesdeuso_mrcp;
}