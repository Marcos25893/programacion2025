package PrimeraEvaluacion.Clases.tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio13 {

    public static void pintar(int matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Crear una tabla bidimensional de tamaño 3x4 de números enteros (leídos desde teclado). Mostrar la matriz y la
        //suma de los valores de cada fila.

        int tabla[][]= new int[3][4];
        int suma[]=new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i=0;i< tabla.length;i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("Dime que numero quieres en la fila " + i + " y la columna " + j);
                tabla[i][j]=Integer.parseInt(sc.nextLine());
                suma[i]+=tabla[i][j];

            }
        }

        pintar(tabla);
        for (int i=0;i< suma.length;i++){
            System.out.println("La suma de la fila " + i + " es " + suma[i]);
        }

    }
}
