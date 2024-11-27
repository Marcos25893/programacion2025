package tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, este
        //es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por
        //lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir
        //“teclado” devolverá “tecladodalcet” y al introducir “hola” devolverá “holaloh”. Haz dos versiones, una
        //con String y otra con StringBuffer.
        String texto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto");
        texto= sc.nextLine();
        String cadenaReves="";


        for (int i=texto.length()-2;i>=0;i--){
            cadenaReves+=texto.charAt(i);
        }

        System.out.println(texto + cadenaReves);

        StringBuffer sb = new StringBuffer(texto);
        sb.deleteCharAt(sb.length()-1);
        sb.reverse();

        System.out.println(texto + cadenaReves);

    }
}
