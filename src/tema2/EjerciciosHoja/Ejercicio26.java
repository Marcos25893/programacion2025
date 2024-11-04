package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio26 {

    public static void convierteEnPalos(int n) {

        int numero=0;
         if (n>0) {
            while (n>0){
                numero=n%10;
                if (numero==0){
                    System.out.println("-");
                }else if (numero>0){
                    for (int i=0; i<numero; i++){
                        System.out.print("|");
                    }
                }
                System.out.print("-");
                n=n/10;
            }

        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero=1000;
        while(numero>999 || numero<0) {
            System.out.println("Dime un numero");
            numero = Integer.parseInt(sc.nextLine());
        }
        convierteEnPalos(numero);

    }
}
