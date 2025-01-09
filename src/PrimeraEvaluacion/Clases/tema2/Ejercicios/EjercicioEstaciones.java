package PrimeraEvaluacion.Clases.tema2.Ejercicios;

import java.time.Month;
import java.util.Scanner;

public class EjercicioEstaciones {
    public static void main(String[] args) {
        int dia,mes;

        //22 diciembre invierno
        //20 marzo primavera
        //20 junio verano
        //22 septiembre otoño

        Scanner sc = new Scanner(System.in);
        System.out.println("Que dia es");
        dia= sc.nextInt();
        System.out.println("Que mes es");
        mes=sc.nextInt();

        if ((dia>=22 && mes==12) || (mes==1) || (mes==2) || (dia<=19 && mes==3)){
            System.out.println("Es invierno y estamos en " + Month.of(mes));
        }else if((dia>=20 && mes==3) || mes==4 || mes==5 || (dia<=19 && mes==6)){
            System.out.println("Es primavera y estamos en " + Month.of(mes));
        }else if((dia>=20 && mes==6) || mes==7 || mes==8 || (dia<=21 && mes==9)){
            System.out.println("Es verano y estamos en " + Month.of(mes));
        } else if ((dia>=22 && mes==9) || mes==10 || mes==11 || (dia<=21 && mes==12)) {
            System.out.println("Es otoño y estamos en " + Month.of(mes));
        }else {
            System.out.println("Error");
        }
    }
}
