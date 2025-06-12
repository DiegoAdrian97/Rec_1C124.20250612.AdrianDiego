package pasajes;

public class PasajeEstudiante implements Pasaje {
    private VehiculoTransporte vehiculo;

    public PasajeEstudiante(VehiculoTransporte vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase() * 0.5;
    }

    public String toString() {
        return "Pasaje Estudiante - Costo: " + calcularCostoFinal();
    }
}