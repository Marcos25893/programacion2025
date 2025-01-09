package PrimeraEvaluacion.Clases.tema3.EjerciciosHoja;

public class Ejercicio10 {

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) )+min;
    }

    public static void main(String[] args) {

        int loteria[]=new int[6];

        for (int i=0;i< loteria.length;i++){
            loteria[i]=numero_aleatorio(1,49);
            for (int j=0;j< i;j++){
                while (loteria[i]==loteria[j]){
                    loteria[i]=numero_aleatorio(1,49);
                    j=0;
                }
            }
        }

        for (int i=0;i< loteria.length;i++){
            System.out.println(loteria[i]);
        }
    }
}
