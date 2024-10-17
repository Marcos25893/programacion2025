package tema1;

import java.util.Scanner;

public class NombreCompleto {
    public static void main(String[] args) {

        String nombre;
        String apellido1;
        String apellido2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es tu nombre ");
        nombre = sc.nextLine();
        System.out.println("Cual es tu primer apellido ");
        apellido1 = sc.nextLine();
        System.out.println("Cual es tu segundo apellido ");
        apellido2 = sc.nextLine();

        System.out.println( " Tu nombre completo es " + apellido1 + " " + apellido2 + ", "+ nombre);

    }
}
