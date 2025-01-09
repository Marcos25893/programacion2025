package PrimeraEvaluacion.Clases.tema3.EjerciciosHoja;

public class Ejercicio11 {

    public static void pintar(int matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Crear una tabla bidimensional de tamaño 5x5 y rellenarla de forma que los elementos de la diagonal principal
        //sean 1 y el resto 0. Mostrarla.

        int numero[][]=new int[5][5];

        for (int i=0;i< numero.length;i++) {
            for (int j = 0; j < numero[i].length; j++) {
                if (i==j){
                    numero[i][j]=1;
                }
            }
        }

        pintar(numero);

    }
}
