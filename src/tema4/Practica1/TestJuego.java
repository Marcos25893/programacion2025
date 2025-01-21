package tema4.Practica1;

public class TestJuego {
    public static void main(String[] args) {


        Arma espada = new Arma("Espada Sagrada", Arma.Tipo.ESPADA, 60, true);
        Jugador Pepe = new Jugador();
        Monstruo Rulo = new Monstruo("Rulo", Monstruo.Clase.TROLL, 100.0, 2, 25);

        System.out.println(Pepe);
        Pepe.equipar(espada);
        System.out.println(Pepe);

    }
}
