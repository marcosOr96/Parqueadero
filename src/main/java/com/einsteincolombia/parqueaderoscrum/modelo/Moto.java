package com.einsteincolombia.parqueaderoscrum.modelo;

import javax.xml.crypto.Data;
import java.time.*;

public class Moto {
    private String plate;
    private String model;
    private String date;

    public Moto() {
    }

    public Moto(String plate, String model, String date) {
        this.plate = plate;
        this.model = model;
        this.date = date;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + plate + '\'' +
                ", modelo='" + model + '\'' +
                ", fecha='" + date + '\'' +
                '}';
    }
}
