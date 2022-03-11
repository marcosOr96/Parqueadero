package com.einsteincolombia.parqueaderoscrum.modelo;

import javax.xml.crypto.Data;
import java.time.*;

public class Moto {
    private String placa;
    private String modelo;
    private String fecha;

    public Moto() {
    }

    public Moto(String placa, String modelo, String fecha) {
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
        return "Moto{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
