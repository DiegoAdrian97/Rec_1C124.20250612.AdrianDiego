
public class PasajeComun implements Pasaje {
    private VehiculoTransporte vehiculo;

    public PasajeComun(VehiculoTransporte vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase();
    }

    @Override
    public String toString() {
        return "Pasaje Común - Costo: $" + calcularCostoFinal();
    }
}
