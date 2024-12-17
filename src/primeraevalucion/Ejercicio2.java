package primeraevalucion;

import java.util.Scanner;

public class Ejercicio2 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) )+min;
    }

    /**
     * Este metodo se encarga de decir que prueba
     * magica ha salido de manera aleatoria
     * @return
     */
    public static int reglaMagica(){
        int regla;
        regla=numero_aleatorio(1,5);
        switch (regla){
            case 1:
                System.out.println("Dado de Fuego");
                break;
            case 2:
                System.out.println("Dado de Curacion");
                break;
            case 3:
                System.out.println("Dado de Robo");
                break;
            case 4:
                System.out.println("Dado Explosivo");
                break;
            case 5:
                System.out.println("Dado de Escudo");
                break;
        }
        return regla;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vidaJugador1=40;
        int vidaJugador2=40;
        int dadoJugador1=0;
        int dadoJugador2=0;
        int numeroRondas=0;
        int ronda=0;
        int modo=0;
        boolean escudo1=false;
        boolean escudo2=false;
        int duracionEscudo1=0;
        int duracionEscudo2=0;

        do {
            try {
                System.out.println("Cuantas rondas se van a jugar(minimo 5)");
                numeroRondas = Integer.parseInt(sc.nextLine());
            }catch (Exception ex){
                System.out.println("Error");
            }
        }while (numeroRondas<5);

        while (ronda<numeroRondas && (vidaJugador1!=0 && vidaJugador2!=0)){
            modo=reglaMagica();
            dadoJugador1=numero_aleatorio(1,6);
            System.out.println("Jugador1-" + dadoJugador1);
            dadoJugador2=numero_aleatorio(1,6);
            System.out.println("Jugador2-" + dadoJugador2);
            switch (modo){
                case 1:
                    if (dadoJugador1>dadoJugador2){
                        if (escudo2==false) {
                            vidaJugador2 -= (dadoJugador1 - dadoJugador2);
                        }else {
                            System.out.println("Se protege con su escudo");
                            escudo2=false;
                        }
                    } else if (dadoJugador1<dadoJugador2) {
                        if (escudo1==false) {
                            vidaJugador1 -= (dadoJugador2 - dadoJugador1);
                        }else{
                            System.out.println("Se protege con su escudo");
                            escudo1=false;
                        }
                    }else{
                        System.out.println("Misma puntuación, os salvais");
                    }
                    break;
                case 2:
                    vidaJugador1+=dadoJugador1;
                    vidaJugador2+=dadoJugador2;
                    break;
                case 3:
                    if (dadoJugador1>dadoJugador2){
                        if (escudo2==false) {
                            vidaJugador2 -= (dadoJugador1 / 2);
                            vidaJugador1 += (dadoJugador1 / 2);
                        }else{
                            System.out.println("Te quedas sin robarle vida, se protege con el escudo");
                            escudo2=false;
                        }
                    } else if (dadoJugador1<dadoJugador2) {
                        if (escudo1==false) {
                            vidaJugador1 -= (dadoJugador2 / 2);
                            vidaJugador2 += (dadoJugador2 / 2);
                        }else{
                            System.out.println("Te quedas sin robarle vida, se protege con el escudo");
                            escudo1=false;
                        }
                    }else{
                        System.out.println("Misma puntuación, nadie roba vida");
                    }
                    break;
                case 4:
                    if (dadoJugador1==6 && dadoJugador2!=dadoJugador1){
                        if (escudo2==false) {
                            vidaJugador2 -= 10;
                        }else{
                            System.out.println("Se protege de la explosion con su escudo");
                            escudo2=false;
                        }
                    } else if (dadoJugador2==6 && dadoJugador2!=dadoJugador1) {
                        if (escudo1==false) {
                            vidaJugador1 -= 10;
                        }else{
                            System.out.println("Se protege de la explosion con su escudo");
                            escudo1=false;
                        }
                    }else{
                        System.out.println("Nadie saco un 6 o ambos teneis un 6, nadie explota");
                    }
                    break;
                case 5:
                    if (dadoJugador1>dadoJugador2){
                        escudo1=true;
                    } else if (dadoJugador1<dadoJugador2) {
                        escudo2=true;
                    }else{
                        System.out.println("Misma puntuación, nadie obtiene escudo");
                    }
                    break;
            }

            ronda++;
            System.out.println("Vida del Jugador1 " + vidaJugador1 + " vida Jugador2 " + vidaJugador2 + " ronda actual " + ronda);
            System.out.println();
        }

        if (vidaJugador1==0 || vidaJugador2>vidaJugador1){
            System.out.println("Gana el Jugador2, con un total de rondas " + ronda);
        } else if (vidaJugador2==0 || vidaJugador1>vidaJugador2) {
            System.out.println("Gana el Jugador1, con un total de rondas " + ronda);
        }

    }
}
