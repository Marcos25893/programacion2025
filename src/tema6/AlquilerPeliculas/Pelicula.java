package tema6.AlquilerPeliculas;

public class Pelicula extends Multimedia{

  private int duraccion;

    public Pelicula(String titulo, double precio, boolean esPlus, int duraccionMinutos) {
        super(titulo, precio, esPlus);
        this.duraccion = duraccionMinutos;
    }

    public int getDuraccion() {
        return duraccion;
    }

    public void setDuraccion(int duraccion) {
        this.duraccion = duraccion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pelicula{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", esPlus=").append(esPlus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append(", duraccion=").append(duraccion);
        sb.append('}');
        return sb.toString();
    }
}
