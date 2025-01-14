package tema4;



public class TestPersonaje {
    public static void main(String[] args) {

        Arma martillo = new Arma("MartilloHielo",100,30,Arma.tipoArma.MARTILLO);
        Arma espada = new Arma("EspadaFuego", 100,40,Arma.tipoArma.ESPADA);
        Personaje pj1 = new Personaje("Pepe", "Elfo", "Hombre", 80, martillo);
        Personaje pj2 = new Personaje();

        System.out.println(pj1);
        System.out.println(pj2);

        pj1.golpear(pj2);
        System.out.println(pj2);
    }
}
