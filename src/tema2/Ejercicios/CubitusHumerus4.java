package tema2.Ejercicios;

import java.util.Scanner;

public class CubitusHumerus4 {

    public static int tirada(){
        tirada:return (int)(Math.random()*13)+1;

    }

    public static boolean iguales(int n1, int n2, int n3, int n4, int n5,int n6){

        return n1 == n4 || n1 == n5 || n1 == n6 || n2 == n4 || n2 == n5 || n2 == n6 || n3 == n4 || n3 == n5 || n3 == n6;
    }

    public static void numeros(int n1, int n2, int n3, int n4, int n5,int n6){
        System.out.println("Cubitus a sacado " + n1 + "-" + n2 + "-" + n3 + " y Humerus a sacado " + n4 + "-" + n5 + "-" + n6);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int turno=0;
        int  tirada1C, tirada2C, tirada3C;
        int tirada1H, tirada2H, tirada3H;
        int contadorC=0;
        int contadorH=0;

        while (turno < 1 || turno%2==0) {

            try {
                System.out.println("Cuantos turnos se va a jugar, tienen que ser impar para que no haya empate");
                turno = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("No has introducido un valor valido");
            }
        }

        for (int i=0; i<turno; i++) {

            tirada1C=tirada();
            tirada2C=tirada();
            tirada3C=tirada();
            tirada1H=tirada();
            tirada2H=tirada();
            tirada3H=tirada();

            if (i%2==0) {
                if (iguales(tirada1C, tirada2C, tirada3C, tirada1H, tirada2H, tirada3H)) {
                    numeros(tirada1C,tirada2C,tirada3C,tirada1H,tirada2H,tirada3H);
                    System.out.println("El valor a coincidido punto para Cubitus");
                    contadorC++;
                } else {
                    numeros(tirada1C,tirada2C,tirada3C,tirada1H,tirada2H,tirada3H);
                    System.out.println("El valor no a coincidido punto para Humerus");
                    contadorH++;
                }
            }else {
                if (iguales(tirada1C, tirada2C, tirada3C, tirada1H, tirada2H, tirada3H)) {
                    numeros(tirada1C,tirada2C,tirada3C,tirada1H,tirada2H,tirada3H);
                    System.out.println("El valor a coincidido para Humerus");
                    contadorH++;
                } else {
                    numeros(tirada1C,tirada2C,tirada3C,tirada1H,tirada2H,tirada3H);
                    System.out.println("El valor a no coincidido Cubitus");
                    contadorC++;
                }

            }


        }
        if (contadorC>contadorH) {
            System.out.println("Gana Cubitus por " + contadorC + " victorias a " + contadorH);
        }else System.out.println("Gana Humerus por " + contadorH + " victorias a " + contadorC);



    }
}
