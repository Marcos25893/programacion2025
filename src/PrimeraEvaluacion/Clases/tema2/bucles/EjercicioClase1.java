package PrimeraEvaluacion.Clases.tema2.bucles;

public class EjercicioClase1 {
    public static void main(String[] args) {

        //Dados dos numeros numero1 y numero2, dime cuantos multiplos de 5 hay entre ellos;

        int numero1=120;
        int numero2=327;
        int contador=0;
        int temp;

        //Que pasa si numero1 es mayor que numero2
        if (numero1>numero2) {
            //si el numero 1 fuera mayor habria que intercambiar los numeros
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        for (int i=numero1; i<=numero2; i++ ) {
            if (i % 5 == 0) {
                contador++;

            }
        }

        System.out.println("Múltiplos de 5 hay: " + contador);
    }
}
