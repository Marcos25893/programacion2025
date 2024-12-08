package tema3.string.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio14 {

    public static String encriptar(String texto, int clave){
        char palabra;

        StringBuffer sb = new StringBuffer();
        for (int i=0;i<texto.length();i++){
            palabra= (char) (texto.charAt(i)+clave);
            sb.append(palabra);
        }
        return sb.toString();
    }

    public static String desencriptar(String texto, int clave){
        char palabra;

        StringBuffer sb = new StringBuffer();
        for (int i=0;i<texto.length();i++){
            palabra= (char) (texto.charAt(i)-clave);
            sb.append(palabra);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        //Cifrado César. Crea un algoritmo de encriptación que se le pase una frase y una clave (numérica). Lo
        //que hará será sumar en ASCII esa clave a cada letra de la frase. Prueba a realizar una función para
        //desencriptar.

        Scanner sc = new Scanner(System.in);

        String texto;
        int clave;

        System.out.println("Que texto quieres encriptar");
        texto= sc.nextLine();

        System.out.println("Cual sera la clave");
        clave=Integer.parseInt(sc.nextLine());

        System.out.println(encriptar(texto,clave));
        System.out.println(desencriptar(encriptar(texto,clave),clave));

    }
}
