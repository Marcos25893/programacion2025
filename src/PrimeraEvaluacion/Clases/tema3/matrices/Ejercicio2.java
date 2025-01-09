package PrimeraEvaluacion.Clases.tema3.matrices;

public class Ejercicio2 {

    public static double numero_aleatorio(double min, double max) {

        return (Math.random() * (max - min + 1)) + min;
    }

    public static void pintar(double matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Ej2 - Crea una matriz 7x3 de double. Rellenala de valores aleatorios y
        // dime la suma de cada una de las columnas

        System.out.println("Ejercicio2");

        double matriz[][]=new double[7][3];

        for(int fila=0; fila < matriz.length; fila++) {
            for(int colu=0; colu < matriz[0].length; colu++) {
                matriz[fila][colu] = numero_aleatorio(1,9);
            }
        }

        pintar(matriz);

        double sumaFila=0;

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[0].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + " = " + sumaFila);
            sumaFila = 0;
        }

        System.out.println();

        double sumCol=0;
        for(int colu=0; colu < matriz[0].length; colu++) {
            for(int fila=0; fila < matriz.length; fila++) {
                sumCol += matriz[fila][colu];
            }
            System.out.println("Columna " + colu + " = " + sumCol);
            sumCol = 0;
        }

    }
}

