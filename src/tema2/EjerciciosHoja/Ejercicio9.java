package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        int numero = 0;
        int contador = 1;
        int numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = Integer.parseInt(sc.nextLine());
        numero2=numero;

        while (numero > 10) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("El numero " + numero2 + " tiene " + contador + " digitos");
    }
}
