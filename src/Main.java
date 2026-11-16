import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Equipo> listaEquipos = cargarEquiposReales();

        Equipo equipoActual = listaEquipos.get(0);
        int opcion;
        do {
            System.out.println("\n==========================================");
            System.out.println(" CRUD FIFAS - EQUIPO ACTUAL: " + equipoActual.getNombreEquipo().toUpperCase());
            System.out.println("==========================================");
            System.out.println("1. Cambiar de Equipo");
            System.out.println("2. ReadAllCSV (Ver Plantilla y Técnico)");
            System.out.println("3. ReadOneCSV (Buscar Jugador por ID)");
            System.out.println("4. SaveCSV (Agregar Jugador al equipo actual)");
            System.out.println("5. SaveCSV Equipo (Crear y agregar un Nuevo Equipo)"); // <--- NUEVA OPCIÓN
            System.out.println("6. Update (Actualizar Jugador)");
            System.out.println("7. Delete (Borrar Jugador)");
            System.out.println("8. Salir");
            System.out.print("Elija una opción: ");
            opcion = lector.nextInt();
            lector.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("\n--- SELECCIONE UN EQUIPO ---");
                    for (int i = 0; i < listaEquipos.size(); i++) {
                        System.out.println((i + 1) + ". " + listaEquipos.get(i).getNombreEquipo());
                    }
                    System.out.print("Elija el número del equipo: ");
                    int idx = lector.nextInt() - 1;
                    lector.nextLine();
                    if (idx >= 0 && idx < listaEquipos.size()) {
                        equipoActual = listaEquipos.get(idx);
                        System.out.println("¡Cambiado a " + equipoActual.getNombreEquipo() + " con éxito!");
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                    System.out.println("\n--- INFORMACIÓN DE " + equipoActual.getNombreEquipo().toUpperCase() + " ---");
                    if (equipoActual.getTecnicoEquipo() != null) {
                        System.out.println("Técnico: " + equipoActual.getTecnicoEquipo());
                    } else {
                        System.out.println("Técnico: No asignado.");
                    }
                    System.out.println("Plantilla de Jugadores:");
                    equipoActual.leerTodos();
                    break;
                case 3:
                    System.out.print("Ingrese el ID del jugador a buscar: ");
                    String idBusqueda = lector.nextLine();
                    Jugador encontrado = equipoActual.buscarJugadorPorId(idBusqueda);
                    if (encontrado != null) {
                        System.out.println("¡Encontrado!: " + encontrado);
                    } else {
                        System.out.println("Jugador no encontrado en este equipo.");
                    }
                    break;
                case 4:
                    System.out.print("ID del nuevo jugador: ");
                    String nuevoId = lector.nextLine();
                    System.out.print("Nombre del jugador: ");
                    String nuevoNom = lector.nextLine();
                    System.out.print("Dorsal: ");
                    int nuevoDor = lector.nextInt();
                    lector.nextLine();
                    System.out.print("País: ");
                    String nuevoPais = lector.nextLine();
                    Jugador nuevoJugador = new Jugador(nuevoNom, nuevoId, nuevoDor, Posicion.DELANTERO, LocalDate.of(2000, 1, 1), nuevoPais);
                    equipoActual.agregarJugador(nuevoJugador);
                    System.out.println("¡Jugador agregado exitosamente a la plantilla!");
                    break;
                case 5:
                    System.out.println("\n--- REGISTRAR NUEVO EQUIPO (SaveCSV Equipo) ---");
                    System.out.print("Ingrese el nombre del nuevo equipo: ");
                    String nombreNuevoEquipo = lector.nextLine();
                    System.out.print("Nombre del director técnico: ");
                    String nombreTec = lector.nextLine();
                    System.out.print("ID del técnico: ");
                    String idTec = lector.nextLine();
                    System.out.print("País del técnico: ");
                    String paisTec = lector.nextLine();
                    Equipo nuevoEquipo = new Equipo(nombreNuevoEquipo);
                    Tecnico tecnicoNuevo = new Tecnico(nombreTec, idTec, nombreNuevoEquipo, paisTec);
                    nuevoEquipo.setTecnicoEquipo(tecnicoNuevo);
                    listaEquipos.add(nuevoEquipo);
                    equipoActual = nuevoEquipo;
                    System.out.println("¡Equipo '" + nombreNuevoEquipo + "' creado exitosamente y seleccionado como actual!");
                    break;
                case 6:
                    System.out.print("Ingrese el ID del jugador a actualizar: ");
                    String idAct = lector.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nomAct = lector.nextLine();
                    System.out.print("Nuevo dorsal: ");
                    int dorAct = lector.nextInt();
                    lector.nextLine();
                    if (equipoActual.actualizarJugador(idAct, nomAct, dorAct)) {
                        System.out.println("¡Jugador actualizado correctamente!");
                    } else {
                        System.out.println("No se encontró un jugador con ese ID.");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el ID del jugador a eliminar (Delete): ");
                    String idDel = lector.nextLine();
                    if (equipoActual.eliminarJugador(idDel)) {
                        System.out.println("¡Jugador eliminado del equipo!");
                    } else {
                        System.out.println("No se encontró el jugador.");
                    }
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
        lector.close();
    }
}