package tema7.Ejercicios.RepasoColecciones.Colletions;

public class Test {

    public static void main(String[] args) {

        System.out.println("Baraja francesa");
        Baraja bf = new Baraja();
        System.out.println(bf);

        System.out.println(bf.sacarCartaArriba());
        System.out.println(bf.sacarCartaArriba());

        bf.ordenarPorNumero();
        System.out.println(bf);

        bf.ordenarPorPalo();
        System.out.println(bf);

    }
}
