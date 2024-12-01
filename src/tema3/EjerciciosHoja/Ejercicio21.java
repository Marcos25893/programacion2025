package tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio21 {

    public static int numero_aleatorio(int min , int max){

        return (int) (Math.random()*(max-min+1) )+min;
    }

    public static void pintar(int matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrizTraspuesta(int[][] matriz, int longitudcolumna, int[][] traspuesta){
        int columna[]=new int[longitudcolumna];

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[0].length;j++){
                columna[j]=matriz[i][j];
            }
            for (int j=0;j< matriz[0].length;j++){
                traspuesta[j][i]=columna[j];
            }
        }


        return traspuesta;
    }

    public static void main(String[] args) {

        int longitudfila,longitudcolumna;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas filas va a tener la matriz");
        longitudfila=Integer.parseInt(sc.nextLine());
        System.out.println("Cuantas columnas va a tener la matriz");
        longitudcolumna=Integer.parseInt(sc.nextLine());

        int matriz[][]=new int[longitudfila][longitudcolumna];
        int traspuesta[][]=new int[longitudcolumna][longitudfila];


        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[0].length;j++){
                matriz[i][j]=numero_aleatorio(0,9);
            }
        }
        pintar(matriz);
        System.out.println();

        pintar(matrizTraspuesta(matriz,longitudcolumna,traspuesta));

    }
}
