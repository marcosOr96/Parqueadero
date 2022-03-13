package com.einsteincolombia.parqueaderoscrum.modelo;

import javax.xml.crypto.Data;
import java.time.*;

public class Carro {
    private String plate;
    private int model;
    private String date;
    private double price;

    public Carro() {
    }

    public Carro(String plate, int model, String date, double price) {
        this.plate = plate;
        this.model = model;
        this.date = date;
        this.price=price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
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
        return "Carro{" +
                "placa='" + plate + '\'' +
                ", modelo='" + model + '\'' +
                ", fecha='" + date + '\'' +
                '}';
    }
}
