package tema7.Ejercicios.RepasoColecciones.TreeMap;

import java.time.LocalDateTime;
import java.util.TreeMap;

public class AgendaCitas {

    private TreeMap<LocalDateTime, String> citas;

    public AgendaCitas() {
        this.citas = new TreeMap<>(); //ordena por LocalDateTime por defecto
    }

    public boolean addCita(String desc, LocalDateTime fecha){
        if (fecha.isBefore(LocalDateTime.now()))
            return false; //No puedes organizar una cita anterior a ahora

        //Comprobar que no tenemos una cita en esa fecha
        if (this.citas.containsKey(fecha))
            return false;

        this.citas.put(fecha, desc);
        return true;
    }

    public void mostrarProximaCitas(){
        for (LocalDateTime f : this.citas.keySet()){
            System.out.println(f + " -> " + this.citas.get(f));
        }
    }

    public String deleteCita(LocalDateTime fecha){
        return this.citas.remove(fecha); //Devuelve un String
    }
}
