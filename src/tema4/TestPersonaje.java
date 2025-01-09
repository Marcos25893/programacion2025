package tema4;

public class TestPersonaje {
    public static void main(String[] args) {

        Personaje pj1 = new Personaje("Pepe", "Elfo", "Hombre", 80);
        Personaje pj2 = new Personaje();

        pj1.setClase("Enano");
        pj2.setVida(75);

        System.out.println(pj1);
        System.out.println(pj2);
    }
}
