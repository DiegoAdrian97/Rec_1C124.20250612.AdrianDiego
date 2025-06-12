package pasajes;

public class Colectivo extends VehiculoTransporte {
    public Colectivo(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }

    public double calcularCostoBase() {
        return 100.0;
    }
}