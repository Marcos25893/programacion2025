package tema3.string.EjerciciosHoja.AlgoritmosOrdenacion;

public class Ejercicio2 {

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static int [] ordenacionBurbujaMejorada(int matriz[]){
        int comparador;
        boolean centinela=false;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j< matriz.length-(1+i);j++) {
                if (matriz[j] > matriz[j+1]) {
                    comparador = matriz[j];
                    matriz[j] = matriz[j+1];
                    matriz[j+1] = comparador;
                    centinela=true;
                }
            }
            if (centinela==false){
                break;
            }
            centinela=false;
        }
        return matriz;
    }

    public static void main(String[] args) {

        //Mejora el método de la burbuja explicado anteriormente y utiliza una variable a modo de centinela o
        //flag, de tal manera que ésta se active cuando hay algún intercambio. En el momento que no haya
        //ningún intercambio, el algoritmo debería parar puesto que el vector ya está ordenado.

        int numeros[]=new int[50];

        for (int i=0;i<numeros.length;i++){
            numeros[i]=numero_aleatorio(1,100);

        }

        ordenacionBurbujaMejorada(numeros);

        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

    }
}
