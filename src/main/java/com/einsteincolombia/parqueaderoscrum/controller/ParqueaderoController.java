package com.einsteincolombia.parqueaderoscrum.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ParqueaderoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}