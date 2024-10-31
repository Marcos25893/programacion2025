package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio25 {

    public static int tirada(){
        tirada: return (int)(Math.random()*6)+1;
    }

    public static void main(String[] args) {

        int turno=-12;
        int dado1,dado2,dado3,dado4,dado5;
        int contadorC=0, contadorH=0;
        Scanner sc = new Scanner(System.in);

        while (turno<0) {
            try {
                System.out.println("Cuantas turnos quieres jugar");
                turno = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("ERROR");
            }
        }

        for (int i=0;i<turno;i++){

            dado1=tirada();
            dado2=tirada();
            dado3=tirada();
            dado4=tirada();
            dado5=tirada();

            if (i%2==0){
                if (dado5==dado1 || dado5==dado2 || dado5==dado3 || dado5==dado4){
                    contadorH++;
                    System.out.println("Gana el punto Humerus");
                }else {
                    contadorC++;
                    System.out.println("Gana el punto Cubitus");
                }
            }else {
                if (dado5==dado1 || dado5==dado2 || dado5==dado3 || dado5==dado4){
                    contadorC++;
                    System.out.println("Gana el punto Cubitus");
                }else {
                    contadorH++;
                    System.out.println("Gana el punto Humerus");
                }
            }


        }

        if (contadorC>contadorH){
            System.out.println("El ganador es Cubitus por " + contadorC + " a " + contadorH);
        } else if (contadorH>contadorC) {
            System.out.println("El ganador es Humerus por " + contadorH + " a " + contadorC);
        }else System.out.println("Empate");
    }
}
