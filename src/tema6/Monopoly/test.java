package tema6.Monopoly;

public class test {

    public static void main(String[] args) {

        Jugadores j1 = new Jugadores("j1");

        Jugadores j2 = new Jugadores("j2");

        Tablero t1 = new Tablero();

        Juego J = new Juego(t1);

        t1.mover(j1);
        System.out.println(j1);
        t1.mover(j1);
        System.out.println(j1);
        t1.mover(j2);
        System.out.println(j2);

        for (int i=0;i<t1.getCasillas().size();i++){
            System.out.println(t1.getCasillas().get(i));
        }

        J.addJugador(j1);
        J.addJugador(j2);
        System.out.println(J.ganador());

        /*Metodo pintar tablero
          Arreglar comprobar ganador
          Array Cartas Impuesto y Multa*/

    }
}
