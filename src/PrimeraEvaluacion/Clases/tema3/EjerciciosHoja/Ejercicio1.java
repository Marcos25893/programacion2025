package PrimeraEvaluacion.Clases.tema3.EjerciciosHoja;

public class Ejercicio1 {

    public static int numero_aleatorio(int min , int max){
        return(int) (Math.random()*(max-min+1) )+min;
    }

    public static void main(String[] args) {

    int numero[]=new int[20];

    for (int i=0;i<numero.length;i++){
        numero[i]=numero_aleatorio(-100,100);
    }

    for (int i=0;i<numero.length;i++){
        System.out.println(numero[i]);
    }

    }
}
