package tema3.string.EjerciciosHoja.AlgoritmosOrdenacion;

import java.util.Arrays;

public class Ejercicio6 {

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static void pintarMatrizUna(int matriz[]){
        for (int i=0;i<matriz.length;i++){
            System.out.print(matriz[i] +  " ");
        }
    }

    public static void main(String[] args) {

        //Realiza un programa que cree un vector de 100 posiciones con números aleatorios entre 1 y 100. Una
        //vez creado el vector, el programa deberá ordenarlo y mostrar los números entre 1 y 100 que no han
        //sido almacenados. Ten en cuenta a la hora de buscar un número en un array que no tienes que
        //comparar con todo el array puesto que ya está ordenado.

        int numeros[]=new int[100];

        for (int i=0;i<numeros.length;i++){
            numeros[i]=numero_aleatorio(1,100);
        }

        Arrays.sort(numeros);
        pintarMatrizUna(numeros);
        System.out.println();

        boolean encontrado;
        for (int i=1;i<=100;i++){
            encontrado=false;
            for (int j=0;j<numeros.length;j++){
                if (i==numeros[j]){
                    encontrado=true;
                    break;
                }
                if (numeros[j]>i){
                    break;
                }
            }
            if (encontrado==false){
                System.out.println(i);
            }
        }

    }
}
