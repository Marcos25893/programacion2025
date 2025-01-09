package PrimeraEvaluacion.Clases.tema3.arrays;

public class Ejercicio3 {

    public static int tirada(int mayor, int menor){
        return (int)(Math.random()*(mayor-menor+1)+menor);
    }

    public static boolean primo(int n) {
        boolean primo = true;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                primo = false;
                break;
            }
        }
        return primo;
    }

    public static void main(String[] args) {

        //Genera un array de 20 números enteros(entre 1 y 1000)
        //Muestra sólo aquellos que sean primos

        int numeros[]= new int[20];

        for (int i=0; i < numeros.length; i++){
            numeros[i]=tirada(1000,1);
            if (primo(numeros[i]))
                System.out.println(numeros[i]);
        }
    }
}
