package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        //unidades=3448/1000
        //decenas=(3448½1000)/100
        //centenas=((3448½1000)½100)/10
        //....
        //(miles*1000)+(centenas*100)+(decenas*10)+unidades

        Scanner sc = new Scanner(System.in);
        int numero=-1;
        int unidades, decenas, centenas, miles, capicua;

        while(numero<=0 || numero>9999) {
            try {
                System.out.println("Dime un numero entre 1 y 9999");
                numero = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("Error, valor no valido");
            }
        }

        miles=numero/1000;
        centenas=(numero-(miles*1000))/100;
        decenas=(numero-((miles*1000)+(centenas*100)))/10;
        unidades=(numero-((miles*1000)+(centenas*100)+(decenas*10)));

        capicua=(unidades*1000)+(decenas*100)+(centenas*10)+miles;

        if (capicua==numero){
            System.out.println("El numero introducido es capicúa");
        }else System.out.println("El numero introducido no es capicúa");





    }
}
