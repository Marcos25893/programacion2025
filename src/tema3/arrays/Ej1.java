package tema3.arrays;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        //1.Crea un programa que pida un número al usuario un número del mes (por ejemplo, el 4) y
        //diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector. Para
        //simplificarlo vamos a suponer que febrero tiene 28 dias.

        //4,6,9,11

        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
        "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int posicion;

        Scanner sc = new Scanner(System.in);
            System.out.println("Dime un numero del mes");
            posicion = Integer.parseInt(sc.nextLine());

        System.out.println("El mes " + meses[posicion-1] + " tiene " + dias[posicion-1]);

    }

}
