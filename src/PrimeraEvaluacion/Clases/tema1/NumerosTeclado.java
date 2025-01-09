package PrimeraEvaluacion.Clases.tema1;

import java.util.Scanner;

public class NumerosTeclado {
    public static void main(String[] args) {
        double numero1, numero2, suma;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge un numeros ");
        numero1 = sc.nextDouble();

        System.out.println("Escoge otro numero ");
        numero2 = sc.nextDouble();

        suma = numero1 + numero2;
        System.out.println("La suma de esos dos numeros es " + suma);

    }
}
