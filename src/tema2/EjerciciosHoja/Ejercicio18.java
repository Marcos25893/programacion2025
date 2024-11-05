package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio18 {

    public static int tirada(){
        tirada: return (int)(Math.random()*6)+1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos turnos se van a jugar");
        int turnos =Integer.parseInt(sc.nextLine());
        int dado1, dado2, dado3, dado4, dado5, dado6, dado7;
        int sumaC=0,sumaH=0;
        int puntoC=0,puntoH=0;

        for (int i = 0; i < turnos; i++) {
            dado1=tirada();
            dado2=tirada();
            dado3=tirada();
            dado4=tirada();
            dado5=tirada();
            dado6=tirada();
            dado7=tirada();

                if (dado1%2!=0 && i%2==0){
                    sumaC=sumaC+dado1;
                }else if(dado1%2!=0){
                    sumaH=sumaH+dado1;
                }

                if (dado2%2!=0 && i%2==0){
                    sumaC=sumaC+dado2;
                }else if(dado2%2!=0){
                    sumaH=sumaH+dado2;
                }

                if (dado3%2!=0 && i%2==0){
                    sumaC=sumaC+dado3;
                }else if(dado3%2!=0){
                    sumaH=sumaH+dado3;
                }

                if (dado4%2!=0 && i%2==0){
                    sumaC=sumaC+dado4;
                }else if(dado4%2!=0){
                    sumaH=sumaH+dado4;
                }

                if (dado5%2==0 && i%2==0){
                    sumaH=sumaH+dado5;
                }else if(dado5%2==0) {
                    sumaC=sumaC+dado5;
                }

                if (dado6%2==0 && i%2==0){
                    sumaH=sumaH+dado6;
                }else if(dado6%2==0){
                    sumaC=sumaC+dado6;
                }

                if (dado7%2==0 && i%2==0){
                    sumaH=sumaH+dado7;
                }else if(dado7%2==0){
                    sumaC=sumaC+dado7;
                }

                if (sumaC>sumaH){
                    System.out.println("Gana Cubitus las ronda por " + sumaC + " a " + sumaH);
                    puntoC++;
                } else if (sumaC<sumaH) {
                    System.out.println("Gana Humerus la ronda por " + sumaH + " a " + sumaC);
                    puntoH++;
                }else System.out.println("Ronda empatada");

                sumaC=0;
                sumaH=0;
        }
        if (puntoC>puntoH){
            System.out.println("Gana Cubitus en un total de " + puntoC + " a " + puntoH);
        } else if (puntoC<puntoH) {
            System.out.println("Gana Humerus en un total de " + puntoH + " a " + puntoC);
        }else System.out.println("Han quedado empate a " + puntoH);
    }
}
