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

    public static boolean ponerFicha(String matriz[][], int fila, int columna){

        if (matriz[fila][columna].equals("-")){
            return true;
        }else
            return false;
    }

    public static boolean ganador(String matriz[][]){
        for (int i=0;i< matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!matriz[i][j].equals("-")) {

                    if (i == 0 && j == 0) {
                        if (((matriz[i][j].equals(matriz[i][j + 1])) && matriz[i][j + 1].equals(matriz[i][j + 2])) ||
                                (matriz[i][j].equals(matriz[i + 1][j])) && matriz[i + 1][j].equals(matriz[i + 2][j])) {
                            return true;

                        }
                    } else if (i == 1 && j == 1) {
                        if ((matriz[i - 1][j - 1].equals((matriz[i][j])) && (matriz[i][j].equals(matriz[i + 1][j + 1])) ||
                                (matriz[i - 1][j + 1].equals(matriz[i][j])) && (matriz[i][j].equals(matriz[i + 1][j - 1])) ||
                                (matriz[i - 1][j].equals(matriz[i][j])) && (matriz[i][j].equals(matriz[i + 1][j])) ||
                                (matriz[i][j - 1].equals(matriz[i][j])) && (matriz[i][j].equals(matriz[i][j + 1])))) {

                            return true;

                        }
                    } else if (i == 2 && j == 2) {
                        if ((matriz[i][j].equals(matriz[i][j - 1])) && matriz[i][j - 1].equals(matriz[i][j - 2]) ||
                                (matriz[i][j].equals(matriz[i - 1][j])) && matriz[i - 1][j].equals(matriz[i - 2][j])) {
                            return true;

                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String tablero[][]=new String[3][3];
        int jugador1Fila, jugador1Columna;
        int jugador2Fila, jugador2Columna;
        boolean ganador=false;
        boolean comprobarFicha=false;
        int jugadas=0;
        int partidas=0;
        int partidasjugadas=0;

        for (int i=0;i< tablero.length;i++){
            for (int j=0;j<tablero[0].length;j++){
                tablero[i][j]="-";
            }
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas partidas se van a jugar");
        partidas=Integer.parseInt(sc.nextLine());


        while (partidas!=partidasjugadas) {

            while (ganador == false) {

                do {
                    do {
                        pintar(tablero);
                        System.out.println("Jugador 1 elige fila");
                        jugador1Fila = Integer.parseInt(sc.nextLine());
                        System.out.println("Jugador 1 elige Columna");
                        jugador1Columna = Integer.parseInt(sc.nextLine());
                    } while ((jugador1Fila < 0 || jugador1Fila > 2) || (jugador1Columna < 0 || jugador1Columna > 2));
                    comprobarFicha = ponerFicha(tablero, jugador1Fila, jugador1Columna);
                } while (comprobarFicha == false);

                comprobarFicha = false;
                tablero[jugador1Fila][jugador1Columna] = "X";

                ganador = ganador(tablero);

                if (ganador == true) {
                    pintar(tablero);
                    System.out.println("El ganador es el jugador 1");
                    partidasjugadas++;
                    break;
                }
                jugadas++;

                if (jugadas == 9) {
                    break;
                }

                do {
                    do {
                        pintar(tablero);
                        System.out.println("Jugador 2 elige fila");
                        jugador2Fila = Integer.parseInt(sc.nextLine());
                        System.out.println("Jugador 2 elige Columna");
                        jugador2Columna = Integer.parseInt(sc.nextLine());
                    } while ((jugador2Fila < 0 || jugador2Fila > 2) || (jugador2Columna < 0 || jugador2Columna > 2));
                    comprobarFicha = ponerFicha(tablero, jugador2Fila, jugador2Columna);
                } while (comprobarFicha == false);

                comprobarFicha = false;
                tablero[jugador2Fila][jugador2Columna] = "O";
                ganador = ganador(tablero);

                if (ganador == true) {
                    pintar(tablero);
                    System.out.println("El ganador es el jugador 2");
                    partidasjugadas++;
                    break;
                }
                jugadas++;

                if (jugadas == 9) {
                    break;
                }

            }
            if (jugadas == 9) {
                pintar(tablero);
                System.out.println("Empate");
                partidasjugadas++;
            }
        }
    }
}
