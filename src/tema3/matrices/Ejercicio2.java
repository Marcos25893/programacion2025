package tema3.matrices;

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
        double sumaColumnas=0;
        double sumaFilas=0;

        for (int j=0;j<matriz[0].length;j++){
            for (int i=0;i<matriz.length;i++){
                matriz[i][j]=numero_aleatorio(1.0,9.0);
                sumaFilas+=matriz[i][j];
            }
            System.out.println("Suma de las filas "+ j + " " + sumaFilas);
            sumaFilas=0;
        }

        System.out.println();

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                sumaColumnas+=matriz[i][j];
            }
            System.out.println("Suma de la columna " + i + " " + sumaColumnas);
            sumaColumnas=0;
        }

        pintar(matriz);
    }
}

