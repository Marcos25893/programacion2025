package tema5.Practica2;

import java.util.ArrayList;

public class Torneo {

    protected String nombre;
    protected ArrayList<Equipo> equipos;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    @Override
    public String toString() {
        return "Torneo{" +
                "nombre='" + nombre + '\'' +
                ", equipos=" + equipos +
                '}';
    }

    public void inscribirEquipo(Equipo equipo){
        this.equipos.add(equipo);
    }

    public Equipo jugarTorneo(){
        int ganador=0;
        for (Equipo equipo: equipos){
            if (ganador<equipo.calcularPuntos()){
                ganador= equipo.calcularPuntos();
            }
        }

        for (Equipo equipo: equipos){
            if (equipo.calcularPuntos()==ganador){
                return equipo;
            }
        }
        return null;
    }

    public void imprimirEquipos(){
        for (Equipo equipo: equipos){
            System.out.println(equipo + " - Puntos: " + equipo.calcularPuntos());
        }

    }



}
