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

    public static void main(String[] args) {

        //Crea una matriz de 3x6 números enteros aleatorios no repetidos.

        int matriz[][]= new int[3][6];
        int comparar[][]= new int[3][6];

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j]=numero_aleatorio(1,18);
                comparar[i][j]=matriz[i][j];
            }
        }

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                for (int x=0;x< i;x++){
                    for (int y=0;y<j;y++){
                        while (matriz[i][j]==comparar[x][y]){
                            matriz[i][j]=numero_aleatorio(1,18);
                            comparar[i][j]=matriz[i][j];
                            x=0;
                            y=0;
                        }
                    }
                }
            }
        }

        pintar(matriz);

    }
}
