
public class PasajeJubilado implements Pasaje {
    private VehiculoTransporte vehiculo;

    public PasajeJubilado(VehiculoTransporte vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase() * 0.25;
    }

    @Override
    public String toString() {
        return "Pasaje Jubilado - Costo: $" + calcularCostoFinal();
    }
}
