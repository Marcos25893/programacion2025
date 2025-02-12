package tema5.Objetos2.EquipoCiclistas;

import java.util.ArrayList;

public class Equipo {

    private ArrayList<Ciclista> equipo;
    private String nombre;
    private static Double sumaTiempo;
    private String pais;

    public Equipo(String nombre, String pais) {
        this.equipo = new ArrayList<>();
        this.nombre = nombre;
        this.pais = pais;
    }

    public ArrayList<Ciclista> getEquipo() {
        return equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Double getSumaTiempo() {
        return sumaTiempo;
    }

    public static void setSumaTiempo(Double sumaTiempo) {
        Equipo.sumaTiempo = sumaTiempo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void addCiclista(Ciclista ciclista){
        this.equipo.add(ciclista);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipo{");
        sb.append("equipo=").append(equipo);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Double tiempoEquipo(String nombreEquipo){

        return sumaTiempo;
    }
}
