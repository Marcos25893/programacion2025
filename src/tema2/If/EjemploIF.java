package tema2.If;

public class EjemploIF {
    public static void main(String[] args) {
        //VidaPersonaje: Si tiene mas de 50 esta bien
        //               Sino pintaremos: toma una posicion

        int vidaPersonaje = 50;
        if (vidaPersonaje > 50) {
            System.out.println("Esta bien");
        }else {
            System.out.println("Toma una pocion");
        }
    }
}
