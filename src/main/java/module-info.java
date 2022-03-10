module com.einsteincolombia.parqueaderoscrum {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.crypto;


    opens com.einsteincolombia.parqueaderoscrum to javafx.fxml;
    exports com.einsteincolombia.parqueaderoscrum;
    exports com.einsteincolombia.parqueaderoscrum.controller;
    opens com.einsteincolombia.parqueaderoscrum.controller to javafx.fxml;
}