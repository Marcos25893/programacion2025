package tema5.BladeofDarnknessll;

public class TestJuego {
    public static void main(String[] args) {

        Jugador pj1 = new Jugador("Paco",7,500.0, Jugador.Clase.BARBARO,75);
        Partida p1 = new Partida(pj1);

        int contador=0;

        do {
            p1.turnoJugador();
            p1.turnoEnemigo();
            contador++;
        }while (contador<30 || p1.turnoEnemigo() || p1.turnoJugador());

        if (pj1.getSalud()<=0){
            System.out.println("El Jugador a muerto");
        }else{
            System.out.println("El Jugador a ganado");
        }
        System.out.println(p1);


    }
}
