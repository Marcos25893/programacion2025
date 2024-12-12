package primeraevalucion;

import java.util.Scanner;

public class Ejercicio4 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) )+min;
    }

    /**
     * Sirve para pintar el array
     * @param matriz
     */
    public static void pintar(String matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Rellena todo el tablero con "-"
     * @param tablero
     * @return
     */
    public static String[][] pintarTablero(String tablero[][]){
        for (int i=0;i< tablero.length;i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "-";
            }
        }
        return tablero;
    }

    /**
     * Comprueba si las coordenadas que le hemos puesto hemos acertado o no
     * Si acertamos pinta tesoro y si fallamos pinta fallo
     * @param tablero
     * @param x
     * @param y
     * @param tesoroX
     * @param tesoroY
     * @return
     */
    public static String[][] disparo(String tablero[][], int x, int y, int tesoroX, int tesoroY){
        if (tesoro(tablero,x,y,tesoroX,tesoroY)==false) {
            tablero[x][y] = "fallo";
        }else tablero[x][y] = "tesoro";
        return tablero;
    }

    /**
     * Comprueba si hemos encontrado el tesoro
     * @param tablero
     * @param x
     * @param y
     * @param tesoroX
     * @param tesoroY
     * @return
     */
    public static boolean tesoro(String tablero[][], int x, int y, int tesoroX, int tesoroY){
        boolean tesoro;
        if (x==tesoroX && y==tesoroY) {
            tesoro=true;
        }else tesoro=false;
        return tesoro;
    }

    /**
     * Coge la distancia anterior y la nueva y las compara para decirnos
     * si estamos mas cerca o mas lejos del tesoro
     * @param tablero
     * @param x
     * @param y
     * @param tesoroX
     * @param tesoroY
     * @param anteriorDistancia
     * @return
     */
    public static int pista(String tablero[][], int x, int y, int tesoroX, int tesoroY, int anteriorDistancia){
        int distancia;

        distancia= Math.abs(tesoroX-x)+ Math.abs(tesoroY-y);
        if (distancia<anteriorDistancia){
            System.out.println("Estas mas cerca del tesoro");
        } else if (distancia>anteriorDistancia) {
            System.out.println("Estas mas lejos del tesoro");
        }else System.out.println("Estas a la misma distancia");

        return distancia;

    }

    public static void main(String[] args) {

        String tablero[][]=new String[10][10];
        int tesoroX=0;
        int tesoroY=0;
        int intento=0;
        int coordenadaX=0;
        int coordenadaY=0;
        int distancia=0;
        boolean encontrarTesoro=false;

        Scanner sc = new Scanner(System.in);

        tesoroX=numero_aleatorio(0,9);
        tesoroY=numero_aleatorio(0,9);

        pintarTablero(tablero);
        System.out.println(tesoroX + " " + tesoroY);


        while (intento!=15 && !encontrarTesoro){
            try {
                pintar(tablero);
                System.out.println("Dime coordenada X");
                coordenadaX = Integer.parseInt(sc.nextLine());
                System.out.println("Dime coordenada Y");
                coordenadaY = Integer.parseInt(sc.nextLine());
                disparo(tablero, coordenadaX, coordenadaY, tesoroX, tesoroY);
                if (!tesoro(tablero, coordenadaX, coordenadaY, tesoroX, tesoroY)) {
                    intento++;
                    distancia = pista(tablero, coordenadaX, coordenadaY, tesoroX, tesoroY, distancia);
                } else {
                    encontrarTesoro = true;
                }
            }catch (Exception ex){
                System.out.println("Coordenada no valida");
            }

        }
        if (encontrarTesoro){
            System.out.println("Ganaste conseguiste el tesoro");
        }else System.out.println("Perdiste, te quedaste sin intentos");


    }
}

