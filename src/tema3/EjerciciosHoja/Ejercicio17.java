package tema3.EjerciciosHoja;

import java.util.Arrays;

public class Ejercicio17 {

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

    public static void main(String[] args) {

        //Ordenar matrices. Crea una matriz de enteros de dos dimensiones de 50x50 elementos, rellénala con números
        //aleatorios entre 1 y 500. A continuación, realiza dos funciones:
            //a.ordenaFilas(matriz): que ordene la matriz por filas, cada fila de la matriz quedará ordenada de menor a
            //mayor.
            //b.ordenaColumnas(matriz): que ordene la matriz por columnas, cada columna quedará ordenada de
            //menor a mayor, independientemente de las demás.

        int num1[][]=new int[50][50];
        int num2[][]=new int[50][50];
        int columna[]=new int[50];
        int fila[]=new int[50];

        for (int i=0;i<num1.length;i++) {
            for (int j = 0; j < num1[i].length; j++) {
                num1[i][j]=numero_aleatorio(1,500);
                num2[i][j]=num1[i][j];
            }
        }
        pintar(num1);

        for (int i=0;i<num1.length;i++){
            for (int j=0;j<num1.length;j++) {
                fila[j] = num1[i][j];
            }
            for (int j=0;j<num1.length;j++) {
                Arrays.sort(fila);
                num1[i][j] = fila[j];
            }
        }

        System.out.println("Matriz ordenada por filas");
        pintar(num1);

        for (int j=0;j<num1.length;j++){
            for (int i=0;i<num1.length;i++) {
                columna[i] = num2[i][j];
            }
            for (int i=0;i<num1.length;i++) {
                Arrays.sort(columna);
                num2[i][j] = columna[i];
            }
        }
        System.out.println("Matriz ordenada por columnas(Matriz original)");
        pintar(num2);
    }
}
