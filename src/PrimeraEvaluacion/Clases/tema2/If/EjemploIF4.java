package PrimeraEvaluacion.Clases.tema2.If;

import java.util.Scanner;

public class EjemploIF4 {
    public static void main(String[] args) {
        //edad-> 1-11 hola niño
        //edad->12-17 hola chaval
        //edad->18-29 hola tio
        //edad->30-50 hola hombre/mujer
        //edad>60 hola abuelo
        int edad;
        char sexo='h' +'m';
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        edad= sc.nextInt();
        sexo='m';


        if (sexo=='h') {
            if (edad >= 1 && edad <= 11) {
                System.out.println("hola niño");
            } else if (edad >= 12 && edad <= 17) {
                System.out.println("hola chaval");
            } else if (edad >= 18 && edad <= 29) {
                System.out.println("hola tio");
            } else if (edad >= 30 && edad <= 59) {
                System.out.println("hola hombre");
            } else if (edad >= 60) {
                System.out.println("hola abuelo");
            } else {
                System.out.println("No has nacido");
            }
        }
        if (sexo=='m'){
            if (edad>=1 && edad<=11){
                System.out.println("hola niña");
            } else if (edad>=12 && edad<=17) {
                System.out.println("hola chavala");
            } else if (edad>=18 && edad<=29) {
                System.out.println("hola tia");
            } else if (edad>=30 && edad<=59) {
                System.out.println("hola mujer");
            } else if (edad>=60) {
                System.out.println("hola abuela");
            } else {
                System.out.println("No has nacido");
            }
        }
    }
}
