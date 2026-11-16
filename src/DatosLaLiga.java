import java.time.LocalDate;
import java.util.ArrayList;

public class DatosLaLiga {

    public static ArrayList<Equipo> cargarEquiposLaLiga() {
        ArrayList<Equipo> equipos = new ArrayList<>();

        // 1. REAL MADRID
        Equipo realMadrid = new Equipo("Real Madrid");
        realMadrid.setTecnicoEquipo(new Tecnico("Carlo Ancelotti", "T01", "Real Madrid", "Italia"));
        realMadrid.agregarJugador(new Jugador("Thibaut Courtois", "RM01", 1, Posicion.PORTERO, LocalDate.of(1992, 5, 11), "Bélgica"));
        realMadrid.agregarJugador(new Jugador("Dani Carvajal", "RM02", 2, Posicion.LATERAL, LocalDate.of(1992, 1, 11), "España"));
        realMadrid.agregarJugador(new Jugador("Éder Militão", "RM03", 3, Posicion.DEFENSA, LocalDate.of(1998, 1, 18), "Brasil"));
        realMadrid.agregarJugador(new Jugador("Antonio Rüdiger", "RM04", 22, Posicion.DEFENSA, LocalDate.of(1993, 3, 3), "Alemania"));
        realMadrid.agregarJugador(new Jugador("Ferland Mendy", "RM05", 23, Posicion.LATERAL, LocalDate.of(1995, 6, 8), "Francia"));
        realMadrid.agregarJugador(new Jugador("Aurélien Tchouaméni", "RM06", 14, Posicion.VOLANTE, LocalDate.of(2000, 1, 27), "Francia"));
        realMadrid.agregarJugador(new Jugador("Federico Valverde", "RM07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 7, 22), "Uruguay"));
        realMadrid.agregarJugador(new Jugador("Jude Bellingham", "RM08", 5, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 6, 29), "Inglaterra"));
        realMadrid.agregarJugador(new Jugador("Rodrygo Goes", "RM09", 11, Posicion.EXTREMO, LocalDate.of(2001, 1, 9), "Brasil"));
        realMadrid.agregarJugador(new Jugador("Vinícius Júnior", "RM10", 7, Posicion.EXTREMO, LocalDate.of(2000, 7, 12), "Brasil"));
        realMadrid.agregarJugador(new Jugador("Kylian Mbappé", "RM11", 9, Posicion.DELANTERO, LocalDate.of(1998, 12, 20), "Francia"));
        equipos.add(realMadrid);

        // 2. FC BARCELONA
        Equipo barcelona = new Equipo("FC Barcelona");
        barcelona.setTecnicoEquipo(new Tecnico("Hansi Flick", "T02", "FC Barcelona", "Alemania"));
        barcelona.agregarJugador(new Jugador("Iñaki Peña", "FCB01", 13, Posicion.PORTERO, LocalDate.of(1999, 3, 2), "España"));
        barcelona.agregarJugador(new Jugador("Jules Koundé", "FCB02", 23, Posicion.LATERAL, LocalDate.of(1998, 11, 12), "Francia"));
        barcelona.agregarJugador(new Jugador("Pau Cubarsí", "FCB03", 2, Posicion.DEFENSA, LocalDate.of(2007, 1, 22), "España"));
        barcelona.agregarJugador(new Jugador("Iñigo Martínez", "FCB04", 5, Posicion.DEFENSA, LocalDate.of(1991, 5, 17), "España"));
        barcelona.agregarJugador(new Jugador("Alejandro Balde", "FCB05", 3, Posicion.LATERAL, LocalDate.of(2003, 10, 18), "España"));
        barcelona.agregarJugador(new Jugador("Marc Casadó", "FCB06", 17, Posicion.VOLANTE, LocalDate.of(2003, 9, 14), "España"));
        barcelona.agregarJugador(new Jugador("Pedri González", "FCB07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 11, 25), "España"));
        barcelona.agregarJugador(new Jugador("Dani Olmo", "FCB08", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 5, 7), "España"));
        barcelona.agregarJugador(new Jugador("Lamine Yamal", "FCB09", 19, Posicion.EXTREMO, LocalDate.of(2007, 7, 13), "España"));
        barcelona.agregarJugador(new Jugador("Raphinha", "FCB10", 11, Posicion.EXTREMO, LocalDate.of(1996, 12, 14), "Brasil"));
        barcelona.agregarJugador(new Jugador("Robert Lewandowski", "FCB11", 9, Posicion.DELANTERO, LocalDate.of(1988, 8, 21), "Polonia"));
        equipos.add(barcelona);

        // 3. ATLÉTICO DE MADRID
        Equipo atletico = new Equipo("Atlético de Madrid");
        atletico.setTecnicoEquipo(new Tecnico("Diego Simeone", "T03", "Atlético de Madrid", "Argentina"));
        atletico.agregarJugador(new Jugador("Jan Oblak", "ATM01", 13, Posicion.PORTERO, LocalDate.of(1993, 1, 7), "Eslovenia"));
        atletico.agregarJugador(new Jugador("Marcos Llorente", "ATM02", 14, Posicion.LATERAL, LocalDate.of(1995, 1, 30), "España"));
        atletico.agregarJugador(new Jugador("José María Giménez", "ATM03", 2, Posicion.DEFENSA, LocalDate.of(1995, 1, 20), "Uruguay"));
        atletico.agregarJugador(new Jugador("Robin Le Normand", "ATM04", 24, Posicion.DEFENSA, LocalDate.of(1996, 11, 11), "España"));
        atletico.agregarJugador(new Jugador("Javi Galán", "ATM05", 21, Posicion.LATERAL, LocalDate.of(1994, 11, 19), "España"));
        atletico.agregarJugador(new Jugador("Koke Resurrección", "ATM06", 6, Posicion.VOLANTE, LocalDate.of(1992, 1, 8), "España"));
        atletico.agregarJugador(new Jugador("Rodrigo De Paul", "ATM07", 5, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 5, 24), "Argentina"));
        atletico.agregarJugador(new Jugador("Conor Gallagher", "ATM08", 4, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 2, 6), "Inglaterra"));
        atletico.agregarJugador(new Jugador("Giuliano Simeone", "ATM09", 22, Posicion.EXTREMO, LocalDate.of(2002, 12, 18), "Argentina"));
        atletico.agregarJugador(new Jugador("Antoine Griezmann", "ATM10", 7, Posicion.DELANTERO, LocalDate.of(1991, 3, 21), "Francia"));
        atletico.agregarJugador(new Jugador("Julián Álvarez", "ATM11", 19, Posicion.DELANTERO, LocalDate.of(2000, 1, 31), "Argentina"));
        equipos.add(atletico);

        // 4. ATHLETIC CLUB
        Equipo athletic = new Equipo("Athletic Club");
        athletic.setTecnicoEquipo(new Tecnico("Ernesto Valverde", "T04", "Athletic Club", "España"));
        athletic.agregarJugador(new Jugador("Unai Simón", "ATH01", 1, Posicion.PORTERO, LocalDate.of(1997, 6, 11), "España"));
        athletic.agregarJugador(new Jugador("Óscar de Marcos", "ATH02", 18, Posicion.LATERAL, LocalDate.of(1989, 4, 14), "España"));
        athletic.agregarJugador(new Jugador("Dani Vivian", "ATH03", 3, Posicion.DEFENSA, LocalDate.of(1999, 7, 5), "España"));
        athletic.agregarJugador(new Jugador("Aitor Paredes", "ATH04", 4, Posicion.DEFENSA, LocalDate.of(2000, 4, 29), "España"));
        athletic.agregarJugador(new Jugador("Yuri Berchiche", "ATH05", 17, Posicion.LATERAL, LocalDate.of(1990, 2, 10), "España"));
        athletic.agregarJugador(new Jugador("Iñigo Ruiz de Galarreta", "ATH06", 16, Posicion.VOLANTE, LocalDate.of(1993, 8, 6), "España"));
        athletic.agregarJugador(new Jugador("Mikel Jauregizar", "ATH07", 23, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 11, 13), "España"));
        athletic.agregarJugador(new Jugador("Oihan Sancet", "ATH08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 4, 25), "España"));
        athletic.agregarJugador(new Jugador("Iñaki Williams", "ATH09", 9, Posicion.EXTREMO, LocalDate.of(1994, 6, 15), "Ghana"));
        athletic.agregarJugador(new Jugador("Nico Williams", "ATH10", 10, Posicion.EXTREMO, LocalDate.of(2002, 7, 12), "España"));
        athletic.agregarJugador(new Jugador("Gorka Guruzeta", "ATH11", 12, Posicion.DELANTERO, LocalDate.of(1996, 9, 12), "España"));
        equipos.add(athletic);

        // 5. VILLARREAL CF
        Equipo villarreal = new Equipo("Villarreal CF");
        villarreal.setTecnicoEquipo(new Tecnico("Marcelino García Toral", "T05", "Villarreal CF", "España"));
        villarreal.agregarJugador(new Jugador("Diego Conde", "VIL01", 13, Posicion.PORTERO, LocalDate.of(1998, 10, 28), "España"));
        villarreal.agregarJugador(new Jugador("Kiko Femenía", "VIL02", 17, Posicion.LATERAL, LocalDate.of(1991, 2, 2), "España"));
        villarreal.agregarJugador(new Jugador("Raúl Albiol", "VIL03", 3, Posicion.DEFENSA, LocalDate.of(1985, 9, 4), "España"));
        villarreal.agregarJugador(new Jugador("Logan Costa", "VIL04", 2, Posicion.DEFENSA, LocalDate.of(2001, 4, 1), "Cabo Verde"));
        villarreal.agregarJugador(new Jugador("Sergi Cardona", "VIL05", 23, Posicion.LATERAL, LocalDate.of(1999, 7, 8), "España"));
        villarreal.agregarJugador(new Jugador("Santi Comesaña", "VIL06", 14, Posicion.VOLANTE, LocalDate.of(1996, 10, 5), "España"));
        villarreal.agregarJugador(new Jugador("Dani Parejo", "VIL07", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1989, 4, 16), "España"));
        villarreal.agregarJugador(new Jugador("Álex Baena", "VIL08", 16, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 7, 20), "España"));
        villarreal.agregarJugador(new Jugador("Yéremy Pino", "VIL09", 21, Posicion.EXTREMO, LocalDate.of(2002, 10, 20), "España"));
        villarreal.agregarJugador(new Jugador("Ayoze Pérez", "VIL10", 22, Posicion.DELANTERO, LocalDate.of(1993, 7, 29), "España"));
        villarreal.agregarJugador(new Jugador("Thierno Barry", "VIL11", 15, Posicion.DELANTERO, LocalDate.of(2002, 10, 21), "Francia"));
        equipos.add(villarreal);

