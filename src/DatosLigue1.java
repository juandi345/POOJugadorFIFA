import java.time.LocalDate;
import java.util.ArrayList;

public class DatosLigue1 {

    public static ArrayList<Equipo> cargarEquiposLigue1() {
        ArrayList<Equipo> equipos = new ArrayList<>();

        // 1. PARIS SAINT-GERMAIN
        Equipo psg = new Equipo("Paris Saint-Germain");
        psg.setTecnicoEquipo(new Tecnico("Luis Enrique", "L1_T01", "Paris Saint-Germain", "España"));
        psg.agregarJugador(new Jugador("Gianluigi Donnarumma", "PSG01", 1, Posicion.PORTERO, LocalDate.of(1999, 2, 25), "Italia"));
        psg.agregarJugador(new Jugador("Achraf Hakimi", "PSG02", 2, Posicion.LATERAL, LocalDate.of(1998, 11, 4), "Marruecos"));
        psg.agregarJugador(new Jugador("Marquinhos", "PSG03", 5, Posicion.DEFENSA, LocalDate.of(1994, 5, 14), "Brasil"));
        psg.agregarJugador(new Jugador("Willian Pacho", "PSG04", 51, Posicion.DEFENSA, LocalDate.of(2001, 10, 16), "Ecuador"));
        psg.agregarJugador(new Jugador("Nuno Mendes", "PSG05", 25, Posicion.LATERAL, LocalDate.of(2002, 6, 19), "Portugal"));
        psg.agregarJugador(new Jugador("Vitinha", "PSG06", 17, Posicion.VOLANTE, LocalDate.of(2000, 2, 13), "Portugal"));
        psg.agregarJugador(new Jugador("João Neves", "PSG07", 87, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 9, 27), "Portugal"));
        psg.agregarJugador(new Jugador("Warren Zaïre-Emery", "PSG08", 33, Posicion.MEDIOCAMPISTA, LocalDate.of(2006, 3, 8), "Francia"));
        psg.agregarJugador(new Jugador("Ousmane Dembélé", "PSG09", 10, Posicion.EXTREMO, LocalDate.of(1997, 5, 15), "Francia"));
        psg.agregarJugador(new Jugador("Bradley Barcola", "PSG10", 29, Posicion.EXTREMO, LocalDate.of(2002, 9, 2), "Francia"));
        psg.agregarJugador(new Jugador("Gonçalo Ramos", "PSG11", 9, Posicion.DELANTERO, LocalDate.of(2001, 6, 20), "Portugal"));
        equipos.add(psg);

