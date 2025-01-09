package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero=Integer.parseInt(sc.nextLine());

        for (int i=numero;i>=1;i--){
            if (numero%i==0){
                System.out.println(i);
            }
        }

    }
}
