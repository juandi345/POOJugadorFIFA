import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // 1. Cargamos todos los equipos base (los que tú metes)
        ArrayList<Equipo> equiposDisponibles = cargarEquiposReales();

        // 2. Cargamos las ligas iniciales usando esos equipos
        ArrayList<Liga> listaLigas = cargarLigasIniciales(equiposDisponibles);

        Liga ligaActual = listaLigas.get(0);
        Equipo equipoActual = ligaActual.getEquiposParticipantes().get(0);

        int opcion;
        do {
            System.out.println("\n=======================================================");
            System.out.println(" LIGA ACTUAL: " + ligaActual.getNombreLiga().toUpperCase() +
                    " | EQUIPO: " + equipoActual.getNombreEquipo().toUpperCase());
            System.out.println("=======================================================");
            System.out.println("--- GESTIÓN DE LIGAS ---");
            System.out.println("1. Cambiar de Liga (y ver sus equipos)");
            System.out.println("2. Crear una Nueva Liga propia");
            System.out.println("3. Inscribir un Equipo existente a la Liga actual");
            System.out.println("--- GESTIÓN DE EQUIPOS Y JUGADORES ---");
            System.out.println("4. Cambiar de Equipo dentro de la Liga actual");
            System.out.println("5. Crear un Nuevo Equipo (y meterlo a la Liga actual)");
            System.out.println("6. Ver Plantilla y Técnico del equipo actual");
            System.out.println("7. Agregar Jugador al equipo actual");
            System.out.println("8. Actualizar o Eliminar Jugador");
            System.out.println("9. Salir");
            System.out.print("Elija una opción: ");
            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- LIGAS DISPONIBLES ---");
                    for (int i = 0; i < listaLigas.size(); i++) {
                        System.out.println((i + 1) + ". " + listaLigas.get(i).getNombreLiga() +
                                " (" + listaLigas.get(i).getPais() + ")");
                    }
                    System.out.print("Seleccione el número de la liga: ");
                    int idxLiga = lector.nextInt() - 1;
                    lector.nextLine();
                    if (idxLiga >= 0 && idxLiga < listaLigas.size()) {
                        ligaActual = listaLigas.get(idxLiga);
                        ligaActual.mostrarTablaEquipos();
                        if (!ligaActual.getEquiposParticipantes().isEmpty()) {
                            equipoActual = ligaActual.getEquiposParticipantes().get(0);
                        } else {
                            equipoActual = new Equipo("Sin equipo seleccionado");
                        }
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- CREAR LIGA PROPIA ---");
                    System.out.print("Nombre de la nueva liga: ");
                    String nomLiga = lector.nextLine();
                    System.out.print("País o región de la liga: ");
                    String paisLiga = lector.nextLine();

                    Liga nuevaLiga = new Liga(nomLiga, paisLiga);
                    listaLigas.add(nuevaLiga);
                    ligaActual = nuevaLiga;
                    equipoActual = new Equipo("Sin equipo seleccionado");
                    System.out.println("¡Liga '" + nomLiga + "' creada! Ahora usa la opción 3 o 5 para meterle equipos.");
                    break;

                case 3:
                    System.out.println("\n--- INSCRIBIR EQUIPO EN " + ligaActual.getNombreLiga().toUpperCase() + " ---");
                    for (int i = 0; i < equiposDisponibles.size(); i++) {
                        System.out.println((i + 1) + ". " + equiposDisponibles.get(i).getNombreEquipo());
                    }
                    System.out.print("Elija el número del equipo que desea agregar a esta liga: ");
                    int idxEqGlobal = lector.nextInt() - 1;
                    lector.nextLine();
                    if (idxEqGlobal >= 0 && idxEqGlobal < equiposDisponibles.size()) {
                        Equipo eqSeleccionado = equiposDisponibles.get(idxEqGlobal);
                        if (ligaActual.agregarEquipo(eqSeleccionado)) {
                            equipoActual = eqSeleccionado;
                            System.out.println("¡" + eqSeleccionado.getNombreEquipo() + " inscrito en " + ligaActual.getNombreLiga() + "!");
                        } else {
                            System.out.println("Ese equipo ya está inscrito en esta liga.");
                        }
                    } else {
                        System.out.println("Número de equipo inválido.");
                    }
                    break;

                case 4:
                    ArrayList<Equipo> equiposEnLiga = ligaActual.getEquiposParticipantes();
                    if (equiposEnLiga.isEmpty()) {
                        System.out.println("Esta liga no tiene equipos todavía. Agrega uno primero.");
                        break;
                    }
                    System.out.println("\n--- EQUIPOS EN " + ligaActual.getNombreLiga().toUpperCase() + " ---");
                    for (int i = 0; i < equiposEnLiga.size(); i++) {
                        System.out.println((i + 1) + ". " + equiposEnLiga.get(i).getNombreEquipo());
                    }
                    System.out.print("Elija el número del equipo: ");
                    int idxEqLiga = lector.nextInt() - 1;
                    lector.nextLine();
                    if (idxEqLiga >= 0 && idxEqLiga < equiposEnLiga.size()) {
                        equipoActual = equiposEnLiga.get(idxEqLiga);
                        System.out.println("¡Cambiado a " + equipoActual.getNombreEquipo() + "!");
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- CREAR NUEVO EQUIPO ---");
                    System.out.print("Nombre del nuevo equipo: ");
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

                    // Se guarda en el catálogo general Y se mete automáticamente en la liga actual
                    equiposDisponibles.add(nuevoEquipo);
                    ligaActual.agregarEquipo(nuevoEquipo);
                    equipoActual = nuevoEquipo;

                    System.out.println("¡Equipo '" + nombreNuevoEquipo + "' creado e inscrito en " + ligaActual.getNombreLiga() + "!");
                    break;

                case 6:
                    if (ligaActual.getEquiposParticipantes().isEmpty()) {
                        System.out.println("No hay ningún equipo seleccionado en esta liga.");
                        break;
                    }
                    System.out.println("\n--- INFORMACIÓN DE " + equipoActual.getNombreEquipo().toUpperCase() + " ---");
                    System.out.println("Técnico: " + (equipoActual.getTecnicoEquipo() != null ? equipoActual.getTecnicoEquipo() : "No asignado"));
                    System.out.println("Plantilla de Jugadores:");
                    equipoActual.leerTodos();
                    break;

                case 7:
                    if (ligaActual.getEquiposParticipantes().isEmpty()) {
                        System.out.println("Primero crea o inscribe un equipo en esta liga.");
                        break;
                    }
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
                    System.out.println("¡Jugador agregado a " + equipoActual.getNombreEquipo() + "!");
                    break;

                case 8:
                    if (ligaActual.getEquiposParticipantes().isEmpty()) {
                        System.out.println("No hay equipo seleccionado.");
                        break;
                    }
                    System.out.print("1. Actualizar jugador | 2. Eliminar jugador: ");
                    int subOp = lector.nextInt();
                    lector.nextLine();
                    System.out.print("Ingrese el ID del jugador: ");
                    String idJug = lector.nextLine();
                    if (subOp == 1) {
                        System.out.print("Nuevo nombre: ");
                        String nomAct = lector.nextLine();
                        System.out.print("Nuevo dorsal: ");
                        int dorAct = lector.nextInt();
                        lector.nextLine();
                        System.out.println(equipoActual.actualizarJugador(idJug, nomAct, dorAct) ? "¡Actualizado!" : "No encontrado.");
                    } else if (subOp == 2) {
                        System.out.println(equipoActual.eliminarJugador(idJug) ? "¡Eliminado!" : "No encontrado.");
                    }
                    break;

                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 9);

        lector.close();
    }

    // Método donde TÚ metes todos los equipos precargados
    private static ArrayList<Equipo> cargarEquiposReales() {
        ArrayList<Equipo> equipos = new ArrayList<>();

        Equipo realMadrid = new Equipo("Real Madrid");
        realMadrid.setTecnicoEquipo(new Tecnico("Carlo Ancelotti", "T01", "Real Madrid", "Italia"));
        realMadrid.agregarJugador(new Jugador("Vinicius Jr", "J01", 7, Posicion.EXTREMO, LocalDate.of(2000, 7, 12), "Brasil"));
        realMadrid.agregarJugador(new Jugador("Jude Bellingham", "J02", 5, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 6, 29), "Inglaterra"));

        Equipo barcelona = new Equipo("FC Barcelona");
        barcelona.setTecnicoEquipo(new Tecnico("Hansi Flick", "T02", "FC Barcelona", "Alemania"));
        barcelona.agregarJugador(new Jugador("Lamine Yamal", "J03", 19, Posicion.EXTREMO, LocalDate.of(2007, 7, 13), "España"));

        Equipo millonarios = new Equipo("Millonarios FC");
        millonarios.setTecnicoEquipo(new Tecnico("Alberto Gamero", "T03", "Millonarios FC", "Colombia"));
        millonarios.agregarJugador(new Jugador("Radamel Falcao", "J04", 9, Posicion.DELANTERO, LocalDate.of(1986, 2, 10), "Colombia"));

        Equipo nacional = new Equipo("Atlético Nacional");
        nacional.setTecnicoEquipo(new Tecnico("Efraín Juárez", "T04", "Atlético Nacional", "México"));
        nacional.agregarJugador(new Jugador("Edwin Cardona", "J05", 8, Posicion.VOLANTE, LocalDate.of(1992, 12, 8), "Colombia"));

        equipos.add(realMadrid);
        equipos.add(barcelona);
        equipos.add(millonarios);
        equipos.add(nacional);

        return equipos;
    }

    // Método donde organizas tus equipos precargados en ligas iniciales
    private static ArrayList<Liga> cargarLigasIniciales(ArrayList<Equipo> equipos) {
        ArrayList<Liga> ligas = new ArrayList<>();

        Liga laLiga = new Liga("LaLiga EA Sports", "España");
        laLiga.agregarEquipo(equipos.get(0)); // Real Madrid
        laLiga.agregarEquipo(equipos.get(1)); // Barcelona

        Liga ligaBetPlay = new Liga("Liga BetPlay Dimayor", "Colombia");
        ligaBetPlay.agregarEquipo(equipos.get(2)); // Millonarios
        ligaBetPlay.agregarEquipo(equipos.get(3)); // Nacional

        ligas.add(laLiga);
        ligas.add(ligaBetPlay);

        return ligas;
    }
}