package PrimeraEvaluacion.Clases.tema2.excepciones;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        int numeroAIntroduccir=0;
        int numero;
        int mayor=0;
        int menor=0;
        int media=0;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Dime cuantos numeros tengo que pedir");
            numeroAIntroduccir = Integer.parseInt(sc.nextLine());

            for(int i=1; i<=numeroAIntroduccir; i++) {
                System.out.println("Dime el numero " + i + ": ");
                numero = Integer.parseInt(sc.nextLine());
                media+=numero;

                if (i == 1) {
                    mayor = numero;
                    menor = numero;
                }
                if (mayor<numero) {
                    mayor=numero;
                }
                if (menor>numero){
                    menor=numero;
                }

            }
        }catch (NumberFormatException ex){
            System.out.println("Numero incorrecto");
        }catch (Exception ex){
            System.out.println("Error");
        }

        System.out.println("La media es " + ((double)media/numeroAIntroduccir));
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);

    }
}
