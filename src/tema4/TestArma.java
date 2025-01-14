package tema4;

import static tema4.Arma.tipoArma.ESPADA;
import static tema4.Arma.tipoArma.MARTILLO;

public class TestArma {
    public static void main(String[] args) {
        Arma martillo = new Arma("MartilloHielo", 100, 50, MARTILLO);
        Arma espada = new Arma("EspadaFuego", 100, 75, ESPADA);
        Personaje pj1 = new Personaje("Pepito", "Orco", "NoDefinido", 100, espada);

        System.out.println(pj1);

        espada.golpear(pj1);

        System.out.println(espada);
        System.out.println(martillo);
        System.out.println(pj1);
    }
}
