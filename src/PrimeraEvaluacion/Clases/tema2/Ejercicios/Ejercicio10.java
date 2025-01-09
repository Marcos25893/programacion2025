package PrimeraEvaluacion.Clases.tema2.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        double x,a,b,c,y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el valor de a");
        a= sc.nextInt();
        System.out.println("Cual es el valor de b");
        b= sc.nextInt();
        System.out.println("Cual es el valor de c");
        c= sc.nextInt();

        x=(-(b)+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
        y=(-(b)-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);

        if (a==0){
            System.out.println("Error");
        } else if ((Math.pow(b,2)-4*a*c)>=0) {

            System.out.println("El valor de x es " + x + " o " + y);
        }

    }
}
