package com.einsteincolombia.parqueaderoscrum.fachada;

import com.einsteincolombia.parqueaderoscrum.modelo.Carro;
import com.einsteincolombia.parqueaderoscrum.modelo.Moto;

import java.util.ArrayList;
import java.util.Locale;

public class Parqueadero {

    private ArrayList<Object> carros;
    private ArrayList<Object> motos;

    public Parqueadero() {
        carros = new ArrayList<>();
        motos = new ArrayList<>();
    }

    public boolean verificarPlaca (String placa, int tipoVehiculo){
        boolean placaVerificada=false;
        if(tipoVehiculo==0){
            if(placa.length()==5){
                placaVerificada=true;
            }
        }else{
            if(placa.length()==6){
                placaVerificada=true;
            }
        }
        return placaVerificada;
    }

    public boolean agregarVehiculo(String placa, String modelo, String fecha, int tipoVehiculo){
        boolean agregado=false;
        if(tipoVehiculo==0){
            motos.add(new Moto(placa, modelo, fecha));
            agregado=true;
        }
        else{
            carros.add(new Carro(placa, modelo, fecha));
            agregado=true;
        }
        return agregado;
    }

    public ArrayList getCarros() {
        return carros;
    }

    public void setCarros(ArrayList carros) {
        this.carros = carros;
    }

    public ArrayList getMotos() {
        return motos;
    }

    public void setMotos(ArrayList motos) {
        this.motos = motos;
    }

    @Override
    public String toString() {
        return "Parqueadero{" +
                "carros=" + carros +
                ", motos=" + motos +
                '}';
    }
}
