package tema4.EjerciciosClase;

public class testSatelite {
    public static void main(String[] args) {
        Satelite volador = new Satelite(20.3,25.4,0);

        System.out.println(volador);
        System.out.println("Esta el satelite en orbita " + volador.enOrbita());
        volador.variaAltura(100);
        volador.variaPosicion(13.4,12.3);
        System.out.println(volador);
        System.out.println("Esta el satelite en orbita " + volador.enOrbita());


    }
}
