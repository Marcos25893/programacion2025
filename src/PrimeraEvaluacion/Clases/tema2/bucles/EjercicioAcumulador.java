package PrimeraEvaluacion.Clases.tema2.bucles;

import java.util.Scanner;

public class EjercicioAcumulador {
    public static void main(String[] args) {
        //Suma todos los numeros pares del 1 al 100
//        int total=0;
//        for (int i=1; i<100; i++){
//            if (i%2==0){
//                total=total+i;
//            }
//        }
//        System.out.println(total);

        //Pide 5 precios por teclado
        //Imprime el total
        Scanner sc=new Scanner(System.in);
        int total=0,precio;
        for (int i=1; i<=5; i++){
            System.out.println("Dime el precio");
            precio=sc.nextInt();
            total+=precio;

        }
        System.out.println(total);



    }
}
