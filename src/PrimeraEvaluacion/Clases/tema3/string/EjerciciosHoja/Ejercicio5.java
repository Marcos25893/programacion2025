package PrimeraEvaluacion.Clases.tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Diseña un programa en Java que solicite al usuario una cadena de caracteres y muestre por pantalla un
        //conteo de cuántas vocales, consonantes y espacios en blanco contiene la cadena introducida.

        Scanner sc = new Scanner(System.in);
        String texto;

        char letra;
        int vocales=0;
        int consonantes=0;
        int espacios=0;

        System.out.println("Escribe un texto");
        texto= sc.nextLine();

        for (int i=0;i<texto.length();i++){
            letra=texto.charAt(i);

            switch (letra){
                case 'a','e','i','o','u':
                    vocales++;
                    break;
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':
                    consonantes++;
                    break;
                case ' ':
                    espacios++;
                    break;
            }
        }

        System.out.println("Hay " + vocales + " vocales " + consonantes + " consonantes " + espacios + " espacios");



    }
}
