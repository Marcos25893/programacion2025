package tema4.Practica1.AcademiaMagia;

public class TestJuego {
    public static void main(String[] args) {
        Mago pj1 = new Mago("Paco", 100);

        pj1.aprenderHechizo(new Hechizo("Bola de fuego", 20,7));
        pj1.aprenderHechizo(new Hechizo("Escudo magico", 15,5));
        pj1.aprenderHechizo(new Hechizo("Rayo electrico", 25,9));
        pj1.aprenderHechizo(new Hechizo("Niebla densa",10,2));
        pj1.aprenderHechizo(new Hechizo("Tsunami",40,15));

        Prueba piso1 = new Prueba("Romper Muro", 5,15);
        Prueba piso2 = new Prueba("Derrotar Orco", 8,25);
        Prueba piso3 = new Prueba("Derrotar Elfo Oscuro", 10,30);
        Prueba piso4 = new Prueba("Prueba de sigilo",1,5);

        System.out.println(pj1);

        pj1.lanzarHechizo(piso1,pj1.getHechizos().get(0));
        pj1.lanzarHechizo(piso2,pj1.getHechizos().get(1));
        pj1.lanzarHechizo(piso3,pj1.getHechizos().get(2));
        pj1.lanzarHechizo2(piso4,"Niebla densa");
        pj1.lanzarHechizo2(piso2,"Tormenta Electrica");
        pj1.lanzarHechizo2(piso3,"Tsunami");
        pj1.lanzarHechizo2(piso3,"Bola de fuego");

        System.out.println(pj1);
    }
}
