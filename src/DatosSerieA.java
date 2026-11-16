import java.time.LocalDate;
import java.util.ArrayList;

public class DatosSerieA {

    public static ArrayList<Equipo> cargarEquiposSerieA() {
        ArrayList<Equipo> equipos = new ArrayList<>();

        // 1. ATALANTA BC
        Equipo atalanta = new Equipo("Atalanta BC");
        atalanta.setTecnicoEquipo(new Tecnico("Gian Piero Gasperini", "SA_T01", "Atalanta BC", "Italia"));
        atalanta.agregarJugador(new Jugador("Marco Carnesecchi", "ATA01", 29, Posicion.PORTERO, LocalDate.of(2000, 7, 1), "Italia"));
        atalanta.agregarJugador(new Jugador("Berat Djimsiti", "ATA02", 19, Posicion.DEFENSA, LocalDate.of(1993, 2, 19), "Albania"));
        atalanta.agregarJugador(new Jugador("Isak Hien", "ATA03", 4, Posicion.DEFENSA, LocalDate.of(1999, 1, 13), "Suecia"));
        atalanta.agregarJugador(new Jugador("Sead Kolašinac", "ATA04", 23, Posicion.DEFENSA, LocalDate.of(1993, 6, 20), "Bosnia y Herzegovina"));
        atalanta.agregarJugador(new Jugador("Raoul Bellanova", "ATA05", 16, Posicion.LATERAL, LocalDate.of(2000, 5, 17), "Italia"));
        atalanta.agregarJugador(new Jugador("Marten de Roon", "ATA06", 15, Posicion.VOLANTE, LocalDate.of(1991, 3, 29), "Países Bajos"));
        atalanta.agregarJugador(new Jugador("Éderson", "ATA07", 13, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 7, 7), "Brasil"));
        atalanta.agregarJugador(new Jugador("Matteo Ruggeri", "ATA08", 22, Posicion.LATERAL, LocalDate.of(2002, 7, 11), "Italia"));
        atalanta.agregarJugador(new Jugador("Charles De Ketelaere", "ATA09", 17, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 3, 10), "Bélgica"));
        atalanta.agregarJugador(new Jugador("Ademola Lookman", "ATA10", 11, Posicion.EXTREMO, LocalDate.of(1997, 10, 20), "Nigeria"));
        atalanta.agregarJugador(new Jugador("Mateo Retegui", "ATA11", 32, Posicion.DELANTERO, LocalDate.of(1999, 4, 29), "Italia"));
        equipos.add(atalanta);

        // 2. BOLOGNA FC
        Equipo bologna = new Equipo("Bologna FC");
        bologna.setTecnicoEquipo(new Tecnico("Vincenzo Italiano", "SA_T02", "Bologna FC", "Italia"));
        bologna.agregarJugador(new Jugador("Łukasz Skorupski", "BOL01", 1, Posicion.PORTERO, LocalDate.of(1991, 5, 5), "Polonia"));
        bologna.agregarJugador(new Jugador("Stefan Posch", "BOL02", 3, Posicion.LATERAL, LocalDate.of(1997, 5, 14), "Austria"));
        bologna.agregarJugador(new Jugador("Sam Beukema", "BOL03", 31, Posicion.DEFENSA, LocalDate.of(1998, 11, 17), "Países Bajos"));
        bologna.agregarJugador(new Jugador("Jhon Lucumí", "BOL04", 26, Posicion.DEFENSA, LocalDate.of(1998, 6, 26), "Colombia"));
        bologna.agregarJugador(new Jugador("Juan Miranda", "BOL05", 33, Posicion.LATERAL, LocalDate.of(2000, 1, 19), "España"));
        bologna.agregarJugador(new Jugador("Remo Freuler", "BOL06", 8, Posicion.VOLANTE, LocalDate.of(1992, 4, 15), "Suiza"));
        bologna.agregarJugador(new Jugador("Nikola Moro", "BOL07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 3, 12), "Croacia"));
        bologna.agregarJugador(new Jugador("Giovanni Fabbian", "BOL08", 80, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 1, 14), "Italia"));
        bologna.agregarJugador(new Jugador("Riccardo Orsolini", "BOL09", 7, Posicion.EXTREMO, LocalDate.of(1997, 1, 24), "Italia"));
        bologna.agregarJugador(new Jugador("Dan Ndoye", "BOL10", 11, Posicion.EXTREMO, LocalDate.of(2000, 10, 25), "Suiza"));
        bologna.agregarJugador(new Jugador("Santiago Castro", "BOL11", 9, Posicion.DELANTERO, LocalDate.of(2004, 9, 18), "Argentina"));
        equipos.add(bologna);

        // 3. CAGLIARI CALCIO
        Equipo cagliari = new Equipo("Cagliari Calcio");
        cagliari.setTecnicoEquipo(new Tecnico("Davide Nicola", "SA_T03", "Cagliari Calcio", "Italia"));
        cagliari.agregarJugador(new Jugador("Simone Scuffet", "CAG01", 22, Posicion.PORTERO, LocalDate.of(1996, 5, 31), "Italia"));
        cagliari.agregarJugador(new Jugador("Gabriele Zappa", "CAG02", 28, Posicion.LATERAL, LocalDate.of(1999, 12, 22), "Italia"));
        cagliari.agregarJugador(new Jugador("Yerry Mina", "CAG03", 26, Posicion.DEFENSA, LocalDate.of(1994, 9, 23), "Colombia"));
        cagliari.agregarJugador(new Jugador("Sebastiano Luperto", "CAG04", 6, Posicion.DEFENSA, LocalDate.of(1996, 9, 6), "Italia"));
        cagliari.agregarJugador(new Jugador("Tommaso Augello", "CAG05", 3, Posicion.LATERAL, LocalDate.of(1994, 8, 30), "Italia"));
        cagliari.agregarJugador(new Jugador("Michel Adopo", "CAG06", 8, Posicion.VOLANTE, LocalDate.of(2000, 7, 19), "Francia"));
        cagliari.agregarJugador(new Jugador("Antoine Makoumbou", "CAG07", 29, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 7, 18), "Congo"));
        cagliari.agregarJugador(new Jugador("Nicolas Viola", "CAG08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1989, 10, 12), "Italia"));
        cagliari.agregarJugador(new Jugador("Nadir Zortea", "CAG09", 19, Posicion.EXTREMO, LocalDate.of(1999, 6, 19), "Italia"));
        cagliari.agregarJugador(new Jugador("Zito Luvumbo", "CAG10", 77, Posicion.EXTREMO, LocalDate.of(2002, 3, 9), "Angola"));
        cagliari.agregarJugador(new Jugador("Roberto Piccoli", "CAG11", 91, Posicion.DELANTERO, LocalDate.of(2001, 1, 27), "Italia"));
        equipos.add(cagliari);

        // 4. COMO 1907
        Equipo como = new Equipo("Como 1907");
        como.setTecnicoEquipo(new Tecnico("Cesc Fàbregas", "SA_T04", "Como 1907", "España"));
        como.agregarJugador(new Jugador("Pepe Reina", "COM01", 25, Posicion.PORTERO, LocalDate.of(1982, 8, 31), "España"));
        como.agregarJugador(new Jugador("Ignace Van der Brempt", "COM02", 77, Posicion.LATERAL, LocalDate.of(2002, 4, 1), "Bélgica"));
        como.agregarJugador(new Jugador("Alberto Dossena", "COM03", 13, Posicion.DEFENSA, LocalDate.of(1998, 10, 13), "Italia"));
        como.agregarJugador(new Jugador("Marc Oliver Kempf", "COM04", 2, Posicion.DEFENSA, LocalDate.of(1995, 1, 28), "Alemania"));
        como.agregarJugador(new Jugador("Alberto Moreno", "COM05", 18, Posicion.LATERAL, LocalDate.of(1992, 7, 5), "España"));
        como.agregarJugador(new Jugador("Máximo Perrone", "COM06", 23, Posicion.VOLANTE, LocalDate.of(2003, 1, 7), "Argentina"));
        como.agregarJugador(new Jugador("Sergi Roberto", "COM07", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(1992, 2, 7), "España"));
        como.agregarJugador(new Jugador("Nico Paz", "COM08", 79, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 9, 8), "Argentina"));
        como.agregarJugador(new Jugador("Gabriel Strefezza", "COM09", 7, Posicion.EXTREMO, LocalDate.of(1997, 4, 18), "Brasil"));
        como.agregarJugador(new Jugador("Alieu Fadera", "COM10", 16, Posicion.EXTREMO, LocalDate.of(2001, 11, 3), "Gambia"));
        como.agregarJugador(new Jugador("Patrick Cutrone", "COM11", 10, Posicion.DELANTERO, LocalDate.of(1998, 1, 3), "Italia"));
        equipos.add(como);

        // 5. EMPOLI FC
        Equipo empoli = new Equipo("Empoli FC");
        empoli.setTecnicoEquipo(new Tecnico("Roberto D'Aversa", "SA_T05", "Empoli FC", "Italia"));
        empoli.agregarJugador(new Jugador("Devis Vásquez", "EMP01", 23, Posicion.PORTERO, LocalDate.of(1998, 5, 12), "Colombia"));
        empoli.agregarJugador(new Jugador("Saba Goglichidze", "EMP02", 2, Posicion.DEFENSA, LocalDate.of(2004, 6, 25), "Georgia"));
        empoli.agregarJugador(new Jugador("Ardian Ismajli", "EMP03", 34, Posicion.DEFENSA, LocalDate.of(1996, 9, 30), "Albania"));
        empoli.agregarJugador(new Jugador("Mattia Viti", "EMP04", 21, Posicion.DEFENSA, LocalDate.of(2002, 1, 24), "Italia"));
        empoli.agregarJugador(new Jugador("Emmanuel Gyasi", "EMP05", 11, Posicion.LATERAL, LocalDate.of(1994, 1, 11), "Ghana"));
        empoli.agregarJugador(new Jugador("Alberto Grassi", "EMP06", 5, Posicion.VOLANTE, LocalDate.of(1995, 3, 7), "Italia"));
        empoli.agregarJugador(new Jugador("Liam Henderson", "EMP07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 4, 25), "Escocia"));
        empoli.agregarJugador(new Jugador("Giuseppe Pezzella", "EMP08", 3, Posicion.LATERAL, LocalDate.of(1997, 11, 29), "Italia"));
        empoli.agregarJugador(new Jugador("Jacopo Fazzini", "EMP09", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 3, 16), "Italia"));
        empoli.agregarJugador(new Jugador("Sebastiano Esposito", "EMP10", 99, Posicion.DELANTERO, LocalDate.of(2002, 7, 2), "Italia"));
        empoli.agregarJugador(new Jugador("Lorenzo Colombo", "EMP11", 29, Posicion.DELANTERO, LocalDate.of(2002, 3, 8), "Italia"));
        equipos.add(empoli);

        // 6. ACF FIORENTINA
        Equipo fiorentina = new Equipo("ACF Fiorentina");
        fiorentina.setTecnicoEquipo(new Tecnico("Raffaele Palladino", "SA_T06", "ACF Fiorentina", "Italia"));
        fiorentina.agregarJugador(new Jugador("David de Gea", "FIO01", 43, Posicion.PORTERO, LocalDate.of(1990, 11, 7), "España"));
        fiorentina.agregarJugador(new Jugador("Dodô", "FIO02", 2, Posicion.LATERAL, LocalDate.of(1998, 11, 17), "Brasil"));
        fiorentina.agregarJugador(new Jugador("Pietro Comuzzo", "FIO03", 15, Posicion.DEFENSA, LocalDate.of(2005, 2, 20), "Italia"));
        fiorentina.agregarJugador(new Jugador("Luca Ranieri", "FIO04", 6, Posicion.DEFENSA, LocalDate.of(1999, 4, 23), "Italia"));
        fiorentina.agregarJugador(new Jugador("Robin Gosens", "FIO05", 21, Posicion.LATERAL, LocalDate.of(1994, 7, 5), "Alemania"));
        fiorentina.agregarJugador(new Jugador("Danilo Cataldi", "FIO06", 32, Posicion.VOLANTE, LocalDate.of(1994, 8, 6), "Italia"));
        fiorentina.agregarJugador(new Jugador("Yacine Adli", "FIO07", 29, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 7, 29), "Francia"));
        fiorentina.agregarJugador(new Jugador("Edoardo Bove", "FIO08", 4, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 5, 16), "Italia"));
        fiorentina.agregarJugador(new Jugador("Andrea Colpani", "FIO09", 23, Posicion.EXTREMO, LocalDate.of(1999, 5, 11), "Italia"));
        fiorentina.agregarJugador(new Jugador("Riccardo Sottil", "FIO10", 7, Posicion.EXTREMO, LocalDate.of(1999, 6, 3), "Italia"));
        fiorentina.agregarJugador(new Jugador("Moise Kean", "FIO11", 20, Posicion.DELANTERO, LocalDate.of(2000, 2, 28), "Italia"));
        equipos.add(fiorentina);

        // 7. GENOA CFC
        Equipo genoa = new Equipo("Genoa CFC");
        genoa.setTecnicoEquipo(new Tecnico("Patrick Vieira", "SA_T07", "Genoa CFC", "Francia"));
        genoa.agregarJugador(new Jugador("Nicola Leali", "GEN01", 1, Posicion.PORTERO, LocalDate.of(1993, 2, 17), "Italia"));
        genoa.agregarJugador(new Jugador("Stefano Sabelli", "GEN02", 20, Posicion.LATERAL, LocalDate.of(1993, 1, 13), "Italia"));
        genoa.agregarJugador(new Jugador("Mattia Bani", "GEN03", 13, Posicion.DEFENSA, LocalDate.of(1993, 12, 10), "Italia"));
        genoa.agregarJugador(new Jugador("Johan Vásquez", "GEN04", 22, Posicion.DEFENSA, LocalDate.of(1998, 10, 22), "México"));
        genoa.agregarJugador(new Jugador("Aarón Martín", "GEN05", 3, Posicion.LATERAL, LocalDate.of(1997, 4, 22), "España"));
        genoa.agregarJugador(new Jugador("Milan Badelj", "GEN06", 47, Posicion.VOLANTE, LocalDate.of(1989, 2, 25), "Croacia"));
        genoa.agregarJugador(new Jugador("Morten Frendrup", "GEN07", 32, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 4, 7), "Dinamarca"));
        genoa.agregarJugador(new Jugador("Morten Thorsby", "GEN08", 2, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 5, 5), "Noruega"));
        genoa.agregarJugador(new Jugador("Alessandro Zanoli", "GEN09", 59, Posicion.EXTREMO, LocalDate.of(2000, 10, 3), "Italia"));
        genoa.agregarJugador(new Jugador("Fabio Miretti", "GEN10", 23, Posicion.EXTREMO, LocalDate.of(2003, 8, 3), "Italia"));
        genoa.agregarJugador(new Jugador("Andrea Pinamonti", "GEN11", 19, Posicion.DELANTERO, LocalDate.of(1999, 5, 19), "Italia"));
        equipos.add(genoa);

        // 8. HELLAS VERONA
        Equipo verona = new Equipo("Hellas Verona");
        verona.setTecnicoEquipo(new Tecnico("Paolo Zanetti", "SA_T08", "Hellas Verona", "Italia"));
        verona.agregarJugador(new Jugador("Lorenzo Montipò", "VER01", 1, Posicion.PORTERO, LocalDate.of(1996, 2, 20), "Italia"));
        verona.agregarJugador(new Jugador("Jackson Tchatchoua", "VER02", 38, Posicion.LATERAL, LocalDate.of(2001, 9, 14), "Camerún"));
        verona.agregarJugador(new Jugador("Diego Coppola", "VER03", 42, Posicion.DEFENSA, LocalDate.of(2003, 12, 28), "Italia"));
        verona.agregarJugador(new Jugador("Giangiacomo Magnani", "VER04", 23, Posicion.DEFENSA, LocalDate.of(1995, 10, 4), "Italia"));
        verona.agregarJugador(new Jugador("Domagoj Bradarić", "VER05", 12, Posicion.LATERAL, LocalDate.of(1999, 12, 10), "Croacia"));
        verona.agregarJugador(new Jugador("Reda Belahyane", "VER06", 6, Posicion.VOLANTE, LocalDate.of(2004, 6, 1), "Marruecos"));
        verona.agregarJugador(new Jugador("Ondrej Duda", "VER07", 33, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 12, 5), "Eslovaquia"));
        verona.agregarJugador(new Jugador("Suat Serdar", "VER08", 25, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 4, 11), "Alemania"));
        verona.agregarJugador(new Jugador("Tomáš Suslov", "VER09", 31, Posicion.EXTREMO, LocalDate.of(2002, 6, 7), "Eslovaquia"));
        verona.agregarJugador(new Jugador("Darko Lazović", "VER10", 8, Posicion.EXTREMO, LocalDate.of(1990, 9, 15), "Serbia"));
        verona.agregarJugador(new Jugador("Casper Tengstedt", "VER11", 11, Posicion.DELANTERO, LocalDate.of(2000, 6, 1), "Dinamarca"));
        equipos.add(verona);

        // 9. INTER DE MILÁN
        Equipo inter = new Equipo("Inter de Milán");
        inter.setTecnicoEquipo(new Tecnico("Simone Inzaghi", "SA_T09", "Inter de Milán", "Italia"));
        inter.agregarJugador(new Jugador("Yann Sommer", "INT01", 1, Posicion.PORTERO, LocalDate.of(1988, 12, 17), "Suiza"));
        inter.agregarJugador(new Jugador("Benjamin Pavard", "INT02", 28, Posicion.DEFENSA, LocalDate.of(1996, 3, 28), "Francia"));
        inter.agregarJugador(new Jugador("Stefan de Vrij", "INT03", 6, Posicion.DEFENSA, LocalDate.of(1992, 2, 5), "Países Bajos"));
        inter.agregarJugador(new Jugador("Alessandro Bastoni", "INT04", 95, Posicion.DEFENSA, LocalDate.of(1999, 4, 13), "Italia"));
        inter.agregarJugador(new Jugador("Denzel Dumfries", "INT05", 2, Posicion.LATERAL, LocalDate.of(1996, 4, 18), "Países Bajos"));
        inter.agregarJugador(new Jugador("Hakan Çalhanoğlu", "INT06", 20, Posicion.VOLANTE, LocalDate.of(1994, 2, 8), "Turquía"));
        inter.agregarJugador(new Jugador("Nicolò Barella", "INT07", 23, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 2, 7), "Italia"));
        inter.agregarJugador(new Jugador("Henrikh Mkhitaryan", "INT08", 22, Posicion.MEDIOCAMPISTA, LocalDate.of(1989, 1, 21), "Armenia"));
        inter.agregarJugador(new Jugador("Federico Dimarco", "INT09", 32, Posicion.LATERAL, LocalDate.of(1997, 11, 10), "Italia"));
        inter.agregarJugador(new Jugador("Marcus Thuram", "INT10", 9, Posicion.DELANTERO, LocalDate.of(1997, 8, 6), "Francia"));
        inter.agregarJugador(new Jugador("Lautaro Martínez", "INT11", 10, Posicion.DELANTERO, LocalDate.of(1997, 8, 22), "Argentina"));
        equipos.add(inter);

        // 10. JUVENTUS FC
        Equipo juventus = new Equipo("Juventus FC");
        juventus.setTecnicoEquipo(new Tecnico("Thiago Motta", "SA_T10", "Juventus FC", "Italia"));
        juventus.agregarJugador(new Jugador("Michele Di Gregorio", "JUV01", 29, Posicion.PORTERO, LocalDate.of(1997, 7, 27), "Italia"));
        juventus.agregarJugador(new Jugador("Nicolò Savona", "JUV02", 37, Posicion.LATERAL, LocalDate.of(2003, 3, 19), "Italia"));
        juventus.agregarJugador(new Jugador("Federico Gatti", "JUV03", 4, Posicion.DEFENSA, LocalDate.of(1998, 6, 24), "Italia"));
        juventus.agregarJugador(new Jugador("Pierre Kalulu", "JUV04", 15, Posicion.DEFENSA, LocalDate.of(2000, 6, 5), "Francia"));
        juventus.agregarJugador(new Jugador("Andrea Cambiaso", "JUV05", 27, Posicion.LATERAL, LocalDate.of(2000, 2, 20), "Italia"));
        juventus.agregarJugador(new Jugador("Manuel Locatelli", "JUV06", 5, Posicion.VOLANTE, LocalDate.of(1998, 1, 8), "Italia"));
        juventus.agregarJugador(new Jugador("Khéphren Thuram", "JUV07", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 3, 26), "Francia"));
        juventus.agregarJugador(new Jugador("Teun Koopmeiners", "JUV08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 2, 28), "Países Bajos"));
        juventus.agregarJugador(new Jugador("Francisco Conceição", "JUV09", 7, Posicion.EXTREMO, LocalDate.of(2002, 12, 14), "Portugal"));
        juventus.agregarJugador(new Jugador("Kenan Yıldız", "JUV10", 10, Posicion.EXTREMO, LocalDate.of(2005, 5, 4), "Turquía"));
        juventus.agregarJugador(new Jugador("Dušan Vlahović", "JUV11", 9, Posicion.DELANTERO, LocalDate.of(2000, 1, 28), "Serbia"));
        equipos.add(juventus);

        // 11. SS LAZIO
        Equipo lazio = new Equipo("SS Lazio");
        lazio.setTecnicoEquipo(new Tecnico("Marco Baroni", "SA_T11", "SS Lazio", "Italia"));
        lazio.agregarJugador(new Jugador("Ivan Provedel", "LAZ01", 94, Posicion.PORTERO, LocalDate.of(1994, 3, 17), "Italia"));
        lazio.agregarJugador(new Jugador("Adam Marušić", "LAZ02", 77, Posicion.LATERAL, LocalDate.of(1992, 10, 17), "Montenegro"));
        lazio.agregarJugador(new Jugador("Mario Gila", "LAZ03", 34, Posicion.DEFENSA, LocalDate.of(2000, 8, 29), "España"));
        lazio.agregarJugador(new Jugador("Alessio Romagnoli", "LAZ04", 13, Posicion.DEFENSA, LocalDate.of(1995, 1, 12), "Italia"));
        lazio.agregarJugador(new Jugador("Nuno Tavares", "LAZ05", 30, Posicion.LATERAL, LocalDate.of(2000, 1, 26), "Portugal"));
        lazio.agregarJugador(new Jugador("Nicolò Rovella", "LAZ06", 6, Posicion.VOLANTE, LocalDate.of(2001, 12, 4), "Italia"));
        lazio.agregarJugador(new Jugador("Mattéo Guendouzi", "LAZ07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 4, 14), "Francia"));
        lazio.agregarJugador(new Jugador("Boulaye Dia", "LAZ08", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 11, 16), "Senegal"));
        lazio.agregarJugador(new Jugador("Gustav Isaksen", "LAZ09", 18, Posicion.EXTREMO, LocalDate.of(2001, 4, 19), "Dinamarca"));
        lazio.agregarJugador(new Jugador("Mattia Zaccagni", "LAZ10", 10, Posicion.EXTREMO, LocalDate.of(1995, 6, 16), "Italia"));
        lazio.agregarJugador(new Jugador("Valentín Castellanos", "LAZ11", 11, Posicion.DELANTERO, LocalDate.of(1998, 10, 3), "Argentina"));
        equipos.add(lazio);

        // 12. US LECCE
        Equipo lecce = new Equipo("US Lecce");
        lecce.setTecnicoEquipo(new Tecnico("Marco Giampaolo", "SA_T12", "US Lecce", "Italia"));
        lecce.agregarJugador(new Jugador("Wladimiro Falcone", "LEC01", 30, Posicion.PORTERO, LocalDate.of(1995, 4, 12), "Italia"));
        lecce.agregarJugador(new Jugador("Frédéric Guilbert", "LEC02", 12, Posicion.LATERAL, LocalDate.of(1994, 12, 24), "Francia"));
        lecce.agregarJugador(new Jugador("Kialonda Gaspar", "LEC03", 4, Posicion.DEFENSA, LocalDate.of(1997, 9, 27), "Angola"));
        lecce.agregarJugador(new Jugador("Federico Baschirotto", "LEC04", 6, Posicion.DEFENSA, LocalDate.of(1996, 9, 20), "Italia"));
        lecce.agregarJugador(new Jugador("Antonino Gallo", "LEC05", 25, Posicion.LATERAL, LocalDate.of(2000, 1, 5), "Italia"));
        lecce.agregarJugador(new Jugador("Ylber Ramadani", "LEC06", 20, Posicion.VOLANTE, LocalDate.of(1996, 4, 12), "Albania"));
        lecce.agregarJugador(new Jugador("Lassana Coulibaly", "LEC07", 29, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 4, 10), "Malí"));
        lecce.agregarJugador(new Jugador("Hamza Rafia", "LEC08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 4, 2), "Túnez"));
        lecce.agregarJugador(new Jugador("Patrick Dorgu", "LEC09", 13, Posicion.EXTREMO, LocalDate.of(2004, 10, 26), "Dinamarca"));
        lecce.agregarJugador(new Jugador("Tete Morente", "LEC10", 7, Posicion.EXTREMO, LocalDate.of(1996, 12, 4), "España"));
        lecce.agregarJugador(new Jugador("Nikola Krstović", "LEC11", 9, Posicion.DELANTERO, LocalDate.of(2000, 4, 5), "Montenegro"));
        equipos.add(lecce);

        // 13. AC MILAN
        Equipo milan = new Equipo("AC Milan");
        milan.setTecnicoEquipo(new Tecnico("Sérgio Conceição", "SA_T13", "AC Milan", "Portugal"));
        milan.agregarJugador(new Jugador("Mike Maignan", "MIL01", 16, Posicion.PORTERO, LocalDate.of(1995, 7, 3), "Francia"));
        milan.agregarJugador(new Jugador("Emerson Royal", "MIL02", 22, Posicion.LATERAL, LocalDate.of(1999, 1, 14), "Brasil"));
        milan.agregarJugador(new Jugador("Matteo Gabbia", "MIL03", 46, Posicion.DEFENSA, LocalDate.of(1999, 10, 21), "Italia"));
        milan.agregarJugador(new Jugador("Malick Thiaw", "MIL04", 28, Posicion.DEFENSA, LocalDate.of(2001, 8, 8), "Alemania"));
        milan.agregarJugador(new Jugador("Theo Hernández", "MIL05", 19, Posicion.LATERAL, LocalDate.of(1997, 10, 6), "Francia"));
        milan.agregarJugador(new Jugador("Youssouf Fofana", "MIL06", 29, Posicion.VOLANTE, LocalDate.of(1999, 1, 10), "Francia"));
        milan.agregarJugador(new Jugador("Tijjani Reijnders", "MIL07", 14, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 7, 29), "Países Bajos"));
        milan.agregarJugador(new Jugador("Christian Pulisic", "MIL08", 11, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 9, 18), "Estados Unidos"));
        milan.agregarJugador(new Jugador("Samuel Chukwueze", "MIL09", 21, Posicion.EXTREMO, LocalDate.of(1999, 5, 22), "Nigeria"));
        milan.agregarJugador(new Jugador("Rafael Leão", "MIL10", 10, Posicion.EXTREMO, LocalDate.of(1999, 6, 10), "Portugal"));
        milan.agregarJugador(new Jugador("Álvaro Morata", "MIL11", 7, Posicion.DELANTERO, LocalDate.of(1992, 10, 23), "España"));
        equipos.add(milan);

        // 14. AC MONZA
        Equipo monza = new Equipo("AC Monza");
        monza.setTecnicoEquipo(new Tecnico("Alessandro Nesta", "SA_T14", "AC Monza", "Italia"));
        monza.agregarJugador(new Jugador("Stefano Turati", "MON01", 30, Posicion.PORTERO, LocalDate.of(2001, 9, 5), "Italia"));
        monza.agregarJugador(new Jugador("Armando Izzo", "MON02", 4, Posicion.DEFENSA, LocalDate.of(1992, 3, 2), "Italia"));
        monza.agregarJugador(new Jugador("Pablo Marí", "MON03", 22, Posicion.DEFENSA, LocalDate.of(1993, 8, 31), "España"));
        monza.agregarJugador(new Jugador("Andrea Carboni", "MON04", 44, Posicion.DEFENSA, LocalDate.of(2001, 2, 4), "Italia"));
        monza.agregarJugador(new Jugador("Pedro Pereira", "MON05", 13, Posicion.LATERAL, LocalDate.of(1998, 1, 22), "Portugal"));
        monza.agregarJugador(new Jugador("Warren Bondo", "MON06", 38, Posicion.VOLANTE, LocalDate.of(2003, 9, 15), "Francia"));
        monza.agregarJugador(new Jugador("Matteo Pessina", "MON07", 32, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 4, 21), "Italia"));
        monza.agregarJugador(new Jugador("Georgios Kyriakopoulos", "MON08", 77, Posicion.LATERAL, LocalDate.of(1996, 2, 5), "Grecia"));
        monza.agregarJugador(new Jugador("Dany Mota", "MON09", 47, Posicion.EXTREMO, LocalDate.of(1998, 5, 2), "Portugal"));
        monza.agregarJugador(new Jugador("Daniel Maldini", "MON10", 14, Posicion.EXTREMO, LocalDate.of(2001, 10, 11), "Italia"));
        monza.agregarJugador(new Jugador("Milan Đurić", "MON11", 11, Posicion.DELANTERO, LocalDate.of(1990, 5, 22), "Bosnia y Herzegovina"));
        equipos.add(monza);

        // 15. SSC NAPOLI
        Equipo napoli = new Equipo("SSC Napoli");
        napoli.setTecnicoEquipo(new Tecnico("Antonio Conte", "SA_T15", "SSC Napoli", "Italia"));
        napoli.agregarJugador(new Jugador("Alex Meret", "NAP01", 1, Posicion.PORTERO, LocalDate.of(1997, 3, 22), "Italia"));
        napoli.agregarJugador(new Jugador("Giovanni Di Lorenzo", "NAP02", 22, Posicion.LATERAL, LocalDate.of(1993, 8, 4), "Italia"));
        napoli.agregarJugador(new Jugador("Amir Rrahmani", "NAP03", 13, Posicion.DEFENSA, LocalDate.of(1994, 2, 24), "Kosovo"));
        napoli.agregarJugador(new Jugador("Alessandro Buongiorno", "NAP04", 4, Posicion.DEFENSA, LocalDate.of(1999, 6, 6), "Italia"));
        napoli.agregarJugador(new Jugador("Mathías Olivera", "NAP05", 17, Posicion.LATERAL, LocalDate.of(1997, 10, 31), "Uruguay"));
        napoli.agregarJugador(new Jugador("Stanislav Lobotka", "NAP06", 68, Posicion.VOLANTE, LocalDate.of(1994, 11, 25), "Eslovaquia"));
        napoli.agregarJugador(new Jugador("André-Frank Zambo Anguissa", "NAP07", 99, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 11, 16), "Camerún"));
        napoli.agregarJugador(new Jugador("Scott McTominay", "NAP08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 12, 8), "Escocia"));
        napoli.agregarJugador(new Jugador("Matteo Politano", "NAP09", 21, Posicion.EXTREMO, LocalDate.of(1993, 8, 3), "Italia"));
        napoli.agregarJugador(new Jugador("Khvicha Kvaratskhelia", "NAP10", 77, Posicion.EXTREMO, LocalDate.of(2001, 2, 12), "Georgia"));
        napoli.agregarJugador(new Jugador("Romelu Lukaku", "NAP11", 11, Posicion.DELANTERO, LocalDate.of(1993, 5, 13), "Bélgica"));
        equipos.add(napoli);

        // 16. PARMA CALCIO
        Equipo parma = new Equipo("Parma Calcio");
        parma.setTecnicoEquipo(new Tecnico("Fabio Pecchia", "SA_T16", "Parma Calcio", "Italia"));
        parma.agregarJugador(new Jugador("Zion Suzuki", "PAR01", 31, Posicion.PORTERO, LocalDate.of(2002, 8, 21), "Japón"));
        parma.agregarJugador(new Jugador("Enrico Delprato", "PAR02", 15, Posicion.LATERAL, LocalDate.of(1999, 11, 10), "Italia"));
        parma.agregarJugador(new Jugador("Botond Balogh", "PAR03", 4, Posicion.DEFENSA, LocalDate.of(2002, 6, 6), "Hungría"));
        parma.agregarJugador(new Jugador("Yordan Osorio", "PAR04", 3, Posicion.DEFENSA, LocalDate.of(1994, 5, 10), "Venezuela"));
        parma.agregarJugador(new Jugador("Emanuele Valeri", "PAR05", 14, Posicion.LATERAL, LocalDate.of(1998, 12, 7), "Italia"));
        parma.agregarJugador(new Jugador("Adrián Bernabé", "PAR06", 10, Posicion.VOLANTE, LocalDate.of(2001, 5, 26), "España"));
        parma.agregarJugador(new Jugador("Simon Sohm", "PAR07", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 4, 11), "Suiza"));
        parma.agregarJugador(new Jugador("Hernani", "PAR08", 27, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 3, 27), "Brasil"));
        parma.agregarJugador(new Jugador("Dennis Man", "PAR09", 98, Posicion.EXTREMO, LocalDate.of(1998, 8, 26), "Rumanía"));
        parma.agregarJugador(new Jugador("Valentin Mihăilă", "PAR10", 28, Posicion.EXTREMO, LocalDate.of(2000, 2, 2), "Rumanía"));
        parma.agregarJugador(new Jugador("Ange-Yoan Bonny", "PAR11", 13, Posicion.DELANTERO, LocalDate.of(2003, 10, 25), "Francia"));
        equipos.add(parma);

        // 17. AS ROMA
        Equipo roma = new Equipo("AS Roma");
        roma.setTecnicoEquipo(new Tecnico("Claudio Ranieri", "SA_T17", "AS Roma", "Italia"));
        roma.agregarJugador(new Jugador("Mile Svilar", "ROM01", 99, Posicion.PORTERO, LocalDate.of(1999, 8, 27), "Serbia"));
        roma.agregarJugador(new Jugador("Gianluca Mancini", "ROM02", 23, Posicion.DEFENSA, LocalDate.of(1996, 4, 17), "Italia"));
        roma.agregarJugador(new Jugador("Evan Ndicka", "ROM03", 5, Posicion.DEFENSA, LocalDate.of(1999, 8, 20), "Costa de Marfil"));
        roma.agregarJugador(new Jugador("Angeliño", "ROM04", 3, Posicion.LATERAL, LocalDate.of(1997, 1, 4), "España"));
        roma.agregarJugador(new Jugador("Zeki Çelik", "ROM05", 19, Posicion.LATERAL, LocalDate.of(1997, 2, 17), "Turquía"));
        roma.agregarJugador(new Jugador("Bryan Cristante", "ROM06", 4, Posicion.VOLANTE, LocalDate.of(1995, 3, 3), "Italia"));
        roma.agregarJugador(new Jugador("Manu Koné", "ROM07", 17, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 5, 17), "Francia"));
        roma.agregarJugador(new Jugador("Lorenzo Pellegrini", "ROM08", 7, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 6, 19), "Italia"));
        roma.agregarJugador(new Jugador("Paulo Dybala", "ROM09", 21, Posicion.EXTREMO, LocalDate.of(1993, 11, 15), "Argentina"));
        roma.agregarJugador(new Jugador("Stephan El Shaarawy", "ROM10", 92, Posicion.EXTREMO, LocalDate.of(1992, 10, 27), "Italia"));
        roma.agregarJugador(new Jugador("Artem Dovbyk", "ROM11", 11, Posicion.DELANTERO, LocalDate.of(1997, 6, 21), "Ucrania"));
        equipos.add(roma);

        // 18. TORINO FC
        Equipo torino = new Equipo("Torino FC");
        torino.setTecnicoEquipo(new Tecnico("Paolo Vanoli", "SA_T18", "Torino FC", "Italia"));
        torino.agregarJugador(new Jugador("Vanja Milinković-Savić", "TOR01", 32, Posicion.PORTERO, LocalDate.of(1997, 2, 20), "Serbia"));
        torino.agregarJugador(new Jugador("Sebastian Walukiewicz", "TOR02", 4, Posicion.DEFENSA, LocalDate.of(2000, 4, 5), "Polonia"));
        torino.agregarJugador(new Jugador("Saúl Coco", "TOR03", 23, Posicion.DEFENSA, LocalDate.of(1999, 2, 9), "Guinea Ecuatorial"));
        torino.agregarJugador(new Jugador("Adam Masina", "TOR04", 5, Posicion.DEFENSA, LocalDate.of(1994, 1, 2), "Marruecos"));
        torino.agregarJugador(new Jugador("Valentino Lazaro", "TOR05", 20, Posicion.LATERAL, LocalDate.of(1996, 3, 24), "Austria"));
        torino.agregarJugador(new Jugador("Samuele Ricci", "TOR06", 28, Posicion.VOLANTE, LocalDate.of(2001, 8, 21), "Italia"));
        torino.agregarJugador(new Jugador("Karol Linetty", "TOR07", 77, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 2, 2), "Polonia"));
        torino.agregarJugador(new Jugador("Nikola Vlašić", "TOR08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 10, 4), "Croacia"));
        torino.agregarJugador(new Jugador("Borna Sosa", "TOR09", 24, Posicion.LATERAL, LocalDate.of(1998, 1, 21), "Croacia"));
        torino.agregarJugador(new Jugador("Ché Adams", "TOR10", 18, Posicion.DELANTERO, LocalDate.of(1996, 7, 13), "Escocia"));
        torino.agregarJugador(new Jugador("Antonio Sanabria", "TOR11", 9, Posicion.DELANTERO, LocalDate.of(1996, 3, 4), "Paraguay"));
        equipos.add(torino);

        // 19. UDINESE CALCIO
        Equipo udinese = new Equipo("Udinese Calcio");
        udinese.setTecnicoEquipo(new Tecnico("Kosta Runjaić", "SA_T19", "Udinese Calcio", "Alemania"));
        udinese.agregarJugador(new Jugador("Maduka Okoye", "UDI01", 40, Posicion.PORTERO, LocalDate.of(1999, 8, 28), "Nigeria"));
        udinese.agregarJugador(new Jugador("Christian Kabasele", "UDI02", 27, Posicion.DEFENSA, LocalDate.of(1991, 2, 24), "Bélgica"));
        udinese.agregarJugador(new Jugador("Jaka Bijol", "UDI03", 29, Posicion.DEFENSA, LocalDate.of(1999, 2, 5), "Eslovenia"));
        udinese.agregarJugador(new Jugador("Lautaro Giannetti", "UDI04", 30, Posicion.DEFENSA, LocalDate.of(1993, 11, 13), "Argentina"));
        udinese.agregarJugador(new Jugador("Kingsley Ehizibue", "UDI05", 19, Posicion.LATERAL, LocalDate.of(1995, 5, 25), "Países Bajos"));
        udinese.agregarJugador(new Jugador("Jesper Karlström", "UDI06", 25, Posicion.VOLANTE, LocalDate.of(1995, 6, 21), "Suecia"));
        udinese.agregarJugador(new Jugador("Sandi Lovrić", "UDI07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 3, 28), "Eslovenia"));
        udinese.agregarJugador(new Jugador("Martín Payero", "UDI08", 32, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 9, 11), "Argentina"));
        udinese.agregarJugador(new Jugador("Hassane Kamara", "UDI09", 11, Posicion.LATERAL, LocalDate.of(1994, 3, 5), "Costa de Marfil"));
        udinese.agregarJugador(new Jugador("Florian Thauvin", "UDI10", 10, Posicion.EXTREMO, LocalDate.of(1993, 1, 26), "Francia"));
        udinese.agregarJugador(new Jugador("Lorenzo Lucca", "UDI11", 17, Posicion.DELANTERO, LocalDate.of(2000, 9, 10), "Italia"));
        equipos.add(udinese);

        // 20. VENEZIA FC
        Equipo venezia = new Equipo("Venezia FC");
        venezia.setTecnicoEquipo(new Tecnico("Eusebio Di Francesco", "SA_T20", "Venezia FC", "Italia"));
        venezia.agregarJugador(new Jugador("Filip Stanković", "VEN01", 35, Posicion.PORTERO, LocalDate.of(2002, 2, 25), "Serbia"));
        venezia.agregarJugador(new Jugador("Jay Idzes", "VEN02", 4, Posicion.DEFENSA, LocalDate.of(2000, 6, 2), "Indonesia"));
        venezia.agregarJugador(new Jugador("Michael Svoboda", "VEN03", 30, Posicion.DEFENSA, LocalDate.of(1998, 10, 15), "Austria"));
        venezia.agregarJugador(new Jugador("Marin Šverko", "VEN04", 33, Posicion.DEFENSA, LocalDate.of(1998, 2, 4), "Croacia"));
        venezia.agregarJugador(new Jugador("Antonio Candela", "VEN05", 27, Posicion.LATERAL, LocalDate.of(2000, 4, 27), "Italia"));
        venezia.agregarJugador(new Jugador("Hans Nicolussi Caviglia", "VEN06", 14, Posicion.VOLANTE, LocalDate.of(2000, 6, 18), "Italia"));
        venezia.agregarJugador(new Jugador("Alfred Duncan", "VEN07", 32, Posicion.MEDIOCAMPISTA, LocalDate.of(1993, 3, 10), "Ghana"));
        venezia.agregarJugador(new Jugador("Gianluca Busio", "VEN08", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 5, 28), "Estados Unidos"));
        venezia.agregarJugador(new Jugador("Francesco Zampano", "VEN09", 7, Posicion.LATERAL, LocalDate.of(1993, 9, 30), "Italia"));
        venezia.agregarJugador(new Jugador("Gaetano Oristanio", "VEN10", 11, Posicion.EXTREMO, LocalDate.of(2002, 9, 28), "Italia"));
        venezia.agregarJugador(new Jugador("Joel Pohjanpalo", "VEN11", 20, Posicion.DELANTERO, LocalDate.of(1994, 9, 13), "Finlandia"));
        equipos.add(venezia);

        return equipos;
    }
}
