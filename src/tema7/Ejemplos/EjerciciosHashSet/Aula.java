package tema7.Ejemplos.EjerciciosHashSet;

import java.util.ArrayList;

public class Aula {

    private ArrayList<Alumno> alumnos;
    private String nombre;
    private String ubicacion;

    public Aula(String nombre, String ubicacion) {
        this.alumnos = new ArrayList<>();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aula{");
        sb.append("alumnos=").append(alumnos);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", ubicacion='").append(ubicacion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void removeAlumno(Alumno alumno){
        this.alumnos.remove(alumno);
    }

    public String listarAlumnos(){

        StringBuffer sc = new StringBuffer("Aula{");
        sc.append("alumnos=").append(alumnos);

        return sc.toString();
    }

}
