package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        int numero;
        int mutiplicar;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero=Integer.parseInt(sc.nextLine());

        for (int i=0;i<=10;i++){
            mutiplicar=numero*i;
            System.out.println(numero + " x " + i + " = " + mutiplicar);
        }
    }
}
