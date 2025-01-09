package PrimeraEvaluacion.Clases.tema2.bucles;

public class Factorial {
    public static void main(String[] args) {

        //Calcular el factorial de un numero. Que es el producto de todos los numeros
        //anteriores a el hasta el 1
        //Factorial
        //5! = 5 * 4 * 3 * 2 * 1
        //3! = 3 * 2 * 1

        int factorial=8;
        long total=1; //Si el numero factorial seria muy grande habria que usar un double en vez del long
                     //para que no se pierdan digitos

        for (int i=8; i>=1; i--){
            total= total*i;
            System.out.println("Factorial: " + i + " " + (total));
        }
        System.out.println("El factorial de 8 es " + total);
    }
}
