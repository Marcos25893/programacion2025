package tema6.ReservaVuelos;

public class AsientoBusiness extends Asiento{

    private boolean comida;

    public AsientoBusiness(Double precioBase, Integer fila, String letra, boolean comida) {
        super(precioBase, fila, letra);
        this.comida = comida;
        this.tipoAsiento=TipoAsiento.BUSINESS;
    }

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        return "AsientoBusiness{" +
                "codigo=" + this.getCodigo() +
                ", precioBase=" + precioBase +
                ", tipoAsiento=" + tipoAsiento +
                ", comida=" + comida +
                ", pasajero=" + pasajero.getDniPasaporte() +
                '}';
    }

    @Override
    public Double calcularPrecio() {
        this.precioBase*=1.25;
        if (comida){
            this.precioBase+=30;
        }

        return this.precioBase;
    }
}
