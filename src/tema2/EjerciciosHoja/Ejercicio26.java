package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio26 {

    public static void convierteEnPalos(int n) {
        String palos="";
        String totalPalos="";
        int numero=0;
         if (n==0){
             System.out.print("-");
         }else if (n>0) {
            while (n>0){
                numero=n%10;
                if (numero==0){
                    palos="--";
                }else if (numero>0){
                    for (int i=0; i<numero; i++){
                        palos+="|";
                    }
                    palos="-" + palos;
                }
                totalPalos=palos + totalPalos;
                n=n/10;
                palos="";
            }
             System.out.print(totalPalos);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero=-1;
        while(numero<0) {
            try {
                System.out.println("Dime un numero");
                numero = Integer.parseInt(sc.nextLine());
            }catch (Exception ex){
                System.out.println("Error, valor introducido no válido");
            }
        }
        convierteEnPalos(numero);

    }
}
