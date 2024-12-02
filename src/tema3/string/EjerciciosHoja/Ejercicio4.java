package tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Crea un programa en Java que solicite al usuario dos cadenas de caracteres y que devuelva la primera
        //cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida.
        //Por ejemplo, si se introducen las cadenas “Esta es mi amiga Ana” y “amiga” devolverá “Esta es mi
        //AMIGA Ana”.

        String texto="";
        String palabra;
        int numero;
        int tamano;

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(texto);

        System.out.println("Escribe el texto");
        texto=sc.nextLine();

        System.out.println("Que quieres pasar a mayusculas");
        palabra= sc.nextLine();

        tamano=palabra.length();
        System.out.println(tamano);

        numero=texto.indexOf(palabra);
        System.out.println(numero);

        tamano=tamano+numero;
        sb.delete(numero, tamano);

        sb.insert(numero, palabra);

        System.out.println(texto);


    }
}
