package PrimeraEvaluacion.Clases.tema2.bucles;

public class EjercicioClase2 {
    public static void main(String[] args) {
        //Tenemos que pintar la siguiente figura
        // 10000000
        // 01000000
        // 00100000
        // 00010000
        // 00001000
        // 00000100
        // 00000010
        // 00000001

        //Un for dentro de otro for
        //El for con i lleva las filas
        //EL for con j lleva las columnas

        for (int i=0; i<8; i++){

            for (int j=0; j<8; j++){
                if (i==j){
                    System.out.print(1);
                }else System.out.print(0);  //Cuando dejamos print sin el ln no salta a la siguiente linea
            }
            System.out.println(); //Usamos este println para que baje a la siguiente linea
        }


    }
}
