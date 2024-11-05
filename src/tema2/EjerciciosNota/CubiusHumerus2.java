package tema2.EjerciciosNota;

import java.util.Scanner;

public class CubiusHumerus2 {

    public static int tirada(int mayor){
        return (int)(Math.random()*mayor)+1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int juego=-1;
        int tiradaC1, tiradaC2, tiradaC3, tiradaC4, tiradaH1, tiradaH2, tiradaH3;
        int sumaC=0, sumaH=0;
        int puntoC=0, puntoH=0;

        while(juego<=0){
            try {
                System.out.println("Cuantas partidas se van a jugar");
                juego = Integer.parseInt(sc.nextLine());
            }catch (Exception ex){
                System.out.println("Error al introducir los valores");
            }
        }

        for(int i=0;i<juego;i++){
            tiradaC1=tirada(10);
            tiradaC2=tirada(10);
            tiradaC3=tirada(10);
            tiradaC4=tirada(10);
            tiradaH1=tirada(15);
            tiradaH2=tirada(15);
            tiradaH3=tirada(15);

            if (tiradaC1%2!=0){
                sumaC+=tiradaC1;
            }
            if (tiradaC2%2!=0){
                sumaC+=tiradaC2;
            }
            if (tiradaC3%2!=0){
                sumaC+=tiradaC3;
            }
            if (tiradaC4%2!=0){
                sumaC+=tiradaC4;
            }
            if (tiradaH1%2==0){
                sumaH+=tiradaH1;
            }
            if (tiradaH2%2==0){
                sumaH+=tiradaH2;
            }
            if (tiradaH3%2==0){
                sumaH+=tiradaH3;
            }

            if (sumaC>sumaH){
                System.out.println("Gana la ronda Cubitus por " + sumaC + " a " + sumaH);
                puntoC++;
            } else if (sumaH>sumaC) {
                System.out.println("Gana la ronda Humerus por " + sumaH + " a " + sumaC);
                puntoH++;
            }else System.out.println("Empate");
            sumaC=0;
            sumaH=0;

        }
        if (puntoC>puntoH){
            System.out.println("El ganador es Cubitus por " + puntoC + " puntos a " + puntoH);
        } else if (puntoH>puntoC) {
            System.out.println("El ganador es Humerus por " + puntoH + " puntos a " + puntoC);
        }else System.out.println("Han empatado");

    }

    //El juego no es equitativo es mas probable que gane Humerus, se puede comprobar poniendo un gran numero
    // de partidas siempre va a tener mas puntos Humerus, al tener que ser par o impar hay 50% de posibilidades
    //de que te salga Cubitus acabara sacando 20 puntos cada juego y Humerus sacara 15 o 30
}
