package tema2.bucles;

public class CubitusHumerus2 {
    public static void main(String[] args) {

        //Nuestros dos romanos favoritos juegan a los dados
        //Cada uno tira dos dados
        //Gana aquel de los dos cuya suma de sus dados sea mayor, o
        //aquel cuyos dos dados sean iguales
        //juega 20 rondas y dime quien gana

        int numC1,numC2,numH1,numH2,totalC,totalH,contadorC=0,contadorH=0;
        for (int i=0; i<20; i++){
            numC1=(int)(Math.random()* 20)+1;
            numC2=(int)(Math.random()* 20)+1;
            numH1=(int)(Math.random()* 20)+1;
            numH2=(int)(Math.random()* 20)+1;
            totalC=numC1+numC2;
            totalH=numH1+numH2;

            if (numC1==numC2 && numH1!=numH2){
                System.out.println("Cubitus saco dos dados iguales " + numC1 + "-" + numC2 + " Gana Cubitus");
                contadorC++;
            } else if (numH1==numH2 && numC1!=numC2) {
                System.out.println("Humerus saco dos dados iguales " + numH1 + "-" + numH2 + " Gana Humerus");
                contadorH++;
            } else if (numC1==numC2 && numH1==numH2) {
                System.out.println("Ambos sacaron dos dados iguales " + numC1+ " " + numH1 + "Empate");
            } else if (totalC>totalH) {
                System.out.println("Cubitus " + totalC + " Humerus " + totalH +" Gana Cubitus");
                contadorC++;
            } else if (totalH>totalC) {
                System.out.println("Humerus " + totalH + " Cubitus " + totalC + " Gana Humerus");
                contadorH++;
            }else System.out.println("Cubitus " + totalC + " Humerus " + totalH + " Empate");
        }

        if (contadorC>contadorH){
            System.out.println("El ganador es Cubitus por " + contadorC + " a " + contadorH);
        } else if (contadorH>contadorC) {
            System.out.println("El ganador es Humerus por " + contadorH + " a " + contadorC);
        }else System.out.println("Humerus a conseguido " + contadorH + " y Cubitus a conseguido " + contadorC + "Empate");

    }
}
