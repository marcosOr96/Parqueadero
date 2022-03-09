import java.util.ArrayList;

public class Parqueadero {
    private ArrayList carros;
    private ArrayList motos;

    public Parqueadero() {
    }

    public Parqueadero(ArrayList carros, ArrayList motos) {
        this.carros = carros;
        this.motos = motos;
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
}
