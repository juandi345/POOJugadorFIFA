import java.time.LocalDate;
import java.util.ArrayList;

public class DatosBundesliga {

    public static ArrayList<Equipo> cargarEquiposBundesliga() {
        ArrayList<Equipo> equipos = new ArrayList<>();

        // 1. BAYERN MÚNICH
        Equipo bayern = new Equipo("Bayern Múnich");
        bayern.setTecnicoEquipo(new Tecnico("Vincent Kompany", "BL_T01", "Bayern Múnich", "Bélgica"));
        bayern.agregarJugador(new Jugador("Manuel Neuer", "BAY01", 1, Posicion.PORTERO, LocalDate.of(1986, 3, 27), "Alemania"));
        bayern.agregarJugador(new Jugador("Raphaël Guerreiro", "BAY02", 22, Posicion.LATERAL, LocalDate.of(1993, 12, 22), "Portugal"));
        bayern.agregarJugador(new Jugador("Dayot Upamecano", "BAY03", 2, Posicion.DEFENSA, LocalDate.of(1998, 10, 27), "Francia"));
        bayern.agregarJugador(new Jugador("Kim Min-jae", "BAY04", 3, Posicion.DEFENSA, LocalDate.of(1996, 11, 15), "Corea del Sur"));
        bayern.agregarJugador(new Jugador("Alphonso Davies", "BAY05", 19, Posicion.LATERAL, LocalDate.of(2000, 11, 2), "Canadá"));
        bayern.agregarJugador(new Jugador("Joshua Kimmich", "BAY06", 6, Posicion.VOLANTE, LocalDate.of(1995, 2, 8), "Alemania"));
        bayern.agregarJugador(new Jugador("Aleksandar Pavlović", "BAY07", 45, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 5, 3), "Alemania"));
        bayern.agregarJugador(new Jugador("Jamal Musiala", "BAY08", 42, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 2, 26), "Alemania"));
        bayern.agregarJugador(new Jugador("Michael Olise", "BAY09", 17, Posicion.EXTREMO, LocalDate.of(2001, 12, 12), "Francia"));
        bayern.agregarJugador(new Jugador("Serge Gnabry", "BAY10", 7, Posicion.EXTREMO, LocalDate.of(1995, 7, 14), "Alemania"));
        bayern.agregarJugador(new Jugador("Harry Kane", "BAY11", 9, Posicion.DELANTERO, LocalDate.of(1993, 7, 28), "Inglaterra"));
        equipos.add(bayern);

        // 2. BAYER LEVERKUSEN
        Equipo leverkusen = new Equipo("Bayer Leverkusen");
        leverkusen.setTecnicoEquipo(new Tecnico("Xabi Alonso", "BL_T02", "Bayer Leverkusen", "España"));
        leverkusen.agregarJugador(new Jugador("Lukáš Hrádecký", "LEV01", 1, Posicion.PORTERO, LocalDate.of(1989, 11, 24), "Finlandia"));
        leverkusen.agregarJugador(new Jugador("Edmond Tapsoba", "LEV02", 12, Posicion.DEFENSA, LocalDate.of(1999, 2, 2), "Burkina Faso"));
        leverkusen.agregarJugador(new Jugador("Jonathan Tah", "LEV03", 4, Posicion.DEFENSA, LocalDate.of(1996, 2, 11), "Alemania"));
        leverkusen.agregarJugador(new Jugador("Piero Hincapié", "LEV04", 3, Posicion.DEFENSA, LocalDate.of(2002, 1, 9), "Ecuador"));
        leverkusen.agregarJugador(new Jugador("Jeremie Frimpong", "LEV05", 30, Posicion.LATERAL, LocalDate.of(2000, 12, 10), "Países Bajos"));
        leverkusen.agregarJugador(new Jugador("Granit Xhaka", "LEV06", 34, Posicion.VOLANTE, LocalDate.of(1992, 9, 27), "Suiza"));
        leverkusen.agregarJugador(new Jugador("Robert Andrich", "LEV07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 9, 22), "Alemania"));
        leverkusen.agregarJugador(new Jugador("Álex Grimaldo", "LEV08", 20, Posicion.LATERAL, LocalDate.of(1995, 9, 20), "España"));
        leverkusen.agregarJugador(new Jugador("Martin Terrier", "LEV09", 11, Posicion.EXTREMO, LocalDate.of(1997, 3, 4), "Francia"));
        leverkusen.agregarJugador(new Jugador("Florian Wirtz", "LEV10", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 5, 3), "Alemania"));
        leverkusen.agregarJugador(new Jugador("Victor Boniface", "LEV11", 22, Posicion.DELANTERO, LocalDate.of(2000, 12, 23), "Nigeria"));
        equipos.add(leverkusen);

        // 3. BORUSSIA DORTMUND
        Equipo dortmund = new Equipo("Borussia Dortmund");
        dortmund.setTecnicoEquipo(new Tecnico("Nuri Şahin", "BL_T03", "Borussia Dortmund", "Turquía"));
        dortmund.agregarJugador(new Jugador("Gregor Kobel", "BVB01", 1, Posicion.PORTERO, LocalDate.of(1997, 12, 6), "Suiza"));
        dortmund.agregarJugador(new Jugador("Julian Ryerson", "BVB02", 26, Posicion.LATERAL, LocalDate.of(1997, 11, 17), "Noruega"));
        dortmund.agregarJugador(new Jugador("Waldemar Anton", "BVB03", 3, Posicion.DEFENSA, LocalDate.of(1996, 7, 20), "Alemania"));
        dortmund.agregarJugador(new Jugador("Nico Schlotterbeck", "BVB04", 4, Posicion.DEFENSA, LocalDate.of(1999, 12, 1), "Alemania"));
        dortmund.agregarJugador(new Jugador("Ramy Bensebaini", "BVB05", 5, Posicion.LATERAL, LocalDate.of(1995, 4, 16), "Argelia"));
        dortmund.agregarJugador(new Jugador("Pascal Groß", "BVB06", 13, Posicion.VOLANTE, LocalDate.of(1991, 6, 15), "Alemania"));
        dortmund.agregarJugador(new Jugador("Felix Nmecha", "BVB07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 10, 10), "Alemania"));
        dortmund.agregarJugador(new Jugador("Julian Brandt", "BVB08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 5, 2), "Alemania"));
        dortmund.agregarJugador(new Jugador("Maximilian Beier", "BVB09", 14, Posicion.EXTREMO, LocalDate.of(2002, 10, 17), "Alemania"));
        dortmund.agregarJugador(new Jugador("Jamie Gittens", "BVB10", 43, Posicion.EXTREMO, LocalDate.of(2004, 8, 8), "Inglaterra"));
        dortmund.agregarJugador(new Jugador("Serhou Guirassy", "BVB11", 9, Posicion.DELANTERO, LocalDate.of(1996, 3, 12), "Guinea"));
        equipos.add(dortmund);

        // 4. RB LEIPZIG
        Equipo leipzig = new Equipo("RB Leipzig");
        leipzig.setTecnicoEquipo(new Tecnico("Marco Rose", "BL_T04", "RB Leipzig", "Alemania"));
        leipzig.agregarJugador(new Jugador("Péter Gulácsi", "RBL01", 1, Posicion.PORTERO, LocalDate.of(1990, 5, 6), "Hungría"));
        leipzig.agregarJugador(new Jugador("Benjamin Henrichs", "RBL02", 39, Posicion.LATERAL, LocalDate.of(1997, 2, 23), "Alemania"));
        leipzig.agregarJugador(new Jugador("Willi Orbán", "RBL03", 4, Posicion.DEFENSA, LocalDate.of(1992, 11, 3), "Hungría"));
        leipzig.agregarJugador(new Jugador("Castello Lukeba", "RBL04", 23, Posicion.DEFENSA, LocalDate.of(2002, 12, 17), "Francia"));
        leipzig.agregarJugador(new Jugador("David Raum", "RBL05", 22, Posicion.LATERAL, LocalDate.of(1998, 4, 22), "Alemania"));
        leipzig.agregarJugador(new Jugador("Amadou Haidara", "RBL06", 8, Posicion.VOLANTE, LocalDate.of(1998, 1, 31), "Malí"));
        leipzig.agregarJugador(new Jugador("Arthur Vermeeren", "RBL07", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(2005, 2, 7), "Bélgica"));
        leipzig.agregarJugador(new Jugador("Christoph Baumgartner", "RBL08", 14, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 8, 1), "Austria"));
        leipzig.agregarJugador(new Jugador("Antonio Nusa", "RBL09", 7, Posicion.EXTREMO, LocalDate.of(2005, 4, 17), "Noruega"));
        leipzig.agregarJugador(new Jugador("Benjamin Šeško", "RBL10", 30, Posicion.DELANTERO, LocalDate.of(2003, 5, 31), "Eslovenia"));
        leipzig.agregarJugador(new Jugador("Loïs Openda", "RBL11", 11, Posicion.DELANTERO, LocalDate.of(2000, 2, 16), "Bélgica"));
        equipos.add(leipzig);

        // 5. EINTRACHT FRANKFURT
        Equipo frankfurt = new Equipo("Eintracht Frankfurt");
        frankfurt.setTecnicoEquipo(new Tecnico("Dino Toppmöller", "BL_T05", "Eintracht Frankfurt", "Alemania"));
        frankfurt.agregarJugador(new Jugador("Kevin Trapp", "SGE01", 1, Posicion.PORTERO, LocalDate.of(1990, 7, 8), "Alemania"));
        frankfurt.agregarJugador(new Jugador("Rasmus Kristensen", "SGE02", 13, Posicion.LATERAL, LocalDate.of(1997, 7, 11), "Dinamarca"));
        frankfurt.agregarJugador(new Jugador("Tuta", "SGE03", 35, Posicion.DEFENSA, LocalDate.of(1999, 7, 4), "Brasil"));
        frankfurt.agregarJugador(new Jugador("Robin Koch", "SGE04", 4, Posicion.DEFENSA, LocalDate.of(1996, 7, 17), "Alemania"));
        frankfurt.agregarJugador(new Jugador("Arthur Theate", "SGE05", 3, Posicion.LATERAL, LocalDate.of(2000, 5, 25), "Bélgica"));
        frankfurt.agregarJugador(new Jugador("Ellyes Skhiri", "SGE06", 15, Posicion.VOLANTE, LocalDate.of(1995, 5, 10), "Túnez"));
        frankfurt.agregarJugador(new Jugador("Hugo Larsson", "SGE07", 16, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 6, 27), "Suecia"));
        frankfurt.agregarJugador(new Jugador("Mario Götze", "SGE08", 27, Posicion.MEDIOCAMPISTA, LocalDate.of(1992, 6, 3), "Alemania"));
        frankfurt.agregarJugador(new Jugador("Ansgar Knauff", "SGE09", 36, Posicion.EXTREMO, LocalDate.of(2002, 1, 10), "Alemania"));
        frankfurt.agregarJugador(new Jugador("Omar Marmoush", "SGE10", 7, Posicion.DELANTERO, LocalDate.of(1999, 2, 7), "Egipto"));
        frankfurt.agregarJugador(new Jugador("Hugo Ekitiké", "SGE11", 11, Posicion.DELANTERO, LocalDate.of(2002, 6, 20), "Francia"));
        equipos.add(frankfurt);

        // 6. VFB STUTTGART
        Equipo stuttgart = new Equipo("VfB Stuttgart");
        stuttgart.setTecnicoEquipo(new Tecnico("Sebastian Hoeneß", "BL_T06", "VfB Stuttgart", "Alemania"));
        stuttgart.agregarJugador(new Jugador("Alexander Nübel", "VFB01", 33, Posicion.PORTERO, LocalDate.of(1996, 9, 30), "Alemania"));
        stuttgart.agregarJugador(new Jugador("Josha Vagnoman", "VFB02", 4, Posicion.LATERAL, LocalDate.of(2000, 12, 11), "Alemania"));
        stuttgart.agregarJugador(new Jugador("Anthony Rouault", "VFB03", 29, Posicion.DEFENSA, LocalDate.of(2001, 5, 29), "Francia"));
        stuttgart.agregarJugador(new Jugador("Jeff Chabot", "VFB04", 24, Posicion.DEFENSA, LocalDate.of(1998, 2, 12), "Alemania"));
        stuttgart.agregarJugador(new Jugador("Maximilian Mittelstädt", "VFB05", 7, Posicion.LATERAL, LocalDate.of(1997, 3, 18), "Alemania"));
        stuttgart.agregarJugador(new Jugador("Atakan Karazor", "VFB06", 16, Posicion.VOLANTE, LocalDate.of(1996, 10, 13), "Turquía"));
        stuttgart.agregarJugador(new Jugador("Angelo Stiller", "VFB07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 4, 4), "Alemania"));
        stuttgart.agregarJugador(new Jugador("Enzo Millot", "VFB08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 7, 17), "Francia"));
        stuttgart.agregarJugador(new Jugador("Jamie Leweling", "VFB09", 18, Posicion.EXTREMO, LocalDate.of(2001, 2, 26), "Alemania"));
        stuttgart.agregarJugador(new Jugador("Chris Führich", "VFB10", 27, Posicion.EXTREMO, LocalDate.of(1998, 1, 9), "Alemania"));
        stuttgart.agregarJugador(new Jugador("Ermedin Demirović", "VFB11", 9, Posicion.DELANTERO, LocalDate.of(1998, 3, 25), "Bosnia y Herzegovina"));
        equipos.add(stuttgart);

        // 7. SC FREIBURG
        Equipo freiburg = new Equipo("SC Freiburg");
        freiburg.setTecnicoEquipo(new Tecnico("Julian Schuster", "BL_T07", "SC Freiburg", "Alemania"));
        freiburg.agregarJugador(new Jugador("Noah Atubolu", "SCF01", 1, Posicion.PORTERO, LocalDate.of(2002, 5, 25), "Alemania"));
        freiburg.agregarJugador(new Jugador("Lukas Kübler", "SCF02", 17, Posicion.LATERAL, LocalDate.of(1992, 8, 30), "Alemania"));
        freiburg.agregarJugador(new Jugador("Matthias Ginter", "SCF03", 28, Posicion.DEFENSA, LocalDate.of(1994, 1, 19), "Alemania"));
        freiburg.agregarJugador(new Jugador("Philipp Lienhart", "SCF04", 3, Posicion.DEFENSA, LocalDate.of(1996, 7, 11), "Austria"));
        freiburg.agregarJugador(new Jugador("Christian Günter", "SCF05", 30, Posicion.LATERAL, LocalDate.of(1993, 2, 28), "Alemania"));
        freiburg.agregarJugador(new Jugador("Maximilian Eggestein", "SCF06", 8, Posicion.VOLANTE, LocalDate.of(1996, 12, 8), "Alemania"));
        freiburg.agregarJugador(new Jugador("Patrick Osterhage", "SCF07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 2, 1), "Alemania"));
        freiburg.agregarJugador(new Jugador("Eren Dinkçi", "SCF08", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 12, 13), "Turquía"));
        freiburg.agregarJugador(new Jugador("Ritsu Dōan", "SCF09", 42, Posicion.EXTREMO, LocalDate.of(1998, 6, 16), "Japón"));
        freiburg.agregarJugador(new Jugador("Vincenzo Grifo", "SCF10", 32, Posicion.EXTREMO, LocalDate.of(1993, 4, 7), "Italia"));
        freiburg.agregarJugador(new Jugador("Junior Adamu", "SCF11", 20, Posicion.DELANTERO, LocalDate.of(2001, 6, 6), "Austria"));
        equipos.add(freiburg);

        // 8. BORUSSIA MÖNCHENGLADBACH
        Equipo gladbach = new Equipo("Borussia Mönchengladbach");
        gladbach.setTecnicoEquipo(new Tecnico("Gerardo Seoane", "BL_T08", "Borussia Mönchengladbach", "Suiza"));
        gladbach.agregarJugador(new Jugador("Moritz Nicolas", "BMG01", 33, Posicion.PORTERO, LocalDate.of(1997, 10, 21), "Alemania"));
        gladbach.agregarJugador(new Jugador("Joe Scally", "BMG02", 29, Posicion.LATERAL, LocalDate.of(2002, 12, 31), "Estados Unidos"));
        gladbach.agregarJugador(new Jugador("Ko Itakura", "BMG03", 3, Posicion.DEFENSA, LocalDate.of(1997, 1, 27), "Japón"));
        gladbach.agregarJugador(new Jugador("Nico Elvedi", "BMG04", 30, Posicion.DEFENSA, LocalDate.of(1996, 9, 30), "Suiza"));
        gladbach.agregarJugador(new Jugador("Lukas Ullrich", "BMG05", 26, Posicion.LATERAL, LocalDate.of(2004, 3, 16), "Alemania"));
        gladbach.agregarJugador(new Jugador("Julian Weigl", "BMG06", 8, Posicion.VOLANTE, LocalDate.of(1995, 9, 8), "Alemania"));
        gladbach.agregarJugador(new Jugador("Rocco Reitz", "BMG07", 27, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 5, 29), "Alemania"));
        gladbach.agregarJugador(new Jugador("Kevin Stöger", "BMG08", 7, Posicion.MEDIOCAMPISTA, LocalDate.of(1993, 8, 27), "Austria"));
        gladbach.agregarJugador(new Jugador("Franck Honorat", "BMG09", 9, Posicion.EXTREMO, LocalDate.of(1996, 8, 11), "Francia"));
        gladbach.agregarJugador(new Jugador("Alassane Pléa", "BMG10", 14, Posicion.EXTREMO, LocalDate.of(1993, 3, 10), "Francia"));
        gladbach.agregarJugador(new Jugador("Tim Kleindienst", "BMG11", 11, Posicion.DELANTERO, LocalDate.of(1995, 8, 31), "Alemania"));
        equipos.add(gladbach);

        // 9. VFL WOLFSBURG
        Equipo wolfsburg = new Equipo("VfL Wolfsburg");
        wolfsburg.setTecnicoEquipo(new Tecnico("Ralph Hasenhüttl", "BL_T09", "VfL Wolfsburg", "Austria"));
        wolfsburg.agregarJugador(new Jugador("Kamil Grabara", "WOB01", 1, Posicion.PORTERO, LocalDate.of(1999, 1, 8), "Polonia"));
        wolfsburg.agregarJugador(new Jugador("Kiliann Fischer", "WOB02", 2, Posicion.LATERAL, LocalDate.of(2000, 10, 12), "Alemania"));
        wolfsburg.agregarJugador(new Jugador("Denis Vavro", "WOB03", 18, Posicion.DEFENSA, LocalDate.of(1996, 4, 10), "Eslovaquia"));
        wolfsburg.agregarJugador(new Jugador("Konstantinos Koulierakis", "WOB04", 4, Posicion.DEFENSA, LocalDate.of(2003, 11, 28), "Grecia"));
        wolfsburg.agregarJugador(new Jugador("Joakim Mæhle", "WOB05", 21, Posicion.LATERAL, LocalDate.of(1997, 5, 20), "Dinamarca"));
        wolfsburg.agregarJugador(new Jugador("Maximilian Arnold", "WOB06", 27, Posicion.VOLANTE, LocalDate.of(1994, 5, 27), "Alemania"));
        wolfsburg.agregarJugador(new Jugador("Bence Dárdai", "WOB07", 24, Posicion.MEDIOCAMPISTA, LocalDate.of(2006, 1, 24), "Hungría"));
        wolfsburg.agregarJugador(new Jugador("Ridle Baku", "WOB08", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 4, 8), "Alemania"));
        wolfsburg.agregarJugador(new Jugador("Tiago Tomás", "WOB09", 11, Posicion.EXTREMO, LocalDate.of(2002, 6, 16), "Portugal"));
        wolfsburg.agregarJugador(new Jugador("Mohamed Amoura", "WOB10", 9, Posicion.EXTREMO, LocalDate.of(2000, 5, 9), "Argelia"));
        wolfsburg.agregarJugador(new Jugador("Jonas Wind", "WOB11", 23, Posicion.DELANTERO, LocalDate.of(1999, 2, 7), "Dinamarca"));
        equipos.add(wolfsburg);

        // 10. WERDER BREMEN
        Equipo bremen = new Equipo("Werder Bremen");
        bremen.setTecnicoEquipo(new Tecnico("Ole Werner", "BL_T10", "Werder Bremen", "Alemania"));
        bremen.agregarJugador(new Jugador("Michael Zetterer", "SVW01", 1, Posicion.PORTERO, LocalDate.of(1995, 7, 12), "Alemania"));
        bremen.agregarJugador(new Jugador("Julian Malatini", "SVW02", 22, Posicion.DEFENSA, LocalDate.of(2001, 5, 31), "Argentina"));
        bremen.agregarJugador(new Jugador("Marco Friedl", "SVW03", 32, Posicion.DEFENSA, LocalDate.of(1998, 3, 16), "Austria"));
        bremen.agregarJugador(new Jugador("Anthony Jung", "SVW04", 3, Posicion.DEFENSA, LocalDate.of(1991, 11, 3), "Alemania"));
        bremen.agregarJugador(new Jugador("Mitchell Weiser", "SVW05", 8, Posicion.LATERAL, LocalDate.of(1994, 4, 21), "Alemania"));
        bremen.agregarJugador(new Jugador("Senne Lynen", "SVW06", 14, Posicion.VOLANTE, LocalDate.of(1999, 2, 19), "Bélgica"));
        bremen.agregarJugador(new Jugador("Jens Stage", "SVW07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 11, 8), "Dinamarca"));
        bremen.agregarJugador(new Jugador("Romano Schmid", "SVW08", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 1, 27), "Austria"));
        bremen.agregarJugador(new Jugador("Derrick Köhn", "SVW09", 19, Posicion.LATERAL, LocalDate.of(1999, 2, 4), "Alemania"));
        bremen.agregarJugador(new Jugador("Marco Grüll", "SVW10", 17, Posicion.EXTREMO, LocalDate.of(1998, 7, 6), "Austria"));
        bremen.agregarJugador(new Jugador("Marvin Ducksch", "SVW11", 7, Posicion.DELANTERO, LocalDate.of(1994, 3, 7), "Alemania"));
        equipos.add(bremen);

        // 11. MAINZ 05
        Equipo mainz = new Equipo("Mainz 05");
        mainz.setTecnicoEquipo(new Tecnico("Bo Henriksen", "BL_T11", "Mainz 05", "Dinamarca"));
        mainz.agregarJugador(new Jugador("Robin Zentner", "M0501", 27, Posicion.PORTERO, LocalDate.of(1994, 10, 28), "Alemania"));
        mainz.agregarJugador(new Jugador("Dominik Kohr", "M0502", 31, Posicion.DEFENSA, LocalDate.of(1994, 1, 31), "Alemania"));
        mainz.agregarJugador(new Jugador("Stefan Bell", "M0503", 16, Posicion.DEFENSA, LocalDate.of(1991, 8, 24), "Alemania"));
        mainz.agregarJugador(new Jugador("Moritz Jenz", "M0504", 25, Posicion.DEFENSA, LocalDate.of(1999, 4, 30), "Alemania"));
        mainz.agregarJugador(new Jugador("Anthony Caci", "M0505", 19, Posicion.LATERAL, LocalDate.of(1997, 7, 1), "Francia"));
        mainz.agregarJugador(new Jugador("Kaishu Sano", "M0506", 6, Posicion.VOLANTE, LocalDate.of(2000, 12, 30), "Japón"));
        mainz.agregarJugador(new Jugador("Nadiem Amiri", "M0507", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 10, 27), "Alemania"));
        mainz.agregarJugador(new Jugador("Phillipp Mwene", "M0508", 2, Posicion.LATERAL, LocalDate.of(1994, 1, 29), "Austria"));
        mainz.agregarJugador(new Jugador("Paul Nebel", "M0509", 8, Posicion.EXTREMO, LocalDate.of(2002, 10, 10), "Alemania"));
        mainz.agregarJugador(new Jugador("Lee Jae-sung", "M0510", 7, Posicion.EXTREMO, LocalDate.of(1992, 8, 10), "Corea del Sur"));
        mainz.agregarJugador(new Jugador("Jonathan Burkardt", "M0511", 29, Posicion.DELANTERO, LocalDate.of(2000, 7, 11), "Alemania"));
        equipos.add(mainz);

        // 12. UNION BERLIN
        Equipo unionBerlin = new Equipo("Union Berlin");
        unionBerlin.setTecnicoEquipo(new Tecnico("Steffen Baumgart", "BL_T12", "Union Berlin", "Alemania"));
        unionBerlin.agregarJugador(new Jugador("Frederik Rønnow", "FCU01", 1, Posicion.PORTERO, LocalDate.of(1992, 8, 4), "Dinamarca"));
        unionBerlin.agregarJugador(new Jugador("Danilho Doekhi", "FCU02", 5, Posicion.DEFENSA, LocalDate.of(1998, 6, 30), "Países Bajos"));
        unionBerlin.agregarJugador(new Jugador("Kevin Vogt", "FCU03", 2, Posicion.DEFENSA, LocalDate.of(1991, 9, 23), "Alemania"));
        unionBerlin.agregarJugador(new Jugador("Diogo Leite", "FCU04", 4, Posicion.DEFENSA, LocalDate.of(1999, 1, 23), "Portugal"));
        unionBerlin.agregarJugador(new Jugador("Christopher Trimmel", "FCU05", 28, Posicion.LATERAL, LocalDate.of(1987, 2, 24), "Austria"));
        unionBerlin.agregarJugador(new Jugador("Rani Khedira", "FCU06", 8, Posicion.VOLANTE, LocalDate.of(1994, 1, 27), "Alemania"));
        unionBerlin.agregarJugador(new Jugador("Aljoscha Kemlein", "FCU07", 36, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 8, 2), "Alemania"));
        unionBerlin.agregarJugador(new Jugador("Tom Rothe", "FCU08", 15, Posicion.LATERAL, LocalDate.of(2004, 10, 29), "Alemania"));
        unionBerlin.agregarJugador(new Jugador("Woo-yeong Jeong", "FCU09", 11, Posicion.EXTREMO, LocalDate.of(1999, 9, 20), "Corea del Sur"));
        unionBerlin.agregarJugador(new Jugador("Benedict Hollerbach", "FCU10", 16, Posicion.EXTREMO, LocalDate.of(2001, 5, 17), "Alemania"));
        unionBerlin.agregarJugador(new Jugador("Jordan Siebatcheu", "FCU11", 17, Posicion.DELANTERO, LocalDate.of(1996, 4, 26), "Estados Unidos"));
        equipos.add(unionBerlin);

        // 13. FC AUGSBURG
        Equipo augsburg = new Equipo("FC Augsburg");
        augsburg.setTecnicoEquipo(new Tecnico("Jess Thorup", "BL_T13", "FC Augsburg", "Dinamarca"));
        augsburg.agregarJugador(new Jugador("Nediljko Labrović", "FCA01", 1, Posicion.PORTERO, LocalDate.of(1999, 10, 10), "Croacia"));
        augsburg.agregarJugador(new Jugador("Maximilian Bauer", "FCA02", 23, Posicion.DEFENSA, LocalDate.of(2000, 2, 9), "Alemania"));
        augsburg.agregarJugador(new Jugador("Jeffrey Gouweleeuw", "FCA03", 6, Posicion.DEFENSA, LocalDate.of(1991, 7, 10), "Países Bajos"));
        augsburg.agregarJugador(new Jugador("Chrislain Matsima", "FCA04", 5, Posicion.DEFENSA, LocalDate.of(2002, 5, 15), "Francia"));
        augsburg.agregarJugador(new Jugador("Marius Wolf", "FCA05", 11, Posicion.LATERAL, LocalDate.of(1995, 5, 27), "Alemania"));
        augsburg.agregarJugador(new Jugador("Kristijan Jakić", "FCA06", 17, Posicion.VOLANTE, LocalDate.of(1997, 5, 14), "Croacia"));
        augsburg.agregarJugador(new Jugador("Frank Onyeka", "FCA07", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 1, 1), "Nigeria"));
        augsburg.agregarJugador(new Jugador("Elvis Rexhbeçaj", "FCA08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 11, 1), "Kosovo"));
        augsburg.agregarJugador(new Jugador("Dimitrios Giannoulis", "FCA09", 13, Posicion.LATERAL, LocalDate.of(1995, 10, 17), "Grecia"));
        augsburg.agregarJugador(new Jugador("Alexis Claude-Maurice", "FCA10", 20, Posicion.EXTREMO, LocalDate.of(1998, 6, 6), "Francia"));
        augsburg.agregarJugador(new Jugador("Phillip Tietz", "FCA11", 21, Posicion.DELANTERO, LocalDate.of(1997, 7, 9), "Alemania"));
        equipos.add(augsburg);

        // 14. TSG HOFFENHEIM
        Equipo hoffenheim = new Equipo("TSG Hoffenheim");
        hoffenheim.setTecnicoEquipo(new Tecnico("Christian Ilzer", "BL_T14", "TSG Hoffenheim", "Austria"));
        hoffenheim.agregarJugador(new Jugador("Oliver Baumann", "TSG01", 1, Posicion.PORTERO, LocalDate.of(1990, 6, 2), "Alemania"));
        hoffenheim.agregarJugador(new Jugador("Valentin Gendrey", "TSG02", 15, Posicion.LATERAL, LocalDate.of(2000, 6, 21), "Francia"));
        hoffenheim.agregarJugador(new Jugador("Anton Stach", "TSG03", 16, Posicion.DEFENSA, LocalDate.of(1998, 11, 15), "Alemania"));
        hoffenheim.agregarJugador(new Jugador("Kevin Akpoguma", "TSG04", 25, Posicion.DEFENSA, LocalDate.of(1995, 4, 19), "Nigeria"));
        hoffenheim.agregarJugador(new Jugador("Alexander Prass", "TSG05", 22, Posicion.LATERAL, LocalDate.of(2001, 5, 26), "Austria"));
        hoffenheim.agregarJugador(new Jugador("Florian Grillitsch", "TSG06", 11, Posicion.VOLANTE, LocalDate.of(1995, 8, 7), "Austria"));
        hoffenheim.agregarJugador(new Jugador("Tom Bischof", "TSG07", 7, Posicion.MEDIOCAMPISTA, LocalDate.of(2005, 6, 28), "Alemania"));
        hoffenheim.agregarJugador(new Jugador("Andrej Kramarić", "TSG08", 27, Posicion.MEDIOCAMPISTA, LocalDate.of(1991, 6, 19), "Croacia"));
        hoffenheim.agregarJugador(new Jugador("Jacob Bruun Larsen", "TSG09", 10, Posicion.EXTREMO, LocalDate.of(1998, 9, 19), "Dinamarca"));
        hoffenheim.agregarJugador(new Jugador("Marius Bülter", "TSG10", 21, Posicion.EXTREMO, LocalDate.of(1993, 3, 29), "Alemania"));
        hoffenheim.agregarJugador(new Jugador("Adam Hložek", "TSG11", 23, Posicion.DELANTERO, LocalDate.of(2002, 7, 25), "República Checa"));
        equipos.add(hoffenheim);

        // 15. 1. FC HEIDENHEIM
        Equipo heidenheim = new Equipo("1. FC Heidenheim");
        heidenheim.setTecnicoEquipo(new Tecnico("Frank Schmidt", "BL_T15", "1. FC Heidenheim", "Alemania"));
        heidenheim.agregarJugador(new Jugador("Kevin Müller", "FCH01", 1, Posicion.PORTERO, LocalDate.of(1991, 3, 15), "Alemania"));
        heidenheim.agregarJugador(new Jugador("Omar Traoré", "FCH02", 23, Posicion.LATERAL, LocalDate.of(1998, 2, 4), "Alemania"));
        heidenheim.agregarJugador(new Jugador("Patrick Mainka", "FCH03", 6, Posicion.DEFENSA, LocalDate.of(1994, 11, 6), "Alemania"));
        heidenheim.agregarJugador(new Jugador("Benedikt Gimber", "FCH04", 5, Posicion.DEFENSA, LocalDate.of(1997, 2, 19), "Alemania"));
        heidenheim.agregarJugador(new Jugador("Jonas Föhrenbach", "FCH05", 19, Posicion.LATERAL, LocalDate.of(1996, 1, 26), "Alemania"));
        heidenheim.agregarJugador(new Jugador("Lennard Maloney", "FCH06", 33, Posicion.VOLANTE, LocalDate.of(1999, 10, 8), "Estados Unidos"));
        heidenheim.agregarJugador(new Jugador("Jan Schöppner", "FCH07", 3, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 6, 12), "Alemania"));
        heidenheim.agregarJugador(new Jugador("Paul Wanner", "FCH08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(2005, 12, 23), "Alemania"));
        heidenheim.agregarJugador(new Jugador("Léo Scienza", "FCH09", 8, Posicion.EXTREMO, LocalDate.of(1998, 9, 13), "Brasil"));
        heidenheim.agregarJugador(new Jugador("Mathias Honsak", "FCH10", 17, Posicion.EXTREMO, LocalDate.of(1996, 12, 20), "Austria"));
        heidenheim.agregarJugador(new Jugador("Marvin Pieringer", "FCH11", 18, Posicion.DELANTERO, LocalDate.of(1999, 10, 4), "Alemania"));
        equipos.add(heidenheim);

        // 16. FC ST. PAULI
        Equipo stPauli = new Equipo("FC St. Pauli");
        stPauli.setTecnicoEquipo(new Tecnico("Alexander Blessin", "BL_T16", "FC St. Pauli", "Alemania"));
        stPauli.agregarJugador(new Jugador("Nikola Vasilj", "STP01", 22, Posicion.PORTERO, LocalDate.of(1995, 12, 2), "Bosnia y Herzegovina"));
        stPauli.agregarJugador(new Jugador("Hauke Wahl", "STP02", 5, Posicion.DEFENSA, LocalDate.of(1994, 4, 15), "Alemania"));
        stPauli.agregarJugador(new Jugador("Eric Smith", "STP03", 8, Posicion.DEFENSA, LocalDate.of(1997, 1, 8), "Suecia"));
        stPauli.agregarJugador(new Jugador("Karol Mets", "STP04", 3, Posicion.DEFENSA, LocalDate.of(1993, 5, 16), "Estonia"));
        stPauli.agregarJugador(new Jugador("Manolis Saliakas", "STP05", 2, Posicion.LATERAL, LocalDate.of(1996, 9, 12), "Grecia"));
        stPauli.agregarJugador(new Jugador("Jackson Irvine", "STP06", 7, Posicion.VOLANTE, LocalDate.of(1993, 3, 7), "Australia"));
        stPauli.agregarJugador(new Jugador("Carlo Boukhalfa", "STP07", 16, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 5, 3), "Alemania"));
        stPauli.agregarJugador(new Jugador("Philipp Treu", "STP08", 23, Posicion.LATERAL, LocalDate.of(2000, 12, 3), "Alemania"));
        stPauli.agregarJugador(new Jugador("Oladapo Afolayan", "STP09", 17, Posicion.EXTREMO, LocalDate.of(1997, 9, 11), "Inglaterra"));
        stPauli.agregarJugador(new Jugador("Morgan Guilavogui", "STP10", 29, Posicion.EXTREMO, LocalDate.of(1998, 3, 10), "Guinea"));
        stPauli.agregarJugador(new Jugador("Johannes Eggestein", "STP11", 11, Posicion.DELANTERO, LocalDate.of(1998, 5, 8), "Alemania"));
        equipos.add(stPauli);

        // 17. HOLSTEIN KIEL
        Equipo kiel = new Equipo("Holstein Kiel");
        kiel.setTecnicoEquipo(new Tecnico("Marcel Rapp", "BL_T17", "Holstein Kiel", "Alemania"));
        kiel.agregarJugador(new Jugador("Timon Weiner", "KSV01", 1, Posicion.PORTERO, LocalDate.of(1999, 1, 18), "Alemania"));
        kiel.agregarJugador(new Jugador("Timo Becker", "KSV02", 17, Posicion.DEFENSA, LocalDate.of(1997, 3, 25), "Alemania"));
        kiel.agregarJugador(new Jugador("Patrick Erras", "KSV03", 4, Posicion.DEFENSA, LocalDate.of(1995, 1, 21), "Alemania"));
        kiel.agregarJugador(new Jugador("Max Geschwill", "KSV04", 33, Posicion.DEFENSA, LocalDate.of(2001, 7, 7), "Alemania"));
        kiel.agregarJugador(new Jugador("Lasse Rosenboom", "KSV05", 23, Posicion.LATERAL, LocalDate.of(2002, 1, 19), "Alemania"));
        kiel.agregarJugador(new Jugador("Magnus Knudsen", "KSV06", 24, Posicion.VOLANTE, LocalDate.of(2001, 6, 15), "Noruega"));
        kiel.agregarJugador(new Jugador("Nicolai Remberg", "KSV07", 22, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 6, 19), "Alemania"));
        kiel.agregarJugador(new Jugador("Lewis Holtby", "KSV08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1990, 9, 18), "Alemania"));
        kiel.agregarJugador(new Jugador("Finn Porath", "KSV09", 8, Posicion.LATERAL, LocalDate.of(1997, 2, 23), "Alemania"));
        kiel.agregarJugador(new Jugador("Shuto Machino", "KSV10", 18, Posicion.EXTREMO, LocalDate.of(1999, 9, 30), "Japón"));
        kiel.agregarJugador(new Jugador("Phil Harres", "KSV11", 19, Posicion.DELANTERO, LocalDate.of(2002, 3, 25), "Alemania"));
        equipos.add(kiel);

        // 18. VFL BOCHUM
        Equipo bochum = new Equipo("VfL Bochum");
        bochum.setTecnicoEquipo(new Tecnico("Dieter Hecking", "BL_T18", "VfL Bochum", "Alemania"));
        bochum.agregarJugador(new Jugador("Patrick Drewes", "BOC01", 27, Posicion.PORTERO, LocalDate.of(1993, 2, 4), "Alemania"));
        bochum.agregarJugador(new Jugador("Felix Passlack", "BOC02", 15, Posicion.LATERAL, LocalDate.of(1998, 5, 29), "Alemania"));
        bochum.agregarJugador(new Jugador("Ivan Ordets", "BOC03", 20, Posicion.DEFENSA, LocalDate.of(1992, 7, 8), "Ucrania"));
        bochum.agregarJugador(new Jugador("Jakov Medić", "BOC04", 13, Posicion.DEFENSA, LocalDate.of(1998, 9, 7), "Croacia"));
        bochum.agregarJugador(new Jugador("Maximilian Wittek", "BOC05", 32, Posicion.LATERAL, LocalDate.of(1995, 8, 21), "Alemania"));
        bochum.agregarJugador(new Jugador("Ibrahima Sissoko", "BOC06", 6, Posicion.VOLANTE, LocalDate.of(1997, 10, 27), "Malí"));
        bochum.agregarJugador(new Jugador("Anthony Losilla", "BOC07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1986, 3, 10), "Francia"));
        bochum.agregarJugador(new Jugador("Matúš Bero", "BOC08", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 9, 6), "Eslovaquia"));
        bochum.agregarJugador(new Jugador("Dani de Wit", "BOC09", 10, Posicion.EXTREMO, LocalDate.of(1998, 1, 28), "Países Bajos"));
        bochum.agregarJugador(new Jugador("Gerrit Holtmann", "BOC10", 17, Posicion.EXTREMO, LocalDate.of(1995, 3, 25), "Filipinas"));
        bochum.agregarJugador(new Jugador("Philipp Hofmann", "BOC11", 33, Posicion.DELANTERO, LocalDate.of(1993, 3, 30), "Alemania"));
        equipos.add(bochum);

        return equipos;
    }
}
