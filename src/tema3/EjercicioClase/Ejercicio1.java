package tema3.EjercicioClase;

import java.util.Scanner;

public class Ejercicio1 {

    public static boolean colocarFicha(int tablero[][],int i, int j, int numJugador){
        if (tablero[i][j]==0 && (tablero[i-1][j]==1 || tablero[i-1][j]==2 )){
            return true;
        }else return false;

    }

    public static int comprobarGanador(int tablero[][]){
        for (int i=0;i< tablero.length;i++){
            for (int j=0;j<tablero[i].length;j++) {
                if (tablero[i][j]==1){
                    if ((tablero[i][j]==1 && tablero[i][j+1]==1 && tablero[i][j+2]==1 && tablero[i][j+3]==1) ||
                            (tablero[i][j]==1 && tablero[i+1][j]==1 && tablero[i+2][j]==1 && tablero[i+3][j]==1)){
                        return 1;
                    }
                } else if ((tablero[i][j]==2 && tablero[i][j+1]==2 && tablero[i][j+2]==2 && tablero[i][j+3]==2) ||
                        (tablero[i][j]==2 && tablero[i+1][j]==2 && tablero[i+2][j]==2 && tablero[i+3][j]==2)) {
                    return 2;
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

        Scanner sc = new Scanner(System.in);



    }
}
