
import java.util.*;

public class SistemaPasajes {
    private static List<Viaje> viajes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1: registrarViaje(); break;
                case 2: mostrarViajes(); break;
                case 3: ordenarPorCosto(); break;
                case 4: ordenarPorNombre(); break;
                case 5: mostrarTotalRecaudado(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Sistema de Cobro de Pasajes ---");
        System.out.println("1. Registrar nuevo viaje");
        System.out.println("2. Mostrar todos los viajes");
        System.out.println("3. Ordenar viajes por costo");
        System.out.println("4. Ordenar viajes por nombre de pasajero");
        System.out.println("5. Mostrar total recaudado");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    private static void registrarViaje() {
        System.out.print("Nombre del pasajero: ");
        String nombre = scanner.nextLine();

        System.out.print("Tipo de vehículo (1-Colectivo, 2-Tren, 3-Subte): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Patente: ");
        String patente = scanner.nextLine();
        System.out.print("Capacidad: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Empresa: ");
        String empresa = scanner.nextLine();

        VehiculoTransporte vehiculo;
        if (tipo == 1) vehiculo = new Colectivo(patente, capacidad, empresa);
        else if (tipo == 2) vehiculo = new Tren(patente, capacidad, empresa);
        else vehiculo = new Subte(patente, capacidad, empresa);

        System.out.print("Tipo de pasaje (1-Común, 2-Estudiante, 3-Jubilado): ");
        int tipoPasaje = scanner.nextInt();
        scanner.nextLine();
        Pasaje pasaje;
        if (tipoPasaje == 1) pasaje = new PasajeComun(vehiculo);
        else if (tipoPasaje == 2) pasaje = new PasajeEstudiante(vehiculo);
        else pasaje = new PasajeJubilado(vehiculo);

        Viaje viaje = new Viaje(nombre, vehiculo, pasaje);
        viajes.add(viaje);
        System.out.println("¡Viaje registrado!");
    }

    private static void mostrarViajes() {
        for (Viaje v : viajes) {
            System.out.println("\n" + v);
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
}
