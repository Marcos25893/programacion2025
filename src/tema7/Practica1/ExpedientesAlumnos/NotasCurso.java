package tema7.Practica1.ExpedientesAlumnos;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

public class NotasCurso {

    private Etapa etapaEducativa;
    private String nombreCiclo;
    private Integer curso;
    private HashMap<String, Double> notas;
    private LocalDate anio;

    public NotasCurso(Etapa etapaEducativa, String nombreCiclo, Integer curso, LocalDate anio) throws Exception {
        this.etapaEducativa = etapaEducativa;
        this.nombreCiclo = nombreCiclo;
        if (curso>4 || curso<1){
            throw new Exception ("Valor del curso no valido");
        }
        this.curso = curso;
        this.notas = new HashMap<>();
        this.anio = anio;
    }

    public Etapa getEtapaEducativa() {
        return etapaEducativa;
    }

    public void setEtapaEducativa(Etapa etapaEducativa) {
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

    public void deleteNota(String asignatura){
        this.notas.remove(asignatura);
    }

    public double buscar(String asignatura){
        if (this.notas.containsKey(asignatura)){
            return this.notas.get(asignatura);
        }else
            return -1;
    }

    public String pintar(){
        StringBuffer sb = new StringBuffer();
        TreeMap<String, Double> ordenado = new TreeMap<>(Comparator.comparing(String::trim));

        ordenado.putAll(notas);

        for (String asignatura : ordenado.keySet()){
            sb.append(asignatura).append(" -> ").append(ordenado.get(asignatura)).append("\n");
        }

        return sb.toString();
    }


}
