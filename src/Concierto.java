import Elementos.*;

import java.util.ArrayList;

public class Concierto {
    public static void main(String[] args) {
        Escenario escenario1 = new Escenario("C001", "Escenario estrella", 400000);
        Integrantes integrantes1 = new Integrantes("Pepe", "Guitarra", 1997);
        Integrantes integrantes2 = new Integrantes("Max", "Bateria", 2000);
        GrupoMusical grupoMusical1 = new GrupoMusical("Caniches", "Pop", "Finlandia", ArrayList<integrantes1, integrantes2>);

        Concierto concierto1 = new Concierto(escenario1, grupoMusical1);

        System.out.println(concierto1);
    }
}
