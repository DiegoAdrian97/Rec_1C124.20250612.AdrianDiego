package pasajes;

public class Subte extends VehiculoTransporte {
    public Subte(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }

    public double calcularCostoBase() {
        return 80.0;
    }
}