package tema6.Monopoly;

public class Propiedad extends Casilla{

    private Integer precioCompra;
    private Integer precioCasilla;
    private Boolean comprado;

    public Propiedad(String nombre, Integer posicion, Integer precioCompra, Integer precioCasilla) {
        super(nombre, posicion);
        this.precioCompra = precioCompra;
        this.precioCasilla = precioCasilla;
        this.comprado=false;
    }

    public Integer getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Integer precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getPrecioCasilla() {
        return precioCasilla;
    }

    public void setPrecioCasilla(Integer precioCasilla) {
        this.precioCasilla = precioCasilla;
    }

    public Boolean getComprado() {
        return comprado;
    }

    public void setComprado(Boolean comprado) {
        this.comprado = comprado;
    }



    @Override
    public String toString() {
        return "Propiedad{" +
                "precioCompra=" + precioCompra +
                ", precioCasilla=" + precioCasilla +
                ", nombre='" + nombre + '\'' +
                ", posicion=" + posicion +
                '}';
    }
}
