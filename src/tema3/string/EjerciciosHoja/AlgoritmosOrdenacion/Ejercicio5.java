package tema3.string.EjerciciosHoja.AlgoritmosOrdenacion;

import java.util.Arrays;

public class Ejercicio5 {

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static void pintarMatrizUna(int matriz[]){
        for (int i=0;i<matriz.length;i++){
            System.out.println(matriz[i]);
        }
    }

    public static int []diezMayoresMatriz(int matriz[], int mayores[]){
        Arrays.sort(matriz);
        for (int i=0;i<mayores.length;i++){
            mayores[i]=matriz[matriz.length-(1+i)];
        }
        return mayores;
    }

    public static void main(String[] args) {

        //Realiza un programa que cree 100 números aleatorios entre 1 y 1000 y que muestre los 10 mayores.

        int numero[]=new int[100];
        int mayores[]=new int[10];

        for (int i=0;i<numero.length;i++){
            numero[i]=numero_aleatorio(1,1000);
        }

        Arrays.sort(numero);

        pintarMatrizUna(numero);
        System.out.println();
        mayores=diezMayoresMatriz(numero,mayores);
        pintarMatrizUna(mayores);


    }
}
