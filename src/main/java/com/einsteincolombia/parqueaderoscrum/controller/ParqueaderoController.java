package com.einsteincolombia.parqueaderoscrum.controller;

import com.einsteincolombia.parqueaderoscrum.fachada.Parqueadero;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ParqueaderoController implements Initializable {
    LocalDate currentDate;
    Parqueadero parking;
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

    //metodo para inicializar componentes ------------------------------------------------------------------------------

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        parking = new Parqueadero();
        comboBoxTipo.setItems(comboTipoContent);
        textModelo.addEventFilter(KeyEvent.ANY, handlerNumbers);    //permitimos sólo el ingreso de números
        currentDate = LocalDate.now();
        textFecha.setText(currentDate.toString());
    }

    //metodo boton agregar vehiculos -----------------------------------------------------------------------------------
    public void addVehicle(ActionEvent event){
        if(textPlaca.getText().isBlank() || textPlaca.getText().isBlank() || comboBoxTipo.getValue()==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("***** Error *****");
            alert.setHeaderText(null);
            alert.setContentText("llene todos los campos");
            alert.showAndWait();
        }else{
            boolean verifiedPlate = parking.checkPlate(textPlaca.getText(), comboBoxTipo.getSelectionModel().getSelectedIndex());
            boolean verifiedModel = parking.checkModel(Integer.parseInt(textModelo.getText()));
            if (!verifiedPlate) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("***** Error *****");
                alert.setHeaderText(null);
                alert.setContentText("Verifique la placa");
                alert.showAndWait();
            } else if (!verifiedModel) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("***** Error *****");
                alert.setHeaderText(null);
                alert.setContentText("Verifique el modelo");
                alert.showAndWait();
            } else {
                boolean aggregate = parking.addVehicle(textPlaca.getText(), textModelo.getText(), textFecha.getText(),
                        comboBoxTipo.getSelectionModel().getSelectedIndex());
                if (aggregate) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("***** Error *****");
                    alert.setHeaderText(null);
                    alert.setContentText("agegado corrctamente");
                    alert.showAndWait();
                }
            }
        }
    }

    //metodo para ingresar solo numero en los textfield ----------------------------------------------------------------
    EventHandler<KeyEvent> handlerNumbers = new EventHandler<KeyEvent>() {
        private boolean willConsume=false;
        private int maxLength=4;
        @Override
        public void handle(KeyEvent event) {
            TextField temp = (TextField) event.getSource();
            if(willConsume){
                event.consume();
            }
            if(!event.getText().matches("[0-9]") && event.getCode()!= KeyCode.BACK_SPACE){
                if(event.getEventType()==KeyEvent.KEY_PRESSED){
                    willConsume=true;
                }
                else if(event.getEventType()==KeyEvent.KEY_RELEASED){
                    willConsume=false;
                }
            }
            if(temp.getText().length()>maxLength-1){
                if(event.getEventType()==KeyEvent.KEY_PRESSED){
                    willConsume=true;
                }
                else if(event.getEventType()==KeyEvent.KEY_RELEASED){
                    willConsume=false;
                }
            }

        }
    };
}