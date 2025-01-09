package PrimeraEvaluacion.Clases.tema2.Ejercicios;

import java.time.Month;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        int mes;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un mes");
        mes= sc.nextInt();


        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            System.out.println("El mes " + Month.of(mes) + " tiene 31 dias");
        } else if (mes==4 || mes==6 || mes==9 || mes==11) {
            System.out.println("El mes " + Month.of(mes) + " tiene 30 dias");
        } else if (mes==2) {
            System.out.println("El mes " + Month.of(mes) + " tiene 28 dias");
        }else {
            System.out.println("No existe el mes");
        }

        ///////////////////Otra forma de hacerlo////////////////////

        switch (mes){
            case 1,3,5,7,8,10,12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 2:
                System.out.println("El mes tiene 28 dias");
                break;
            case 4,6,9,11:
                System.out.println("El mes tiene 30 dias");
                break;
            default:
                System.out.println("Numero de mes incorrecto");
        }
    }
}
