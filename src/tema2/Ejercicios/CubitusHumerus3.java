package tema2.Ejercicios;

import java.util.Scanner;

public class CubitusHumerus3 {

    public static int tirada(){
        tirada: return (int)(Math.random()*6)+1;

    }

    public static void main(String[] args) {

        int turno=0;
        int dadoC;
        int dadoH;
        int sumaC=0;
        int sumatotalC=0;
        int sumaH=0;
        int sumatotalH=0;
        Scanner sc = new Scanner(System.in);

        while (turno < 1) {

        try {
            System.out.println("Cuantos turnos se va a jugar");
            turno = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("No has introducido un valor valido");
        }
    }
        for (int i = 1; i <= turno; i++) {
            dadoC=tirada();
            dadoH=tirada();

            if((dadoC%2==0 && dadoH%2==0) || (dadoC%2!=0 && dadoH%2!=0)){
                sumatotalC=sumaC+dadoC+dadoH;
                sumaC=dadoC+dadoH;
                System.out.println("Cubitus gana se apunta " + sumaC);
            }else {
            sumatotalH=sumaH+dadoC+dadoH;
            sumaH=dadoC+dadoH;
            System.out.println("Humerus gana se apunta " + sumaH);
            }
        }

        if (sumaC>sumaH) {
            System.out.println("Cubitus a ganado con una suma de " + sumatotalC + " puntos, frente a " + sumatotalH);
        } else if (sumaC<sumaH) {
            System.out.println("Humerus a ganado con una suma de " + sumatotalH + " puntos, frente a " + sumatotalC);
        }else System.out.println("Empate");


    }

}
