package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio19 {

    public static boolean primo(int n) {
        for (int i=2;i<n;i++){
            if (n%i==0){
                primo: return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero=Integer.parseInt(sc.nextLine());

        System.out.println("El numero " + numero+ " es primo " + primo(numero));
    }
}
