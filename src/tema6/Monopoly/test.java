package tema6.Monopoly;

public class test {

    public static void rellenar(char lab[][], Tablero tablero) {
        char nombre=' ';
        //Lo de dentro
        for(int i=1; i<lab.length-1; i++) {
            for(int j=1; j<lab[i].length-1; j++) {
                lab[i][j] = ' ';
            }
        }
        for (int x=1; x<tablero.getCasillas().size()-1;x++) {

            if (tablero.getCasillas().get(x) instanceof Propiedad) {
                nombre='P';
            } else if (tablero.getCasillas().get(x) instanceof Multa) {
                nombre='M';
            } else if (tablero.getCasillas().get(x) instanceof Impuesto) {
                nombre='I';
            } else if (tablero.getCasillas().get(x) instanceof Carcel) {
                nombre='C';
            }

            if (x<lab[1].length) {
                lab[0][x] = nombre;
            } else if (x< lab.length-1 + lab[1].length-1) {

            }


        }
/*
        //Borde superior e inferior
        for(int j=0; j < lab[0].length; j++) {
            lab[0][j] = '-';
            lab[lab.length-1][j] = '-';
        }
*/
        /*
        //Borde derecho e izquierdo
        for(int i=0; i<lab.length; i++) {
            lab[i][0] = '|';
            lab[i][lab.length - 1] = '|';
        }
        */

    }

    public static void pintar(char lab[][]) {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                System.out.print(lab[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Jugadores j1 = new Jugadores("j1");

        Jugadores j2 = new Jugadores("j2");

        Tablero t1 = new Tablero();

        Juego J = new Juego(t1);

        char pintar[][] = new char[5][5];

        rellenar(pintar , J.getTablero());

        pintar(pintar);
/*
        J.addJugador(j1);
        J.addJugador(j2);
        J.getTablero().mover(j1);
        System.out.println(j1);
        J.getTablero().mover(j1);
        System.out.println(j1);
        J.getTablero().mover(j2);
        System.out.println(j2);

        for (int i=0;i<t1.getCasillas().size();i++){
            System.out.println(t1.getCasillas().get(i));
        }
        System.out.println(J.ganador());

*/

    }
}
