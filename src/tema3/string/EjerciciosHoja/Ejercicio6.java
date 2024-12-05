package tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Crea un método que determine si una cadena es un palíndromo, o sea, se lee igual en los dos sentidos.

//        String texto;
//        String reves;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Dime que texto quieres comprobar que sea palindromo");
//        texto= sc.nextLine();
//
//        reves=texto;
//        StringBuffer sb = new StringBuffer(reves);
//
//        sb.reverse();
//        reves=sb.toString();
//
//        if (texto.equals(reves)){
//            System.out.println("El texto es palindromo");
//        }else System.out.println("El texto no es palindromo");

        String texto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime que texto quieres comprobar que sea palindromo");
        texto= sc.nextLine();


        StringBuffer sb = new StringBuffer(texto);

        sb.reverse();

        if (texto.equals(sb.toString())){
            System.out.println("El texto es palindromo");
        }else System.out.println("El texto no es palindromo");

    }
}
