package tema2.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int minutos;
        boolean mañana=true;
        boolean domingo=false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos minutos has hablado");
        minutos= sc.nextInt();

        //minutos= Integer.parseInt(sc.nextline());  Lee String->Integer
        //minutos= Double.parseDouble(sc.nextLine());
        //if (diaSemana.equals("domingo")){

        if (mañana==true && domingo==false) {
            if (minutos <= 5) {
                System.out.println("Te cobran " + 1*1.15);
            } else if (minutos > 5 && minutos <= 8) {
                System.out.println("Te cobran " + (1+0.8)*1.15);
            } else if (minutos > 8 && minutos <= 10) {
                System.out.println("Te cobran " + (1+0.8+0.7)*1.15);
            } else if (minutos > 10) {
                System.out.println("Te cobran " + (1+0.8+0.7+0.5)*1.15);
            }
        }else if (mañana==false && domingo==false) {
            if (minutos <= 5) {
                System.out.println("Te cobran " + 1*1.10);
            } else if (minutos > 5 && minutos <= 8) {
                System.out.println("Te cobran " + (1+0.8)*1.10);
            } else if (minutos > 8 && minutos <= 10) {
                System.out.println("Te cobran " + (1+0.8+0.7)*1.10);
            } else if (minutos > 10) {
                System.out.println("Te cobran " + (1+0.8+0.7+0.5)*1.10);
            }
        }else if (domingo==true) {
            if (minutos <= 5) {
                System.out.println("Te cobran " + 1*1.03);
            } else if (minutos > 5 && minutos <= 8) {
                System.out.println("Te cobran " + (1+0.8)*1.03);
            } else if (minutos > 8 && minutos <= 10) {
                System.out.println("Te cobran " + (1+0.8+0.7)*1.03);
            } else if (minutos > 10) {
                System.out.println("Te cobran " + (1+0.8+0.7+0.5)*1.03);
            }
        }

    }
}
