package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad=-1;
        int numero=-1;
        int contador=0;
        int suma=0;
        int mayor=0;
        int menor=0;
        double media;

        while (cantidad<=0) {
            try {
                System.out.println("Cuantos numeros vas a poner");
                cantidad = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("Error, valor introduccido no valido");
            }
        }

        for (int i=0;i<cantidad;i++){
            while (numero <= 0) {
                try {
                    System.out.println("Dime un numero");
                    numero = Integer.parseInt(sc.nextLine());
                } catch (Exception ex) {
                    System.out.println("Error en el numero introduccido");
                }
            }
            if (i==0){
                menor=numero;
            }
            if (menor>numero){
                menor=numero;
            }
            if(mayor<numero){
                mayor=numero;
            }
            contador++;
            suma+=numero;
            numero=-1;
        }

        media=(double)suma/contador;
        System.out.println(contador + "La media de los numeros introduccidos es " + media + " el numero mayor es " + mayor + " y el numero menor es " + menor);
    }
}
