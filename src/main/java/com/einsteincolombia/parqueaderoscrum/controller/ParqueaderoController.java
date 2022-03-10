package com.einsteincolombia.parqueaderoscrum.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ParqueaderoController implements Initializable {

    @FXML private TextField textPlaca;
    @FXML private TextField textModelo;
    @FXML private TextField textFecha;
    @FXML private TextField textCantMotos;
    @FXML private TextField textCantCarros;
    @FXML private ComboBox<String> comboBoxTipo;
    @FXML private Button buttonAgregar;
    @FXML private Button buttonLimpiar;
    @FXML private Button buttonReiniciar;
    @FXML private Button buttonTotalizar;
    @FXML private Label labelResultado;

    ObservableList<String> comboTipoContent =
            FXCollections.observableArrayList(
                    "Moto",
                    "Carro"
            );

    public ParqueaderoController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBoxTipo.setItems(comboTipoContent);
    }
}