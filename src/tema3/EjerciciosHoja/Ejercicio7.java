package tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero[]=new int[5];
        int desplazar;

        for (int i=0;i< numero.length;i++){
            System.out.println("Dale valor al array en la posicion " + i);
            numero[i]=Integer.parseInt(sc.nextLine());
        }

        System.out.println("Cuantas posiciones quieres desplazarlo");
        desplazar=Integer.parseInt(sc.nextLine());

        //Este solo desplaza los numeros en un array mas grande
//
//        int total[]=new int[numero.length+desplazar];
//
//        for (int i=0;i<numero.length;i++){
//            total[i+desplazar]=numero[i];
//        }
//
//        for (int i=0;i<total.length;i++){
//            System.out.println(total[i]);
//        }


        //Desplaza los numeros pero sigue guardando esos numeros y los pasa a la primera posicion
        int total[]=new int[5];

        for (int i=0;i< numero.length-desplazar;i++){
            total[i+desplazar]=numero[i];
        }
        for (int i=0;i< desplazar;i++){
            total[i]=numero[numero.length-(i+1)];
        }

        for (int i=0;i< numero.length;i++){
            System.out.println(total[i]);
        }

    }
}
