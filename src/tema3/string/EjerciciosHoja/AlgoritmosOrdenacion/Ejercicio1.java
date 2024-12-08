package tema3.string.EjerciciosHoja.AlgoritmosOrdenacion;

import java.util.Arrays;

public class Ejercicio1 {

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static int [] ordenacionBurbuja(int matriz[]){
        int comparador;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j< matriz.length-(1+i);j++) {
                if (matriz[j] > matriz[j+1]) {
                    comparador = matriz[j];
                    matriz[j] = matriz[j+1];
                    matriz[j+1] = comparador;

                }
            }
        }
        return matriz;
    }

    public static void main(String[] args) {

        //Realiza un programa que cree un array de 50 posiciones cargado con valores aleatorios. Los valores
        //aleatorios deberán estar entre el 1 y el 100. Una vez cargado el vector, deberá ordenarlo mediante el
        //método de la burbuja y mostrarlo ordenado por pantalla. Para el método de la burbuja deberás crear
        //una función que reciba un array de números y lo devuelva ordenado.


        int numeros[]=new int[50];

        for (int i=0;i<numeros.length;i++){
            numeros[i]=numero_aleatorio(1,100);

        }

        ordenacionBurbuja(numeros);

        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

    }
}
