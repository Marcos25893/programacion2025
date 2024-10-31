package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio26 {

    public static void convierteEnPalos(int n){
        int resto=0;
        for (int i=0;i<1;i++) {
            while(n>9){
                resto=n%10;
                n=n/10;
            }
            for (int j = 0; j < n; j++) {
                    System.out.print("|");
            }
            System.out.print("-");
            for (int j = 0; j < resto; j++) {
                System.out.print("|");
            }
        }
    }

    public static void main(String[] args) {


        int miles,centenas,decenas,unidades,distancia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numero=Integer.parseInt(sc.nextLine());

        convierteEnPalos(numero);

/*        miles=numero/1000;
        centenas=(numero-(miles*1000))/100;
        decenas=(numero-((miles*1000)+(centenas*100)))/10;
        unidades=(numero-((miles*1000)+(centenas*100)+(decenas*10)));

        if (miles>0){
            convierteEnPalos(miles);
        }
        if (centenas>0){
            convierteEnPalos(centenas);
        }
        if (decenas>0){
            convierteEnPalos(decenas);
        }
        if(unidades>0){
            convierteEnPalos(unidades);
        }*/



    }
}
