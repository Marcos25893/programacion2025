package tema6.EjercicioClasePoo;

import java.time.LocalDate;
import java.util.ArrayList;

public class TiendaComics {

    private ArrayList<Comic> comics;
    private ArrayList<Venta> ventas;

    public TiendaComics() {
        this.comics = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }

    public void addComic(Comic c){
        this.comics.add(c);
    }

    public void removeComic(Comic c){
        this.comics.remove(c);
    }

    public void addVenta(Venta v) throws Exception{
        if (v.getComic().numeroEjemplares>0) {
            this.ventas.add(v);
            v.getComic().setNumeroEjemplares(v.getComic().getNumeroEjemplares()-1);
        }else {
            throw new Exception("No quedan ejemplares");
        }
    }

    public String listarVentas(){
        final StringBuffer sb = new StringBuffer("TiendaComics{");
        sb.append("ventas=").append(ventas);
        sb.append('}');
        return sb.toString();
    }

    public String listarComics(){
        final StringBuffer sb = new StringBuffer("TiendaComics{");
        sb.append("comics=").append(comics);
        sb.append('}');
        return sb.toString();
    }

    public void buscar(LocalDate desde, LocalDate hasta, Comic c){

    }
}
