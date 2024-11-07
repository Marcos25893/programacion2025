package tema3.arrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Pide 5 números double por teclado
        //Guárdalos directamente en un array
        //Pinta el array entero

        Scanner sc = new Scanner(System.in);

        double numeros[] = new double[5];
        for (int i=0; i < numeros.length; i++){
            System.out.println("Dime un numero");
            numeros[i]=Double.parseDouble(sc.nextLine());
        }

        for (int i=0; i< numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
