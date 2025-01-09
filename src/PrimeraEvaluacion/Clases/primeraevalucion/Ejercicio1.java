package PrimeraEvaluacion.Clases.primeraevalucion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static void pintar(int matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Metodo que sirve para pintar el menú
     */
    public static void menu(){
        System.out.println("1.Intercambiar columna");
        System.out.println("2.Suma de una fila");
        System.out.println("3.Comprobar si la diagonal principal y la inversa son iguales");
        System.out.println("4.Coordenadas del menor elemento");
        System.out.println("5.Muestra la matriz con las filas ordenadas de menor a mayor");
        System.out.println("6.Salir");
    }

    /**
     * Cambia de lugar una columna con otra
     * @param matriz
     * @param columna1
     * @param columna2
     * @return
     */
    public static int[][] cambiarColumna(int matriz[][], int columna1, int columna2){
        int variable=0;
        for (int i=0;i< matriz.length;i++){
            variable=matriz[i][columna1];
            matriz[i][columna1]=matriz[i][columna2];
            matriz[i][columna2]=variable;
        }

        return matriz;
    }

    /**
     * Suma todos los numeros de la fila que indiquemos
     * @param matriz
     * @param fila
     */
    public static void sumarFila(int matriz[][],int fila){
        int suma=0;
        for (int j=0;j<matriz[0].length;j++){
            suma+=matriz[fila][j];
        }

        System.out.println("La suma de la fila " + fila + " es " + suma);
    }

    /**
     * Comprueba si la diagonal principal y la inversa son iguales
     * @param matriz
     * @return
     */
    public static boolean diagonales(int matriz[][]){
        boolean diagonal=true;
        int diagonalP=0;
        int diagonalS=0;
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++) {
                if (i == j) {
                    diagonalP = matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    diagonalS = matriz[i][j];
                }
                if (diagonalP!=diagonalS){
                    diagonal=false;
                    return diagonal;
                }
            }
        }
        return diagonal;
    }

    /**
     * Busca el numero mas pequeño de la matriz y te devuelve sus coordenadas
     * @param matriz
     * @return
     */
    public static String menorMatriz(int matriz[][]){
        int menor=matriz[0][0];
        int cordenadaX=0;
        int cordenadaY=0;
        String coordenada;
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                if (menor>matriz[i][j]){
                    menor=matriz[i][j];
                    cordenadaX=i;
                    cordenadaY=j;
                }
            }
        }
        coordenada= String.valueOf(cordenadaX+ "-" + cordenadaY);
        return coordenada;
    }

    /**
     * Ordena las filas de menor a mayor
     * @param matriz
     */
    public static void OrdenarFilas(int matriz[][]){
        for (int i=0;i< matriz.length;i++){
            Arrays.sort(matriz[i]);
        }
        pintar(matriz);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][]=new int[20][20];
        int opciones =0;
        int columna1;
        int columna2;
        int sumaFila;

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                matriz[i][j]=numero_aleatorio(1,100);
            }
        }

        pintar(matriz);

        while (opciones !=6){
            try {
                menu();
                opciones = Integer.parseInt(sc.nextLine());

                switch (opciones) {
                    case 1:
                        System.out.println("Dime una columna que quieras cambiar");
                        columna1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Dime ahora la otra columna que quieras cambiar");
                        columna2 = Integer.parseInt(sc.nextLine());
                        cambiarColumna(matriz, columna1, columna2);
                        pintar(matriz);
                        break;
                    case 2:
                        System.out.println("Dime una fila que quieras sumar sus valores");
                        sumaFila = Integer.parseInt(sc.nextLine());
                        sumarFila(matriz, sumaFila);
                        break;
                    case 3:
                        System.out.println("La matriz principal es igual a la inversa " + diagonales(matriz));
                        break;
                    case 4:
                        System.out.println("La coordenada del menor es " + menorMatriz(matriz));
                        break;
                    case 5:
                        OrdenarFilas(matriz);
                        break;
                    case 6:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("El valor tiene que estar entre 1 y 6");
                        break;
                }
            }catch (Exception ex){
                System.out.println("Error, no es valido");
            }
        }

    }
}
