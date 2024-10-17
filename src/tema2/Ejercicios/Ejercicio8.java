package tema2.Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int dado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que numero ha salido en el dado");
        dado= sc.nextInt();
       // dado=(int) (Math.random() * (6 -1+1)+1);

        if (dado==1){
            System.out.println("En la cara opuesta esta el numero " + 6);
        } else if (dado==2) {
            System.out.println("En la cara opuesta esta el numero " + 5);
        } else if (dado==3) {
            System.out.println("En la cara opuesta esta el numero " + 4);
        }else if (dado==4) {
            System.out.println("En la cara opuesta esta el numero " + 3);
        }else if (dado==5) {
            System.out.println("En la cara opuesta esta el numero " + 2);
        }else if (dado==6) {
            System.out.println("En la cara opuesta esta el numero " + 1);
        }else {
            System.out.println("ERROR: número incorrecto");
        }

        //switch (dado){
        //case 1: sout("")
        //break;
        //case 2
        //...
        //default:
        //sout;

    }
}