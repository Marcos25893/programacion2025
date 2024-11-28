package tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Crea un programa en Java que solicite al usuario dos cadenas de caracteres y que devuelva la primera
        //cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida.
        //Por ejemplo, si se introducen las cadenas “Esta es mi amiga Ana” y “amiga” devolverá “Esta es mi
        //AMIGA Ana”.

        String texto;
        String palabra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el texto");
        texto=sc.nextLine();

        System.out.println("Que quieres pasar a mayusculas");
        palabra= sc.nextLine();


    }
}
