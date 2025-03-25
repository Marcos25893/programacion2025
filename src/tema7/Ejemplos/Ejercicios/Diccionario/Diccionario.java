package tema7.Ejemplos.Ejercicios.Diccionario;

import java.util.Comparator;
import java.util.TreeSet;

public class Diccionario {

    private TreeSet<Entrada> entradas;

    public Diccionario() {
        this.entradas = new TreeSet<>(Comparator.comparing(Entrada::getPalabraEspanol));
    }

    public TreeSet<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(TreeSet<Entrada> entradas) {
        this.entradas = entradas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diccionario{");
        sb.append("palabras=").append(entradas);
        sb.append('}');
        return sb.toString();
    }

    public void addEntrada(Entrada entrada){
        this.entradas.add(entrada);
    }

    public void removeEntrada(Entrada entrada){
        this.entradas.remove(entrada);
    }

    public String listarPalabras(){
        StringBuffer se = new StringBuffer("Diccionario{");
        se.append("palabras=");
        for (Entrada e : entradas){
            se.append("\n").append("Español= ").append(e.getPalabraEspanol())
                    .append("-> Traducción= ").append(e.getTraduccion());
        }
        se.append('}');
        return se.toString();
    }

    public String buscarEntrada(String palabra){
        for (Entrada e : entradas){
            if (e.getPalabraEspanol().equalsIgnoreCase(palabra)){
                return e.getTraduccion();
            }
        }
        return "No se encontro esa palabra";
    }
}
