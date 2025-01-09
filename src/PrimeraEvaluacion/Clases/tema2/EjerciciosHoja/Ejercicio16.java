package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;


import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 1;
        double media = 0;
        int contador =0;

        while (numero != (-1)) {
            System.out.println("Ingrese un numero");
            numero = Integer.parseInt(sc.nextLine());
            if (numero!=(-1)) {
                media += numero;
                contador++;
            }
        }
        media = media/contador;
        System.out.println("La media es: " + media);
    }
}