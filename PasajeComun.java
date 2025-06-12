package pasajes;

public class PasajeComun implements Pasaje {
    private VehiculoTransporte vehiculo;

    public PasajeComun(VehiculoTransporte vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase();
    }

    public String toString() {
        return "Pasaje Común - Costo: " + calcularCostoFinal();
    }
}