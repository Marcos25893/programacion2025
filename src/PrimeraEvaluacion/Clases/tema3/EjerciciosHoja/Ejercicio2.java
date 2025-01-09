package PrimeraEvaluacion.Clases.tema3.EjerciciosHoja;

public class Ejercicio2 {

    public static int numero_aleatorio(int min , int max){
        return(int) (Math.random()*(max-min+1) )+min;
    }

    public static void main(String[] args) {

        int numero[]=new int[10];
        int tercera;

        for (int i=0;i<numero.length;i++){
            numero[i]=numero_aleatorio(0,30);
        }

        for (int i=0;i<numero.length;i++){
            System.out.println(numero[i]);
        }
        System.out.println();

        tercera=numero[0];
        numero[0]=numero[9];
        numero[9]=tercera;

        for (int i=0;i<numero.length;i++){
            System.out.println(numero[i]);
        }


    }
}
