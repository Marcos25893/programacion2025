package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas filas de * quieres");
        numero=Integer.parseInt(sc.nextLine());

        for (int i=0;i<numero;i++){
            for (int j=numero;j>i;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
