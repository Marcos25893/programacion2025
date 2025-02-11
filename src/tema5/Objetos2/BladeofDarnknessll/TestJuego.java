package tema5.Objetos2.BladeofDarnknessll;

public class TestJuego {
    public static void main(String[] args) {

        Jugador pj1 = new Jugador("Paco",5,400.0, Jugador.Clase.BARBARO,0);
        Partida p1 = new Partida(pj1);

        System.out.println(p1);

        int contador=0;

        do {
            p1.turnoJugador();
            p1.turnoEnemigo();
            contador++;
        }while (contador<30 && !p1.turnoEnemigo() && !p1.turnoJugador());

        System.out.println(p1);


    }
}
