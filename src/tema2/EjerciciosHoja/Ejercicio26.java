package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio26 {

    public static void convierteEnPalos(int n){
        int resto=0;
        int resto2=0;
        int valor=0;
        String cadena= String.valueOf(n);
        if (cadena.length()==1){
            valor=1;
        } else if (cadena.length()==2) {
            valor=2;
        } else if (cadena.length()==3) {
            valor=3;
        }
        for (int i=0;i<1;i++) {
            if (valor==2) {
                resto=n%10;
                n=n/10;
            } else if (valor==3) {
                resto2=n%100;
                resto=n%10;
                resto2=(resto2-resto)/10;
                n=n/100;
            }
            if(n==0) {
                System.out.println("-");
            }else {
                for (int j = 0; j < n; j++) {
                    System.out.print("|");
                }
            }

            System.out.print("-");
            if (resto2==0) {
                System.out.print("-");
            }else {
                for (int j = 0; j < resto2; j++) {
                    System.out.print("|");
                }
            }

                System.out.print("-");
            if (resto==0) {
                System.out.print("-");
            }else{
                for (int j = 0; j < resto; j++) {
                    System.out.print("|");
                }
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
