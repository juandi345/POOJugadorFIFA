import java.time.LocalDate;
import java.util.ArrayList;

public class DatosLigaColombia {

    public static ArrayList<Equipo> cargarEquiposColombia() {
        ArrayList<Equipo> equipos = new ArrayList<>();

        // 1. ATLÉTICO NACIONAL
        Equipo nacional = new Equipo("Atlético Nacional");
        nacional.setTecnicoEquipo(new Tecnico("Efraín Juárez", "CO_T01", "Atlético Nacional", "México"));
        nacional.agregarJugador(new Jugador("David Ospina", "NAC01", 1, Posicion.PORTERO, LocalDate.of(1988, 8, 31), "Colombia"));
        nacional.agregarJugador(new Jugador("Andrés Román", "NAC02", 6, Posicion.LATERAL, LocalDate.of(1995, 10, 5), "Colombia"));
        nacional.agregarJugador(new Jugador("Felipe Aguirre", "NAC03", 3, Posicion.DEFENSA, LocalDate.of(1996, 2, 18), "Colombia"));
        nacional.agregarJugador(new Jugador("William Tesillo", "NAC04", 16, Posicion.DEFENSA, LocalDate.of(1990, 2, 2), "Colombia"));
        nacional.agregarJugador(new Jugador("Álvaro Angulo", "NAC05", 77, Posicion.LATERAL, LocalDate.of(1997, 3, 6), "Colombia"));
        nacional.agregarJugador(new Jugador("Jorman Campuzano", "NAC06", 21, Posicion.VOLANTE, LocalDate.of(1996, 4, 30), "Colombia"));
        nacional.agregarJugador(new Jugador("Sebastián Guzmán", "NAC07", 32, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 5, 26), "Colombia"));
        nacional.agregarJugador(new Jugador("Edwin Cardona", "NAC08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1992, 12, 8), "Colombia"));
        nacional.agregarJugador(new Jugador("Marino Hinestroza", "NAC09", 18, Posicion.EXTREMO, LocalDate.of(2002, 7, 8), "Colombia"));
        nacional.agregarJugador(new Jugador("Andrés Sarmiento", "NAC10", 29, Posicion.EXTREMO, LocalDate.of(1998, 1, 15), "Colombia"));
        nacional.agregarJugador(new Jugador("Alfredo Morelos", "NAC11", 9, Posicion.DELANTERO, LocalDate.of(1996, 6, 21), "Colombia"));
        equipos.add(nacional);

        // 2. MILLONARIOS FC
        Equipo millonarios = new Equipo("Millonarios FC");
        millonarios.setTecnicoEquipo(new Tecnico("David González", "CO_T02", "Millonarios FC", "Colombia"));
        millonarios.agregarJugador(new Jugador("Álvaro Montero", "MIL01", 31, Posicion.PORTERO, LocalDate.of(1995, 3, 29), "Colombia"));
        millonarios.agregarJugador(new Jugador("Delvin Alfonzo", "MIL02", 22, Posicion.LATERAL, LocalDate.of(2000, 9, 4), "Venezuela"));
        millonarios.agregarJugador(new Jugador("Andrés Llinás", "MIL03", 26, Posicion.DEFENSA, LocalDate.of(1997, 7, 23), "Colombia"));
        millonarios.agregarJugador(new Jugador("Juan Pablo Vargas", "MIL04", 4, Posicion.DEFENSA, LocalDate.of(1995, 6, 6), "Costa Rica"));
        millonarios.agregarJugador(new Jugador("Danovis Banguero", "MIL05", 20, Posicion.LATERAL, LocalDate.of(1989, 10, 27), "Colombia"));
        millonarios.agregarJugador(new Jugador("Stiven Vega", "MIL06", 28, Posicion.VOLANTE, LocalDate.of(1998, 5, 22), "Colombia"));
        millonarios.agregarJugador(new Jugador("Daniel Giraldo", "MIL07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1992, 7, 1), "Colombia"));
        millonarios.agregarJugador(new Jugador("David Mackalister Silva", "MIL08", 14, Posicion.MEDIOCAMPISTA, LocalDate.of(1986, 12, 13), "Colombia"));
        millonarios.agregarJugador(new Jugador("Jhon Córdoba", "MIL09", 15, Posicion.EXTREMO, LocalDate.of(2000, 7, 15), "Colombia"));
        millonarios.agregarJugador(new Jugador("Daniel Mantilla", "MIL10", 11, Posicion.EXTREMO, LocalDate.of(1996, 12, 25), "Colombia"));
        millonarios.agregarJugador(new Jugador("Leonardo Castro", "MIL11", 23, Posicion.DELANTERO, LocalDate.of(1992, 6, 14), "Colombia"));
        equipos.add(millonarios);

        // 3. AMÉRICA DE CALI
        Equipo america = new Equipo("América de Cali");
        america.setTecnicoEquipo(new Tecnico("Jorge Da Silva", "CO_T03", "América de Cali", "Uruguay"));
        america.agregarJugador(new Jugador("Jorge Soto", "AME01", 12, Posicion.PORTERO, LocalDate.of(1993, 8, 2), "Colombia"));
        america.agregarJugador(new Jugador("Yerson Candelo", "AME02", 92, Posicion.LATERAL, LocalDate.of(1992, 2, 24), "Colombia"));
        america.agregarJugador(new Jugador("Daniel Bocanegra", "AME03", 2, Posicion.DEFENSA, LocalDate.of(1987, 4, 23), "Colombia"));
        america.agregarJugador(new Jugador("Andrés Mosquera Guardia", "AME04", 24, Posicion.DEFENSA, LocalDate.of(1990, 2, 20), "Colombia"));
        america.agregarJugador(new Jugador("Marcos Mina", "AME05", 30, Posicion.LATERAL, LocalDate.of(1999, 4, 12), "Colombia"));
        america.agregarJugador(new Jugador("Éder Álvarez Balanta", "AME06", 3, Posicion.VOLANTE, LocalDate.of(1993, 2, 28), "Colombia"));
        america.agregarJugador(new Jugador("Harold Rivera", "AME07", 17, Posicion.MEDIOCAMPISTA, LocalDate.of(1993, 3, 19), "Colombia"));
        america.agregarJugador(new Jugador("Alexis Zapata", "AME08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 5, 10), "Colombia"));
        america.agregarJugador(new Jugador("Cristian Barrios", "AME09", 7, Posicion.EXTREMO, LocalDate.of(1998, 5, 19), "Colombia"));
        america.agregarJugador(new Jugador("Duván Vergara", "AME10", 11, Posicion.EXTREMO, LocalDate.of(1996, 9, 9), "Colombia"));
        america.agregarJugador(new Jugador("Rodrigo Holgado", "AME11", 22, Posicion.DELANTERO, LocalDate.of(1995, 6, 28), "Argentina"));
        equipos.add(america);

        // 4. INDEPENDIENTE SANTA FE
        Equipo santaFe = new Equipo("Independiente Santa Fe");
        santaFe.setTecnicoEquipo(new Tecnico("Pablo Peirano", "CO_T04", "Independiente Santa Fe", "Uruguay"));
        santaFe.agregarJugador(new Jugador("Andrés Mosquera Marmolejo", "SFE01", 1, Posicion.PORTERO, LocalDate.of(1991, 9, 10), "Colombia"));
        santaFe.agregarJugador(new Jugador("Elvis Perlaza", "SFE02", 22, Posicion.LATERAL, LocalDate.of(1989, 3, 7), "Colombia"));
        santaFe.agregarJugador(new Jugador("Iván Scarpeta", "SFE03", 15, Posicion.DEFENSA, LocalDate.of(1996, 6, 5), "Colombia"));
        santaFe.agregarJugador(new Jugador("Julián Millán", "SFE04", 29, Posicion.DEFENSA, LocalDate.of(1998, 3, 27), "Colombia"));
        santaFe.agregarJugador(new Jugador("Dairon Mosquera", "SFE05", 32, Posicion.LATERAL, LocalDate.of(1992, 6, 23), "Colombia"));
        santaFe.agregarJugador(new Jugador("Daniel Torres", "SFE06", 16, Posicion.VOLANTE, LocalDate.of(1989, 11, 15), "Colombia"));
        santaFe.agregarJugador(new Jugador("Yilmar Velásquez", "SFE07", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 8, 21), "Colombia"));
        santaFe.agregarJugador(new Jugador("Juan Pablo Zuluaga", "SFE08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1993, 6, 15), "Colombia"));
        santaFe.agregarJugador(new Jugador("Ómar Albornoz", "SFE09", 7, Posicion.EXTREMO, LocalDate.of(1995, 9, 28), "Colombia"));
        santaFe.agregarJugador(new Jugador("Harold Santiago Mosquera", "SFE10", 23, Posicion.EXTREMO, LocalDate.of(1995, 2, 7), "Colombia"));
        santaFe.agregarJugador(new Jugador("Hugo Rodallega", "SFE11", 11, Posicion.DELANTERO, LocalDate.of(1985, 7, 25), "Colombia"));
        equipos.add(santaFe);

        // 5. JUNIOR FC
        Equipo junior = new Equipo("Junior FC");
        junior.setTecnicoEquipo(new Tecnico("César Farías", "CO_T05", "Junior FC", "Venezuela"));
        junior.agregarJugador(new Jugador("Santiago Mele", "JUN01", 77, Posicion.PORTERO, LocalDate.of(1997, 9, 6), "Uruguay"));
        junior.agregarJugador(new Jugador("Edwin Herrera", "JUN02", 3, Posicion.LATERAL, LocalDate.of(1998, 9, 2), "Colombia"));
        junior.agregarJugador(new Jugador("Emanuel Olivera", "JUN03", 18, Posicion.DEFENSA, LocalDate.of(1990, 4, 2), "Argentina"));
        junior.agregarJugador(new Jugador("Howell Mena", "JUN04", 2, Posicion.DEFENSA, LocalDate.of(2001, 5, 3), "Colombia"));
        junior.agregarJugador(new Jugador("Gabriel Fuentes", "JUN05", 12, Posicion.LATERAL, LocalDate.of(1997, 2, 9), "Colombia"));
        junior.agregarJugador(new Jugador("Didier Moreno", "JUN06", 6, Posicion.VOLANTE, LocalDate.of(1991, 9, 15), "Colombia"));
        junior.agregarJugador(new Jugador("Víctor Cantillo", "JUN07", 24, Posicion.MEDIOCAMPISTA, LocalDate.of(1993, 10, 15), "Colombia"));
        junior.agregarJugador(new Jugador("Yimmi Chará", "JUN08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1991, 4, 2), "Colombia"));
        junior.agregarJugador(new Jugador("José Enamorado", "JUN09", 99, Posicion.EXTREMO, LocalDate.of(1999, 1, 13), "Colombia"));
        junior.agregarJugador(new Jugador("Bryan Castrillón", "JUN10", 88, Posicion.EXTREMO, LocalDate.of(1999, 3, 30), "Colombia"));
        junior.agregarJugador(new Jugador("Carlos Bacca", "JUN11", 70, Posicion.DELANTERO, LocalDate.of(1986, 9, 8), "Colombia"));
        equipos.add(junior);

        // 6. DEPORTES TOLIMA
        Equipo tolima = new Equipo("Deportes Tolima");
        tolima.setTecnicoEquipo(new Tecnico("Ismael Rescalvo", "CO_T06", "Deportes Tolima", "España"));
        tolima.agregarJugador(new Jugador("William Cuesta", "TOL01", 1, Posicion.PORTERO, LocalDate.of(1993, 2, 19), "Colombia"));
        tolima.agregarJugador(new Jugador("Yhorman Hurtado", "TOL02", 26, Posicion.LATERAL, LocalDate.of(1996, 12, 14), "Colombia"));
        tolima.agregarJugador(new Jugador("Julián Quiñones", "TOL03", 2, Posicion.DEFENSA, LocalDate.of(1989, 11, 5), "Colombia"));
        tolima.agregarJugador(new Jugador("Anderson Angulo", "TOL04", 3, Posicion.DEFENSA, LocalDate.of(1996, 11, 28), "Colombia"));
        tolima.agregarJugador(new Jugador("Junior Hernández", "TOL05", 20, Posicion.LATERAL, LocalDate.of(1999, 4, 16), "Colombia"));
        tolima.agregarJugador(new Jugador("Juan Pablo Nieto", "TOL06", 15, Posicion.VOLANTE, LocalDate.of(1993, 2, 25), "Colombia"));
        tolima.agregarJugador(new Jugador("Brayan Rovira", "TOL07", 80, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 12, 2), "Colombia"));
        tolima.agregarJugador(new Jugador("Yeison Guzmán", "TOL08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 3, 22), "Colombia"));
        tolima.agregarJugador(new Jugador("Alex Castro", "TOL09", 23, Posicion.EXTREMO, LocalDate.of(1994, 3, 8), "Colombia"));
        tolima.agregarJugador(new Jugador("Jeison Lucumí", "TOL10", 33, Posicion.EXTREMO, LocalDate.of(1995, 4, 8), "Colombia"));
        tolima.agregarJugador(new Jugador("Brayan Gil", "TOL11", 30, Posicion.DELANTERO, LocalDate.of(2001, 6, 28), "El Salvador"));
        equipos.add(tolima);

        // 7. INDEPENDIENTE MEDELLÍN
        Equipo medellin = new Equipo("Independiente Medellín");
        medellin.setTecnicoEquipo(new Tecnico("Alejandro Restrepo", "CO_T07", "Independiente Medellín", "Colombia"));
        medellin.agregarJugador(new Jugador("Éder Chaux", "DIM01", 12, Posicion.PORTERO, LocalDate.of(1991, 12, 20), "Colombia"));
        medellin.agregarJugador(new Jugador("Leyser Chaverra", "DIM02", 2, Posicion.LATERAL, LocalDate.of(1997, 4, 1), "Colombia"));
        medellin.agregarJugador(new Jugador("Fainer Torijano", "DIM03", 5, Posicion.DEFENSA, LocalDate.of(1988, 8, 31), "Colombia"));
        medellin.agregarJugador(new Jugador("José Ortiz", "DIM04", 29, Posicion.DEFENSA, LocalDate.of(1998, 11, 16), "Colombia"));
        medellin.agregarJugador(new Jugador("Jimer Fory", "DIM05", 13, Posicion.LATERAL, LocalDate.of(2002, 5, 24), "Colombia"));
        medellin.agregarJugador(new Jugador("Jaime Alvarado", "DIM06", 15, Posicion.VOLANTE, LocalDate.of(1999, 7, 26), "Colombia"));
        medellin.agregarJugador(new Jugador("Baldomero Perlaza", "DIM07", 14, Posicion.MEDIOCAMPISTA, LocalDate.of(1992, 6, 5), "Colombia"));
        medellin.agregarJugador(new Jugador("Homer Martínez", "DIM08", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 10, 6), "Colombia"));
        medellin.agregarJugador(new Jugador("Diego Moreno", "DIM09", 31, Posicion.EXTREMO, LocalDate.of(1996, 2, 27), "Colombia"));
        medellin.agregarJugador(new Jugador("Brayan León", "DIM10", 27, Posicion.EXTREMO, LocalDate.of(2000, 10, 19), "Colombia"));
        medellin.agregarJugador(new Jugador("Luis Sandoval", "DIM11", 9, Posicion.DELANTERO, LocalDate.of(1999, 6, 1), "Colombia"));
        equipos.add(medellin);

        // 8. ONCE CALDAS
        Equipo onceCaldas = new Equipo("Once Caldas");
        onceCaldas.setTecnicoEquipo(new Tecnico("Hernán Darío Herrera", "CO_T08", "Once Caldas", "Colombia"));
        onceCaldas.agregarJugador(new Jugador("James Aguirre", "ONC01", 12, Posicion.PORTERO, LocalDate.of(1992, 5, 18), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Juan David Cuesta", "ONC02", 22, Posicion.LATERAL, LocalDate.of(1997, 5, 26), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Jorge Cardona", "ONC03", 18, Posicion.DEFENSA, LocalDate.of(1999, 1, 22), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Jeider Riquett", "ONC04", 34, Posicion.DEFENSA, LocalDate.of(1990, 5, 22), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Juan Pablo Patiño", "ONC05", 30, Posicion.LATERAL, LocalDate.of(1998, 12, 3), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Mateo García", "ONC06", 19, Posicion.VOLANTE, LocalDate.of(1998, 8, 28), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Iván Rojas", "ONC07", 5, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 7, 24), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Alejandro García", "ONC08", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 2, 28), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Michael Barrios", "ONC09", 7, Posicion.EXTREMO, LocalDate.of(1991, 4, 21), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Luis Palacios", "ONC10", 28, Posicion.EXTREMO, LocalDate.of(2001, 6, 17), "Colombia"));
        onceCaldas.agregarJugador(new Jugador("Dayro Moreno", "ONC11", 17, Posicion.DELANTERO, LocalDate.of(1985, 9, 16), "Colombia"));
        equipos.add(onceCaldas);

        // 9. ATLÉTICO BUCARAMANGA
        Equipo bucaramanga = new Equipo("Atlético Bucaramanga");
        bucaramanga.setTecnicoEquipo(new Tecnico("Gustavo Florentín", "CO_T09", "Atlético Bucaramanga", "Paraguay"));
        bucaramanga.agregarJugador(new Jugador("Aldair Quintana", "BUC01", 1, Posicion.PORTERO, LocalDate.of(1994, 7, 11), "Colombia"));
        bucaramanga.agregarJugador(new Jugador("Aldair Gutiérrez", "BUC02", 19, Posicion.LATERAL, LocalDate.of(1998, 6, 17), "Colombia"));
        bucaramanga.agregarJugador(new Jugador("Jefferson Mena", "BUC03", 2, Posicion.DEFENSA, LocalDate.of(1989, 6, 15), "Colombia"));
        bucaramanga.agregarJugador(new Jugador("Carlos Henao", "BUC04", 29, Posicion.DEFENSA, LocalDate.of(1988, 12, 3), "Colombia"));
        bucaramanga.agregarJugador(new Jugador("Fredy Hinestroza", "BUC05", 8, Posicion.LATERAL, LocalDate.of(1990, 4, 5), "Colombia"));
        bucaramanga.agregarJugador(new Jugador("Fabry Castro", "BUC06", 22, Posicion.VOLANTE, LocalDate.of(1992, 2, 21), "Colombia"));
        bucaramanga.agregarJugador(new Jugador("Leonardo Flores", "BUC07", 28, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 6, 5), "Venezuela"));
        bucaramanga.agregarJugador(new Jugador("Fabián Sambueza", "BUC08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1988, 8, 1), "Argentina"));
        bucaramanga.agregarJugador(new Jugador("Frank Castañeda", "BUC09", 70, Posicion.EXTREMO, LocalDate.of(1994, 7, 17), "Colombia"));
        bucaramanga.agregarJugador(new Jugador("Kevin Cuesta", "BUC10", 23, Posicion.EXTREMO, LocalDate.of(2000, 3, 29), "Colombia"));
        bucaramanga.agregarJugador(new Jugador("Andrés Ponce", "BUC11", 9, Posicion.DELANTERO, LocalDate.of(1996, 11, 11), "Venezuela"));
        equipos.add(bucaramanga);

        // 10. DEPORTIVO CALI
        Equipo cali = new Equipo("Deportivo Cali");
        cali.setTecnicoEquipo(new Tecnico("Alfredo Arias", "CO_T10", "Deportivo Cali", "Uruguay"));
        cali.agregarJugador(new Jugador("Alejandro Rodríguez", "CAL01", 1, Posicion.PORTERO, LocalDate.of(2001, 1, 12), "Colombia"));
        cali.agregarJugador(new Jugador("Jonathan Marulanda", "CAL02", 2, Posicion.LATERAL, LocalDate.of(1995, 11, 21), "Colombia"));
        cali.agregarJugador(new Jugador("Francisco Meza", "CAL03", 3, Posicion.DEFENSA, LocalDate.of(1991, 8, 29), "Colombia"));
        cali.agregarJugador(new Jugador("José Caldera", "CAL04", 24, Posicion.DEFENSA, LocalDate.of(2002, 2, 4), "Colombia"));
        cali.agregarJugador(new Jugador("Yulián Gómez", "CAL05", 13, Posicion.LATERAL, LocalDate.of(1997, 8, 4), "Colombia"));
        cali.agregarJugador(new Jugador("Alexander Mejía", "CAL06", 14, Posicion.VOLANTE, LocalDate.of(1988, 7, 11), "Colombia"));
        cali.agregarJugador(new Jugador("Rafael Bustamante", "CAL07", 5, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 10, 2), "Colombia"));
        cali.agregarJugador(new Jugador("Jarlan Barrera", "CAL08", 7, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 9, 16), "Colombia"));
        cali.agregarJugador(new Jugador("Andrey Estupiñán", "CAL09", 11, Posicion.EXTREMO, LocalDate.of(1994, 7, 5), "Colombia"));
        cali.agregarJugador(new Jugador("Kelvin Osorio", "CAL10", 8, Posicion.EXTREMO, LocalDate.of(1993, 10, 29), "Colombia"));
        cali.agregarJugador(new Jugador("Fredy Montero", "CAL11", 17, Posicion.DELANTERO, LocalDate.of(1987, 7, 26), "Colombia"));
        equipos.add(cali);

        // 11. DEPORTIVO PEREIRA
        Equipo pereira = new Equipo("Deportivo Pereira");
        pereira.setTecnicoEquipo(new Tecnico("Luis Fernando Suárez", "CO_T11", "Deportivo Pereira", "Colombia"));
        pereira.agregarJugador(new Jugador("Salvador Ichazo", "PER01", 1, Posicion.PORTERO, LocalDate.of(1992, 1, 26), "Uruguay"));
        pereira.agregarJugador(new Jugador("Eber Moreno", "PER02", 16, Posicion.LATERAL, LocalDate.of(2002, 1, 11), "Colombia"));
        pereira.agregarJugador(new Jugador("Jean Pestaña", "PER03", 29, Posicion.DEFENSA, LocalDate.of(1997, 8, 25), "Colombia"));
        pereira.agregarJugador(new Jugador("José Moya", "PER04", 3, Posicion.DEFENSA, LocalDate.of(1992, 8, 7), "Colombia"));
        pereira.agregarJugador(new Jugador("Nicolás Giraldo", "PER05", 13, Posicion.LATERAL, LocalDate.of(1993, 3, 29), "Colombia"));
        pereira.agregarJugador(new Jugador("Juan David Ríos", "PER06", 25, Posicion.VOLANTE, LocalDate.of(1991, 10, 7), "Colombia"));
        pereira.agregarJugador(new Jugador("Jorge Bermúdez", "PER07", 18, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 7, 26), "Colombia"));
        pereira.agregarJugador(new Jugador("Yesus Cabrera", "PER08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1990, 9, 15), "Colombia"));
        pereira.agregarJugador(new Jugador("Darwin Quintero", "PER09", 11, Posicion.EXTREMO, LocalDate.of(1987, 9, 19), "Colombia"));
        pereira.agregarJugador(new Jugador("Alejandro Piedrahita", "PER10", 20, Posicion.EXTREMO, LocalDate.of(2002, 9, 3), "Colombia"));
        pereira.agregarJugador(new Jugador("Gonzalo Lencina", "PER11", 9, Posicion.DELANTERO, LocalDate.of(1997, 10, 18), "Argentina"));
        equipos.add(pereira);

        // 12. DEPORTIVO PASTO
        Equipo pasto = new Equipo("Deportivo Pasto");
        pasto.setTecnicoEquipo(new Tecnico("Camilo Ayala", "CO_T12", "Deportivo Pasto", "Colombia"));
        pasto.agregarJugador(new Jugador("Diego Martínez", "PAS01", 1, Posicion.PORTERO, LocalDate.of(1989, 11, 29), "Colombia"));
        pasto.agregarJugador(new Jugador("Israel Alba", "PAS02", 27, Posicion.LATERAL, LocalDate.of(1995, 5, 6), "Colombia"));
        pasto.agregarJugador(new Jugador("Brayan Carabalí", "PAS03", 5, Posicion.DEFENSA, LocalDate.of(1999, 2, 25), "Colombia"));
        pasto.agregarJugador(new Jugador("Nicolás Gil", "PAS04", 23, Posicion.DEFENSA, LocalDate.of(1997, 8, 22), "Colombia"));
        pasto.agregarJugador(new Jugador("Christian Mafla", "PAS05", 30, Posicion.LATERAL, LocalDate.of(1993, 1, 15), "Colombia"));
        pasto.agregarJugador(new Jugador("Víctor Mejía", "PAS06", 8, Posicion.VOLANTE, LocalDate.of(1993, 7, 11), "Colombia"));
        pasto.agregarJugador(new Jugador("Diego Chávez", "PAS07", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 9, 24), "Argentina"));
        pasto.agregarJugador(new Jugador("Juan Castilla", "PAS08", 16, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 7, 27), "Colombia"));
        pasto.agregarJugador(new Jugador("Kevin Londoño", "PAS09", 7, Posicion.EXTREMO, LocalDate.of(1993, 11, 23), "Colombia"));
        pasto.agregarJugador(new Jugador("Ray Vanegas", "PAS10", 11, Posicion.EXTREMO, LocalDate.of(1993, 3, 12), "Colombia"));
        pasto.agregarJugador(new Jugador("Daniel Moreno", "PAS11", 9, Posicion.DELANTERO, LocalDate.of(1995, 1, 17), "Colombia"));
        equipos.add(pasto);

        // 13. LA EQUIDAD
        Equipo equidad = new Equipo("La Equidad");
        equidad.setTecnicoEquipo(new Tecnico("Alexis García", "CO_T13", "La Equidad", "Colombia"));
        equidad.agregarJugador(new Jugador("Washington Ortega", "EQU01", 1, Posicion.PORTERO, LocalDate.of(1994, 11, 13), "Uruguay"));
        equidad.agregarJugador(new Jugador("Jaison Mina", "EQU02", 2, Posicion.LATERAL, LocalDate.of(2000, 10, 6), "Colombia"));
        equidad.agregarJugador(new Jugador("Daniel Polanco", "EQU03", 3, Posicion.DEFENSA, LocalDate.of(1999, 5, 13), "Colombia"));
        equidad.agregarJugador(new Jugador("Martín Payares", "EQU04", 15, Posicion.DEFENSA, LocalDate.of(1995, 3, 27), "Colombia"));
        equidad.agregarJugador(new Jugador("Andrés Correa", "EQU05", 21, Posicion.LATERAL, LocalDate.of(1994, 1, 29), "Colombia"));
        equidad.agregarJugador(new Jugador("Juan Mahecha", "EQU06", 20, Posicion.VOLANTE, LocalDate.of(1987, 7, 22), "Colombia"));
        equidad.agregarJugador(new Jugador("Felipe Acosta", "EQU07", 24, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 5, 29), "Colombia"));
        equidad.agregarJugador(new Jugador("Élan Ricardo", "EQU08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 2, 20), "Colombia"));
        equidad.agregarJugador(new Jugador("Léiner Escalante", "EQU09", 7, Posicion.EXTREMO, LocalDate.of(1991, 12, 18), "Colombia"));
        equidad.agregarJugador(new Jugador("Amaury Torralvo", "EQU10", 26, Posicion.EXTREMO, LocalDate.of(1994, 6, 15), "Colombia"));
        equidad.agregarJugador(new Jugador("Beckham Castro", "EQU11", 11, Posicion.DELANTERO, LocalDate.of(2003, 9, 12), "Colombia"));
        equipos.add(equidad);

        // 14. ÁGUILAS DORADAS
        Equipo aguilas = new Equipo("Águilas Doradas");
        aguilas.setTecnicoEquipo(new Tecnico("Pedro Depablos", "CO_T14", "Águilas Doradas", "Venezuela"));
        aguilas.agregarJugador(new Jugador("José Contreras", "AGU01", 1, Posicion.PORTERO, LocalDate.of(1994, 10, 20), "Venezuela"));
        aguilas.agregarJugador(new Jugador("Dylan Lozano", "AGU02", 16, Posicion.LATERAL, LocalDate.of(2000, 12, 11), "Colombia"));
        aguilas.agregarJugador(new Jugador("Jeison Quiñónes", "AGU03", 3, Posicion.DEFENSA, LocalDate.of(1997, 8, 17), "Colombia"));
        aguilas.agregarJugador(new Jugador("Joaquín Varela", "AGU04", 2, Posicion.DEFENSA, LocalDate.of(1998, 6, 27), "Uruguay"));
        aguilas.agregarJugador(new Jugador("Javier Mena", "AGU05", 22, Posicion.LATERAL, LocalDate.of(2005, 1, 20), "Colombia"));
        aguilas.agregarJugador(new Jugador("Guillermo Celis", "AGU06", 28, Posicion.VOLANTE, LocalDate.of(1993, 5, 8), "Colombia"));
        aguilas.agregarJugador(new Jugador("Jean Pineda", "AGU07", 24, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 9, 17), "Colombia"));
        aguilas.agregarJugador(new Jugador("Jesús Rivas", "AGU08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 1, 29), "Colombia"));
        aguilas.agregarJugador(new Jugador("Jhon Fredy Salazar", "AGU09", 7, Posicion.EXTREMO, LocalDate.of(1995, 4, 1), "Colombia"));
        aguilas.agregarJugador(new Jugador("Yony González", "AGU10", 11, Posicion.EXTREMO, LocalDate.of(1994, 7, 11), "Colombia"));
        aguilas.agregarJugador(new Jugador("Jorge Ramos", "AGU11", 9, Posicion.DELANTERO, LocalDate.of(1992, 10, 2), "Colombia"));
        equipos.add(aguilas);

        // 15. FORTALEZA CEIF
        Equipo fortaleza = new Equipo("Fortaleza CEIF");
        fortaleza.setTecnicoEquipo(new Tecnico("Sebastián Oliveros", "CO_T15", "Fortaleza CEIF", "Colombia"));
        fortaleza.agregarJugador(new Jugador("Juan Diego Castillo", "FOR01", 12, Posicion.PORTERO, LocalDate.of(2003, 1, 13), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Hayen Palacios", "FOR02", 26, Posicion.LATERAL, LocalDate.of(1999, 9, 8), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Daniel Rivera", "FOR03", 4, Posicion.DEFENSA, LocalDate.of(1999, 2, 28), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Yesid Díaz", "FOR04", 24, Posicion.DEFENSA, LocalDate.of(1997, 7, 24), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Juan Camilo Castillo", "FOR05", 13, Posicion.LATERAL, LocalDate.of(2002, 10, 3), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Leonardo Pico", "FOR06", 5, Posicion.VOLANTE, LocalDate.of(1991, 9, 4), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Ronaldo Pájaro", "FOR07", 20, Posicion.MEDIOCAMPISTA, LocalDate.of(2002, 2, 18), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Nicolás Rodríguez", "FOR08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(2004, 4, 25), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Sebastián Navarro", "FOR09", 8, Posicion.EXTREMO, LocalDate.of(2000, 7, 15), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Adrián Parra", "FOR10", 7, Posicion.EXTREMO, LocalDate.of(1997, 5, 19), "Colombia"));
        fortaleza.agregarJugador(new Jugador("Santiago Córdoba", "FOR11", 9, Posicion.DELANTERO, LocalDate.of(1997, 9, 3), "Colombia"));
        equipos.add(fortaleza);

        // 16. ALIANZA FC
        Equipo alianza = new Equipo("Alianza FC");
        alianza.setTecnicoEquipo(new Tecnico("Hubert Bodhert", "CO_T16", "Alianza FC", "Colombia"));
        alianza.agregarJugador(new Jugador("Carlos Mosquera", "ALI01", 30, Posicion.PORTERO, LocalDate.of(1994, 9, 24), "Colombia"));
        alianza.agregarJugador(new Jugador("Efraín Navarro", "ALI02", 16, Posicion.LATERAL, LocalDate.of(1999, 5, 14), "Colombia"));
        alianza.agregarJugador(new Jugador("Pedro Franco", "ALI03", 5, Posicion.DEFENSA, LocalDate.of(1991, 4, 23), "Colombia"));
        alianza.agregarJugador(new Jugador("Jesús Figueroa", "ALI04", 22, Posicion.DEFENSA, LocalDate.of(1996, 2, 20), "Colombia"));
        alianza.agregarJugador(new Jugador("Leonardo Saldaña", "ALI05", 2, Posicion.LATERAL, LocalDate.of(1989, 12, 10), "Colombia"));
        alianza.agregarJugador(new Jugador("Rubén Manjarrés", "ALI06", 6, Posicion.VOLANTE, LocalDate.of(2000, 4, 24), "Colombia"));
        alianza.agregarJugador(new Jugador("Jair Castillo", "ALI07", 21, Posicion.MEDIOCAMPISTA, LocalDate.of(1997, 5, 14), "Colombia"));
        alianza.agregarJugador(new Jugador("Royscer Colpa", "ALI08", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1995, 10, 4), "Colombia"));
        alianza.agregarJugador(new Jugador("Emerson Batalla", "ALI09", 7, Posicion.EXTREMO, LocalDate.of(2001, 6, 30), "Colombia"));
        alianza.agregarJugador(new Jugador("Mayer Gil", "ALI10", 11, Posicion.EXTREMO, LocalDate.of(2003, 9, 7), "El Salvador"));
        alianza.agregarJugador(new Jugador("Andrés Rentería", "ALI11", 9, Posicion.DELANTERO, LocalDate.of(1993, 3, 6), "Colombia"));
        equipos.add(alianza);

        // 17. ENVIGADO FC
        Equipo envigado = new Equipo("Envigado FC");
        envigado.setTecnicoEquipo(new Tecnico("Andrés Orozco", "CO_T17", "Envigado FC", "Colombia"));
        envigado.agregarJugador(new Jugador("Joan Parra", "ENV01", 1, Posicion.PORTERO, LocalDate.of(2000, 6, 5), "Colombia"));
        envigado.agregarJugador(new Jugador("Gendry Cuervo", "ENV02", 2, Posicion.LATERAL, LocalDate.of(2001, 8, 28), "Colombia"));
        envigado.agregarJugador(new Jugador("Julián Palacios", "ENV03", 15, Posicion.DEFENSA, LocalDate.of(2003, 8, 7), "Colombia"));
        envigado.agregarJugador(new Jugador("Andrés Cadavid", "ENV04", 5, Posicion.DEFENSA, LocalDate.of(1985, 12, 28), "Colombia"));
        envigado.agregarJugador(new Jugador("Kevin Tamayo", "ENV05", 13, Posicion.LATERAL, LocalDate.of(2000, 3, 21), "Colombia"));
        envigado.agregarJugador(new Jugador("Felipe Jaramillo", "ENV06", 6, Posicion.VOLANTE, LocalDate.of(1996, 4, 18), "Colombia"));
        envigado.agregarJugador(new Jugador("Edison López", "ENV07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2000, 11, 2), "Colombia"));
        envigado.agregarJugador(new Jugador("Dorlan Pabón", "ENV08", 88, Posicion.MEDIOCAMPISTA, LocalDate.of(1988, 1, 24), "Colombia"));
        envigado.agregarJugador(new Jugador("Luis Ángel Díaz", "ENV09", 7, Posicion.EXTREMO, LocalDate.of(2004, 1, 11), "Colombia"));
        envigado.agregarJugador(new Jugador("Daniel Arcila", "ENV10", 10, Posicion.EXTREMO, LocalDate.of(2002, 5, 17), "Colombia"));
        envigado.agregarJugador(new Jugador("Bayron Garcés", "ENV11", 9, Posicion.DELANTERO, LocalDate.of(1993, 5, 30), "Colombia"));
        equipos.add(envigado);

        // 18. BOYACÁ CHICÓ
        Equipo chico = new Equipo("Boyacá Chicó");
        chico.setTecnicoEquipo(new Tecnico("Juan Carlos Álvarez", "CO_T18", "Boyacá Chicó", "Colombia"));
        chico.agregarJugador(new Jugador("Rogerio Caicedo", "CHI01", 1, Posicion.PORTERO, LocalDate.of(1995, 7, 17), "Colombia"));
        chico.agregarJugador(new Jugador("Eduard Banguero", "CHI02", 26, Posicion.LATERAL, LocalDate.of(1999, 12, 12), "Colombia"));
        chico.agregarJugador(new Jugador("Henry Plazas", "CHI03", 3, Posicion.DEFENSA, LocalDate.of(1992, 12, 12), "Venezuela"));
        chico.agregarJugador(new Jugador("Rafael Uzcátegui", "CHI04", 24, Posicion.DEFENSA, LocalDate.of(2004, 10, 4), "Venezuela"));
        chico.agregarJugador(new Jugador("Jonathan Herrera", "CHI05", 13, Posicion.LATERAL, LocalDate.of(2000, 4, 21), "Colombia"));
        chico.agregarJugador(new Jugador("Frank Lozano", "CHI06", 20, Posicion.VOLANTE, LocalDate.of(1993, 10, 17), "Colombia"));
        chico.agregarJugador(new Jugador("Sebastián Támara", "CHI07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1996, 5, 10), "Colombia"));
        chico.agregarJugador(new Jugador("Kevin Londoño", "CHI08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1998, 2, 18), "Colombia"));
        chico.agregarJugador(new Jugador("Wilmar Cruz", "CHI09", 9, Posicion.EXTREMO, LocalDate.of(1994, 5, 29), "Colombia"));
        chico.agregarJugador(new Jugador("Geimer Balanta", "CHI10", 7, Posicion.EXTREMO, LocalDate.of(1993, 4, 26), "Colombia"));
        chico.agregarJugador(new Jugador("Michael Nike Gómez", "CHI11", 11, Posicion.DELANTERO, LocalDate.of(1997, 4, 4), "Colombia"));
        equipos.add(chico);

        // 19. UNIÓN MAGDALENA
        Equipo union = new Equipo("Unión Magdalena");
        union.setTecnicoEquipo(new Tecnico("Jorge Luis Pinto", "CO_T19", "Unión Magdalena", "Colombia"));
        union.agregarJugador(new Jugador("Johan Wallens", "UNI01", 1, Posicion.PORTERO, LocalDate.of(1992, 8, 3), "Colombia"));
        union.agregarJugador(new Jugador("Daniel Mera", "UNI02", 2, Posicion.LATERAL, LocalDate.of(2002, 5, 14), "Colombia"));
        union.agregarJugador(new Jugador("Andrés Correa", "UNI03", 4, Posicion.DEFENSA, LocalDate.of(1994, 1, 29), "Colombia"));
        union.agregarJugador(new Jugador("Guillermo Tegüé", "UNI04", 26, Posicion.DEFENSA, LocalDate.of(2000, 2, 6), "Colombia"));
        union.agregarJugador(new Jugador("Brayan Correa", "UNI05", 3, Posicion.LATERAL, LocalDate.of(1995, 6, 17), "Colombia"));
        union.agregarJugador(new Jugador("Fabián Cantillo", "UNI06", 20, Posicion.VOLANTE, LocalDate.of(1997, 9, 17), "Colombia"));
        union.agregarJugador(new Jugador("Agustín Cano", "UNI07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(2001, 4, 19), "Colombia"));
        union.agregarJugador(new Jugador("Jannenson Sarmiento", "UNI08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1999, 10, 17), "Colombia"));
        union.agregarJugador(new Jugador("Cristian Sención", "UNI09", 7, Posicion.EXTREMO, LocalDate.of(1996, 1, 28), "Uruguay"));
        union.agregarJugador(new Jugador("Orles Aragón", "UNI10", 11, Posicion.EXTREMO, LocalDate.of(1999, 4, 24), "Colombia"));
        union.agregarJugador(new Jugador("Ruyeri Blanco", "UNI11", 9, Posicion.DELANTERO, LocalDate.of(1998, 12, 7), "Colombia"));
        equipos.add(union);

        // 20. LLANEROS FC
        Equipo llaneros = new Equipo("Llaneros FC");
        llaneros.setTecnicoEquipo(new Tecnico("Jaime de la Pava", "CO_T20", "Llaneros FC", "Colombia"));
        llaneros.agregarJugador(new Jugador("Kevin Armesto", "LLA01", 1, Posicion.PORTERO, LocalDate.of(1997, 6, 18), "Colombia"));
        llaneros.agregarJugador(new Jugador("Geovan Montes", "LLA02", 2, Posicion.LATERAL, LocalDate.of(1996, 3, 21), "Colombia"));
        llaneros.agregarJugador(new Jugador("Cristian Valencia", "LLA03", 4, Posicion.DEFENSA, LocalDate.of(1991, 12, 4), "Colombia"));
        llaneros.agregarJugador(new Jugador("Jan Carlos Angulo", "LLA04", 5, Posicion.DEFENSA, LocalDate.of(1999, 4, 2), "Colombia"));
        llaneros.agregarJugador(new Jugador("Jhildrey Lasso", "LLA05", 13, Posicion.LATERAL, LocalDate.of(1996, 10, 11), "Colombia"));
        llaneros.agregarJugador(new Jugador("Eyder Restrepo", "LLA06", 6, Posicion.VOLANTE, LocalDate.of(1996, 11, 29), "Colombia"));
        llaneros.agregarJugador(new Jugador("Marlon Sierra", "LLA07", 8, Posicion.MEDIOCAMPISTA, LocalDate.of(1994, 5, 19), "Colombia"));
        llaneros.agregarJugador(new Jugador("Bryan Urueña", "LLA08", 10, Posicion.MEDIOCAMPISTA, LocalDate.of(1992, 11, 1), "Colombia"));
        llaneros.agregarJugador(new Jugador("Néider Ospina", "LLA09", 7, Posicion.EXTREMO, LocalDate.of(2003, 5, 3), "Colombia"));
        llaneros.agregarJugador(new Jugador("Kevin Quejada", "LLA10", 11, Posicion.EXTREMO, LocalDate.of(2002, 8, 18), "Colombia"));
        llaneros.agregarJugador(new Jugador("Omar Duarte", "LLA11", 9, Posicion.DELANTERO, LocalDate.of(1995, 7, 18), "Colombia"));
        equipos.add(llaneros);

        return equipos;
    }
}
