package tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero[]=new int[5];
        int copia;
        int desplazar;

        for (int i=0;i< numero.length;i++){
            System.out.println("Dale valor al array en la posicion " + i);
            numero[i]=Integer.parseInt(sc.nextLine());
        }

        System.out.println("Cuantas posiciones quieres desplazarlo");
        desplazar=Integer.parseInt(sc.nextLine());

        //Desplaza los numeros pero sigue guardando esos numeros y los pasa a la primera posicion

        for (int i=0;i< desplazar;i++){
            copia=numero[numero.length-1];

            for (int j=numero.length-1;j> 0;j--){
                numero[j]=numero[j-1];
            }
            numero[0]=copia;
        }

        for (int i=0;i< numero.length;i++){
            System.out.println(numero[i]);
        }

    }
}
