package tema4.Practica1.AcademiaMagia;

public class TestJuego {
    public static void main(String[] args) {
        Mago pj1 = new Mago("Paco", 100);

        pj1.aprenderHechizo(new Hechizo("Bola de fuego", 20,7));
        pj1.aprenderHechizo(new Hechizo("Escudo Magico", 15,5));
        pj1.aprenderHechizo(new Hechizo("Rayo Electrico", 25,9));

        Prueba piso1 = new Prueba("Romper Muro", 5,10);
        Prueba piso2 = new Prueba("Derrotar Orco", 8,15);
        Prueba piso3 = new Prueba("Derrotar Elfo Oscuro", 10,20);

        System.out.println(pj1);

        pj1.lanzarHechizo(piso1,pj1.getHechizos().get(0));
        pj1.lanzarHechizo(piso2,pj1.getHechizos().get(1));
        pj1.lanzarHechizo(piso3,pj1.getHechizos().get(2));

        System.out.println(pj1);
    }
}
