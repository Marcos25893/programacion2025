package tema6.Monopoly;

public class test {

    public static void main(String[] args) {

        Jugadores j1 = new Jugadores("j1");

        Jugadores j2 = new Jugadores("j2");

        Tablero t1 = new Tablero();

        Juego J = new Juego(t1);

        System.out.println(t1.getCasillas());


        System.out.println(j1.getPosicionJugador());

        t1.comprar((Propiedad) t1.getCasillas().get(j1.getPosicionJugador()),j1);
        System.out.println(j1);
        t1.comprar((Propiedad) t1.getCasillas().get(j2.getPosicionJugador()),j2);
        System.out.println(j2);

        t1.mover(j1);
        t1.comprar((Propiedad) t1.getCasillas().get(j1.getPosicionJugador()),j1);
        System.out.println(j1);


        /*
        j1.setPosicionJugador(13);
        t1.mover(j1);
        System.out.println(j1);

         */
    }
}
