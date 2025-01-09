package PrimeraEvaluacion.Clases.tema1;

import java.util.Scanner;

public class Ejercicio11_2 {
    public static void main(String[] args) {
        int numero, unidades, decenas, total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero ");
        numero = sc.nextInt();

        unidades= numero/10;
        decenas= numero%10;
        decenas=decenas*10;
        total=decenas + unidades;
        System.out.println("Tu numero invertido es " + total);

    }
}
