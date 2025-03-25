package tema7.Ejercicios.Diccionario;

import java.util.Objects;

public class Entrada {

    private String palabraEspanol;
    private String traduccion;

    public Entrada(String palabraEspanol, String traduccion) {
        this.palabraEspanol = palabraEspanol;
        this.traduccion = traduccion;
    }

    public String getPalabraEspanol() {
        return palabraEspanol;
    }

    public void setPalabraEspanol(String palabraEspanol) {
        this.palabraEspanol = palabraEspanol;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entrada{");
        sb.append("palabraEspanol='").append(palabraEspanol).append('\'');
        sb.append(", traduccion='").append(traduccion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return Objects.equals(palabraEspanol, entrada.palabraEspanol);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palabraEspanol);
    }
}
