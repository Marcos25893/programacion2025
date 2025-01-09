package PrimeraEvaluacion.Clases.tema3.EjerciciosHoja;

public class Ejercicio18 {

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

        int tabla[][]=new int[4][5];
        int sumaFilas=0, sumaColumnas=0, sumaTotal=0;
        int suma[][]=new int[5][6];

        for (int i=0;i<tabla.length;i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j]=numero_aleatorio(0,20);
                suma[i][j]=tabla[i][j];
            }
        }
        pintar(tabla);

        for (int i=0;i<tabla.length;i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                sumaFilas+=tabla[i][j];
            }
            suma[i][suma[i].length-1]=sumaFilas;
            sumaTotal+=sumaFilas;
            sumaFilas=0;
        }

        for (int j=0;j<tabla[0].length;j++) {
            for (int i = 0; i < tabla.length; i++) {
                sumaColumnas+=tabla[i][j];
            }
            suma[suma.length-1][j]=sumaColumnas;
            sumaTotal+=sumaColumnas;
            sumaColumnas=0;
        }

        suma[suma.length-1][tabla[0].length]=sumaTotal; //A la j que tiene el valor de longitudJ no hay que restarle ya que es la longitud de la otra matriz(tabla)
        System.out.println("Excel");              // que ya es una columna mas pequeña que la matriz suma.
        pintar(suma);

    }
}
