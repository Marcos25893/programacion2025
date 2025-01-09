package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        double factorial=1;

        System.out.println("Dime un numero que quieras sacar su factorial");
        numero=Integer.parseInt(sc.nextLine());

        for (int i=numero;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
