package tema6.AlquilerPeliculas;

public class Episodio {

    private String titulo;
    private String duracion;
    Temporada temporada;

    public Episodio(String titulo, String duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
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
                ", temporada=" + temporada +
                '}';
    }
}
