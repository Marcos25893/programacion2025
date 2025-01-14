package tema4;

public class TestTarjetaRegalo {
    public static void main(String[] args) {

        TarjetaRegalo tarjeta1 = new TarjetaRegalo(1500.0);
        TarjetaRegalo tarjeta2 = new TarjetaRegalo(205.35);

        tarjeta1.gasta(200.5);
        System.out.println(tarjeta1);
        System.out.println(tarjeta2);

        tarjeta1.fusionarTarjeta(tarjeta2);

        System.out.println(tarjeta1);
        System.out.println(tarjeta2);

    }
}
