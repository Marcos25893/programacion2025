package tema4.EjerciciosClase;

public class TestCoche {
    public static void main(String[] args) {
        Coche co = new Coche();
        System.out.println(co.getVelocidad());
        co.acelera(120);
        System.out.println(co.getVelocidad());
        co.frena(55);
        System.out.println(co.getVelocidad());
    }
}
