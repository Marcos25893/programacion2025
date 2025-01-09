package PrimeraEvaluacion.Clases.tema3.EjerciciosHoja;

public class Ejercicio12 {

    public static void pintar(int matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Crear una matriz “marco” de tamaño 8x6. Una matriz “marco” es aquella que todos sus elementos son 0 salvo los
        //de los bordes que deben ser 1. Mostrarla.

        int marco[][]=new int[8][6];


        for (int i=0;i< marco.length;i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if ((i==0 || i== marco.length-1) || (j==0 || j== marco[i].length-1)){
                    marco[i][j]=1;
                }
            }
        }

        pintar(marco);
    }
}
