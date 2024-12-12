package tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        //Elimina los espacios (intermedios también) de una cadena de texto.

        Scanner sc = new Scanner(System.in);

        String texto;

        System.out.println("Dime un texto que quieras quitar los espacios");
        texto= sc.nextLine();

        StringBuffer sb = new StringBuffer(texto);

        char espacios;

        for (int i=0;i< sb.length();i++){
            espacios=sb.charAt(i);
            if (espacios==' '){
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb.toString());



        //        String texto = "  Hola mundo    cruel     ";
        //
        //        //trim() elimina los espacios del principio y del final de la cadena
        //        System.out.println(texto.trim() + ".");
        //
        //        //StringBuffer delete
        //        StringBuffer sb = new StringBuffer(texto);
        //        while (sb.indexOf(" ") != -1) {
        //            sb.deleteCharAt(sb.indexOf(" "));
        //        }
        //
        //        System.out.println(sb.toString() + ".");
        //
        //        //0   5          15
        //        //hola mundo cruel
        //
        //        //hola-mundo cruel
        //
        //        //texto = texto.replace(" ", "");
    }
}
