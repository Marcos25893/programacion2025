package tema6.AlquilerPeliculas;

public class Episodio {

    private String titulo;
    private int duracion;
    private Temporada temporada;

    public Episodio(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracion = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Episodio{" +
                "titulo='" + titulo + '\'' +
                ", duracion='" + duracion + '\'' +
                '}';
    }
}
