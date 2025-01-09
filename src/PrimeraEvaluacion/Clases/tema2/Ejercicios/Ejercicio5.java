package PrimeraEvaluacion.Clases.tema2.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int ano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un año");
        ano= sc.nextInt();

        if (((ano % 4==0) && (ano%100!=0 || ano%400==0))){
            System.out.println("El año es bisisesto");
        } else {
            System.out.println("No es un año bisisesto");
        }
    }
}