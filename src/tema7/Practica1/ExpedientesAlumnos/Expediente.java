package tema7.Practica1.ExpedientesAlumnos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class Expediente implements Comparable<Expediente> {

    private Estudiante estudiante;
    private HashSet<NotasCurso> notas;
    private boolean activo;

    public Expediente(Estudiante estudiante, boolean activo) {
        this.estudiante = estudiante;
        this.notas = new HashSet<>();
        this.activo = activo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public HashSet<NotasCurso> getNotas() {
        return notas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("estudiante=").append(estudiante);
        sb.append(", notas=").append(notas);
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return Objects.equals(estudiante, that.estudiante);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(estudiante);
    }

    public void addNotas(NotasCurso nc){
        notas.add(nc);
    }

    public void mostrarNotas(int curso, Etapa etapa){

        for (NotasCurso nc : notas){
            if (nc.getEtapaEducativa().equals(etapa) && nc.getCurso()==curso){
                System.out.println(nc);
            }
        }
    }


    @Override
    public int compareTo(Expediente o) {
       return getEstudiante().getDni().compareTo(o.getEstudiante().getDni());
    }

}
