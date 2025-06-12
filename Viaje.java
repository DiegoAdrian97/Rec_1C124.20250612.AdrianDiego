
public class Viaje implements Comparable<Viaje> {
    private String nombrePasajero;
    private VehiculoTransporte vehiculo;
    private Pasaje pasaje;

    public Viaje(String nombrePasajero, VehiculoTransporte vehiculo, Pasaje pasaje) {
        if (nombrePasajero == null || nombrePasajero.isEmpty()) {
            nombrePasajero = "Sin nombre";
        }
        this.nombrePasajero = nombrePasajero;
        this.vehiculo = vehiculo;
        this.pasaje = pasaje;
    }

    public double getCosto() {
        return pasaje.calcularCostoFinal();
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public VehiculoTransporte getVehiculo() {
        return vehiculo;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public int compareTo(Viaje otro) {
        return Double.compare(this.getCosto(), otro.getCosto());
    }

    @Override
    public String toString() {
        return "Pasajero: " + nombrePasajero + "\n" + vehiculo + "\n" + pasaje;
    }
}
