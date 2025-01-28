package tema4.Practica1.AcademiaMagia;

import java.util.Objects;

public class Prueba {

    private String descripcion;
    private int nivelDificultad;
    private int recompensa;

    public Prueba(String descripcion, int nivelDificultad, int recompensa) {
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prueba{");
        sb.append("descripcion='").append(descripcion).append('\'');
        sb.append(", nivelDificultad=").append(nivelDificultad);
        sb.append(", recompensa=").append(recompensa);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Si devuelve true si la potencia del hechizo es
     * mayor que la dificultad de la prueba
     * y false en caso contrario
     * @param hechizo
     * @return
     */
    public boolean resolver(Hechizo hechizo){
        if (hechizo.getPotencia()>=this.getNivelDificultad()){
            return true;
        }else return false;

    }
}
