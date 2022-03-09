import javax.xml.crypto.Data;
import java.time.*;

public class Moto {
    private String placa;
    private String modelo;
    private  LocalDate fecha;

    public Moto() {
    }

    public Moto(String placa, String modelo, LocalDate fecha) {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
