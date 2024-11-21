package tema3.EjercicioClase;

public class Ejercicio2 {

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

    public static boolean continuo(int matriz[][]){

        for (int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i!= matriz.length-1 && j!=matriz[0].length-1) {
                    if (matriz[i][j] == 1 && matriz[i][j + 1] == 1 && matriz[i + 1][j] == 1 && matriz[i + 1][j + 1] == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //2. Simulación sensores de movimiento
        //Un edificio tiene una matriz de sensores de movimiento simulando una sala.
        //Tendría una matriz de 5x5, total 25 sensores. Si tiene un 0 una casilla
        //es que no hay movimiento, si tiene 1, es que sí hay movimiento
        //- Genera aleatoriamente el estado de los sensores de la sala
        //- Calcula cuántos sensores están activados
        //- Identifica si hay una región de movimiento contínuo, es decir al menos un bloque 2x2 con
        //todos los sensores activados.

        int sala[][]=new int[5][5];
        int sensores=0;

        for (int i=0;i<sala.length;i++) {
            for (int j = 0; j < sala.length; j++) {
                sala[i][j]=numero_aleatorio(0,1);
            }
        }
        pintar(sala);

        for (int i=0;i<sala.length;i++) {
            for (int j = 0; j < sala.length; j++) {
                if (sala[i][j]==1){
                    sensores++;
                }
            }
        }

        System.out.println("Hay activados " + sensores + " sensores");
        System.out.println("Hay algun movimiento continuo " + continuo(sala));
    }
}
