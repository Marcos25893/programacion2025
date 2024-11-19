package tema3.EjerciciosHoja;

public class Ejercicio16 {

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

    public static boolean buscar(int matriz[][], int num1){
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                if (matriz[i][j]==num1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        //Crea una matriz de 3x6 números enteros aleatorios no repetidos.

        int matriz[][]= new int[3][6];
        int numero=0;

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                do {
                    numero=numero_aleatorio(1,18);
                }while (buscar(matriz,numero));
                matriz[i][j]=numero;
            }
        }

        pintar(matriz);

    }
}
