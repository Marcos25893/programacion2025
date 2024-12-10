package tema3.string.EjerciciosHoja.AlgoritmosOrdenacion;

import java.util.Arrays;

public class Ejercicio6 {

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static void pintarMatrizUna(int matriz[]){
        for (int i=0;i<matriz.length;i++){
            System.out.println(matriz[i]);
        }
    }

    public static int []noAlmacenados(int matriz[]){
        int noAlmacenado[] = new int[10];

        for (int i=0;i<matriz.length;i++){
            if (matriz[i]!=i){
                noAlmacenado[i]=i;
            }
        }
        return noAlmacenado;
    }

    public static void main(String[] args) {

        //Realiza un programa que cree un vector de 100 posiciones con números aleatorios entre 1 y 100. Una
        //vez creado el vector, el programa deberá ordenarlo y mostrar los números entre 1 y 100 que no han
        //sido almacenados. Ten en cuenta a la hora de buscar un número en un array que no tienes que
        //comparar con todo el array puesto que ya está ordenado.


        int numeros[]=new int[10];
        int contador=0;
        int numero=0;

        for (int i=0;i<numeros.length;i++){
            numeros[i]=numero_aleatorio(1,10);
        }

        Arrays.sort(numeros);
        pintarMatrizUna(numeros);
        System.out.println();

        for (int i=1;i<numeros.length;i++){

            if (contador < 10 && numeros[contador] == i) {
                contador++;
            } else {
                System.out.println(numero);
            }
            numero++;

        }




    }
}
