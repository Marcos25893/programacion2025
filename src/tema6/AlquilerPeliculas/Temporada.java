package tema6.AlquilerPeliculas;

import java.util.ArrayList;

public class Temporada {

    private int numero;
    private ArrayList<Episodio> episodios;
    Serie serie;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void addEpisodio(Episodio episodio){
        episodio.setTemporada(this);
        this.episodios.add(episodio);
    }

    public boolean delEpisodio(Episodio episodio){
        for (Episodio e : episodios){
            if (e.equals(episodio)){
                this.episodios.remove(episodio);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "numero=" + numero +
                ", serie=" + serie +
                ", episodios=" + episodios +
                '}';
    }


}
