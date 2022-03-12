package com.einsteincolombia.parqueaderoscrum.fachada;

import com.einsteincolombia.parqueaderoscrum.modelo.Carro;
import com.einsteincolombia.parqueaderoscrum.modelo.Moto;

import java.util.ArrayList;
import java.util.Locale;

public class Parqueadero {

    private ArrayList<Object> car;
    private ArrayList<Object> motorbike;

    public Parqueadero() {
        car = new ArrayList<>();
        motorbike = new ArrayList<>();
    }

    //metodo para verificar las placas según el tipo de vehiculo y formato de placa ------------------------------------
    public boolean checkPlate (String plate, int vehicleType){
        boolean verifiedPlate=false;
        if(vehicleType==0){
            if(plate.length()==5 && plate.matches("[A-Za-z]{3}+[0-9]{2}")){
                verifiedPlate=true;
            }
        }else{
            if(plate.length()==6 && plate.matches("[A-Za-z]{3}+[0-9]{3}")){
                verifiedPlate=true;
            }
        }
        return verifiedPlate;
    }

    //metodo para verificar que el modelo de vehiculo este entre los años 1960 y 2023 ----------------------------------
    public boolean checkModel (int model){
        boolean verifiedModel=false;
        if(model>1960 && model<2023){
            verifiedModel=true;
        }
        return verifiedModel;
    }

    //metodo para agregar vehiculos en array list segun tipo -----------------------------------------------------------
    public boolean addVehicle(String plate, String model, String date, int vehicleType){
        boolean aggregate=false;
        if(vehicleType==0){
            motorbike.add(new Moto(plate, model, date));
            aggregate=true;
        }
        else{
            car.add(new Carro(plate, model, date));
            aggregate=true;
        }
        return aggregate;
    }

    //metodo agregar valor por servicio de parqueadero -----------------------------------------------------------------


    public ArrayList getCar() {
        return car;
    }

    public void setCar(ArrayList car) {
        this.car = car;
    }

    public ArrayList getMotorbike() {
        return motorbike;
    }

    public void setMotorbike(ArrayList motorbike) {
        this.motorbike = motorbike;
    }

    @Override
    public String toString() {
        return "Parqueadero{" +
                "carros=" + car +
                ", motos=" + motorbike +
                '}';
    }
}