        // 2. AS MÓNACO
        Equipo monaco = new Equipo("AS Mónaco");
        monaco.setTecnicoEquipo(new Tecnico("Adi Hütter", "L1_T02", "AS Mónaco", "Austria"));
        monaco.agregarJugador(new Jugador("Radosław Majecki", "ASM01", 1, Posicion.PORTERO, LocalDate.of(1999, 11, 16), "Polonia"));
        monaco.agregarJugador(new Jugador("Vanderson", "ASM02", 2, Posicion.LATERAL, LocalDate.of(2001, 6, 21), "Brasil"));
        monaco.agregarJugador(new Jugador("Thilo Kehrer", "ASM03", 5, Posicion.DEFENSA, LocalDate.of(1996, 9, 21), "Alemania"));
        monaco.agregarJugador(new Jugador("Wilfried Singo", "ASM04", 17, Posicion.DEFENSA, LocalDate.of(2000, 12, 25), "Costa de Marfil"));
        monaco.agregarJugador(new Jugador("Caio Henrique", "ASM05", 12, Posicion.LATERAL, LocalDate.of(1997, 7, 31), "Brasil"));
        monaco.agregarJugador(new Jugador("Denis Zakaria", "ASM06", 6, Posicion.VOLANTE, LocalDate.of(1996, 11, 20), "Suiza"));
        monaco.agregarJugador(new Jugador("Lamine Camara", "ASM07", 15, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 1, 1), "Senegal"));
        monaco.agregarJugador(new Jugador("Aleksandr Golovin", "ASM08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 5, 30), "Rusia"));
        monaco.agregarJugador(new Jugador("Maghnes Akliouche", "ASM09", 11, Posicion.EXTREMO, LocalDate.of(2002, 2, 25), "Francia"));
        monaco.agregarJugador(new Jugador("Eliesse Ben Seghir", "ASM10", 7, Posicion.EXTREMO, LocalDate.of(2005, 2, 16), "Marruecos"));
        monaco.agregarJugador(new Jugador("Breel Embolo", "ASM11", 36, Posicion.DELANTERO, LocalDate.of(1997, 2, 14), "Suiza"));
        equipos.add(monaco);

        // 3. OLYMPIQUE DE MARSELLA
        Equipo marsella = new Equipo("Olympique de Marsella");
        marsella.setTecnicoEquipo(new Tecnico("Roberto De Zerbi", "L1_T03", "Olympique de Marsella", "Italia"));
        marsella.agregarJugador(new Jugador("Gerónimo Rulli", "OM01", 1, Posicion.PORTERO, LocalDate.of(1992, 5, 20), "Argentina"));
        marsella.agregarJugador(new Jugador("Michael Murillo", "OM02", 62, Posicion.LATERAL, LocalDate.of(1996, 2, 11), "Panamá"));
        marsella.agregarJugador(new Jugador("Leonardo Balerdi", "OM03", 5, Posicion.DEFENSA, LocalDate.of(1999, 1, 26), "Argentina"));
        marsella.agregarJugador(new Jugador("Geoffrey Kondogbia", "OM04", 19, Posicion.DEFENSA, LocalDate.of(1993, 2, 15), "República Centroafricana"));
        marsella.agregarJugador(new Jugador("Quentin Merlin", "OM05", 3, Posicion.LATERAL, LocalDate.of(2002, 5, 16), "Francia"));
        marsella.agregarJugador(new Jugador("Pierre-Emile Højbjerg", "OM06", 23, Posicion.VOLANTE, LocalDate.of(1995, 8, 5), "Dinamarca"));
        marsella.agregarJugador(new Jugador("Adrien Rabiot", "OM07", 25, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 4, 3), "Francia"));
        marsella.agregarJugador(new Jugador("Amine Harit", "OM08", 11, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 6, 18), "Marruecos"));
        marsella.agregarJugador(new Jugador("Mason Greenwood", "OM09", 10, Posicion.EXTREMO, LocalDate.of(2001, 10, 1), "Inglaterra"));
        marsella.agregarJugador(new Jugador("Luis Henrique", "OM10", 44, Posicion.EXTREMO, LocalDate.of(2001, 12, 14), "Brasil"));
        marsella.agregarJugador(new Jugador("Neal Maupay", "OM11", 8, Posicion.DELANTERO, LocalDate.of(1996, 8, 14), "Francia"));
        equipos.add(marsella);

        // 4. LILLE OSC
        Equipo lille = new Equipo("Lille OSC");
        lille.setTecnicoEquipo(new Tecnico("Bruno Génésio", "L1_T04", "Lille OSC", "Francia"));
        lille.agregarJugador(new Jugador("Lucas Chevalier", "LOSC01", 30, Posicion.PORTERO, LocalDate.of(2001, 11, 6), "Francia"));
        lille.agregarJugador(new Jugador("Thomas Meunier", "LOSC02", 12, Posicion.LATERAL, LocalDate.of(1991, 9, 12), "Bélgica"));
        lille.agregarJugador(new Jugador("Bafodé Diakité", "LOSC03", 18, Posicion.DEFENSA, LocalDate.of(2001, 1, 6), "Francia"));
        lille.agregarJugador(new Jugador("Alexsandro Ribeiro", "LOSC04", 4, Posicion.DEFENSA, LocalDate.of(1999, 8, 9), "Brasil"));
        lille.agregarJugador(new Jugador("Gabriel Gudmundsson", "LOSC05", 5, Posicion.LATERAL, LocalDate.of(1999, 4, 29), "Suecia"));
        lille.agregarJugador(new Jugador("Benjamin André", "LOSC06", 21, Posicion.VOLANTE, LocalDate.of(1990, 8, 3), "Francia"));
        lille.agregarJugador(new Jugador("Ayyoub Bouaddi", "LOSC07", 32, Posicion.MEDIOCAMPISTA, LocalDate.of(2007, 10, 2), "Francia"));
        lille.agregarJugador(new Jugador("Angel Gomes", "LOSC08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 8, 31), "Inglaterra"));
        lille.agregarJugador(new Jugador("Edon Zhegrova", "LOSC09", 23, Posicion.EXTREMO, LocalDate.of(1999, 3, 31), "Kosovo"));
        lille.agregarJugador(new Jugador("Osame Sahraoui", "LOSC10", 11, Posicion.EXTREMO, LocalDate.of(2001, 6, 11), "Marruecos"));
        lille.agregarJugador(new Jugador("Jonathan David", "LOSC11", 9, Posicion.DELANTERO, LocalDate.of(2000, 1, 14), "Canadá"));
        equipos.add(lille);

        // 5. OLYMPIQUE DE LYON
        Equipo lyon = new Equipo("Olympique de Lyon");
        lyon.setTecnicoEquipo(new Tecnico("Pierre Sage", "L1_T05", "Olympique de Lyon", "Francia"));
        lyon.agregarJugador(new Jugador("Lucas Perri", "OL01", 23, Posicion.PORTERO, LocalDate.of(1997, 12, 10), "Brasil"));
        lyon.agregarJugador(new Jugador("Ainsley Maitland-Niles", "OL02", 98, Posicion.LATERAL, LocalDate.of(1997, 8, 29), "Inglaterra"));
        lyon.agregarJugador(new Jugador("Clinton Mata", "OL03", 22, Posicion.DEFENSA, LocalDate.of(1992, 11, 7), "Angola"));
        lyon.agregarJugador(new Jugador("Moussa Niakhaté", "OL04", 19, Posicion.DEFENSA, LocalDate.of(1996, 3, 8), "Senegal"));
        lyon.agregarJugador(new Jugador("Nicolás Tagliafico", "OL05", 3, Posicion.LATERAL, LocalDate.of(1992, 8, 31), "Argentina"));
        lyon.agregarJugador(new Jugador("Nemanja Matić", "OL06", 31, Posicion.VOLANTE, LocalDate.of(1988, 8, 1), "Serbia"));
        lyon.agregarJugador(new Jugador("Corentin Tolisso", "OL07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 8, 3), "Francia"));
        lyon.agregarJugador(new Jugador("Rayan Cherki", "OL08", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 8, 17), "Francia"));
        lyon.agregarJugador(new Jugador("Ernest Nuamah", "OL09", 37, Posicion.EXTREMO, LocalDate.of(2003, 11, 1), "Ghana"));
        lyon.agregarJugador(new Jugador("Malick Fofana", "OL10", 11, Posicion.EXTREMO, LocalDate.of(2005, 3, 31), "Bélgica"));
        lyon.agregarJugador(new Jugador("Alexandre Lacazette", "OL11", 10, Posicion.DELANTERO, LocalDate.of(1991, 5, 28), "Francia"));
        equipos.add(lyon);

        // 6. OGC NIZA
        Equipo niza = new Equipo("OGC Niza");
        niza.setTecnicoEquipo(new Tecnico("Franck Haise", "L1_T06", "OGC Niza", "Francia"));
        niza.agregarJugador(new Jugador("Marcin Bułka", "OGC01", 1, Posicion.PORTERO, LocalDate.of(1999, 10, 4), "Polonia"));
        niza.agregarJugador(new Jugador("Moïse Bombito", "OGC02", 64, Posicion.DEFENSA, LocalDate.of(2000, 3, 30), "Canadá"));
        niza.agregarJugador(new Jugador("Dante", "OGC03", 4, Posicion.DEFENSA, LocalDate.of(1983, 10, 18), "Brasil"));
        niza.agregarJugador(new Jugador("Youssouf Ndayishimiye", "OGC04", 55, Posicion.DEFENSA, LocalDate.of(1998, 10, 27), "Burundi"));
        niza.agregarJugador(new Jugador("Jonathan Clauss", "OGC05", 92, Posicion.LATERAL, LocalDate.of(1992, 9, 25), "Francia"));
        niza.agregarJugador(new Jugador("Pablo Rosario", "OGC06", 8, Posicion.VOLANTE, LocalDate.of(1997, 1, 7), "República Dominicana"));
        niza.agregarJugador(new Jugador("Hicham Boudaoui", "OGC07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 9, 23), "Argelia"));
        niza.agregarJugador(new Jugador("Melvin Bard", "OGC08", 26, Posicion.LATERAL, LocalDate.of(2000, 11, 6), "Francia"));
        niza.agregarJugador(new Jugador("Mohamed-Ali Cho", "OGC09", 25, Posicion.EXTREMO, LocalDate.of(2004, 1, 19), "Francia"));
        niza.agregarJugador(new Jugador("Jérémie Boga", "OGC10", 7, Posicion.EXTREMO, LocalDate.of(1997, 1, 3), "Costa de Marfil"));
        niza.agregarJugador(new Jugador("Evann Guessand", "OGC11", 29, Posicion.DELANTERO, LocalDate.of(2001, 7, 1), "Costa de Marfil"));
        equipos.add(niza);

        // 7. RC LENS
        Equipo lens = new Equipo("RC Lens");
        lens.setTecnicoEquipo(new Tecnico("Will Still", "L1_T07", "RC Lens", "Bélgica"));
        lens.agregarJugador(new Jugador("Brice Samba", "RCL01", 30, Posicion.PORTERO, LocalDate.of(1994, 4, 25), "Francia"));
        lens.agregarJugador(new Jugador("Jonathan Gradit", "RCL02", 24, Posicion.DEFENSA, LocalDate.of(1992, 11, 24), "Francia"));
        lens.agregarJugador(new Jugador("Kevin Danso", "RCL03", 4, Posicion.DEFENSA, LocalDate.of(1998, 9, 19), "Austria"));
        lens.agregarJugador(new Jugador("Facundo Medina", "RCL04", 14, Posicion.DEFENSA, LocalDate.of(1999, 5, 28), "Argentina"));
        lens.agregarJugador(new Jugador("Przemysław Frankowski", "RCL05", 29, Posicion.LATERAL, LocalDate.of(1995, 4, 12), "Polonia"));
        lens.agregarJugador(new Jugador("Adrien Thomasson", "RCL06", 28, Posicion.VOLANTE, LocalDate.of(1993, 12, 10), "Francia"));
        lens.agregarJugador(new Jugador("Andy Diouf", "RCL07", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 5, 17), "Francia"));
        lens.agregarJugador(new Jugador("Deiver Machado", "RCL08", 3, Posicion.LATERAL, LocalDate.of(1993, 9, 2), "Colombia"));
        lens.agregarJugador(new Jugador("Florian Sotoca", "RCL09", 7, Posicion.EXTREMO, LocalDate.of(1990, 10, 25), "Francia"));
        lens.agregarJugador(new Jugador("Anass Zaroury", "RCL10", 21, Posicion.EXTREMO, LocalDate.of(2000, 11, 7), "Marruecos"));
        lens.agregarJugador(new Jugador("M'Bala Nzola", "RCL11", 8, Posicion.DELANTERO, LocalDate.of(1996, 8, 18), "Angola"));
        equipos.add(lens);

        // 8. STADE BRESTOIS
        Equipo brest = new Equipo("Stade Brestois");
        brest.setTecnicoEquipo(new Tecnico("Éric Roy", "L1_T08", "Stade Brestois", "Francia"));
        brest.agregarJugador(new Jugador("Marco Bizot", "SB2901", 40, Posicion.PORTERO, LocalDate.of(1991, 3, 10), "Países Bajos"));
        brest.agregarJugador(new Jugador("Kenny Lala", "SB2902", 7, Posicion.LATERAL, LocalDate.of(1991, 10, 3), "Francia"));
        brest.agregarJugador(new Jugador("Brendan Chardonnet", "SB2903", 5, Posicion.DEFENSA, LocalDate.of(1994, 12, 22), "Francia"));
        brest.agregarJugador(new Jugador("Soumaïla Coulibaly", "SB2904", 44, Posicion.DEFENSA, LocalDate.of(2003, 10, 14), "Francia"));
        brest.agregarJugador(new Jugador("Massadio Haïdara", "SB2905", 22, Posicion.LATERAL, LocalDate.of(1992, 12, 2), "Malí"));
        brest.agregarJugador(new Jugador("Pierre Lees-Melou", "SB2906", 20, Posicion.VOLANTE, LocalDate.of(1993, 5, 25), "Francia"));
        brest.agregarJugador(new Jugador("Hugo Magnetti", "SB2907", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 5, 30), "Francia"));
        brest.agregarJugador(new Jugador("Mahdi Camara", "SB2908", 45, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 6, 30), "Francia"));
        brest.agregarJugador(new Jugador("Romain Del Castillo", "SB2909", 10, Posicion.EXTREMO, LocalDate.of(1996, 3, 29), "Francia"));
        brest.agregarJugador(new Jugador("Mama Baldé", "SB2910", 14, Posicion.EXTREMO, LocalDate.of(1995, 11, 6), "Guinea-Bisáu"));
        brest.agregarJugador(new Jugador("Ludovic Ajorque", "SB2911", 19, Posicion.DELANTERO, LocalDate.of(1994, 2, 25), "Francia"));
        equipos.add(brest);

        // 9. STADE DE REIMS
        Equipo reims = new Equipo("Stade de Reims");
        reims.setTecnicoEquipo(new Tecnico("Luka Elsner", "L1_T09", "Stade de Reims", "Eslovenia"));
        reims.agregarJugador(new Jugador("Yehvann Diouf", "SDR01", 94, Posicion.PORTERO, LocalDate.of(1999, 11, 16), "Francia"));
        reims.agregarJugador(new Jugador("Aurélio Buta", "SDR02", 23, Posicion.LATERAL, LocalDate.of(1997, 2, 10), "Portugal"));
        reims.agregarJugador(new Jugador("Emmanuel Agbadou", "SDR03", 24, Posicion.DEFENSA, LocalDate.of(1997, 6, 17), "Costa de Marfil"));
        reims.agregarJugador(new Jugador("Cédric Kipré", "SDR04", 21, Posicion.DEFENSA, LocalDate.of(1996, 12, 9), "Costa de Marfil"));
        reims.agregarJugador(new Jugador("Sergio Akieme", "SDR05", 18, Posicion.LATERAL, LocalDate.of(1997, 12, 16), "España"));
        reims.agregarJugador(new Jugador("Valentin Atangana", "SDR06", 6, Posicion.VOLANTE, LocalDate.of(2005, 8, 25), "Francia"));
        reims.agregarJugador(new Jugador("Marshall Munetsi", "SDR07", 15, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 6, 22), "Zimbabue"));
        reims.agregarJugador(new Jugador("Teddy Teuma", "SDR08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1993, 9, 30), "Malta"));
        reims.agregarJugador(new Jugador("Junya Itō", "SDR09", 7, Posicion.EXTREMO, LocalDate.of(1993, 3, 9), "Japón"));
        reims.agregarJugador(new Jugador("Keito Nakamura", "SDR10", 17, Posicion.EXTREMO, LocalDate.of(2000, 7, 28), "Japón"));
        reims.agregarJugador(new Jugador("Oumar Diakité", "SDR11", 22, Posicion.DELANTERO, LocalDate.of(2003, 12, 20), "Costa de Marfil"));
        equipos.add(reims);

        // 10. RC ESTRASBURGO
        Equipo estrasburgo = new Equipo("RC Estrasburgo");
        estrasburgo.setTecnicoEquipo(new Tecnico("Liam Rosenior", "L1_T10", "RC Estrasburgo", "Inglaterra"));
        estrasburgo.agregarJugador(new Jugador("Đorđe Petrović", "RCSA01", 1, Posicion.PORTERO, LocalDate.of(1999, 10, 8), "Serbia"));
        estrasburgo.agregarJugador(new Jugador("Guéla Doué", "RCSA02", 22, Posicion.LATERAL, LocalDate.of(2002, 10, 17), "Costa de Marfil"));
        estrasburgo.agregarJugador(new Jugador("Saïdou Sow", "RCSA03", 5, Posicion.DEFENSA, LocalDate.of(2002, 7, 4), "Guinea"));
        estrasburgo.agregarJugador(new Jugador("Mamadou Sarr", "RCSA04", 23, Posicion.DEFENSA, LocalDate.of(2005, 8, 29), "Francia"));
        estrasburgo.agregarJugador(new Jugador("Diego Moreira", "RCSA05", 7, Posicion.LATERAL, LocalDate.of(2004, 8, 6), "Portugal"));
        estrasburgo.agregarJugador(new Jugador("Andrey Santos", "RCSA06", 8, Posicion.VOLANTE, LocalDate.of(2004, 5, 3), "Brasil"));
        estrasburgo.agregarJugador(new Jugador("Habib Diarra", "RCSA07", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 1, 3), "Senegal"));
        estrasburgo.agregarJugador(new Jugador("Sebastian Nanasi", "RCSA08", 15, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 5, 16), "Suecia"));
        estrasburgo.agregarJugador(new Jugador("Dilane Bakwa", "RCSA09", 26, Posicion.EXTREMO, LocalDate.of(2002, 8, 26), "Francia"));
        estrasburgo.agregarJugador(new Jugador("Sékou Mara", "RCSA10", 14, Posicion.EXTREMO, LocalDate.of(2002, 7, 30), "Francia"));
        estrasburgo.agregarJugador(new Jugador("Emanuel Emegha", "RCSA11", 10, Posicion.DELANTERO, LocalDate.of(2003, 2, 3), "Países Bajos"));
        equipos.add(estrasburgo);

        // 11. TOULOUSE FC
        Equipo toulouse = new Equipo("Toulouse FC");
        toulouse.setTecnicoEquipo(new Tecnico("Carles Martínez Novell", "L1_T11", "Toulouse FC", "España"));
        toulouse.agregarJugador(new Jugador("Guillaume Restes", "TFC01", 50, Posicion.PORTERO, LocalDate.of(2005, 3, 11), "Francia"));
        toulouse.agregarJugador(new Jugador("Djibril Sidibé", "TFC02", 19, Posicion.DEFENSA, LocalDate.of(1992, 7, 29), "Francia"));
        toulouse.agregarJugador(new Jugador("Charlie Cresswell", "TFC03", 4, Posicion.DEFENSA, LocalDate.of(2002, 8, 17), "Inglaterra"));
        toulouse.agregarJugador(new Jugador("Mark McKenzie", "TFC04", 3, Posicion.DEFENSA, LocalDate.of(1999, 2, 25), "Estados Unidos"));
        toulouse.agregarJugador(new Jugador("Warren Kamanzi", "TFC05", 12, Posicion.LATERAL, LocalDate.of(2000, 11, 11), "Noruega"));
        toulouse.agregarJugador(new Jugador("Cristian Cásseres Jr.", "TFC06", 23, Posicion.VOLANTE, LocalDate.of(2000, 1, 20), "Venezuela"));
        toulouse.agregarJugador(new Jugador("Vincent Sierro", "TFC07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 10, 8), "Suiza"));
        toulouse.agregarJugador(new Jugador("Gabriel Suazo", "TFC08", 17, Posicion.LATERAL, LocalDate.of(1997, 8, 9), "Chile"));
        toulouse.agregarJugador(new Jugador("Zakaria Aboukhlal", "TFC09", 7, Posicion.EXTREMO, LocalDate.of(2000, 2, 18), "Marruecos"));
        toulouse.agregarJugador(new Jugador("Yann Gboho", "TFC10", 10, Posicion.EXTREMO, LocalDate.of(2001, 1, 14), "Francia"));
        toulouse.agregarJugador(new Jugador("Joshua King", "TFC11", 13, Posicion.DELANTERO, LocalDate.of(1992, 1, 15), "Noruega"));
        equipos.add(toulouse);

        // 12. AJ AUXERRE
        Equipo auxerre = new Equipo("AJ Auxerre");
        auxerre.setTecnicoEquipo(new Tecnico("Christophe Pélissier", "L1_T12", "AJ Auxerre", "Francia"));
        auxerre.agregarJugador(new Jugador("Donovan Léon", "AJA01", 16, Posicion.PORTERO, LocalDate.of(1992, 11, 3), "Guayana Francesa"));
        auxerre.agregarJugador(new Jugador("Sinaly Diomandé", "AJA02", 20, Posicion.DEFENSA, LocalDate.of(2001, 4, 9), "Costa de Marfil"));
        auxerre.agregarJugador(new Jugador("Jubal", "AJA03", 4, Posicion.DEFENSA, LocalDate.of(1993, 8, 29), "Brasil"));
        auxerre.agregarJugador(new Jugador("Clément Akpa", "AJA04", 92, Posicion.DEFENSA, LocalDate.of(2001, 11, 24), "Costa de Marfil"));
        auxerre.agregarJugador(new Jugador("Ki-Jana Hoever", "AJA05", 27, Posicion.LATERAL, LocalDate.of(2002, 1, 18), "Países Bajos"));
        auxerre.agregarJugador(new Jugador("Elisha Owusu", "AJA06", 42, Posicion.VOLANTE, LocalDate.of(1997, 11, 7), "Ghana"));
        auxerre.agregarJugador(new Jugador("Kévin Danois", "AJA07", 21, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 6, 28), "Francia"));
        auxerre.agregarJugador(new Jugador("Gideon Mensah", "AJA08", 14, Posicion.LATERAL, LocalDate.of(1998, 7, 18), "Ghana"));
        auxerre.agregarJugador(new Jugador("Gaëtan Perrin", "AJA09", 10, Posicion.EXTREMO, LocalDate.of(1996, 6, 7), "Francia"));
        auxerre.agregarJugador(new Jugador("Hamed Junior Traorè", "AJA10", 25, Posicion.EXTREMO, LocalDate.of(2000, 2, 16), "Costa de Marfil"));
        auxerre.agregarJugador(new Jugador("Lassine Sinayoko", "AJA11", 17, Posicion.DELANTERO, LocalDate.of(1999, 12, 8), "Malí"));
        equipos.add(auxerre);

        // 13. STADE RENNAIS
        Equipo rennes = new Equipo("Stade Rennais");
        rennes.setTecnicoEquipo(new Tecnico("Jorge Sampaoli", "L1_T13", "Stade Rennais", "Argentina"));
        rennes.agregarJugador(new Jugador("Steve Mandanda", "SRFC01", 30, Posicion.PORTERO, LocalDate.of(1985, 3, 28), "Francia"));
        rennes.agregarJugador(new Jugador("Hans Hateboer", "SRFC02", 33, Posicion.DEFENSA, LocalDate.of(1994, 1, 9), "Países Bajos"));
        rennes.agregarJugador(new Jugador("Leo Østigård", "SRFC03", 55, Posicion.DEFENSA, LocalDate.of(1999, 11, 28), "Noruega"));
        rennes.agregarJugador(new Jugador("Christopher Wooh", "SRFC04", 4, Posicion.DEFENSA, LocalDate.of(2001, 9, 18), "Camerún"));
        rennes.agregarJugador(new Jugador("Lorenz Assignon", "SRFC05", 22, Posicion.LATERAL, LocalDate.of(2000, 6, 22), "Francia"));
        rennes.agregarJugador(new Jugador("Azor Matusiwa", "SRFC06", 6, Posicion.VOLANTE, LocalDate.of(1998, 4, 28), "Países Bajos"));
        rennes.agregarJugador(new Jugador("Baptiste Santamaria", "SRFC07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 3, 9), "Francia"));
        rennes.agregarJugador(new Jugador("Adrien Truffert", "SRFC08", 3, Posicion.LATERAL, LocalDate.of(2001, 11, 20), "Francia"));
        rennes.agregarJugador(new Jugador("Ludovic Blas", "SRFC09", 10, Posicion.EXTREMO, LocalDate.of(1997, 12, 31), "Francia"));
        rennes.agregarJugador(new Jugador("Amine Gouiri", "SRFC10", 9, Posicion.EXTREMO, LocalDate.of(2000, 2, 16), "Argelia"));
        rennes.agregarJugador(new Jugador("Arnaud Kalimuendo", "SRFC11", 15, Posicion.DELANTERO, LocalDate.of(2002, 1, 20), "Francia"));
        equipos.add(rennes);

        // 14. FC NANTES
        Equipo nantes = new Equipo("FC Nantes");
        nantes.setTecnicoEquipo(new Tecnico("Antoine Kombouaré", "L1_T14", "FC Nantes", "Francia"));
        nantes.agregarJugador(new Jugador("Alban Lafont", "FCN01", 1, Posicion.PORTERO, LocalDate.of(1999, 1, 23), "Francia"));
        nantes.agregarJugador(new Jugador("Kelvin Amian", "FCN02", 98, Posicion.LATERAL, LocalDate.of(1998, 2, 8), "Francia"));
        nantes.agregarJugador(new Jugador("Jean-Charles Castelletto", "FCN03", 21, Posicion.DEFENSA, LocalDate.of(1995, 1, 26), "Camerún"));
        nantes.agregarJugador(new Jugador("Nathan Zézé", "FCN04", 44, Posicion.DEFENSA, LocalDate.of(2005, 6, 18), "Francia"));
        nantes.agregarJugador(new Jugador("Nicolas Cozza", "FCN05", 3, Posicion.LATERAL, LocalDate.of(1999, 1, 8), "Francia"));
        nantes.agregarJugador(new Jugador("Pedro Chirivella", "FCN06", 5, Posicion.VOLANTE, LocalDate.of(1997, 5, 23), "España"));
        nantes.agregarJugador(new Jugador("Douglas Augusto", "FCN07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 1, 13), "Brasil"));
        nantes.agregarJugador(new Jugador("Johann Lepenant", "FCN08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 10, 22), "Francia"));
        nantes.agregarJugador(new Jugador("Sorba Thomas", "FCN09", 22, Posicion.EXTREMO, LocalDate.of(1999, 1, 25), "Gales"));
        nantes.agregarJugador(new Jugador("Moses Simon", "FCN10", 27, Posicion.EXTREMO, LocalDate.of(1995, 7, 12), "Nigeria"));
        nantes.agregarJugador(new Jugador("Matthis Abline", "FCN11", 39, Posicion.DELANTERO, LocalDate.of(2003, 3, 28), "Francia"));
        equipos.add(nantes);

        // 15. ANGERS SCO
        Equipo angers = new Equipo("Angers SCO");
        angers.setTecnicoEquipo(new Tecnico("Alexandre Dujeux", "L1_T15", "Angers SCO", "Francia"));
        angers.agregarJugador(new Jugador("Yahia Fofana", "SCO01", 30, Posicion.PORTERO, LocalDate.of(2000, 8, 21), "Costa de Marfil"));
        angers.agregarJugador(new Jugador("Carlens Arcus", "SCO02", 2, Posicion.LATERAL, LocalDate.of(1996, 6, 28), "Haití"));
        angers.agregarJugador(new Jugador("Emmanuel Biumla", "SCO03", 24, Posicion.DEFENSA, LocalDate.of(2005, 5, 8), "Francia"));
        angers.agregarJugador(new Jugador("Jordan Lefort", "SCO04", 21, Posicion.DEFENSA, LocalDate.of(1993, 8, 9), "Francia"));
        angers.agregarJugador(new Jugador("Florent Hanin", "SCO05", 26, Posicion.LATERAL, LocalDate.of(1990, 2, 4), "Francia"));
        angers.agregarJugador(new Jugador("Jean-Eudes Aholou", "SCO06", 6, Posicion.VOLANTE, LocalDate.of(1994, 3, 20), "Costa de Marfil"));
        angers.agregarJugador(new Jugador("Haris Belkebla", "SCO07", 93, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 1, 28), "Argelia"));
        angers.agregarJugador(new Jugador("Himad Abdelli", "SCO08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 11, 17), "Argelia"));
        angers.agregarJugador(new Jugador("Jim Allevinah", "SCO09", 18, Posicion.EXTREMO, LocalDate.of(1995, 2, 27), "Gabón"));
        angers.agregarJugador(new Jugador("Farid El Melali", "SCO10", 28, Posicion.EXTREMO, LocalDate.of(1997, 7, 13), "Argelia"));
        angers.agregarJugador(new Jugador("Ibrahima Niane", "SCO11", 7, Posicion.DELANTERO, LocalDate.of(1999, 3, 11), "Senegal"));
        equipos.add(angers);

        // 16. AS SAINT-ÉTIENNE
        Equipo saintEtienne = new Equipo("AS Saint-Étienne");
        saintEtienne.setTecnicoEquipo(new Tecnico("Eirik Horneland", "L1_T16", "AS Saint-Étienne", "Noruega"));
        saintEtienne.agregarJugador(new Jugador("Gautier Larsonneur", "ASSE01", 30, Posicion.PORTERO, LocalDate.of(1997, 2, 23), "Francia"));
        saintEtienne.agregarJugador(new Jugador("Dennis Appiah", "ASSE02", 8, Posicion.LATERAL, LocalDate.of(1992, 6, 9), "Francia"));
        saintEtienne.agregarJugador(new Jugador("Dylan Batubinsika", "ASSE03", 21, Posicion.DEFENSA, LocalDate.of(1996, 2, 15), "RD del Congo"));
        saintEtienne.agregarJugador(new Jugador("Mickaël Nadé", "ASSE04", 3, Posicion.DEFENSA, LocalDate.of(1999, 3, 4), "Francia"));
        saintEtienne.agregarJugador(new Jugador("Léo Pétrot", "ASSE05", 19, Posicion.LATERAL, LocalDate.of(1997, 4, 15), "Francia"));
        saintEtienne.agregarJugador(new Jugador("Pierre Ekwah", "ASSE06", 4, Posicion.VOLANTE, LocalDate.of(2002, 1, 15), "Francia"));
        saintEtienne.agregarJugador(new Jugador("Benjamin Bouchouari", "ASSE07", 6, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 11, 13), "Marruecos"));
        saintEtienne.agregarJugador(new Jugador("Louis Mouton", "ASSE08", 14, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 6, 3), "Francia"));
        saintEtienne.agregarJugador(new Jugador("Mathieu Cafaro", "ASSE09", 18, Posicion.EXTREMO, LocalDate.of(1997, 3, 25), "Francia"));
        saintEtienne.agregarJugador(new Jugador("Zuriko Davitashvili", "ASSE10", 22, Posicion.EXTREMO, LocalDate.of(2001, 2, 15), "Georgia"));
        saintEtienne.agregarJugador(new Jugador("Lucas Stassin", "ASSE11", 32, Posicion.DELANTERO, LocalDate.of(2004, 11, 29), "Bélgica"));
        equipos.add(saintEtienne);

        // 17. LE HAVRE AC
        Equipo leHavre = new Equipo("Le Havre AC");
        leHavre.setTecnicoEquipo(new Tecnico("Didier Digard", "L1_T17", "Le Havre AC", "Francia"));
        leHavre.agregarJugador(new Jugador("Arthur Desmas", "HAC01", 30, Posicion.PORTERO, LocalDate.of(1994, 4, 7), "Francia"));
        leHavre.agregarJugador(new Jugador("Loïc Nego", "HAC02", 7, Posicion.LATERAL, LocalDate.of(1991, 1, 15), "Hungría"));
        leHavre.agregarJugador(new Jugador("Arouna Sangante", "HAC03", 93, Posicion.DEFENSA, LocalDate.of(2002, 4, 12), "Senegal"));
        leHavre.agregarJugador(new Jugador("Gautier Lloris", "HAC04", 4, Posicion.DEFENSA, LocalDate.of(1995, 7, 18), "Francia"));
        leHavre.agregarJugador(new Jugador("Christopher Operi", "HAC05", 27, Posicion.LATERAL, LocalDate.of(1997, 4, 29), "Costa de Marfil"));
        leHavre.agregarJugador(new Jugador("Abdoulaye Touré", "HAC06", 94, Posicion.VOLANTE, LocalDate.of(1994, 3, 3), "Guinea"));
        leHavre.agregarJugador(new Jugador("Rassoul Ndiaye", "HAC07", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 12, 11), "Senegal"));
        leHavre.agregarJugador(new Jugador("Yassine Kechta", "HAC08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 2, 25), "Marruecos"));
        leHavre.agregarJugador(new Jugador("Josué Casimir", "HAC09", 10, Posicion.EXTREMO, LocalDate.of(2001, 9, 24), "Guadalupe"));
        leHavre.agregarJugador(new Jugador("Emmanuel Sabbi", "HAC10", 11, Posicion.EXTREMO, LocalDate.of(1997, 12, 24), "Estados Unidos"));
        leHavre.agregarJugador(new Jugador("André Ayew", "HAC11", 28, Posicion.DELANTERO, LocalDate.of(1989, 12, 17), "Ghana"));
        equipos.add(leHavre);

        // 18. MONTPELLIER HSC
        Equipo montpellier = new Equipo("Montpellier HSC");
        montpellier.setTecnicoEquipo(new Tecnico("Jean-Louis Gasset", "L1_T18", "Montpellier HSC", "Francia"));
        montpellier.agregarJugador(new Jugador("Benjamin Lecomte", "MHSC01", 40, Posicion.PORTERO, LocalDate.of(1991, 4, 26), "Francia"));
        montpellier.agregarJugador(new Jugador("Enzo Tchato", "MHSC02", 29, Posicion.LATERAL, LocalDate.of(2002, 11, 23), "Camerún"));
        montpellier.agregarJugador(new Jugador("Modibo Sagnan", "MHSC03", 5, Posicion.DEFENSA, LocalDate.of(1999, 4, 14), "Malí"));
        montpellier.agregarJugador(new Jugador("Bećir Omeragić", "MHSC04", 27, Posicion.DEFENSA, LocalDate.of(2002, 1, 20), "Suiza"));
        montpellier.agregarJugador(new Jugador("Issiaga Sylla", "MHSC05", 3, Posicion.LATERAL, LocalDate.of(1994, 1, 1), "Guinea"));
        montpellier.agregarJugador(new Jugador("Jordan Ferri", "MHSC06", 12, Posicion.VOLANTE, LocalDate.of(1992, 3, 12), "Francia"));
        montpellier.agregarJugador(new Jugador("Joris Chotard", "MHSC07", 13, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 9, 24), "Francia"));
        montpellier.agregarJugador(new Jugador("Téji Savanier", "MHSC08", 11, Posicion.MEDIOCAMPISTA, LocalDate.of(1991, 12, 22), "Francia"));
        montpellier.agregarJugador(new Jugador("Musa Al-Taamari", "MHSC09", 9, Posicion.EXTREMO, LocalDate.of(1997, 6, 10), "Jordania"));
        montpellier.agregarJugador(new Jugador("Arnaud Nordin", "MHSC10", 7, Posicion.EXTREMO, LocalDate.of(1998, 6, 17), "Francia"));
        montpellier.agregarJugador(new Jugador("Akor Adams", "MHSC11", 8, Posicion.DELANTERO, LocalDate.of(2000, 1, 29), "Nigeria"));
        equipos.add(montpellier);

        return equipos;
    }
}
