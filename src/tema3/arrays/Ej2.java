package tema3.arrays;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {


        //2. Programa que declare tres vectores de enteros, 10 elementos cada uno, pida por teclador los valores
        // de vector1 y vector2 y calcule vector3 como la suma de los anteriores y lo pinte por pantalla

        Scanner sc = new Scanner(System.in);

        int numero1[] = new int[10];
        int numero2[] = new int[10];
        int numero3[] = new int[10];

        for (int i=0;i<numero1.length;i++){
            System.out.println("Dime un numeros para el primer vector");
            numero1[i]=Integer.parseInt(sc.nextLine());
        }

        for (int i=0;i<numero2.length;i++){
            System.out.println("Dime un numeros para el segundo vector");
            numero2[i]=Integer.parseInt(sc.nextLine());
        }

        for (int i=0;i< numero3.length;i++){
            numero3[i]=numero2[i]+numero1[i];
            System.out.println("La suma del vector 1 =" + numero1[i] + " mas el vector 2 =" + numero2[i] +
                    " es igual a " + numero1[i]+ "+" + numero2[i] + "=" + numero3[i]);
        }

    }
}
