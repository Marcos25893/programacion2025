package tema6.AlquilerPeliculas;

import java.util.Objects;

public class Multimedia {

    protected long codigo;
    protected String titulo;
    protected boolean esPlus;
    protected double precio;
    protected Genero genero;

    private static int autoIncremento=1;

    public Multimedia(String titulo, double precio, boolean esPlus) {
        this.titulo = titulo;
        this.precio = precio;
        this.esPlus = esPlus;
        this.codigo=autoIncremento;
        autoIncremento++;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEsPlus() {
        return esPlus;
    }

    public void setEsPlus(boolean esPlus) {
        this.esPlus = esPlus;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Multimedia{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", esPlus=").append(esPlus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
