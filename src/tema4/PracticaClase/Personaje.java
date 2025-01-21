package tema4.PracticaClase;

public class Personaje {

    private String nombre;
    private String clase;
    private String sexo;
    private Integer vida;
    private Arma arma;

    public Personaje(String nombre, String clase, String sexo, Integer vida, Arma arma) {
        this.nombre = nombre;
        this.clase = clase;
        this.sexo = sexo;
        this.vida = vida;
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Personaje() {
        this.nombre="SinNombre";
        this.clase="Humano";
        this.sexo="nodefinido";
        this.vida=10;
        this.arma = null;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", vida=").append(vida);
        sb.append(", arma=").append(arma);
        sb.append('}');
        return sb.toString();
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void golpear(Personaje pj) {
        this.arma.golpear(pj);
    }

}
