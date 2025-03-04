package tema6.AlquilerPeliculas;

import java.util.ArrayList;

public class Serie extends Multimedia{


    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, boolean esPlus, double precio, Genero genero) {
        super(titulo, esPlus, precio, genero);
        this.temporadas = new ArrayList<>();
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public void addTemporada(Temporada temporada) {
        temporada.setSerie(this);
        this.temporadas.add(temporada);
    }

    public boolean delTemporada(Temporada temporada){
        for (Temporada t : temporadas){
            if (t.equals(temporada)){
                this.temporadas.remove(temporada);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "temporadas=" + temporadas +
                ", codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", esPlus=" + esPlus +
                ", precio=" + precio +
                ", genero=" + genero +
                '}';
    }
}
