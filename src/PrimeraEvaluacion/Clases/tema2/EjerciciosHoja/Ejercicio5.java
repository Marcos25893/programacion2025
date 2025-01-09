package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int numero=0;
        Scanner sc = new Scanner(System.in);


        while (numero<1 || numero>10) {
            try {
                System.out.println("Ingrese un numero tiene que ser entre 1 y 10");
                numero = Integer.parseInt(sc.nextLine());
            }catch(Exception e) {
                System.out.println("Error al ingresar el numero");
            }
        }

    }
}
