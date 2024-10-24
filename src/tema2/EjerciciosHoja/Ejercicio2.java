package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean multiplo(int a, int b){
        return a % b == 0;
    }

    public static void main(String[] args) {

        int num1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        num1=Integer.parseInt(sc.nextLine());

        System.out.println("El numero " +num1 + " es muliplo de 2 " + multiplo(num1,2));
        System.out.println("El numero " +num1 + " es muliplo de 3 " + multiplo(num1,3));
        System.out.println("El numero " +num1 + " es muliplo de 5 " + multiplo(num1,5));
        System.out.println("El numero " +num1 + " es muliplo de 7 " + multiplo(num1,7));

    }
}
