package tema6.AlquilerPeliculas;

public class ClientePrime extends Cliente{

    private static final int PrecioMensualPrime=3;

    public ClientePrime(String dni, String nombre, String email) {
        super(dni, nombre, email);
    }


    @Override
    public boolean esPro() {
        return false;
    }

    @Override
    public double getPrecioMensual() {
        return PrecioMensualPrime;
    }


}
