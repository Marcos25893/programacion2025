package tema4.EjerciciosClase;

public class TestSteamJuego {
    public static void main(String[] args) {
        SteamJuego juego1 = new SteamJuego("FIF","Deporte",100000,79.99,12,10);
        SteamJuego juego2 = new SteamJuego("DASS","Accion",80000,49.99,17,23);
        SteamJuego juego3 = new SteamJuego("RED","Aventura",8000,14.99,43,83);

        juego1.jugadoresDia(89000);
        juego2.jugadoresDia(68000);
        juego3.jugadoresDia(6500);


        System.out.println(juego1.getMediaJugadoresDiarios());
        System.out.println(juego2.getMediaJugadoresDiarios());
        System.out.println(juego3.getMediaJugadoresDiarios());
    }
}
