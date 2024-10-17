package tema1;

import java.util.Scanner;

public class EjercicioEuros {
    public static void main(String[] args) {
        // Cantidad en euros pasar a dolares y pesos argentinos

        double euros, dolares, pesos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de Euros ");
        euros = sc.nextDouble();

        dolares = euros * 1.1;
        pesos = euros * 1071.75;

        System.out.println("El cambio a dolares es " + dolares + " El cambio a pesos argentinos son " + pesos);



    }
}
