package pasajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static ArrayList<Viaje> viajes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    registrarViaje();
                    break;
                case 2:
                    mostrarViajes();
                    break;
                case 3:
                    ordenarPorCosto();
                    break;
                case 4:
                    ordenarPorNombre();
                    break;
                case 5:
                    mostrarTotalRecaudado();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Sistema de Pasajes ---");
        System.out.println("1. Registrar nuevo viaje");
        System.out.println("2. Mostrar todos los viajes");
        System.out.println("3. Ordenar viajes por costo");
        System.out.println("4. Ordenar viajes por nombre de pasajero");
        System.out.println("5. Mostrar total recaudado");
        System.out.println("6. Salir");
    }

    private static void registrarViaje() {
        System.out.print("Nombre del pasajero: ");
        String nombre = scanner.nextLine();
        System.out.println("Tipo de vehículo (1-Colectivo, 2-Tren, 3-Subte): ");
        int tipoVehiculo = leerEntero("Opción: ");
        scanner.nextLine(); // limpiar buffer

        System.out.print("Patente: ");
        String patente = scanner.nextLine();
        int capacidad = leerEntero("Capacidad: ");
        scanner.nextLine(); // limpiar buffer
        System.out.print("Empresa: ");
        String empresa = scanner.nextLine();

        VehiculoTransporte vehiculo = null;
        if (tipoVehiculo == 1)
            vehiculo = new Colectivo(patente, capacidad, empresa);
        else if (tipoVehiculo == 2)
            vehiculo = new Tren(patente, capacidad, empresa);
        else if (tipoVehiculo == 3)
            vehiculo = new Subte(patente, capacidad, empresa);
        else {
            System.out.println("Tipo de vehículo inválido.");
            return;
        }

        System.out.println("Tipo de pasaje (1-Común, 2-Estudiante, 3-Jubilado): ");
        int tipoPasaje = leerEntero("Opción: ");
        Pasaje pasaje = null;
        if (tipoPasaje == 1)
            pasaje = new PasajeComun(vehiculo);
        else if (tipoPasaje == 2)
            pasaje = new PasajeEstudiante(vehiculo);
        else if (tipoPasaje == 3)
            pasaje = new PasajeJubilado(vehiculo);
        else {
            System.out.println("Tipo de pasaje inválido.");
            return;
        }

        viajes.add(new Viaje(nombre, pasaje, vehiculo));
        System.out.println("Viaje registrado con éxito.");
    }

    private static void mostrarViajes() {
        if (viajes.isEmpty()) {
            System.out.println("No hay viajes registrados.");
        } else {
            for (Viaje v : viajes) {
                System.out.println(v);
            }
        }
    }

    private static void ordenarPorCosto() {
        Collections.sort(viajes);
        System.out.println("Viajes ordenados por costo.");
    }

    private static void ordenarPorNombre() {
        Collections.sort(viajes, new ComparadorNombre());
        System.out.println("Viajes ordenados por nombre de pasajero.");
    }

    private static void mostrarTotalRecaudado() {
        double total = 0;
        for (Viaje v : viajes) {
            total += v.getCosto();
        }
        System.out.println("Total recaudado: $" + total);
    }

    private static int leerEntero(String mensaje) {
        int valor = -1;
        while (true) {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(scanner.nextLine());
                if (valor <= 0) throw new NumberFormatException();
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
            }
        }
    }
}