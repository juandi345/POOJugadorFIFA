import java.util.ArrayList;

public class Liga {
    private String nombreLiga;
    private String pais;
    private ArrayList<Equipo> equiposParticipantes;

    public Liga(String nombreLiga, String pais) {
        this.nombreLiga = nombreLiga;
        this.pais = pais;
        this.equiposParticipantes = new ArrayList<>();
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Equipo> getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public boolean agregarEquipo(Equipo equipo) {
        if (!equiposParticipantes.contains(equipo)) {
            equiposParticipantes.add(equipo);
            return true;
        }
        return false; // Evita meter el mismo equipo dos veces en la misma liga
    }

    public void mostrarTablaEquipos() {
        System.out.println("\n=== LIGA: " + nombreLiga.toUpperCase() + " (" + pais + ") ===");
        if (equiposParticipantes.isEmpty()) {
            System.out.println("  Esta liga aún no tiene equipos inscritos.");
        } else {
            for (int i = 0; i < equiposParticipantes.size(); i++) {
                Equipo eq = equiposParticipantes.get(i);
                String nombreTec = (eq.getTecnicoEquipo() != null) ? eq.getTecnicoEquipo().name : "Sin técnico";
                System.out.println("  " + (i + 1) + ". " + eq.getNombreEquipo() + " | DT: " + nombreTec);
            }
        }
    }
}
