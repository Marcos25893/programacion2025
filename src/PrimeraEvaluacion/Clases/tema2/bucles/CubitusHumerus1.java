package PrimeraEvaluacion.Clases.tema2.bucles;

public class CubitusHumerus1 {
    public static void main(String[] args) {

        //Dos romanos asediando una ciudad, estan aburridos y se ponen a jugar a los dados
        //Cada uno tira un dado de 20 caras
        //Gana el que saca el dado mayor, o si alguno de ellos saca el 9
        //Juega una partida y dime quien gana
        //Si juegan diez partidas dime quien gana de los dos

        int num1, num2, contadorC=0,contadorH=0;

        for (int i=0; i<10;i++) {

            num1=(int)(Math.random() * 20)+1;
            num2=(int)(Math.random() * 20)+1;

            if (num1 > num2 && num2 != 9) {
                System.out.println("Cubitus a sacado " + num1 + " y a ganado, Humerus saco " + num2);
                contadorC++;
            } else if (num2 > num1 && num1 != 9) {
                System.out.println("Humerus a sacado " + num2 + " y a ganado, Cubitus saco " + num1);
                contadorH++;
            } else if (num1 == 9 && num2 != 9) {
                System.out.println("Cubitus a sacado " + num1 + " y a ganado, Humerus saco " + num2);
                contadorC++;
            } else if (num2 == 9 && num1 != 9) {
                System.out.println("Humerus a sacado " + num2 + " y a ganado, Cubitus saco " + num1);
                contadorH++;
            } else System.out.println("Han empatado");

        }
        if (contadorH>contadorC){
            System.out.println("El ganador es Humerus");
        } else if (contadorC>contadorH) {
            System.out.println("El ganador es Cubitus");
        }else System.out.println("Empate");
    }
}
