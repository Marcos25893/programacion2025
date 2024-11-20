package tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        int pila[]=new int[5];
        int numero;
        int contador=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Que numero quieres añadir");
        numero=Integer.parseInt(sc.nextLine());
        if (contador> pila.length){
            pila[0]=numero;
        }else {
            pila[pila.length - contador] = numero;
            contador++;
        }


    }
}
