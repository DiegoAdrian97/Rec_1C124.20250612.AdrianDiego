
public abstract class VehiculoTransporte {
    private String patente;
    private int capacidad;
    private String empresa;

    public VehiculoTransporte(String patente, int capacidad, String empresa) {
        if (patente == null || patente.isEmpty()) patente = "Falta la patente";
        if (capacidad <= 0) capacidad = 1;
        if (empresa == null || empresa.isEmpty()) empresa = "Falta la empresa";

        this.patente = patente;
        this.capacidad = capacidad;
        this.empresa = empresa;
    }

    public abstract double calcularCostoBase();

    public String getPatente() { return patente; }
    public int getCapacidad() { return capacidad; }
    public String getEmpresa() { return empresa; }

    public void setPatente(String patente) {
        if (patente != null && !patente.isEmpty()) this.patente = patente;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad > 0) this.capacidad = capacidad;
    }

    public void setEmpresa(String empresa) {
        if (empresa != null && !empresa.isEmpty()) this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Patente: " + patente + ", Capacidad: " + capacidad + ", Empresa: " + empresa;
    }
}
