package tema6.EjercicioClasePoo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Comic {

    protected UUID id;
    protected String titulo;
    protected LocalDate fecha;
    protected Integer numPagina;
    protected ArrayList<Autor> autores;
    protected Double precio;
    protected Integer numeroEjemplares;
    protected Genero genero;

    public Comic(Integer numPagina, LocalDate fecha, String titulo, Double precio, Genero genero,Integer numeroEjemplares) {
        this.autores = new ArrayList<>();
        this.numPagina = numPagina;
        this.fecha = fecha;
        this.titulo = titulo;
        this.precio = precio;
        this.numeroEjemplares = numeroEjemplares;
        this.id = UUID.randomUUID();
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor){
        this.autores.add(autor);
        autor.addComic(this);
    }

    public void removeAutor(Autor autor){
        autores.remove(autor);
        autor.removeComic(this);
    }

    public UUID getId() {
        return id;
    }

    public Integer getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(Integer numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comic{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", numPagina=").append(numPagina);
        sb.append(", autores=").append(autores);
        sb.append(", precio=").append(precio);
        sb.append(", numeroEjemplares=").append(numeroEjemplares);
        sb.append('}');
        return sb.toString();
    }
}
