package PrimeraEvaluacion.Clases.tema3.matrices;

public class Ejercicio1 {

    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void pintar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        //Ej1 - Crea un matriz 6x6 de enteros. Rellenala de valores aleatorios y
        // dime la suma de la diagonal principal y de la diagonal secundaria

        int numero[][] = new int[6][6];
        int diagonalP = 0, diagonalS = 0;

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[0].length; j++) {
                numero[i][j] = numero_aleatorio(1, 9);
            }
        }

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[0].length; j++) {
                if (i == j) {
                    diagonalP += numero[i][j];
                }
                if (i + j == numero.length - 1) {
                    diagonalS += numero[i][j];
                }
            }
        }

        pintar(numero);
        System.out.println("Diagonal Principal " + diagonalP);
        System.out.println("Diagonal Secundaria " + diagonalS);

    }
}
