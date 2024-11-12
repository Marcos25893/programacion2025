package tema3.arrays;

public class Ej3 {

    public static int tirada(int mayor, int menor){
        return (int)(Math.random()*(mayor-menor+1)+menor);
    }

    public static int tiradaCubitus(){
        int dado1, dado2, dado3;
        dado1=tirada(6,1);
        dado2=tirada(6,1);
        dado3=tirada(15,1);
        int total=dado1+dado2+dado3;
        if ((dado1+dado2)>dado3){
            total+=3;
            return total;
        }else return total;
    }

    public static int tiradaHumerus(){
        int dado1, dado2, dado3;
        dado1=tirada(6,1);
        dado2=tirada(6,1);
        dado3=tirada(15,1);
        int total=dado1+dado2+dado3;
        if ((dado1+dado2)<dado3){
            total+=3;
            return total;
        }else return total;
    }

    public static void main(String[] args) {

        //3. Cubitus y Humerus juegan hoy otra vez a los dados. Ambos lanzan dos dados de 6 caras y un dado
        // de 15 caras. Si en su tirada Cubitus obtiene un valor mayor en los dados de 6 caras que en el de 15
        // suma tres puntos al total. Si en su tirada Humerus obtiene un valor mayor en el dado de 15 caras que
        // en los de 6 suma tres puntos al total. Gana la ronda el que tenga más puntos. Simula el juego de 100
        // partidas, guarda los resultados en un array, y dime cuál es la media de la puntuación de las partidas
        // jugadas, y quién es el ganador.

        int partidas[]= new int[100];
        int puntosCubitus=0, puntosHumerus=0;
        int contadorC=0, contadorH=0;
        int partidastotal=0;

        for (int i=0;i< partidas.length;i++){
            puntosCubitus=tiradaCubitus();
            puntosHumerus=tiradaHumerus();
            if (puntosCubitus>puntosHumerus){
                partidas[i]=puntosCubitus;
                System.out.println("Gana Cubitus: " + puntosCubitus);
                contadorC++;
            }else if (puntosCubitus<puntosHumerus){
                partidas[i]=puntosHumerus;
                System.out.println("Gana Humerus: " + puntosHumerus);
                contadorH++;
            }
        }

        for (int i=0; i<partidas.length; i++){
            partidastotal+=partidas[i];
        }

        if (contadorC>contadorH){
            System.out.println("El ganador es Cubitus por " + puntosCubitus + " puntos");
        }else if(contadorH>contadorC){
            System.out.println("El ganador es Humerus por " + puntosHumerus + " puntos");
        }
        System.out.println("La media de las partidas es " + partidastotal/partidas.length);

    }
}
