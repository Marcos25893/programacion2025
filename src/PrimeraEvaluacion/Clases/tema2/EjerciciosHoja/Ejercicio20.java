package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio20 {

    public static boolean primo(int n) {
        return Ejercicio19.primo(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero=Integer.parseInt(sc.nextLine());

        for (int i=numero;i>0;i--){
            if (primo(i)){
                System.out.println(i);
            }
        }
    }
}
