package tema3.RepasoExamen.Resueltos;

public class Examen2 {
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }
    public static int tirarDosDados() {
        int dado1 = generarNumero(1,6);
        int dado2 = generarNumero(1, 6);
        return dado1+dado2;
    }
    public static boolean jugarRonda() {
        int tirada = tirarDosDados();

        System.out.println("Tirada " + tirada);
        switch (tirada) {
            case 7,11:
                System.out.println("Gana");
                return true;
            case 2,3,12:
                System.out.println("Pierde");
                return false;

            default:
                //Tirar los dados otra vez
                int nuevaTirada=0;
                do {
                    nuevaTirada = tirarDosDados();
                    System.out.println("Intermedias: " + nuevaTirada);
                } while (nuevaTirada != 7 && nuevaTirada != tirada);
                //Gano o pierdo
                if (nuevaTirada == 7) {
                    return false;
                } else {
                    return true;
                }
        }
    }
    public static void main(String[] args) {

        int jugador1=0, jugador2=0;
        boolean ronda1=false, ronda2=false;

        for(int i=0; i<100; i++) {
            ronda1 = jugarRonda();
            ronda2 = jugarRonda();
            if (ronda1 == true && ronda2 == false) {
                jugador1++;
            }
            if (ronda1 == false && ronda2 == true) {
                jugador2++;
            }
        }

        System.out.println("PartidasJ1 " +  jugador1);
        System.out.println("PartidasJ2 " +  jugador2);
    }

    //Craps. Es un juego de dados muy facil, y consiste en arrojar la suma de 2 dados,
    //y su suma es 7 u 11 ganas la partida. En cambio, si sacas un 2, 3 o 12 pierdes. Con cualquier
    //otro numero que saques, debes guardar ese número y tirar los dados repetidamente hasta
    //volver a sacar ese dado (ganas) o sacar el 7 (pierdes). Realiza el juego para dos jugadores
    //simulando las tiradas de forma aleatoria y que jueguen 10 partidas, indica cuántas partidas
    //gana jugador1 y cuántas jugador2. Ahora simula 1000 partidas e indica las partidas que
    //gana cada uno.
}
