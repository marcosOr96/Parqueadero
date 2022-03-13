package com.einsteincolombia.parqueaderoscrum.fachada;

import com.einsteincolombia.parqueaderoscrum.modelo.Carro;
import com.einsteincolombia.parqueaderoscrum.modelo.Moto;

import java.util.ArrayList;
import java.util.Locale;

public class Parqueadero {

    private ArrayList<Carro> car;
    private ArrayList<Moto> motorbike;

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
        if(model>1960 && model<=2023){
            verifiedModel=true;
        }
        return verifiedModel;
    }

    //metodo para agregar vehiculos en array list segun tipo -----------------------------------------------------------
    public boolean addVehicle(String plate, int model, String date, int vehicleType){
        boolean aggregate=false;
        double price=this.parkingPrice(vehicleType, model);
        boolean check=false;
        if (vehicleType == 0) {
            for (int i = 0; i < motorbike.size(); i++) {
                Moto search = motorbike.get(i);
                if (search.getPlate().equalsIgnoreCase(plate)) {
                    check=true;
                    break;
                }
            }
            if(!check) {
                motorbike.add(new Moto(plate, model, date, price));
                aggregate = true;
            }

        } else {
            for (int i=0;i<car.size();i++) {
                Carro search = car.get(i);
                if (search.getPlate().equalsIgnoreCase(plate)) {
                    check=true;
                    break;
                }
            }
            if(!check) {
                car.add(new Carro(plate, model, date, price));
                aggregate = true;
            }
        }
        return aggregate;
    }

    //metodo agregar valor por servicio de parqueadero -----------------------------------------------------------------
    private double parkingPrice(int vehicleType, int model){
        double price=0;
        if(vehicleType==0){
            if(model<2012){
                price=1000;
            }
            if(model>=2012 && model<2023){
                price=1200;
            }
            if(model==2023){
                price=1200*1.1;
            }
        }
        else{
            if(model<2012){
                price=2000;
            }
            if(model>=2012 && model<2023){
                price=2500;
            }
            if(model==2023){
                price=2500*1.2;
            }
        }
        return price;
    }

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
