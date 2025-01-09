package PrimeraEvaluacion.Clases.tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto;
        int mitad;

        System.out.println("Dime un texto");
        texto=sc.nextLine();

        mitad=texto.length()/2;

        System.out.println(texto.substring(0,mitad));

    }
}
