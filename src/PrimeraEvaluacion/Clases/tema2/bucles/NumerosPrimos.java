package PrimeraEvaluacion.Clases.tema2.bucles;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        //Introduce un numero y di si es un numero primo o no
        //Primo: solo divisible entre el mismo y el 1
        //Indicador
        //7-> 7/6 resto!=0, 7/5!=0, .... 7/2!=0
        // Si algun resto da cero significa que no es primo

        Scanner sc = new Scanner(System.in);
        boolean EsPrimo = true;
        int num1;
        int total;
        System.out.println("Dime un numero");
        num1= sc.nextInt();

        for (int i=2; i<num1; i++){
            total=num1%i;
            if (total==0){
                EsPrimo=false;
            }

        }
        if (EsPrimo) {
            System.out.println(num1 + " es primo");
        }else System.out.println(num1 + " no es primo");
    }
}
