package tema3.string.EjerciciosHoja.AlgoritmosOrdenacion;

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
        int noAlmacenado[]=new int[100];

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){

            }
        }
        return noAlmacenado;
    }

    public static void main(String[] args) {

        //Realiza un programa que cree un vector de 100 posiciones con números aleatorios entre 1 y 100. Una
        //vez creado el vector, el programa deberá ordenarlo y mostrar los números entre 1 y 100 que no han
        //sido almacenados. Ten en cuenta a la hora de buscar un número en un array que no tienes que
        //comparar con todo el array puesto que ya está ordenado.

        int numeros[]=new int[100];
        int faltantes[];

        for (int i=0;i<numeros.length;i++){
            numeros[i]=numero_aleatorio(1,100);
        }
        faltantes =noAlmacenados(numeros);

        for (int i=0;i<numeros.length;i++){
            System.out.println(faltantes[i]);
        }


    }
}
