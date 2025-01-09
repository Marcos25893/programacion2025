package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2, temp;
        int contador=0;

        System.out.println("Ingrese el numero 1: ");
        numero1=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el numero 2: ");
        numero2=Integer.parseInt(sc.nextLine());

        if(numero1<numero2){
            temp=numero1;
            numero1=numero2;
            numero2=temp;
        }

        for (int i=numero2; i<numero1; i++){
            if (i%2==0){
                System.out.println(i);
                contador++;
            }

        }
        System.out.println("Han salido " + contador + " numeros");

    }
}
