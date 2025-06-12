package pasajes;

public abstract class VehiculoTransporte {
    private String patente;
    private int capacidad;
    private String empresa;

    public VehiculoTransporte(String patente, int capacidad, String empresa) {
        setPatente(patente);
        setCapacidad(capacidad);
        setEmpresa(empresa);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("Patente no puede estar vacía");
        }
        this.patente = patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("Capacidad debe ser mayor a 0");
        }
        this.capacidad = capacidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        if (empresa == null || empresa.trim().isEmpty()) {
            throw new IllegalArgumentException("Empresa no puede estar vacía");
        }
        this.empresa = empresa;
    }

    public abstract double calcularCostoBase();

    public String toString() {
        return "Patente: " + patente + ", Capacidad: " + capacidad + ", Empresa: " + empresa;
    }
}