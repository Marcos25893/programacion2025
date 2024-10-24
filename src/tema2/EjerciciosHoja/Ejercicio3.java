package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero de un digito");
        num1=Integer.parseInt(sc.nextLine());

        if (num1>0 && num1<10){
            if (num1==1){
                System.out.println("Uno");
            }else if (num1==2){
                System.out.println("Dos");
            }else if (num1==3){
                System.out.println("Tres");
            }else if (num1==4){
                System.out.println("Cuatro");
            }else if (num1==5){
                System.out.println("Cinco");
            }else if (num1==6){
                System.out.println("Seis");
            }else if (num1==7){
                System.out.println("Siete");
            }else if (num1==8){
                System.out.println("Ocho");
            }else System.out.println("Nueve");

        }else System.out.println("Error: no es un número de un dígito");

    }
}
