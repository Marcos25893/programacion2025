package tema6.EjercicioClasePoo;

import java.time.LocalDate;

public class Anime extends Comic{

    private Integer episodio;
    private String serie;

    public Anime(Integer numPagina, LocalDate fecha, String titulo, Double precio, Genero genero,
                 Integer numeroEjemplares, Integer episodio, String serie) {
        super(numPagina, fecha, titulo, precio, genero, numeroEjemplares);
        this.episodio = episodio;
        this.serie = serie;
    }

    public Integer getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Integer episodio) {
        this.episodio = episodio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Anime{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", numPagina=").append(numPagina);
        sb.append(", autores=").append(autores);
        sb.append(", precio=").append(precio);
        sb.append(", numeroEjemplares=").append(numeroEjemplares);
        sb.append(", episodio=").append(episodio);
        sb.append(", serie='").append(serie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
