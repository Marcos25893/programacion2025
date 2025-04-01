package tema7.Practica1.ExpedientesAlumnos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

public class NotasCurso {

    enum etapaEducativa{ESO, Bachillerato, FPBásica, FPMedio, FPSuperior}

    private etapaEducativa etapaEducativa;
    private String nombreCiclo;
    private Integer curso;
    private HashMap<String, Double> notas;
    private LocalDate anio;

    public NotasCurso(NotasCurso.etapaEducativa etapaEducativa, String nombreCiclo, Integer curso, HashMap<String, Double> notas, LocalDate anio) throws Exception {
        this.etapaEducativa = etapaEducativa;
        this.nombreCiclo = nombreCiclo;
        if (curso>4 || curso<1){
            throw new Exception ("Valor del curso no valido");
        }
        this.curso = curso;
        this.notas = notas;
        this.anio = anio;
    }

    public NotasCurso.etapaEducativa getEtapaEducativa() {
        return etapaEducativa;
    }

    public void setEtapaEducativa(NotasCurso.etapaEducativa etapaEducativa) {
        this.etapaEducativa = etapaEducativa;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public HashMap<String, Double> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<String, Double> notas) {
        this.notas = notas;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "NotasCurso{" +
                "etapaEducativa=" + etapaEducativa +
                ", nombreCiclo='" + nombreCiclo + '\'' +
                ", curso=" + curso +
                ", notas=" + notas +
                ", anio=" + anio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotasCurso that = (NotasCurso) o;
        return etapaEducativa == that.etapaEducativa && Objects.equals(nombreCiclo, that.nombreCiclo) && Objects.equals(curso, that.curso) && Objects.equals(anio, that.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etapaEducativa, nombreCiclo, curso, anio);
    }

    public void addNota(String asignatura, Double nota){
        this.notas.put(asignatura, nota);
    }
}
