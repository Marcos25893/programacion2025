package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas filas de * quieres");
        numero=Integer.parseInt(sc.nextLine());

        for (int i=0;i<=numero;i++){
            for (int x=numero;x>i;x--){
                System.out.print(" ");
            }
            for (int j=0;j<i;j=j+2){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
