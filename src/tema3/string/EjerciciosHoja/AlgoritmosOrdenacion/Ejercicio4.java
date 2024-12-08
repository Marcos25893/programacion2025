package tema3.string.EjerciciosHoja.AlgoritmosOrdenacion;

public class Ejercicio4 {

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static void pintarMatrizUna(int matriz[]){
        for (int i=0;i<matriz.length;i++){
            System.out.println(matriz[i]);
        }
    }

    public static int menorMatriz(int matriz[]){
        int menor=matriz[0];
        for (int i=0;i<matriz.length;i++){
            if (menor>matriz[i]){
                menor=matriz[i];
            }
        }
        return menor;
    }

    public static int mayorMatriz(int matriz[]){
        int mayor=0;
        for (int i=0;i<matriz.length;i++){
            if (mayor<matriz[i]){
                mayor=matriz[i];
            }
        }
        return mayor;
    }

    public static double mediaMatriz(int matriz[]){
        double media=0;
        int contador=0;
        for (int i=0;i<matriz.length;i++){
            media+=matriz[i];
            contador++;
        }
        media=media/contador;
        return media;
    }

    public static void main(String[] args) {

        //Realiza un programa que cree un vector de 50 posiciones con número aleatorios entre 1 y 50. Una vez
        //creado el vector, el programa deberá mostrar el mayor, el menor y la media de los valores almacenados
        //en el array.

        int numero[]=new int[50];
        int menor=0;
        int mayor=0;
        double media=0;

        for (int i = 0; i< numero.length; i++){
            numero[i]=numero_aleatorio(1,50);
        }

        pintarMatrizUna(numero);

        menor=menorMatriz(numero);
        mayor=mayorMatriz(numero);
        media=mediaMatriz(numero);

        System.out.println("El numero mas pequeño es " + menor + ", el numero mas grande es " + mayor + " y la media es " + media);




    }
}
