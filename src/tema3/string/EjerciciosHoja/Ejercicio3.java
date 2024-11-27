package tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la
        //cadena buscada. El programa indicará cuántas veces aparece la segunda cadena en la primera.

        String texto= "En un lugar de la mancha de cuyo nombre no quiero acordarme";
        String palabra;
        int posicion=0;
        int contador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que palabra quieres ver cuantas veces aparece");
        palabra= sc.nextLine();

        while (posicion>=0) {

            posicion = texto.indexOf(palabra, posicion + 1);
            contador++;
        }

        System.out.println("La palabra " + palabra + " aparece " + (contador-1) + " veces");

    }
}
