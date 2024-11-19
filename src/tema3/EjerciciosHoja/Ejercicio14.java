package tema3.EjerciciosHoja;

public class Ejercicio14 {

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static void pintar(int matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Crear una matriz 5x3 de números enteros (aleatorios) y mostrar el menor, el mayor y la media de los elementos.

        int matriz[][]=new int[5][3];
        int mayor=0;
        int menor=0;
        int contador=0;
        int suma=0;
        double media;

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                matriz[i][j]=numero_aleatorio(1,30);
                if (i==0 && j==0){
                    menor=matriz[i][j];
                }
                if (matriz[i][j]>mayor){
                    mayor=matriz[i][j];
                }
                if (matriz[i][j]<menor){
                    menor=matriz[i][j];
                }
                suma+=matriz[i][j];
                contador++;
            }
        }
        media=(double) suma/contador;

        pintar(matriz);
        System.out.println("La media de los numeros es " + media);
        System.out.println("El mayor de los numeros es " + mayor);
        System.out.println("El menor de los numeros es " + menor);

    }
}
