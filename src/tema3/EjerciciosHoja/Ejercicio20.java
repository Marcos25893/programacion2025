package tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio20 {

    public static void pintar(String matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String tablero[][]=new String[3][3];
        int jugador1Fila, jugador1Columna;
        int jugador2Fila, jugador2Columna;
        int jugadas=0;

        Scanner sc = new Scanner(System.in);

        while(jugadas<10) {

            System.out.println("Jugador 1 elige fila");
            jugador1Fila = Integer.parseInt(sc.nextLine());
            System.out.println("Jugador 1 elige Columna");
            jugador1Columna = Integer.parseInt(sc.nextLine());

            tablero[jugador1Fila][jugador1Columna] = "X";
            pintar(tablero);

            System.out.println("Jugador 2 elige fila");
            jugador2Fila = Integer.parseInt(sc.nextLine());
            System.out.println("Jugador 2 elige Columna");
            jugador2Columna = Integer.parseInt(sc.nextLine());

            tablero[jugador2Fila][jugador2Columna] = "O";

            jugadas++;

            pintar(tablero);
        }
    }
}
