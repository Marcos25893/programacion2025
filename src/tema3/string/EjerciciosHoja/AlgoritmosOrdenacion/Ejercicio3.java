package tema3.string.EjerciciosHoja.AlgoritmosOrdenacion;

import java.util.Arrays;

public class Ejercicio3 {

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static void pintarMatrizUna(int matriz[]){
        for (int i=0;i<matriz.length;i++){
            System.out.println(matriz[i]);
        }
    }

    public static int []agrupacionOrdenada(int matriz1[], int matriz2[], int matrizAgrupacion[]){
        for (int i=0;i< matriz1.length;i++){
            matrizAgrupacion[i]=matriz1[i];
        }
        for (int i=0;i< matriz2.length;i++){
            matrizAgrupacion[i+ matriz1.length]=matriz2[i];
        }
        Arrays.sort(matrizAgrupacion);
        return matrizAgrupacion;
    }

    public static void main(String[] args) {

        //Realiza un método que tome como parámetros de entrada dos arrays de enteros y devuelva como
        //salida un único array con los dos elementos de los anteriores arrays ordenados de forma ascendente.

        int numero1[]=new int[5];
        int numero2[]=new int[2];
        int agrupacion[]=new int[numero1.length+numero2.length];

        for (int i=0;i<numero1.length;i++){
            numero1[i]=numero_aleatorio(1,9);
        }
        for (int i=0;i<numero2.length;i++){
            numero2[i]=numero_aleatorio(1,9);
        }

        pintarMatrizUna(numero1);
        System.out.println();

        pintarMatrizUna(numero2);
        System.out.println();

        agrupacionOrdenada(numero1,numero2,agrupacion);

        pintarMatrizUna(agrupacion);

    }
}
