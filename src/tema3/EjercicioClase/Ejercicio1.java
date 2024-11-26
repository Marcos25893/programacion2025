package tema3.EjercicioClase;

import java.util.Scanner;

public class Ejercicio1 {

    public static void pintar(int matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int pedirFichaJugador(int numJugador){
        int ficha=-1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Jugador " + numJugador + " en que columna vas a poner la ficha (0-6)");
            ficha = Integer.parseInt(sc.nextLine());
        }while(ficha<0 || ficha>6);
        return ficha;

    }

    public static boolean colocarFicha(int tablero[][], int j, int numJugador) {
        for (int i = tablero.length-1; i >=0; i--) {
            if (tablero[i][j]==0){
                if (numJugador==1){
                    tablero[i][j]=1;
                } else if (numJugador==2) {
                    tablero[i][j]=2;
                }
                return true;
            }
        }
        return false;
    }

//    public static boolean colocarFicha(int tablero[][], int j, int numJugador) {
//        boolean colocada = false;
//        for(int i=0; i < tablero.length-1; i++) {
//            if (tablero[i+1][j] != 0) {
//                colocada = true;
//                if (numJugador==1)
//                    tablero[i][j] = 1;
//                else
//                    tablero[i][j] = 2;
//                break;
//            }
//        }
//        if (colocada == false) {
//            if (numJugador==1)
//                tablero[tablero.length-1][j] = 1;
//            else
//                tablero[tablero.length-1][j] = 2;
//        }
//
//        return true;
//    }

    public static int comprobarGanador(int tablero[][]){
        for (int i=tablero.length-1;i>=0 ;i--){
            for (int j=0;j< tablero[0].length ;j++){
                if (i>=3) {
                    if (tablero[i][j] == 1 && tablero[i-1][j] == 1 && tablero[i-2][j] == 1 && tablero[i-3][j] == 1){
                        return 1;
                    } else if ((tablero[i][j] == 2 && tablero[i-1][j] == 2 && tablero[i-2][j] == 2 && tablero[i-3][j] == 2)) {
                        return 2;
                    }
                }
                if (j<=3) {
                    if (tablero[i][j] == 1 && tablero[i][j+1] == 1 && tablero[i][j+2] == 1 && tablero[i][j+3] == 1){
                        return 1;
                    } else if (tablero[i][j] == 2 && tablero[i][j+1] == 2 && tablero[i][j+2] == 2 && tablero[i][j+3] == 2) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        //1. Conecta 4
        //Representa un tablero 6x7 que pueda contener los valores 0, 1 o 2.
        //Realiza un método:
        //    boolean colocarFicha(int tablero[][], int i, int j, int numJugador)
        //
        //    - Ese método devolverá true, si en (i,j) hay un 0, está vacía,
        //    o si debajo no hay nada
        //    - Si numJugador==1 pondrá en esa casilla un 1
        //    - Si numJugador==2 pondrá en esa casilla un 2
        //
        //Realiza un método para comprobar si algún jugador ha ganado:
        //    int comprobarGanador(int tablero[][])
        //
        //    - Para ello debe haber cuatro casillas contiguas con 1 o con 2. Puede ser
        //    en horizontal, vertical o, si te animas, en diagonal.
        //    - Devolverá 0, si no hay ninguna
        //    - Devolverá 1, si hay cuatro 1 consecutivos
        //    - Devolvera 2, si hay cuatro 2 consecutivos
        //
        //Intenta jugar una partida con dos jugadores, hasta que uno gane, o salir del juego

        int tablero[][]=new int[6][7];
        int ficha=0;
        int ganador=0;
        boolean correcto=false;

        while (ganador==0) {
            pintar(tablero);
            do {
                ficha=pedirFichaJugador(1);
                correcto=colocarFicha(tablero,ficha,1);
            }while (correcto==false);

            correcto=false;
            ganador=comprobarGanador(tablero);
            if (ganador==1){
                pintar(tablero);
                System.out.println("Se conectaron 4, El ganador es el Jugador1");
                break;
            }

            pintar(tablero);
            do {
                ficha=pedirFichaJugador(2);
                correcto=colocarFicha(tablero,ficha,2);
            }while (correcto==false);

            correcto=false;
            ganador=comprobarGanador(tablero);

            if (ganador==2){
                pintar(tablero);
                System.out.println("Se conectaron 4, El ganador es el Jugador2");
                break;
            }

        }

    }
}
