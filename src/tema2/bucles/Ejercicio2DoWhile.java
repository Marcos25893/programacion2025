package tema2.bucles;

import java.util.Scanner;

public class Ejercicio2DoWhile {
    public static void main(String[] args) {

        //Mismo del password >=8

        Scanner sc =new Scanner(System.in);
        String password;
        do {
            System.out.println("Dime contraseña");
            password= sc.nextLine();
        }while (password.length()<8);
        System.out.println("Tu contraseña es " + password);

        //Muestra los numeros del 1 al 10 usando do-while

        int numero=1;
        do {
            System.out.println(numero);
            numero++;
        }while (numero<=10);


    }
}
