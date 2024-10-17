package tema2.Ejercicios;

import java.util.Scanner;

public class EjercicioComprobarFecha {
    public static void main(String[] args) {
        //Comprobar que la fecha sea correcta
        //switch mes { case 1,3,5......
        //Comprobar que el dia esta entre 1-31

        int dia, mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un dia");
        dia=sc.nextInt();
        System.out.println("Dime un mes");
        mes=sc.nextInt();

        switch (mes){
            case 1,3,5,7,8,10,12:
                System.out.println(dia>=1 && dia<=31);
                break;
            case 4,6,9,11:
                System.out.println(dia>=1 && dia<=30);
                break;
            case 2:
                System.out.println(dia>=1 && dia<=28);
                break;
            default:
                System.out.println("ERROR no existe ese mes");
        }
    }
}
