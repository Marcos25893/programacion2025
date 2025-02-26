package tema6.AlquilerPeliculas;

public class ClientePrimePro extends Cliente{

    private static final int PrecioMensualCPP=3;

    public ClientePrimePro(String dni, String nombre, String email) {
        super(dni, nombre, email);
    }

    @Override
    public boolean esPro() {
        return true;
    }

    @Override
    public double getPrecioMensual() {
        return PrecioMensualCPP;
    }


}
