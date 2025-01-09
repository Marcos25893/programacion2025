package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int billete500, billete200, billete100, billete50, billete20, billete10, billete5;
        int precio;
        int resto=0;
        int cantidad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un precio");
        precio = Integer.parseInt(sc.nextLine());
        resto = precio;

        if (precio>=500){
            cantidad=precio/500;
            resto=precio-(cantidad*500);
            System.out.println(cantidad + " billete de 500");
        }
        if (resto>=200){
            cantidad=resto/200;
            resto=resto-(cantidad*200);
            System.out.println(cantidad + " billete de 200");
        }
        if (resto>=100){
            cantidad=resto/100;
            resto=resto-(cantidad*100);
            System.out.println(cantidad + " billete de 100");
        }
        if (resto>=50){
            cantidad=resto/50;
            resto=resto-(cantidad*50);
            System.out.println(cantidad + " billete de 50");
        }
        if (resto>=20){
            cantidad=resto/20;
            resto=resto-(cantidad*20);
            System.out.println(cantidad + " billete de 20");
        }
        if (resto>=10){
            cantidad=resto/10;
            resto=resto-(cantidad*10);
            System.out.println(cantidad + " billete de 10");
        }
        if (resto>=5){
            cantidad=resto/5;
            resto=resto-(cantidad*5);
            System.out.println(cantidad + " billete de 5");
        }
        if (resto<5){
            System.out.println("Sobran " + resto + " euros");
        }

    }
}
