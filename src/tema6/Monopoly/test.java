package tema6.Monopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static void rellenar(char lab[][], Tablero tablero) {
        char nombre=' ';
        //Lo de dentro
        for(int i=1; i<lab.length-1; i++) {
            for(int j=1; j<lab[i].length-1; j++) {
                lab[i][j] = ' ';
            }
        }

        lab[0][0]='S';

        int variable=1;
        int abajo=4;
        int izquierda=4;
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
                lab[variable][lab[1].length-1] = nombre;
                variable++;
            } else if (x<(lab.length-1)*2 + lab[1].length-1) {
                lab[lab.length-1][abajo] = nombre;
                abajo--;
            } else if (x<(lab.length-1)*2 + (lab[1].length-1)*2) {
                lab[izquierda][0] = nombre;
                izquierda--;
            }

        }

    }

    public static void pintar(char lab[][]) {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                System.out.print(lab[i][j] + "  ");
            }
            System.out.println();
        }
    }
/*
    public static ArrayList<Carta> addCartas1(ArrayList<Carta> cartas, ArrayList<Carta> vacio){
        for (Carta c : cartas){
            vacio.add(c);
        }

        return vacio;

    }
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carta c1 = new Carta("Paga la factura Hacienda", 150);
        Carta c2 = new Carta("Donación a la caridad", 50);
        Carta c3 = new Carta("Impuesto de la comunidad", 75);
        Carta c4 = new Carta("Multa", 100);
        Carta c5 = new Carta("Impuesto de Lujo", 75);
        Carta c6 = new Carta("Impuesto por reparaciones", 100);


        Tablero t1 = new Tablero();

        t1.addCartas(c1);
        t1.addCartas(c2);
        t1.addCartas(c3);
        t1.addCartas(c4);
        t1.addCartas(c5);
        t1.addCartas(c6);

        for (Casilla c : t1.getCasillas()){
            if (c instanceof Impuesto){
                for (Carta carta : t1.getCartas()) {
                    ((Impuesto) c).addCartas(carta);
                }
            }

            if (c instanceof Multa){
                for (Carta carta : t1.getCartas()) {
                    ((Multa) c).addCartas(carta);
                }
            }
        }

        Juego J = new Juego(t1);

        char pintar[][] = new char[5][5];

        rellenar(pintar , J.getTablero());

        pintar(pintar);

        int jugadores=0;

        while (jugadores <2 || jugadores > 4) {
            System.out.println("Cuantas personas van a jugar,mínimo 2 maximo 4 personas");
            jugadores = Integer.parseInt(sc.nextLine());
        }

        for (int j=1; j<=jugadores; j++){
            Jugadores j1 = new Jugadores("j" + j);
            J.addJugador(j1);
        }

        for (int i=0; i<40; i++){

            for (Jugadores ju : J.getJugadores()){
                J.getTablero().mover(ju);
                System.out.println(ju);
            }

        }
        System.out.println(J.ganador());


    }
}
