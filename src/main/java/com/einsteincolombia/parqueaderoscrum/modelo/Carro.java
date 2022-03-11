package com.einsteincolombia.parqueaderoscrum.modelo;

import javax.xml.crypto.Data;
import java.time.*;

public class Carro {
    private String placa;
    private String modelo;
    private String fecha;

    public Carro() {
    }

    public Carro(String placa, String modelo, String fecha) {
        this.placa = placa;
        this.modelo = modelo;
        this.fecha = fecha;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
