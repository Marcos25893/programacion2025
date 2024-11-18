package tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio4 {

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) )+min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int personas;

        System.out.println("Dime el numero de personas");
        personas=Integer.parseInt(sc.nextLine());

        int altura[]=new int[personas];
        int alturas=0;
        double media;

        for (int i=0;i<altura.length;i++){
            altura[i]=numero_aleatorio(150,200);
            alturas+=altura[i];
        }
        media=alturas/personas;

        System.out.println("La media es " + media + "cm");

        for (int i=0;i<altura.length;i++){
            if (altura[i]>media){
                System.out.println("La persona numero " + (i+1) + " esta por encima de la media con una altura de " + altura[i] + "cm");
            } else if (altura[i]<media) {
                System.out.println("La persona numero " + (i+1) + " esta por debajo de la media con una altura de " + altura[i] + "cm");
            }else System.out.println("La persona numero " + (i+1) + " esta justo en la media con una altura de " + altura[i] + "cm");

        }

    }
}
