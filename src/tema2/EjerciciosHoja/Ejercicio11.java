package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        int fila;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas filas de * quieres");
        fila=Integer.parseInt(sc.nextLine());

        for (int i=0;i<=fila;i++){
            for (int x=fila;x>i;x--){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}

