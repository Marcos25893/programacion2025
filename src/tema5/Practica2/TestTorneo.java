package tema5.Practica2;

public class TestTorneo {

    public static void main(String[] args) throws Exception {

        EquipoMOBA em1 = new EquipoMOBA("Dragons", 80,4);
        EquipoMOBA em2 = new EquipoMOBA("Phoenix", 70,5);
        EquipoMOBA em3 = new EquipoMOBA("Wolves", 90,3);

        TorneoMOBA tm1 = new TorneoMOBA("Torneo Moba");

        EquipoFPS ef1 = new EquipoFPS("Snipers", 85,8);
        EquipoFPS ef2 = new EquipoFPS("Assassins", 95,7);
        EquipoFPS ef3 = new EquipoFPS("Hunters", 70,9);

        TorneoFPS tf1 = new TorneoFPS("Torneo FPS");

        tm1.inscribirEquipoMoba(em1);
        tm1.inscribirEquipoMoba(em2);
        tm1.inscribirEquipoMoba(em3);
//        tm1.inscribirEquipoMoba(ef1);
//        tm1.inscribirEquipoMoba(ef2);
//        tm1.inscribirEquipoMoba(ef3);

//        tf1.inscribirEquipoFPS(em1);
//        tf1.inscribirEquipoFPS(em2);
//        tf1.inscribirEquipoFPS(em3);
        tf1.inscribirEquipoFPS(ef1);
        tf1.inscribirEquipoFPS(ef2);
        tf1.inscribirEquipoFPS(ef3);

        tm1.imprimirEquipos();
        System.out.println();
        System.out.println("Ganador del Torneo " + tm1.jugarTorneo());
        System.out.println();

        tf1.imprimirEquipos();
        System.out.println();
        System.out.println("Ganador del Torneo " + tf1.jugarTorneo());



    }
}
