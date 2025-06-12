package pasajes;

public class Viaje implements Comparable<Viaje> {
    private String nombrePasajero;
    private Pasaje pasaje;
    private VehiculoTransporte vehiculo;

    public Viaje(String nombrePasajero, Pasaje pasaje, VehiculoTransporte vehiculo) {
        setNombrePasajero(nombrePasajero);
        this.pasaje = pasaje;
        this.vehiculo = vehiculo;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        if (nombrePasajero == null || nombrePasajero.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del pasajero no puede estar vacío");
        }
        this.nombrePasajero = nombrePasajero;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public VehiculoTransporte getVehiculo() {
        return vehiculo;
    }

    public double getCosto() {
        return pasaje.calcularCostoFinal();
    }

    public String toString() {
        return "Pasajero: " + nombrePasajero + " - " + vehiculo.toString() + " - " + pasaje.toString();
    }

    public int compareTo(Viaje otro) {
        return Double.compare(this.getCosto(), otro.getCosto());
    }
}