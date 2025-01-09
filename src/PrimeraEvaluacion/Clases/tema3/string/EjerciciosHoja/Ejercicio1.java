package PrimeraEvaluacion.Clases.tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y
        //devuelva esta cadena invertida. Haz dos versiones, una con String y otra con StringBuffer.

        String texto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto");
        texto= sc.nextLine();

        StringBuffer sb = new StringBuffer(texto);
        System.out.println(sb.reverse());

        for (int i=texto.length()-1;i>=0;i--){
            System.out.print(texto.charAt(i));
        }

    }
}