        // 6. REAL SOCIEDAD
        Equipo realSociedad = new Equipo("Real Sociedad");
        realSociedad.setTecnicoEquipo(new Tecnico("Imanol Alguacil", "T06", "Real Sociedad", "España"));
        realSociedad.agregarJugador(new Jugador("Álex Remiro", "RSO01", 1, Posicion.PORTERO, LocalDate.of(1995, 3, 24), "España"));
        realSociedad.agregarJugador(new Jugador("Jon Aramburu", "RSO02", 19, Posicion.LATERAL, LocalDate.of(2002, 7, 23), "Venezuela"));
        realSociedad.agregarJugador(new Jugador("Igor Zubeldia", "RSO03", 5, Posicion.DEFENSA, LocalDate.of(1997, 3, 30), "España"));
        realSociedad.agregarJugador(new Jugador("Nayef Aguerd", "RSO04", 21, Posicion.DEFENSA, LocalDate.of(1996, 3, 30), "Marruecos"));
        realSociedad.agregarJugador(new Jugador("Sergio Gómez", "RSO05", 17, Posicion.LATERAL, LocalDate.of(2000, 9, 4), "España"));
        realSociedad.agregarJugador(new Jugador("Martín Zubimendi", "RSO06", 4, Posicion.VOLANTE, LocalDate.of(1999, 2, 2), "España"));
        realSociedad.agregarJugador(new Jugador("Luka Sučić", "RSO07", 24, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 9, 8), "Croacia"));
        realSociedad.agregarJugador(new Jugador("Brais Méndez", "RSO08", 23, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 1, 7), "España"));
        realSociedad.agregarJugador(new Jugador("Takefusa Kubo", "RSO09", 14, Posicion.EXTREMO, LocalDate.of(2001, 6, 4), "Japón"));
        realSociedad.agregarJugador(new Jugador("Ander Barrenetxea", "RSO10", 7, Posicion.EXTREMO, LocalDate.of(2001, 12, 27), "España"));
        realSociedad.agregarJugador(new Jugador("Mikel Oyarzabal", "RSO11", 10, Posicion.DELANTERO, LocalDate.of(1997, 4, 21), "España"));
        equipos.add(realSociedad);

        // 7. REAL BETIS
        Equipo betis = new Equipo("Real Betis");
        betis.setTecnicoEquipo(new Tecnico("Manuel Pellegrini", "T07", "Real Betis", "Chile"));
        betis.agregarJugador(new Jugador("Rui Silva", "BET01", 1, Posicion.PORTERO, LocalDate.of(1994, 2, 7), "Portugal"));
        betis.agregarJugador(new Jugador("Youssouf Sabaly", "BET02", 23, Posicion.LATERAL, LocalDate.of(1993, 3, 5), "Senegal"));
        betis.agregarJugador(new Jugador("Diego Llorente", "BET03", 3, Posicion.DEFENSA, LocalDate.of(1993, 8, 16), "España"));
        betis.agregarJugador(new Jugador("Marc Bartra", "BET04", 5, Posicion.DEFENSA, LocalDate.of(1991, 1, 15), "España"));
        betis.agregarJugador(new Jugador("Romain Perraud", "BET05", 15, Posicion.LATERAL, LocalDate.of(1997, 9, 22), "Francia"));
        betis.agregarJugador(new Jugador("Johnny Cardoso", "BET06", 4, Posicion.VOLANTE, LocalDate.of(2001, 9, 20), "Estados Unidos"));
        betis.agregarJugador(new Jugador("Sergi Altimira", "BET07", 16, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 8, 25), "España"));
        betis.agregarJugador(new Jugador("Giovani Lo Celso", "BET08", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 4, 9), "Argentina"));
        betis.agregarJugador(new Jugador("Pablo Fornals", "BET09", 18, Posicion.EXTREMO, LocalDate.of(1996, 2, 22), "España"));
        betis.agregarJugador(new Jugador("Abde Ezzalzouli", "BET10", 10, Posicion.EXTREMO, LocalDate.of(2001, 12, 17), "Marruecos"));
        betis.agregarJugador(new Jugador("Vitor Roque", "BET11", 8, Posicion.DELANTERO, LocalDate.of(2005, 2, 28), "Brasil"));
        equipos.add(betis);

        // 8. GIRONA FC
        Equipo girona = new Equipo("Girona FC");
        girona.setTecnicoEquipo(new Tecnico("Míchel Sánchez", "T08", "Girona FC", "España"));
        girona.agregarJugador(new Jugador("Paulo Gazzaniga", "GIR01", 13, Posicion.PORTERO, LocalDate.of(1992, 1, 2), "Argentina"));
        girona.agregarJugador(new Jugador("Arnau Martínez", "GIR02", 4, Posicion.LATERAL, LocalDate.of(2003, 4, 25), "España"));
        girona.agregarJugador(new Jugador("David López", "GIR03", 5, Posicion.DEFENSA, LocalDate.of(1989, 10, 9), "España"));
        girona.agregarJugador(new Jugador("Ladislav Krejčí", "GIR04", 18, Posicion.DEFENSA, LocalDate.of(1999, 4, 20), "República Checa"));
        girona.agregarJugador(new Jugador("Miguel Gutiérrez", "GIR05", 3, Posicion.LATERAL, LocalDate.of(2001, 7, 27), "España"));
        girona.agregarJugador(new Jugador("Oriol Romeu", "GIR06", 14, Posicion.VOLANTE, LocalDate.of(1991, 9, 24), "España"));
        girona.agregarJugador(new Jugador("Yangel Herrera", "GIR07", 21, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 1, 7), "Venezuela"));
        girona.agregarJugador(new Jugador("Iván Martín", "GIR08", 23, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 2, 14), "España"));
        girona.agregarJugador(new Jugador("Viktor Tsygankov", "GIR09", 8, Posicion.EXTREMO, LocalDate.of(1997, 11, 15), "Ucrania"));
        girona.agregarJugador(new Jugador("Bryan Gil", "GIR10", 20, Posicion.EXTREMO, LocalDate.of(2001, 2, 11), "España"));
        girona.agregarJugador(new Jugador("Abel Ruiz", "GIR11", 9, Posicion.DELANTERO, LocalDate.of(2000, 1, 28), "España"));
        equipos.add(girona);

        // 9. CA OSASUNA
        Equipo osasuna = new Equipo("CA Osasuna");
        osasuna.setTecnicoEquipo(new Tecnico("Vicente Moreno", "T09", "CA Osasuna", "España"));
        osasuna.agregarJugador(new Jugador("Sergio Herrera", "OSA01", 1, Posicion.PORTERO, LocalDate.of(1993, 6, 5), "España"));
        osasuna.agregarJugador(new Jugador("Jesús Areso", "OSA02", 12, Posicion.LATERAL, LocalDate.of(1999, 7, 2), "España"));
        osasuna.agregarJugador(new Jugador("Alejandro Catena", "OSA03", 24, Posicion.DEFENSA, LocalDate.of(1994, 10, 28), "España"));
        osasuna.agregarJugador(new Jugador("Enzo Boyomo", "OSA04", 22, Posicion.DEFENSA, LocalDate.of(2001, 10, 7), "Camerún"));
        osasuna.agregarJugador(new Jugador("Juan Cruz", "OSA05", 3, Posicion.LATERAL, LocalDate.of(1992, 7, 28), "España"));
        osasuna.agregarJugador(new Jugador("Lucas Torró", "OSA06", 6, Posicion.VOLANTE, LocalDate.of(1994, 7, 19), "España"));
        osasuna.agregarJugador(new Jugador("Jon Moncayola", "OSA07", 7, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 5, 13), "España"));
        osasuna.agregarJugador(new Jugador("Aimar Oroz", "OSA08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 11, 27), "España"));
        osasuna.agregarJugador(new Jugador("Rubén García", "OSA09", 14, Posicion.EXTREMO, LocalDate.of(1993, 7, 14), "España"));
        osasuna.agregarJugador(new Jugador("Bryan Zaragoza", "OSA10", 19, Posicion.EXTREMO, LocalDate.of(2001, 9, 9), "España"));
        osasuna.agregarJugador(new Jugador("Ante Budimir", "OSA11", 17, Posicion.DELANTERO, LocalDate.of(1991, 7, 22), "Croacia"));
        equipos.add(osasuna);

        // 10. RC CELTA DE VIGO
        Equipo celta = new Equipo("RC Celta de Vigo");
        celta.setTecnicoEquipo(new Tecnico("Claudio Giráldez", "T10", "RC Celta de Vigo", "España"));
        celta.agregarJugador(new Jugador("Vicente Guaita", "CEL01", 13, Posicion.PORTERO, LocalDate.of(1987, 1, 10), "España"));
        celta.agregarJugador(new Jugador("Óscar Mingueza", "CEL02", 3, Posicion.LATERAL, LocalDate.of(1999, 5, 13), "España"));
        celta.agregarJugador(new Jugador("Carl Starfelt", "CEL03", 2, Posicion.DEFENSA, LocalDate.of(1995, 6, 1), "Suecia"));
        celta.agregarJugador(new Jugador("Marcos Alonso", "CEL04", 20, Posicion.DEFENSA, LocalDate.of(1990, 12, 28), "España"));
        celta.agregarJugador(new Jugador("Hugo Álvarez", "CEL05", 23, Posicion.LATERAL, LocalDate.of(2003, 7, 2), "España"));
        celta.agregarJugador(new Jugador("Fran Beltrán", "CEL06", 8, Posicion.VOLANTE, LocalDate.of(1999, 2, 3), "España"));
        celta.agregarJugador(new Jugador("Ilaix Moriba", "CEL07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 1, 19), "Guinea"));
        celta.agregarJugador(new Jugador("Williot Swedberg", "CEL08", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 2, 1), "Suecia"));
        celta.agregarJugador(new Jugador("Iago Aspas", "CEL09", 10, Posicion.EXTREMO, LocalDate.of(1987, 8, 1), "España"));
        celta.agregarJugador(new Jugador("Jonathan Bamba", "CEL10", 17, Posicion.EXTREMO, LocalDate.of(1996, 3, 26), "Costa de Marfil"));
        celta.agregarJugador(new Jugador("Borja Iglesias", "CEL11", 7, Posicion.DELANTERO, LocalDate.of(1993, 1, 17), "España"));
        equipos.add(celta);

        // 11. RCD MALLORCA
        Equipo mallorca = new Equipo("RCD Mallorca");
        mallorca.setTecnicoEquipo(new Tecnico("Jagoba Arrasate", "T11", "RCD Mallorca", "España"));
        mallorca.agregarJugador(new Jugador("Dominik Greif", "MAL01", 1, Posicion.PORTERO, LocalDate.of(1997, 4, 6), "Eslovaquia"));
        mallorca.agregarJugador(new Jugador("Pablo Maffeo", "MAL02", 23, Posicion.LATERAL, LocalDate.of(1997, 7, 12), "España"));
        mallorca.agregarJugador(new Jugador("Martin Valjent", "MAL03", 24, Posicion.DEFENSA, LocalDate.of(1995, 12, 11), "Eslovaquia"));
        mallorca.agregarJugador(new Jugador("Antonio Raíllo", "MAL04", 21, Posicion.DEFENSA, LocalDate.of(1991, 10, 8), "España"));
        mallorca.agregarJugador(new Jugador("Johan Mojica", "MAL05", 22, Posicion.LATERAL, LocalDate.of(1992, 8, 21), "Colombia"));
        mallorca.agregarJugador(new Jugador("Samú Costa", "MAL06", 12, Posicion.VOLANTE, LocalDate.of(2000, 11, 27), "Portugal"));
        mallorca.agregarJugador(new Jugador("Manu Morlanes", "MAL07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 1, 12), "España"));
        mallorca.agregarJugador(new Jugador("Sergi Darder", "MAL08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1993, 12, 22), "España"));
        mallorca.agregarJugador(new Jugador("Robert Navarro", "MAL09", 27, Posicion.EXTREMO, LocalDate.of(2002, 4, 12), "España"));
        mallorca.agregarJugador(new Jugador("Dani Rodríguez", "MAL10", 14, Posicion.EXTREMO, LocalDate.of(1988, 6, 6), "España"));
        mallorca.agregarJugador(new Jugador("Vedat Muriqi", "MAL11", 7, Posicion.DELANTERO, LocalDate.of(1994, 4, 24), "Kosovo"));
        equipos.add(mallorca);

        // 12. SEVILLA FC
        Equipo sevilla = new Equipo("Sevilla FC");
        sevilla.setTecnicoEquipo(new Tecnico("García Pimienta", "T12", "Sevilla FC", "España"));
        sevilla.agregarJugador(new Jugador("Ørjan Nyland", "SEV01", 13, Posicion.PORTERO, LocalDate.of(1990, 9, 10), "Noruega"));
        sevilla.agregarJugador(new Jugador("José Ángel Carmona", "SEV02", 32, Posicion.LATERAL, LocalDate.of(2002, 1, 29), "España"));
        sevilla.agregarJugador(new Jugador("Loïc Badé", "SEV03", 22, Posicion.DEFENSA, LocalDate.of(2000, 4, 11), "Francia"));
        sevilla.agregarJugador(new Jugador("Nemanja Gudelj", "SEV04", 6, Posicion.DEFENSA, LocalDate.of(1991, 11, 16), "Serbia"));
        sevilla.agregarJugador(new Jugador("Adrià Pedrosa", "SEV05", 3, Posicion.LATERAL, LocalDate.of(1998, 5, 13), "España"));
        sevilla.agregarJugador(new Jugador("Lucien Agoumé", "SEV06", 18, Posicion.VOLANTE, LocalDate.of(2002, 2, 9), "Francia"));
        sevilla.agregarJugador(new Jugador("Albert Sambi Lokonga", "SEV07", 12, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 10, 22), "Bélgica"));
        sevilla.agregarJugador(new Jugador("Djibril Sow", "SEV08", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 2, 6), "Suiza"));
        sevilla.agregarJugador(new Jugador("Dodi Lukebakio", "SEV09", 11, Posicion.EXTREMO, LocalDate.of(1997, 9, 24), "Bélgica"));
        sevilla.agregarJugador(new Jugador("Chidera Ejuke", "SEV10", 21, Posicion.EXTREMO, LocalDate.of(1998, 1, 2), "Nigeria"));
        sevilla.agregarJugador(new Jugador("Isaac Romero", "SEV11", 7, Posicion.DELANTERO, LocalDate.of(2000, 5, 18), "España"));
        equipos.add(sevilla);

        // 13. RAYO VALLECANO
        Equipo rayo = new Equipo("Rayo Vallecano");
        rayo.setTecnicoEquipo(new Tecnico("Iñigo Pérez", "T13", "Rayo Vallecano", "España"));
        rayo.agregarJugador(new Jugador("Augusto Batalla", "RAY01", 13, Posicion.PORTERO, LocalDate.of(1996, 4, 30), "Argentina"));
        rayo.agregarJugador(new Jugador("Andrei Rațiu", "RAY02", 2, Posicion.LATERAL, LocalDate.of(1998, 6, 20), "Rumanía"));
        rayo.agregarJugador(new Jugador("Florian Lejeune", "RAY03", 24, Posicion.DEFENSA, LocalDate.of(1991, 5, 20), "Francia"));
        rayo.agregarJugador(new Jugador("Abdul Mumin", "RAY04", 16, Posicion.DEFENSA, LocalDate.of(1998, 6, 6), "Ghana"));
        rayo.agregarJugador(new Jugador("Pep Chavarría", "RAY05", 3, Posicion.LATERAL, LocalDate.of(1998, 4, 10), "España"));
        rayo.agregarJugador(new Jugador("Óscar Valentín", "RAY06", 23, Posicion.VOLANTE, LocalDate.of(1994, 8, 20), "España"));
        rayo.agregarJugador(new Jugador("Unai López", "RAY07", 17, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 10, 30), "España"));
        rayo.agregarJugador(new Jugador("Isi Palazón", "RAY08", 7, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 12, 27), "España"));
        rayo.agregarJugador(new Jugador("Jorge de Frutos", "RAY09", 19, Posicion.EXTREMO, LocalDate.of(1997, 2, 20), "España"));
        rayo.agregarJugador(new Jugador("Álvaro García", "RAY10", 18, Posicion.EXTREMO, LocalDate.of(1992, 10, 27), "España"));
        rayo.agregarJugador(new Jugador("Sergio Camello", "RAY11", 14, Posicion.DELANTERO, LocalDate.of(2001, 2, 10), "España"));
        equipos.add(rayo);

        // 14. GETAFE CF
        Equipo getafe = new Equipo("Getafe CF");
        getafe.setTecnicoEquipo(new Tecnico("José Bordalás", "T14", "Getafe CF", "España"));
        getafe.agregarJugador(new Jugador("David Soria", "GET01", 13, Posicion.PORTERO, LocalDate.of(1993, 4, 4), "España"));
        getafe.agregarJugador(new Jugador("Juan Iglesias", "GET02", 21, Posicion.LATERAL, LocalDate.of(1998, 7, 3), "España"));
        getafe.agregarJugador(new Jugador("Djené Dakonam", "GET03", 2, Posicion.DEFENSA, LocalDate.of(1991, 12, 31), "Togo"));
        getafe.agregarJugador(new Jugador("Omar Alderete", "GET04", 15, Posicion.DEFENSA, LocalDate.of(1996, 12, 26), "Paraguay"));
        getafe.agregarJugador(new Jugador("Diego Rico", "GET05", 16, Posicion.LATERAL, LocalDate.of(1993, 2, 23), "España"));
        getafe.agregarJugador(new Jugador("Luis Milla", "GET06", 5, Posicion.VOLANTE, LocalDate.of(1994, 10, 7), "España"));
        getafe.agregarJugador(new Jugador("Mauro Arambarri", "GET07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 9, 30), "Uruguay"));
        getafe.agregarJugador(new Jugador("Chrisantus Uche", "GET08", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 5, 19), "Nigeria"));
        getafe.agregarJugador(new Jugador("Carles Pérez", "GET09", 7, Posicion.EXTREMO, LocalDate.of(1998, 2, 16), "España"));
        getafe.agregarJugador(new Jugador("Álex Sola", "GET10", 12, Posicion.EXTREMO, LocalDate.of(1999, 6, 9), "España"));
        getafe.agregarJugador(new Jugador("Bertuğ Yıldırım", "GET11", 19, Posicion.DELANTERO, LocalDate.of(2002, 7, 12), "Turquía"));
        equipos.add(getafe);

        // 15. DEPORTIVO ALAVÉS
        Equipo alaves = new Equipo("Deportivo Alavés");
        alaves.setTecnicoEquipo(new Tecnico("Luis García Plaza", "T15", "Deportivo Alavés", "España"));
        alaves.agregarJugador(new Jugador("Antonio Sivera", "ALA01", 1, Posicion.PORTERO, LocalDate.of(1996, 8, 11), "España"));
        alaves.agregarJugador(new Jugador("Nahuel Tenaglia", "ALA02", 14, Posicion.LATERAL, LocalDate.of(1996, 2, 21), "Argentina"));
        alaves.agregarJugador(new Jugador("Abdel Abqar", "ALA03", 5, Posicion.DEFENSA, LocalDate.of(1999, 3, 10), "Marruecos"));
        alaves.agregarJugador(new Jugador("Aleksandar Sedlar", "ALA04", 4, Posicion.DEFENSA, LocalDate.of(1991, 12, 13), "Serbia"));
        alaves.agregarJugador(new Jugador("Manu Sánchez", "ALA05", 3, Posicion.LATERAL, LocalDate.of(2000, 8, 24), "España"));
        alaves.agregarJugador(new Jugador("Antonio Blanco", "ALA06", 8, Posicion.VOLANTE, LocalDate.of(2000, 7, 23), "España"));
        alaves.agregarJugador(new Jugador("Ander Guevara", "ALA07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 7, 7), "España"));
        alaves.agregarJugador(new Jugador("Jon Guridi", "ALA08", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 2, 28), "España"));
        alaves.agregarJugador(new Jugador("Carlos Vicente", "ALA09", 7, Posicion.EXTREMO, LocalDate.of(1999, 4, 23), "España"));
        alaves.agregarJugador(new Jugador("Tomás Conechny", "ALA10", 10, Posicion.EXTREMO, LocalDate.of(1998, 3, 30), "Argentina"));
        alaves.agregarJugador(new Jugador("Kike García", "ALA11", 17, Posicion.DELANTERO, LocalDate.of(1989, 11, 25), "España"));
        equipos.add(alaves);

        // 16. UD LAS PALMAS
        Equipo lasPalmas = new Equipo("UD Las Palmas");
        lasPalmas.setTecnicoEquipo(new Tecnico("Diego Martínez", "T16", "UD Las Palmas", "España"));
        lasPalmas.agregarJugador(new Jugador("Jasper Cillessen", "LPA01", 1, Posicion.PORTERO, LocalDate.of(1989, 4, 22), "Países Bajos"));
        lasPalmas.agregarJugador(new Jugador("Viti Rozada", "LPA02", 18, Posicion.LATERAL, LocalDate.of(1997, 9, 16), "España"));
        lasPalmas.agregarJugador(new Jugador("Álex Suárez", "LPA03", 4, Posicion.DEFENSA, LocalDate.of(1993, 3, 18), "España"));
        lasPalmas.agregarJugador(new Jugador("Scott McKenna", "LPA04", 15, Posicion.DEFENSA, LocalDate.of(1996, 11, 12), "Escocia"));
        lasPalmas.agregarJugador(new Jugador("Álex Muñoz", "LPA05", 23, Posicion.LATERAL, LocalDate.of(1994, 7, 30), "España"));
        lasPalmas.agregarJugador(new Jugador("Dário Essugo", "LPA06", 29, Posicion.VOLANTE, LocalDate.of(2005, 3, 14), "Portugal"));
        lasPalmas.agregarJugador(new Jugador("Kirian Rodríguez", "LPA07", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 3, 5), "España"));
        lasPalmas.agregarJugador(new Jugador("Alberto Moleiro", "LPA08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 9, 30), "España"));
        lasPalmas.agregarJugador(new Jugador("Sandro Ramírez", "LPA09", 19, Posicion.EXTREMO, LocalDate.of(1995, 7, 9), "España"));
        lasPalmas.agregarJugador(new Jugador("Manu Fuster", "LPA10", 14, Posicion.EXTREMO, LocalDate.of(1997, 10, 22), "España"));
        lasPalmas.agregarJugador(new Jugador("Fábio Silva", "LPA11", 37, Posicion.DELANTERO, LocalDate.of(2002, 7, 19), "Portugal"));
        equipos.add(lasPalmas);

        // 17. CD LEGANÉS
        Equipo leganes = new Equipo("CD Leganés");
        leganes.setTecnicoEquipo(new Tecnico("Borja Jiménez", "T17", "CD Leganés", "España"));
        leganes.agregarJugador(new Jugador("Marko Dmitrović", "LEG01", 13, Posicion.PORTERO, LocalDate.of(1992, 1, 24), "Serbia"));
        leganes.agregarJugador(new Jugador("Valentin Rosier", "LEG02", 12, Posicion.LATERAL, LocalDate.of(1996, 8, 19), "Francia"));
        leganes.agregarJugador(new Jugador("Sergio González", "LEG03", 6, Posicion.DEFENSA, LocalDate.of(1992, 4, 20), "España"));
        leganes.agregarJugador(new Jugador("Matija Nastasić", "LEG04", 22, Posicion.DEFENSA, LocalDate.of(1993, 3, 28), "Serbia"));
        leganes.agregarJugador(new Jugador("Javi Hernández", "LEG05", 20, Posicion.LATERAL, LocalDate.of(1998, 5, 2), "España"));
        leganes.agregarJugador(new Jugador("Renato Tapia", "LEG06", 5, Posicion.VOLANTE, LocalDate.of(1995, 7, 28), "Perú"));
        leganes.agregarJugador(new Jugador("Yvan Neyou", "LEG07", 17, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 1, 3), "Camerún"));
        leganes.agregarJugador(new Jugador("Seydouba Cissé", "LEG08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 2, 10), "Guinea"));
        leganes.agregarJugador(new Jugador("Juan Cruz", "LEG09", 11, Posicion.EXTREMO, LocalDate.of(2000, 4, 25), "España"));
        leganes.agregarJugador(new Jugador("Dani Raba", "LEG10", 10, Posicion.EXTREMO, LocalDate.of(1995, 10, 29), "España"));
        leganes.agregarJugador(new Jugador("Miguel de la Fuente", "LEG11", 9, Posicion.DELANTERO, LocalDate.of(1999, 9, 3), "España"));
        equipos.add(leganes);

        // 18. RCD ESPANYOL
        Equipo espanyol = new Equipo("RCD Espanyol");
        espanyol.setTecnicoEquipo(new Tecnico("Manolo González", "T18", "RCD Espanyol", "España"));
        espanyol.agregarJugador(new Jugador("Joan García", "ESP01", 1, Posicion.PORTERO, LocalDate.of(2001, 5, 4), "España"));
        espanyol.agregarJugador(new Jugador("Omar El Hilali", "ESP02", 23, Posicion.LATERAL, LocalDate.of(2003, 9, 12), "Marruecos"));
        espanyol.agregarJugador(new Jugador("Marash Kumbulla", "ESP03", 4, Posicion.DEFENSA, LocalDate.of(2000, 2, 8), "Albania"));
        espanyol.agregarJugador(new Jugador("Leandro Cabrera", "ESP04", 6, Posicion.DEFENSA, LocalDate.of(1991, 6, 17), "Uruguay"));
        espanyol.agregarJugador(new Jugador("Carlos Romero", "ESP05", 22, Posicion.LATERAL, LocalDate.of(2001, 10, 29), "España"));
        espanyol.agregarJugador(new Jugador("Alex Král", "ESP06", 20, Posicion.VOLANTE, LocalDate.of(1998, 5, 19), "República Checa"));
        espanyol.agregarJugador(new Jugador("Pol Lozano", "ESP07", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 10, 6), "España"));
        espanyol.agregarJugador(new Jugador("Álvaro Tejero", "ESP08", 12, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 7, 20), "España"));
        espanyol.agregarJugador(new Jugador("Jofre Carreras", "ESP09", 17, Posicion.EXTREMO, LocalDate.of(2001, 6, 17), "España"));
        espanyol.agregarJugador(new Jugador("Javi Puado", "ESP10", 7, Posicion.EXTREMO, LocalDate.of(1998, 5, 25), "España"));
        espanyol.agregarJugador(new Jugador("Alejo Véliz", "ESP11", 9, Posicion.DELANTERO, LocalDate.of(2003, 9, 19), "Argentina"));
        equipos.add(espanyol);

        // 19. REAL VALLADOLID
        Equipo valladolid = new Equipo("Real Valladolid");
        valladolid.setTecnicoEquipo(new Tecnico("Paulo Pezzolano", "T19", "Real Valladolid", "Uruguay"));
        valladolid.agregarJugador(new Jugador("Karl Hein", "VAL01", 13, Posicion.PORTERO, LocalDate.of(2002, 4, 13), "Estonia"));
        valladolid.agregarJugador(new Jugador("Luis Pérez", "VAL02", 2, Posicion.LATERAL, LocalDate.of(1995, 2, 4), "España"));
        valladolid.agregarJugador(new Jugador("Javi Sánchez", "VAL03", 5, Posicion.DEFENSA, LocalDate.of(1997, 3, 14), "España"));
        valladolid.agregarJugador(new Jugador("Abdulai Juma Bah", "VAL04", 35, Posicion.DEFENSA, LocalDate.of(2006, 4, 11), "Sierra Leona"));
        valladolid.agregarJugador(new Jugador("Lucas Rosa", "VAL05", 22, Posicion.LATERAL, LocalDate.of(2000, 4, 3), "Brasil"));
        valladolid.agregarJugador(new Jugador("Eray Cömert", "VAL06", 15, Posicion.VOLANTE, LocalDate.of(1998, 2, 4), "Suiza"));
        valladolid.agregarJugador(new Jugador("Mario Martín", "VAL07", 12, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 3, 5), "España"));
        valladolid.agregarJugador(new Jugador("Selim Amallah", "VAL08", 21, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 11, 15), "Marruecos"));
        valladolid.agregarJugador(new Jugador("Anuar Tuhami", "VAL09", 23, Posicion.EXTREMO, LocalDate.of(1995, 1, 15), "Marruecos"));
        valladolid.agregarJugador(new Jugador("Raúl Moro", "VAL10", 11, Posicion.EXTREMO, LocalDate.of(2002, 12, 5), "España"));
        valladolid.agregarJugador(new Jugador("Mamadou Sylla", "VAL11", 7, Posicion.DELANTERO, LocalDate.of(1994, 3, 20), "Senegal"));
        equipos.add(valladolid);

        // 20. VALENCIA CF
        Equipo valencia = new Equipo("Valencia CF");
        valencia.setTecnicoEquipo(new Tecnico("Rubén Baraja", "T20", "Valencia CF", "España"));
        valencia.agregarJugador(new Jugador("Giorgi Mamardashvili", "VCF01", 25, Posicion.PORTERO, LocalDate.of(2000, 9, 29), "Georgia"));
        valencia.agregarJugador(new Jugador("Thierry Correia", "VCF02", 12, Posicion.LATERAL, LocalDate.of(1999, 3, 9), "Portugal"));
        valencia.agregarJugador(new Jugador("Cristhian Mosquera", "VCF03", 3, Posicion.DEFENSA, LocalDate.of(2004, 6, 27), "España"));
        valencia.agregarJugador(new Jugador("César Tárrega", "VCF04", 15, Posicion.DEFENSA, LocalDate.of(2002, 2, 26), "España"));
        valencia.agregarJugador(new Jugador("José Gayà", "VCF05", 14, Posicion.LATERAL, LocalDate.of(1995, 5, 25), "España"));
        valencia.agregarJugador(new Jugador("Pepelu", "VCF06", 18, Posicion.VOLANTE, LocalDate.of(1998, 8, 11), "España"));
        valencia.agregarJugador(new Jugador("Enzo Barrenechea", "VCF07", 5, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 5, 22), "Argentina"));
        valencia.agregarJugador(new Jugador("Javi Guerra", "VCF08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 5, 13), "España"));
        valencia.agregarJugador(new Jugador("Diego López", "VCF09", 16, Posicion.EXTREMO, LocalDate.of(2002, 5, 13), "España"));
        valencia.agregarJugador(new Jugador("Luis Rioja", "VCF10", 22, Posicion.EXTREMO, LocalDate.of(1993, 10, 16), "España"));
        valencia.agregarJugador(new Jugador("Hugo Duro", "VCF11", 9, Posicion.DELANTERO, LocalDate.of(1999, 11, 10), "España"));
        equipos.add(valencia);

        return equipos;
    }
}
