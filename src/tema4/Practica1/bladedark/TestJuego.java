package tema4.Practica1.bladedark;

public class TestJuego {
    public static void main(String[] args) {


        Arma espada = new Arma("Espada Sagrada", Arma.Tipo.ESPADA, 60, true);
        Jugador arturo = new Jugador();
        Monstruo urol = new Monstruo("Urol", Monstruo.Clase.TROLL, 100.0, 2, 25);
        Monstruo orol = new Monstruo("Orol", Monstruo.Clase.GOBLIN, 50.0, 9, 75);

        arturo.setNombre("Arturo");
        arturo.setClase(Jugador.Clase.CABALLERO);
        System.out.println(arturo);

        arturo.equipar(espada);
        System.out.println(arturo);
        System.out.println(urol);

        arturo.golpearJ(urol);
        urol.golpearM(arturo);
        System.out.println(arturo);
        System.out.println(urol);

        arturo.golpearJ(urol);
        System.out.println(arturo);
        System.out.println(urol);
        System.out.println(orol);

        arturo.golpearJ(orol);
        System.out.println(arturo);

    }
}
