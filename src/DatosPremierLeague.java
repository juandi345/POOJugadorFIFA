import java.time.LocalDate;
import java.util.ArrayList;

public class DatosPremierLeague {

    public static ArrayList<Equipo> cargarEquiposPremier() {
        ArrayList<Equipo> equipos = new ArrayList<>();

        // 1. ARSENAL FC
        Equipo arsenal = new Equipo("Arsenal FC");
        arsenal.setTecnicoEquipo(new Tecnico("Mikel Arteta", "PL_T01", "Arsenal FC", "España"));
        arsenal.agregarJugador(new Jugador("David Raya", "ARS01", 22, Posicion.PORTERO, LocalDate.of(1995, 9, 15), "España"));
        arsenal.agregarJugador(new Jugador("Jurriën Timber", "ARS02", 12, Posicion.LATERAL, LocalDate.of(2001, 6, 17), "Países Bajos"));
        arsenal.agregarJugador(new Jugador("William Saliba", "ARS03", 2, Posicion.DEFENSA, LocalDate.of(2001, 3, 24), "Francia"));
        arsenal.agregarJugador(new Jugador("Gabriel Magalhães", "ARS04", 6, Posicion.DEFENSA, LocalDate.of(1997, 12, 19), "Brasil"));
        arsenal.agregarJugador(new Jugador("Riccardo Calafiori", "ARS05", 33, Posicion.LATERAL, LocalDate.of(2002, 5, 19), "Italia"));
        arsenal.agregarJugador(new Jugador("Thomas Partey", "ARS06", 5, Posicion.VOLANTE, LocalDate.of(1993, 6, 13), "Ghana"));
        arsenal.agregarJugador(new Jugador("Declan Rice", "ARS07", 41, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 1, 14), "Inglaterra"));
        arsenal.agregarJugador(new Jugador("Martin Ødegaard", "ARS08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 12, 17), "Noruega"));
        arsenal.agregarJugador(new Jugador("Bukayo Saka", "ARS09", 7, Posicion.EXTREMO, LocalDate.of(2001, 9, 5), "Inglaterra"));
        arsenal.agregarJugador(new Jugador("Gabriel Martinelli", "ARS10", 11, Posicion.EXTREMO, LocalDate.of(2001, 6, 18), "Brasil"));
        arsenal.agregarJugador(new Jugador("Kai Havertz", "ARS11", 29, Posicion.DELANTERO, LocalDate.of(1999, 6, 11), "Alemania"));
        equipos.add(arsenal);

        // 2. ASTON VILLA
        Equipo astonVilla = new Equipo("Aston Villa");
        astonVilla.setTecnicoEquipo(new Tecnico("Unai Emery", "PL_T02", "Aston Villa", "España"));
        astonVilla.agregarJugador(new Jugador("Emiliano Martínez", "AVL01", 23, Posicion.PORTERO, LocalDate.of(1992, 9, 2), "Argentina"));
        astonVilla.agregarJugador(new Jugador("Matty Cash", "AVL02", 2, Posicion.LATERAL, LocalDate.of(1997, 8, 7), "Polonia"));
        astonVilla.agregarJugador(new Jugador("Ezri Konsa", "AVL03", 4, Posicion.DEFENSA, LocalDate.of(1997, 10, 23), "Inglaterra"));
        astonVilla.agregarJugador(new Jugador("Pau Torres", "AVL04", 14, Posicion.DEFENSA, LocalDate.of(1997, 1, 16), "España"));
        astonVilla.agregarJugador(new Jugador("Lucas Digne", "AVL05", 12, Posicion.LATERAL, LocalDate.of(1993, 7, 20), "Francia"));
        astonVilla.agregarJugador(new Jugador("Amadou Onana", "AVL06", 24, Posicion.VOLANTE, LocalDate.of(2001, 8, 16), "Bélgica"));
        astonVilla.agregarJugador(new Jugador("Youri Tielemans", "AVL07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 5, 7), "Bélgica"));
        astonVilla.agregarJugador(new Jugador("Morgan Rogers", "AVL08", 27, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 7, 26), "Inglaterra"));
        astonVilla.agregarJugador(new Jugador("Leon Bailey", "AVL09", 31, Posicion.EXTREMO, LocalDate.of(1997, 8, 9), "Jamaica"));
        astonVilla.agregarJugador(new Jugador("John McGinn", "AVL10", 7, Posicion.EXTREMO, LocalDate.of(1994, 10, 18), "Escocia"));
        astonVilla.agregarJugador(new Jugador("Ollie Watkins", "AVL11", 11, Posicion.DELANTERO, LocalDate.of(1995, 12, 30), "Inglaterra"));
        equipos.add(astonVilla);

        // 3. AFC BOURNEMOUTH
        Equipo bournemouth = new Equipo("AFC Bournemouth");
        bournemouth.setTecnicoEquipo(new Tecnico("Andoni Iraola", "PL_T03", "AFC Bournemouth", "España"));
        bournemouth.agregarJugador(new Jugador("Kepa Arrizabalaga", "BOU01", 13, Posicion.PORTERO, LocalDate.of(1994, 10, 3), "España"));
        bournemouth.agregarJugador(new Jugador("Adam Smith", "BOU02", 15, Posicion.LATERAL, LocalDate.of(1991, 4, 29), "Inglaterra"));
        bournemouth.agregarJugador(new Jugador("Illia Zabarnyi", "BOU03", 27, Posicion.DEFENSA, LocalDate.of(2002, 9, 1), "Ucrania"));
        bournemouth.agregarJugador(new Jugador("Marcos Senesi", "BOU04", 5, Posicion.DEFENSA, LocalDate.of(1997, 5, 10), "Argentina"));
        bournemouth.agregarJugador(new Jugador("Milos Kerkez", "BOU05", 3, Posicion.LATERAL, LocalDate.of(2003, 11, 7), "Hungría"));
        bournemouth.agregarJugador(new Jugador("Lewis Cook", "BOU06", 4, Posicion.VOLANTE, LocalDate.of(1997, 2, 3), "Inglaterra"));
        bournemouth.agregarJugador(new Jugador("Ryan Christie", "BOU07", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 2, 22), "Escocia"));
        bournemouth.agregarJugador(new Jugador("Justin Kluivert", "BOU08", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 5, 5), "Países Bajos"));
        bournemouth.agregarJugador(new Jugador("Antoine Semenyo", "BOU09", 24, Posicion.EXTREMO, LocalDate.of(2000, 1, 7), "Ghana"));
        bournemouth.agregarJugador(new Jugador("Marcus Tavernier", "BOU10", 16, Posicion.EXTREMO, LocalDate.of(1999, 3, 22), "Inglaterra"));
        bournemouth.agregarJugador(new Jugador("Evanilson", "BOU11", 9, Posicion.DELANTERO, LocalDate.of(1999, 10, 6), "Brasil"));
        equipos.add(bournemouth);

        // 4. BRENTFORD FC
        Equipo brentford = new Equipo("Brentford FC");
        brentford.setTecnicoEquipo(new Tecnico("Thomas Frank", "PL_T04", "Brentford FC", "Dinamarca"));
        brentford.agregarJugador(new Jugador("Mark Flekken", "BRE01", 1, Posicion.PORTERO, LocalDate.of(1993, 6, 13), "Países Bajos"));
        brentford.agregarJugador(new Jugador("Sepp van den Berg", "BRE02", 4, Posicion.LATERAL, LocalDate.of(2001, 12, 20), "Países Bajos"));
        brentford.agregarJugador(new Jugador("Nathan Collins", "BRE03", 22, Posicion.DEFENSA, LocalDate.of(2001, 4, 30), "Irlanda"));
        brentford.agregarJugador(new Jugador("Ethan Pinnock", "BRE04", 5, Posicion.DEFENSA, LocalDate.of(1993, 5, 29), "Jamaica"));
        brentford.agregarJugador(new Jugador("Kristoffer Ajer", "BRE05", 20, Posicion.LATERAL, LocalDate.of(1998, 4, 17), "Noruega"));
        brentford.agregarJugador(new Jugador("Christian Nørgaard", "BRE06", 6, Posicion.VOLANTE, LocalDate.of(1994, 3, 10), "Dinamarca"));
        brentford.agregarJugador(new Jugador("Vitaly Janelt", "BRE07", 27, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 5, 10), "Alemania"));
        brentford.agregarJugador(new Jugador("Mikkel Damsgaard", "BRE08", 24, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 7, 3), "Dinamarca"));
        brentford.agregarJugador(new Jugador("Bryan Mbeumo", "BRE09", 19, Posicion.EXTREMO, LocalDate.of(1999, 8, 7), "Camerún"));
        brentford.agregarJugador(new Jugador("Keane Lewis-Potter", "BRE10", 23, Posicion.EXTREMO, LocalDate.of(2001, 2, 22), "Inglaterra"));
        brentford.agregarJugador(new Jugador("Yoane Wissa", "BRE11", 11, Posicion.DELANTERO, LocalDate.of(1996, 9, 3), "RD del Congo"));
        equipos.add(brentford);

        // 5. BRIGHTON & HOVE ALBION
        Equipo brighton = new Equipo("Brighton & Hove Albion");
        brighton.setTecnicoEquipo(new Tecnico("Fabian Hürzeler", "PL_T05", "Brighton & Hove Albion", "Alemania"));
        brighton.agregarJugador(new Jugador("Bart Verbruggen", "BHA01", 1, Posicion.PORTERO, LocalDate.of(2002, 8, 18), "Países Bajos"));
        brighton.agregarJugador(new Jugador("Joël Veltman", "BHA02", 34, Posicion.LATERAL, LocalDate.of(1992, 1, 15), "Países Bajos"));
        brighton.agregarJugador(new Jugador("Jan Paul van Hecke", "BHA03", 29, Posicion.DEFENSA, LocalDate.of(2000, 6, 8), "Países Bajos"));
        brighton.agregarJugador(new Jugador("Lewis Dunk", "BHA04", 5, Posicion.DEFENSA, LocalDate.of(1991, 11, 21), "Inglaterra"));
        brighton.agregarJugador(new Jugador("Pervis Estupiñán", "BHA05", 30, Posicion.LATERAL, LocalDate.of(1998, 1, 21), "Ecuador"));
        brighton.agregarJugador(new Jugador("Carlos Baleba", "BHA06", 20, Posicion.VOLANTE, LocalDate.of(2004, 1, 3), "Camerún"));
        brighton.agregarJugador(new Jugador("Yasin Ayari", "BHA07", 26, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 10, 6), "Suecia"));
        brighton.agregarJugador(new Jugador("Georginio Rutter", "BHA08", 14, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 4, 20), "Francia"));
        brighton.agregarJugador(new Jugador("Yankuba Minteh", "BHA09", 17, Posicion.EXTREMO, LocalDate.of(2004, 7, 22), "Gambia"));
        brighton.agregarJugador(new Jugador("Kaoru Mitoma", "BHA10", 22, Posicion.EXTREMO, LocalDate.of(1997, 5, 20), "Japón"));
        brighton.agregarJugador(new Jugador("Danny Welbeck", "BHA11", 18, Posicion.DELANTERO, LocalDate.of(1990, 11, 26), "Inglaterra"));
        equipos.add(brighton);

        // 6. CHELSEA FC
        Equipo chelsea = new Equipo("Chelsea FC");
        chelsea.setTecnicoEquipo(new Tecnico("Enzo Maresca", "PL_T06", "Chelsea FC", "Italia"));
        chelsea.agregarJugador(new Jugador("Robert Sánchez", "CHE01", 1, Posicion.PORTERO, LocalDate.of(1997, 11, 18), "España"));
        chelsea.agregarJugador(new Jugador("Malo Gusto", "CHE02", 27, Posicion.LATERAL, LocalDate.of(2003, 5, 19), "Francia"));
        chelsea.agregarJugador(new Jugador("Wesley Fofana", "CHE03", 29, Posicion.DEFENSA, LocalDate.of(2000, 12, 17), "Francia"));
        chelsea.agregarJugador(new Jugador("Levi Colwill", "CHE04", 6, Posicion.DEFENSA, LocalDate.of(2003, 2, 26), "Inglaterra"));
        chelsea.agregarJugador(new Jugador("Marc Cucurella", "CHE05", 3, Posicion.LATERAL, LocalDate.of(1998, 7, 22), "España"));
        chelsea.agregarJugador(new Jugador("Moisés Caicedo", "CHE06", 25, Posicion.VOLANTE, LocalDate.of(2001, 11, 2), "Ecuador"));
        chelsea.agregarJugador(new Jugador("Enzo Fernández", "CHE07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 1, 17), "Argentina"));
        chelsea.agregarJugador(new Jugador("Cole Palmer", "CHE08", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 5, 6), "Inglaterra"));
        chelsea.agregarJugador(new Jugador("Noni Madueke", "CHE09", 11, Posicion.EXTREMO, LocalDate.of(2002, 3, 10), "Inglaterra"));
        chelsea.agregarJugador(new Jugador("Jadon Sancho", "CHE10", 19, Posicion.EXTREMO, LocalDate.of(2000, 3, 25), "Inglaterra"));
        chelsea.agregarJugador(new Jugador("Nicolas Jackson", "CHE11", 15, Posicion.DELANTERO, LocalDate.of(2001, 6, 20), "Senegal"));
        equipos.add(chelsea);

        // 7. CRYSTAL PALACE
        Equipo palace = new Equipo("Crystal Palace");
        palace.setTecnicoEquipo(new Tecnico("Oliver Glasner", "PL_T07", "Crystal Palace", "Austria"));
        palace.agregarJugador(new Jugador("Dean Henderson", "CRY01", 1, Posicion.PORTERO, LocalDate.of(1997, 3, 12), "Inglaterra"));
        palace.agregarJugador(new Jugador("Daniel Muñoz", "CRY02", 12, Posicion.LATERAL, LocalDate.of(1996, 5, 26), "Colombia"));
        palace.agregarJugador(new Jugador("Maxence Lacroix", "CRY03", 5, Posicion.DEFENSA, LocalDate.of(2000, 4, 6), "Francia"));
        palace.agregarJugador(new Jugador("Marc Guéhi", "CRY04", 6, Posicion.DEFENSA, LocalDate.of(2000, 7, 13), "Inglaterra"));
        palace.agregarJugador(new Jugador("Tyrick Mitchell", "CRY05", 3, Posicion.LATERAL, LocalDate.of(1999, 9, 1), "Inglaterra"));
        palace.agregarJugador(new Jugador("Jefferson Lerma", "CRY06", 8, Posicion.VOLANTE, LocalDate.of(1994, 10, 25), "Colombia"));
        palace.agregarJugador(new Jugador("Will Hughes", "CRY07", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 4, 17), "Inglaterra"));
        palace.agregarJugador(new Jugador("Daichi Kamada", "CRY08", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 8, 5), "Japón"));
        palace.agregarJugador(new Jugador("Ismaïla Sarr", "CRY09", 7, Posicion.EXTREMO, LocalDate.of(1998, 2, 25), "Senegal"));
        palace.agregarJugador(new Jugador("Eberechi Eze", "CRY10", 10, Posicion.EXTREMO, LocalDate.of(1998, 6, 29), "Inglaterra"));
        palace.agregarJugador(new Jugador("Jean-Philippe Mateta", "CRY11", 14, Posicion.DELANTERO, LocalDate.of(1997, 6, 28), "Francia"));
        equipos.add(palace);

        // 8. EVERTON FC
        Equipo everton = new Equipo("Everton FC");
        everton.setTecnicoEquipo(new Tecnico("David Moyes", "PL_T08", "Everton FC", "Escocia"));
        everton.agregarJugador(new Jugador("Jordan Pickford", "EVE01", 1, Posicion.PORTERO, LocalDate.of(1994, 3, 7), "Inglaterra"));
        everton.agregarJugador(new Jugador("Ashley Young", "EVE02", 18, Posicion.LATERAL, LocalDate.of(1985, 7, 9), "Inglaterra"));
        everton.agregarJugador(new Jugador("James Tarkowski", "EVE03", 6, Posicion.DEFENSA, LocalDate.of(1992, 11, 19), "Inglaterra"));
        everton.agregarJugador(new Jugador("Jarrad Branthwaite", "EVE04", 32, Posicion.DEFENSA, LocalDate.of(2002, 6, 27), "Inglaterra"));
        everton.agregarJugador(new Jugador("Vitaliy Mykolenko", "EVE05", 19, Posicion.LATERAL, LocalDate.of(1999, 5, 29), "Ucrania"));
        everton.agregarJugador(new Jugador("Idrissa Gueye", "EVE06", 27, Posicion.VOLANTE, LocalDate.of(1989, 9, 26), "Senegal"));
        everton.agregarJugador(new Jugador("Orel Mangala", "EVE07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 3, 18), "Bélgica"));
        everton.agregarJugador(new Jugador("Abdoulaye Doucouré", "EVE08", 16, Posicion.MEDIOCAMPISTA, LocalDate.of(1993, 1, 1), "Malí"));
        everton.agregarJugador(new Jugador("Jack Harrison", "EVE09", 11, Posicion.EXTREMO, LocalDate.of(1996, 11, 20), "Inglaterra"));
        everton.agregarJugador(new Jugador("Iliman Ndiaye", "EVE10", 10, Posicion.EXTREMO, LocalDate.of(2000, 3, 6), "Senegal"));
        everton.agregarJugador(new Jugador("Dominic Calvert-Lewin", "EVE11", 9, Posicion.DELANTERO, LocalDate.of(1997, 3, 16), "Inglaterra"));
        equipos.add(everton);

        // 9. FULHAM FC
        Equipo fulham = new Equipo("Fulham FC");
        fulham.setTecnicoEquipo(new Tecnico("Marco Silva", "PL_T09", "Fulham FC", "Portugal"));
        fulham.agregarJugador(new Jugador("Bernd Leno", "FUL01", 1, Posicion.PORTERO, LocalDate.of(1992, 3, 4), "Alemania"));
        fulham.agregarJugador(new Jugador("Kenny Tete", "FUL02", 2, Posicion.LATERAL, LocalDate.of(1995, 10, 9), "Países Bajos"));
        fulham.agregarJugador(new Jugador("Joachim Andersen", "FUL03", 5, Posicion.DEFENSA, LocalDate.of(1996, 5, 31), "Dinamarca"));
        fulham.agregarJugador(new Jugador("Calvin Bassey", "FUL04", 3, Posicion.DEFENSA, LocalDate.of(1999, 12, 31), "Nigeria"));
        fulham.agregarJugador(new Jugador("Antonee Robinson", "FUL05", 33, Posicion.LATERAL, LocalDate.of(1997, 8, 8), "Estados Unidos"));
        fulham.agregarJugador(new Jugador("Sander Berge", "FUL06", 16, Posicion.VOLANTE, LocalDate.of(1998, 2, 14), "Noruega"));
        fulham.agregarJugador(new Jugador("Andreas Pereira", "FUL07", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 1, 1), "Brasil"));
        fulham.agregarJugador(new Jugador("Emile Smith Rowe", "FUL08", 32, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 7, 28), "Inglaterra"));
        fulham.agregarJugador(new Jugador("Adama Traoré", "FUL09", 11, Posicion.EXTREMO, LocalDate.of(1996, 1, 25), "España"));
        fulham.agregarJugador(new Jugador("Alex Iwobi", "FUL10", 17, Posicion.EXTREMO, LocalDate.of(1996, 5, 3), "Nigeria"));
        fulham.agregarJugador(new Jugador("Raúl Jiménez", "FUL11", 7, Posicion.DELANTERO, LocalDate.of(1991, 5, 5), "México"));
        equipos.add(fulham);

        // 10. IPSWICH TOWN
        Equipo ipswich = new Equipo("Ipswich Town");
        ipswich.setTecnicoEquipo(new Tecnico("Kieran McKenna", "PL_T10", "Ipswich Town", "Irlanda del Norte"));
        ipswich.agregarJugador(new Jugador("Arijanet Muric", "IPS01", 1, Posicion.PORTERO, LocalDate.of(1998, 11, 7), "Kosovo"));
        ipswich.agregarJugador(new Jugador("Axel Tuanzebe", "IPS02", 40, Posicion.LATERAL, LocalDate.of(1997, 11, 14), "RD del Congo"));
        ipswich.agregarJugador(new Jugador("Dara O'Shea", "IPS03", 26, Posicion.DEFENSA, LocalDate.of(1999, 3, 4), "Irlanda"));
        ipswich.agregarJugador(new Jugador("Jacob Greaves", "IPS04", 24, Posicion.DEFENSA, LocalDate.of(2000, 9, 12), "Inglaterra"));
        ipswich.agregarJugador(new Jugador("Leif Davis", "IPS05", 3, Posicion.LATERAL, LocalDate.of(1999, 12, 31), "Inglaterra"));
        ipswich.agregarJugador(new Jugador("Sam Morsy", "IPS06", 5, Posicion.VOLANTE, LocalDate.of(1991, 9, 10), "Egipto"));
        ipswich.agregarJugador(new Jugador("Jens Cajuste", "IPS07", 12, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 8, 10), "Suecia"));
        ipswich.agregarJugador(new Jugador("Omari Hutchinson", "IPS08", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(2003, 10, 29), "Inglaterra"));
        ipswich.agregarJugador(new Jugador("Wes Burns", "IPS09", 7, Posicion.EXTREMO, LocalDate.of(1994, 11, 23), "Gales"));
        ipswich.agregarJugador(new Jugador("Sammie Szmodics", "IPS10", 23, Posicion.EXTREMO, LocalDate.of(1995, 9, 24), "Irlanda"));
        ipswich.agregarJugador(new Jugador("Liam Delap", "IPS11", 19, Posicion.DELANTERO, LocalDate.of(2003, 2, 8), "Inglaterra"));
        equipos.add(ipswich);

        // 11. LEICESTER CITY
        Equipo leicester = new Equipo("Leicester City");
        leicester.setTecnicoEquipo(new Tecnico("Ruud van Nistelrooy", "PL_T11", "Leicester City", "Países Bajos"));
        leicester.agregarJugador(new Jugador("Mads Hermansen", "LEI01", 30, Posicion.PORTERO, LocalDate.of(2000, 7, 11), "Dinamarca"));
        leicester.agregarJugador(new Jugador("James Justin", "LEI02", 2, Posicion.LATERAL, LocalDate.of(1998, 2, 23), "Inglaterra"));
        leicester.agregarJugador(new Jugador("Wout Faes", "LEI03", 3, Posicion.DEFENSA, LocalDate.of(1998, 4, 3), "Bélgica"));
        leicester.agregarJugador(new Jugador("Jannik Vestergaard", "LEI04", 23, Posicion.DEFENSA, LocalDate.of(1992, 8, 3), "Dinamarca"));
        leicester.agregarJugador(new Jugador("Victor Kristiansen", "LEI05", 16, Posicion.LATERAL, LocalDate.of(2002, 12, 16), "Dinamarca"));
        leicester.agregarJugador(new Jugador("Wilfred Ndidi", "LEI06", 6, Posicion.VOLANTE, LocalDate.of(1996, 12, 16), "Nigeria"));
        leicester.agregarJugador(new Jugador("Harry Winks", "LEI07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 2, 2), "Inglaterra"));
        leicester.agregarJugador(new Jugador("Facundo Buonanotte", "LEI08", 40, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 12, 23), "Argentina"));
        leicester.agregarJugador(new Jugador("Abdul Fatawu", "LEI09", 7, Posicion.EXTREMO, LocalDate.of(2004, 3, 8), "Ghana"));
        leicester.agregarJugador(new Jugador("Stephy Mavididi", "LEI10", 10, Posicion.EXTREMO, LocalDate.of(1998, 5, 31), "Inglaterra"));
        leicester.agregarJugador(new Jugador("Jamie Vardy", "LEI11", 9, Posicion.DELANTERO, LocalDate.of(1987, 1, 11), "Inglaterra"));
        equipos.add(leicester);

        // 12. LIVERPOOL FC
        Equipo liverpool = new Equipo("Liverpool FC");
        liverpool.setTecnicoEquipo(new Tecnico("Arne Slot", "PL_T12", "Liverpool FC", "Países Bajos"));
        liverpool.agregarJugador(new Jugador("Alisson Becker", "LIV01", 1, Posicion.PORTERO, LocalDate.of(1992, 10, 2), "Brasil"));
        liverpool.agregarJugador(new Jugador("Trent Alexander-Arnold", "LIV02", 66, Posicion.LATERAL, LocalDate.of(1998, 10, 7), "Inglaterra"));
        liverpool.agregarJugador(new Jugador("Ibrahima Konaté", "LIV03", 5, Posicion.DEFENSA, LocalDate.of(1999, 5, 25), "Francia"));
        liverpool.agregarJugador(new Jugador("Virgil van Dijk", "LIV04", 4, Posicion.DEFENSA, LocalDate.of(1991, 7, 8), "Países Bajos"));
        liverpool.agregarJugador(new Jugador("Andrew Robertson", "LIV05", 26, Posicion.LATERAL, LocalDate.of(1994, 3, 11), "Escocia"));
        liverpool.agregarJugador(new Jugador("Ryan Gravenberch", "LIV06", 38, Posicion.VOLANTE, LocalDate.of(2002, 5, 16), "Países Bajos"));
        liverpool.agregarJugador(new Jugador("Alexis Mac Allister", "LIV07", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 12, 24), "Argentina"));
        liverpool.agregarJugador(new Jugador("Dominik Szoboszlai", "LIV08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 10, 25), "Hungría"));
        liverpool.agregarJugador(new Jugador("Mohamed Salah", "LIV09", 11, Posicion.EXTREMO, LocalDate.of(1992, 6, 15), "Egipto"));
        liverpool.agregarJugador(new Jugador("Luis Díaz", "LIV10", 7, Posicion.EXTREMO, LocalDate.of(1997, 1, 13), "Colombia"));
        liverpool.agregarJugador(new Jugador("Cody Gakpo", "LIV11", 18, Posicion.DELANTERO, LocalDate.of(1999, 5, 7), "Países Bajos"));
        equipos.add(liverpool);

        // 13. MANCHESTER CITY
        Equipo manCity = new Equipo("Manchester City");
        manCity.setTecnicoEquipo(new Tecnico("Pep Guardiola", "PL_T13", "Manchester City", "España"));
        manCity.agregarJugador(new Jugador("Ederson Moraes", "MCI01", 31, Posicion.PORTERO, LocalDate.of(1993, 8, 17), "Brasil"));
        manCity.agregarJugador(new Jugador("Kyle Walker", "MCI02", 2, Posicion.LATERAL, LocalDate.of(1990, 5, 28), "Inglaterra"));
        manCity.agregarJugador(new Jugador("Rúben Dias", "MCI03", 3, Posicion.DEFENSA, LocalDate.of(1997, 5, 14), "Portugal"));
        manCity.agregarJugador(new Jugador("Manuel Akanji", "MCI04", 25, Posicion.DEFENSA, LocalDate.of(1995, 7, 19), "Suiza"));
        manCity.agregarJugador(new Jugador("Joško Gvardiol", "MCI05", 24, Posicion.LATERAL, LocalDate.of(2002, 1, 23), "Croacia"));
        manCity.agregarJugador(new Jugador("Mateo Kovačić", "MCI06", 8, Posicion.VOLANTE, LocalDate.of(1994, 5, 6), "Croacia"));
        manCity.agregarJugador(new Jugador("İlkay Gündoğan", "MCI07", 19, Posicion.MEDIOCAMPISTA, LocalDate.of(1990, 10, 24), "Alemania"));
        manCity.agregarJugador(new Jugador("Bernardo Silva", "MCI08", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 8, 10), "Portugal"));
        manCity.agregarJugador(new Jugador("Savinho", "MCI09", 26, Posicion.EXTREMO, LocalDate.of(2004, 4, 10), "Brasil"));
        manCity.agregarJugador(new Jugador("Phil Foden", "MCI10", 47, Posicion.EXTREMO, LocalDate.of(2000, 5, 28), "Inglaterra"));
        manCity.agregarJugador(new Jugador("Erling Haaland", "MCI11", 9, Posicion.DELANTERO, LocalDate.of(2000, 7, 21), "Noruega"));
        equipos.add(manCity);

        // 14. MANCHESTER UNITED
        Equipo manUnited = new Equipo("Manchester United");
        manUnited.setTecnicoEquipo(new Tecnico("Ruben Amorim", "PL_T14", "Manchester United", "Portugal"));
        manUnited.agregarJugador(new Jugador("André Onana", "MUN01", 24, Posicion.PORTERO, LocalDate.of(1996, 4, 2), "Camerún"));
        manUnited.agregarJugador(new Jugador("Noussair Mazraoui", "MUN02", 3, Posicion.LATERAL, LocalDate.of(1997, 11, 14), "Marruecos"));
        manUnited.agregarJugador(new Jugador("Matthijs de Ligt", "MUN03", 4, Posicion.DEFENSA, LocalDate.of(1999, 8, 12), "Países Bajos"));
        manUnited.agregarJugador(new Jugador("Lisandro Martínez", "MUN04", 6, Posicion.DEFENSA, LocalDate.of(1998, 1, 18), "Argentina"));
        manUnited.agregarJugador(new Jugador("Diogo Dalot", "MUN05", 20, Posicion.LATERAL, LocalDate.of(1999, 3, 18), "Portugal"));
        manUnited.agregarJugador(new Jugador("Manuel Ugarte", "MUN06", 25, Posicion.VOLANTE, LocalDate.of(2001, 4, 11), "Uruguay"));
        manUnited.agregarJugador(new Jugador("Kobbie Mainoo", "MUN07", 37, Posicion.MEDIOCAMPISTA, LocalDate.of(2005, 4, 19), "Inglaterra"));
        manUnited.agregarJugador(new Jugador("Bruno Fernandes", "MUN08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 9, 8), "Portugal"));
        manUnited.agregarJugador(new Jugador("Amad Diallo", "MUN09", 16, Posicion.EXTREMO, LocalDate.of(2002, 7, 11), "Costa de Marfil"));
        manUnited.agregarJugador(new Jugador("Alejandro Garnacho", "MUN10", 17, Posicion.EXTREMO, LocalDate.of(2004, 7, 1), "Argentina"));
        manUnited.agregarJugador(new Jugador("Rasmus Højlund", "MUN11", 9, Posicion.DELANTERO, LocalDate.of(2003, 2, 4), "Dinamarca"));
        equipos.add(manUnited);

        // 15. NEWCASTLE UNITED
        Equipo newcastle = new Equipo("Newcastle United");
        newcastle.setTecnicoEquipo(new Tecnico("Eddie Howe", "PL_T15", "Newcastle United", "Inglaterra"));
        newcastle.agregarJugador(new Jugador("Nick Pope", "NEW01", 22, Posicion.PORTERO, LocalDate.of(1992, 4, 19), "Inglaterra"));
        newcastle.agregarJugador(new Jugador("Tino Livramento", "NEW02", 21, Posicion.LATERAL, LocalDate.of(2002, 11, 12), "Inglaterra"));
        newcastle.agregarJugador(new Jugador("Fabian Schär", "NEW03", 5, Posicion.DEFENSA, LocalDate.of(1991, 12, 20), "Suiza"));
        newcastle.agregarJugador(new Jugador("Dan Burn", "NEW04", 33, Posicion.DEFENSA, LocalDate.of(1992, 5, 9), "Inglaterra"));
        newcastle.agregarJugador(new Jugador("Lewis Hall", "NEW05", 20, Posicion.LATERAL, LocalDate.of(2004, 9, 8), "Inglaterra"));
        newcastle.agregarJugador(new Jugador("Bruno Guimarães", "NEW06", 39, Posicion.VOLANTE, LocalDate.of(1997, 11, 16), "Brasil"));
        newcastle.agregarJugador(new Jugador("Sandro Tonali", "NEW07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 5, 8), "Italia"));
        newcastle.agregarJugador(new Jugador("Joelinton", "NEW08", 7, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 8, 14), "Brasil"));
        newcastle.agregarJugador(new Jugador("Jacob Murphy", "NEW09", 23, Posicion.EXTREMO, LocalDate.of(1995, 2, 24), "Inglaterra"));
        newcastle.agregarJugador(new Jugador("Anthony Gordon", "NEW10", 10, Posicion.EXTREMO, LocalDate.of(2001, 2, 24), "Inglaterra"));
        newcastle.agregarJugador(new Jugador("Alexander Isak", "NEW11", 14, Posicion.DELANTERO, LocalDate.of(1999, 9, 21), "Suecia"));
        equipos.add(newcastle);

        // 16. NOTTINGHAM FOREST
        Equipo forest = new Equipo("Nottingham Forest");
        forest.setTecnicoEquipo(new Tecnico("Nuno Espírito Santo", "PL_T16", "Nottingham Forest", "Portugal"));
        forest.agregarJugador(new Jugador("Matz Sels", "NFO01", 26, Posicion.PORTERO, LocalDate.of(1992, 2, 26), "Bélgica"));
        forest.agregarJugador(new Jugador("Ola Aina", "NFO02", 34, Posicion.LATERAL, LocalDate.of(1996, 10, 8), "Nigeria"));
        forest.agregarJugador(new Jugador("Nikola Milenković", "NFO03", 31, Posicion.DEFENSA, LocalDate.of(1997, 10, 12), "Serbia"));
        forest.agregarJugador(new Jugador("Murillo", "NFO04", 5, Posicion.DEFENSA, LocalDate.of(2002, 7, 4), "Brasil"));
        forest.agregarJugador(new Jugador("Álex Moreno", "NFO05", 19, Posicion.LATERAL, LocalDate.of(1993, 6, 8), "España"));
        forest.agregarJugador(new Jugador("Ryan Yates", "NFO06", 22, Posicion.VOLANTE, LocalDate.of(1997, 11, 21), "Inglaterra"));
        forest.agregarJugador(new Jugador("Elliot Anderson", "NFO07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 11, 6), "Inglaterra"));
        forest.agregarJugador(new Jugador("Morgan Gibbs-White", "NFO08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 1, 27), "Inglaterra"));
        forest.agregarJugador(new Jugador("Anthony Elanga", "NFO09", 21, Posicion.EXTREMO, LocalDate.of(2002, 4, 27), "Suecia"));
        forest.agregarJugador(new Jugador("Callum Hudson-Odoi", "NFO10", 14, Posicion.EXTREMO, LocalDate.of(2000, 11, 7), "Inglaterra"));
        forest.agregarJugador(new Jugador("Chris Wood", "NFO11", 11, Posicion.DELANTERO, LocalDate.of(1991, 12, 7), "Nueva Zelanda"));
        equipos.add(forest);

        // 17. SOUTHAMPTON FC
        Equipo southampton = new Equipo("Southampton FC");
        southampton.setTecnicoEquipo(new Tecnico("Ivan Jurić", "PL_T17", "Southampton FC", "Croacia"));
        southampton.agregarJugador(new Jugador("Aaron Ramsdale", "SOU01", 30, Posicion.PORTERO, LocalDate.of(1998, 5, 14), "Inglaterra"));
        southampton.agregarJugador(new Jugador("Yukinari Sugawara", "SOU02", 16, Posicion.LATERAL, LocalDate.of(2000, 6, 28), "Japón"));
        southampton.agregarJugador(new Jugador("Taylor Harwood-Bellis", "SOU03", 6, Posicion.DEFENSA, LocalDate.of(2002, 1, 30), "Inglaterra"));
        southampton.agregarJugador(new Jugador("Jan Bednarek", "SOU04", 35, Posicion.DEFENSA, LocalDate.of(1996, 4, 12), "Polonia"));
        southampton.agregarJugador(new Jugador("Kyle Walker-Peters", "SOU05", 2, Posicion.LATERAL, LocalDate.of(1997, 4, 13), "Inglaterra"));
        southampton.agregarJugador(new Jugador("Flynn Downes", "SOU06", 4, Posicion.VOLANTE, LocalDate.of(1999, 1, 20), "Inglaterra"));
        southampton.agregarJugador(new Jugador("Mateus Fernandes", "SOU07", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 7, 10), "Portugal"));
        southampton.agregarJugador(new Jugador("Joe Aribo", "SOU08", 7, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 7, 21), "Nigeria"));
        southampton.agregarJugador(new Jugador("Tyler Dibling", "SOU09", 33, Posicion.EXTREMO, LocalDate.of(2006, 2, 17), "Inglaterra"));
        southampton.agregarJugador(new Jugador("Adam Armstrong", "SOU10", 9, Posicion.EXTREMO, LocalDate.of(1997, 2, 10), "Inglaterra"));
        southampton.agregarJugador(new Jugador("Cameron Archer", "SOU11", 19, Posicion.DELANTERO, LocalDate.of(2001, 7, 21), "Inglaterra"));
        equipos.add(southampton);

        // 18. TOTTENHAM HOTSPUR
        Equipo tottenham = new Equipo("Tottenham Hotspur");
        tottenham.setTecnicoEquipo(new Tecnico("Ange Postecoglou", "PL_T18", "Tottenham Hotspur", "Australia"));
        tottenham.agregarJugador(new Jugador("Guglielmo Vicario", "TOT01", 1, Posicion.PORTERO, LocalDate.of(1996, 10, 7), "Italia"));
        tottenham.agregarJugador(new Jugador("Pedro Porro", "TOT02", 23, Posicion.LATERAL, LocalDate.of(1999, 9, 13), "España"));
        tottenham.agregarJugador(new Jugador("Cristian Romero", "TOT03", 17, Posicion.DEFENSA, LocalDate.of(1998, 4, 27), "Argentina"));
        tottenham.agregarJugador(new Jugador("Micky van de Ven", "TOT04", 37, Posicion.DEFENSA, LocalDate.of(2001, 4, 19), "Países Bajos"));
        tottenham.agregarJugador(new Jugador("Destiny Udogie", "TOT05", 13, Posicion.LATERAL, LocalDate.of(2002, 11, 28), "Italia"));
        tottenham.agregarJugador(new Jugador("Yves Bissouma", "TOT06", 8, Posicion.VOLANTE, LocalDate.of(1996, 8, 30), "Malí"));
        tottenham.agregarJugador(new Jugador("Dejan Kulusevski", "TOT07", 21, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 4, 25), "Suecia"));
        tottenham.agregarJugador(new Jugador("James Maddison", "TOT08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 11, 23), "Inglaterra"));
        tottenham.agregarJugador(new Jugador("Brennan Johnson", "TOT09", 22, Posicion.EXTREMO, LocalDate.of(2001, 5, 23), "Gales"));
        tottenham.agregarJugador(new Jugador("Heung-min Son", "TOT10", 7, Posicion.EXTREMO, LocalDate.of(1992, 7, 8), "Corea del Sur"));
        tottenham.agregarJugador(new Jugador("Dominic Solanke", "TOT11", 19, Posicion.DELANTERO, LocalDate.of(1997, 9, 14), "Inglaterra"));
        equipos.add(tottenham);

        // 19. WEST HAM UNITED
        Equipo westHam = new Equipo("West Ham United");
        westHam.setTecnicoEquipo(new Tecnico("Graham Potter", "PL_T19", "West Ham United", "Inglaterra"));
        westHam.agregarJugador(new Jugador("Łukasz Fabiański", "WHU01", 1, Posicion.PORTERO, LocalDate.of(1985, 4, 18), "Polonia"));
        westHam.agregarJugador(new Jugador("Aaron Wan-Bissaka", "WHU02", 29, Posicion.LATERAL, LocalDate.of(1997, 11, 26), "Inglaterra"));
        westHam.agregarJugador(new Jugador("Jean-Clair Todibo", "WHU03", 25, Posicion.DEFENSA, LocalDate.of(1999, 12, 30), "Francia"));
        westHam.agregarJugador(new Jugador("Max Kilman", "WHU04", 26, Posicion.DEFENSA, LocalDate.of(1997, 5, 23), "Inglaterra"));
        westHam.agregarJugador(new Jugador("Emerson Palmieri", "WHU05", 33, Posicion.LATERAL, LocalDate.of(1994, 8, 3), "Italia"));
        westHam.agregarJugador(new Jugador("Edson Álvarez", "WHU06", 19, Posicion.VOLANTE, LocalDate.of(1997, 10, 24), "México"));
        westHam.agregarJugador(new Jugador("Tomáš Souček", "WHU07", 28, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 2, 27), "República Checa"));
        westHam.agregarJugador(new Jugador("Lucas Paquetá", "WHU08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 8, 27), "Brasil"));
        westHam.agregarJugador(new Jugador("Jarrod Bowen", "WHU09", 20, Posicion.EXTREMO, LocalDate.of(1996, 12, 20), "Inglaterra"));
        westHam.agregarJugador(new Jugador("Mohammed Kudus", "WHU10", 14, Posicion.EXTREMO, LocalDate.of(2000, 8, 2), "Ghana"));
        westHam.agregarJugador(new Jugador("Michail Antonio", "WHU11", 9, Posicion.DELANTERO, LocalDate.of(1990, 3, 28), "Jamaica"));
        equipos.add(westHam);

        // 20. WOLVERHAMPTON WANDERERS
        Equipo wolves = new Equipo("Wolverhampton Wanderers");
        wolves.setTecnicoEquipo(new Tecnico("Vítor Pereira", "PL_T20", "Wolverhampton Wanderers", "Portugal"));
        wolves.agregarJugador(new Jugador("José Sá", "WOL01", 1, Posicion.PORTERO, LocalDate.of(1993, 1, 17), "Portugal"));
        wolves.agregarJugador(new Jugador("Nélson Semedo", "WOL02", 22, Posicion.LATERAL, LocalDate.of(1993, 11, 16), "Portugal"));
        wolves.agregarJugador(new Jugador("Santiago Bueno", "WOL03", 4, Posicion.DEFENSA, LocalDate.of(1998, 11, 9), "Uruguay"));
        wolves.agregarJugador(new Jugador("Toti Gomes", "WOL04", 24, Posicion.DEFENSA, LocalDate.of(1999, 1, 16), "Portugal"));
        wolves.agregarJugador(new Jugador("Rayan Aït-Nouri", "WOL05", 3, Posicion.LATERAL, LocalDate.of(2001, 6, 6), "Argelia"));
        wolves.agregarJugador(new Jugador("André", "WOL06", 7, Posicion.VOLANTE, LocalDate.of(2001, 7, 16), "Brasil"));
        wolves.agregarJugador(new Jugador("João Gomes", "WOL07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 2, 12), "Brasil"));
        wolves.agregarJugador(new Jugador("Mario Lemina", "WOL08", 5, Posicion.MEDIOCAMPISTA, LocalDate.of(1993, 9, 1), "Gabón"));
        wolves.agregarJugador(new Jugador("Matheus Cunha", "WOL09", 10, Posicion.EXTREMO, LocalDate.of(1999, 5, 27), "Brasil"));
        wolves.agregarJugador(new Jugador("Gonçalo Guedes", "WOL10", 29, Posicion.EXTREMO, LocalDate.of(1996, 11, 29), "Portugal"));
        wolves.agregarJugador(new Jugador("Jørgen Strand Larsen", "WOL11", 9, Posicion.DELANTERO, LocalDate.of(2000, 2, 6), "Noruega"));
        equipos.add(wolves);

        return equipos;
    }
}
