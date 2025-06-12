
public class Tren extends VehiculoTransporte {
    public Tren(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }

    public double calcularCostoBase() {
        return 150.0;
    }
}
