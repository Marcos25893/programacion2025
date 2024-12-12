package tema3.RepasoExamen.Resueltos;

import java.util.Arrays;

public class Examen4 {
    public static void pintarTablero(String tablero[][]) {
        for(String linea[]: tablero) {
            System.out.println(Arrays.toString(linea));
        }
    }
    public static void colocarBarco(int x, int y, String direccion, int longitud, String letra, String tablero[][]) {
        if (comprobarBarco(x, y, direccion, longitud, tablero)) {
            int dx = 0;
            int dy = 0;
            switch (direccion) {
                case "arriba":
                    dx = -1;
                    break;
                case "abajo":
                    dx = 1;
                    break;
                case "derecha":
                    dy = 1;
                    break;
                case "izquierda":
                    dy = -1;
                    break;

                default:
                    break;
            }
            int a = x;
            int b = y;
            for(int i=0; i < longitud; i++) {
                tablero[a][b] = letra;
                a += dx;
                b += dy;
            }
        } else {
            System.out.println("No se puede poner barco");
        }

    }
    public static boolean colocarBarco2(int x, int y, String direccion, int longitud, String letra, String tablero[][]) {
        int dx = 0;
        int dy = 0;
        switch (direccion) {
            case "arriba":
                dx = -1;
                break;
            case "abajo":
                dx = 1;
                break;
            case "derecha":
                dy = 1;
                break;
            case "izquierda":
                dy = -1;
                break;

            default:
                break;
        }
        int a = x;
        int b = y;
        try {
            for(int i=0; i < longitud; i++) {
                if (tablero[a][b].equals("a")) {
                    a += dx;
                    b += dy;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No puedo colocar barco");
            return false;
        }
        a = x;
        b = y;
        try {
            for(int i=0; i < longitud; i++) {
                tablero[a][b] = letra;
                a += dx;
                b += dy;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No puedo colocar barco");
            return false;
        }


        return true;
    }
    public static boolean comprobarBarco(int x, int y, String direccion, int longitud, String tablero[][]) {
        boolean sePuede = true;
        switch (direccion) {
            case "arriba":
                if (x - longitud < 0)
                    return false;
                break;
            case "abajo":
                if (x + longitud > tablero.length)
                    return false;
                break;
            case "derecha":
                if (y + longitud > tablero.length)
                    return false;
                break;
            case "izquierda":
                if (y - longitud < 0)
                    return false;
                break;

            default:
                break;
        }
        return sePuede;
    }
    public static boolean disparar(int x, int y, String tablero[][]) {
        if (tablero[x][y].equals("a")) {
            tablero[x][y] = "x";
            return false;
        } else {
            tablero[x][y] = "x";
            return true;
        }
    }
    public static void main(String[] args) {

        String tablero[][] = new String[10][10];
        for(int i=0; i<tablero.length; i++) {
            Arrays.fill(tablero[i], "a");
        }
        pintarTablero(tablero);
        System.out.println();
        colocarBarco(3,3, "abajo", 4, "p", tablero );
        pintarTablero(tablero);
        colocarBarco(4,4, "derecha", 4, "c", tablero );

        System.out.println();
        pintarTablero(tablero);
        colocarBarco(8,8, "abajo", 3, "s", tablero );
        colocarBarco(1,8, "arriba", 3, "s", tablero );
        colocarBarco(8,8, "derecha", 3, "s", tablero );
        colocarBarco(8,1, "izquierda", 3, "s", tablero );

        System.out.println();
        pintarTablero(tablero);
        System.out.println(disparar(4,4,tablero));
        System.out.println(disparar(0,0, tablero));
        System.out.println();
        pintarTablero(tablero);
    }
    // Nos piden crear una matriz 10×10 de caracteres, que inicialmente rellenaremos
    //con la letra ‘a’ (agua). Vamos, ha simular el juego “Batalla Naval”. Tienes que implementar:
    //8. Un método pintarTablero(char[][] tablero): que pinte toda la matriz.
    //9. Un método colocarBarco(int x, int y, String dirección, int longitudBarco, char letra,
    //char[][] tablero): este método pintará la letra indicada en la posición (x,y) del
    //tablero indicada. Además, en la dirección que se le pase (“Izquierda”, “Derecha”,
    //“Arriba”, “Abajo”), continuará pintando esa misma letra, tantas posiciones como
    //indique longitudBarco. Importante: debes comprobar que el barco se puede colocar
    //y no se sale del tablero, llamando al siguiente método.
    //10. Un método comprobarBarco(int x, int y, String direccion, int longitudBarco, char[][]
    //tablero): comprobará si el barco se puede poner, cabe, en la posición y dirección
    //indicada. Devuelve false si no se puede poner, y true si se puede colocar.
    //11. Un método disparar(int x, int y, char[][] tablero): devolverá false si en esa posición
    //hay agua, y true si en esa posición hay un barco. Pondrá una ‘x’ en esa posición.
    //Haz un main, donde se coloque un barco de longitud 2 con la letra ‘l’ (lancha), uno de
    //longitud 3 con la letra ‘s’ (submarino), uno de longitud 4 con la letra ‘c’ (crucero) y uno de
    //longitud 4 con la letra ‘p’ (portaaviones). Dispara a un barco. Pinta el tablero.
}
