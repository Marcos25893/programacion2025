package tema3.EjerciciosHoja;

public class Ejercicio15 {

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

        //Crear dos matrices 3x3 de números enteros (generadas aleatoriamente), pintarlas, sumarlas y mostrar su suma. El
        //resultado será también una matriz (suma) donde cada elemento será la suma de los elementos de las otras
        //matrices en la misma posición.

        int num1[][]=new int[3][3];
        int num2[][]=new int[3][3];
        int suma[][]=new int[3][3];

        for (int i=0;i<num1.length;i++){
            for (int j=0;j<num1[i].length;j++){
                num1[i][j]=numero_aleatorio(1,20);
            }
        }

        for (int i=0;i<num2.length;i++){
            for (int j=0;j<num2[i].length;j++){
                num2[i][j]=numero_aleatorio(1,20);
            }
        }

        for (int i=0;i<suma.length;i++){
            for (int j=0;j<suma[i].length;j++){
                suma[i][j]=num1[i][j]+num2[i][j];
            }
        }
        System.out.println("Primera matriz");
        pintar(num1);
        System.out.println("Segunda matriz");
        pintar(num2);
        System.out.println("La suma de ambos");
        pintar(suma);

    }
}
