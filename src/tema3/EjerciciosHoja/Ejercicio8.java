package tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio8 {

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) )+min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero[]=new int[10];
        int posicion;

        for (int i=0;i<numero.length;i++){
            numero[i]=numero_aleatorio(1,50);
            System.out.println(numero[i]);
        }

        System.out.println("Que posicion quieres eliminar entre 0 y 9");
        posicion=Integer.parseInt(sc.nextLine());

        for (int i=posicion;i<numero.length-1;i++){
            numero[i]=numero[i+1];
        }

        numero[numero.length-1]=0;

        for (int i=0;i<numero.length;i++){
            System.out.println(numero[i]);
        }
    }
}
