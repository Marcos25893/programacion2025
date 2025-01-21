package tema4.PracticaClase;

public class Arma {

    enum tipoArma { ESPADA, MARTILLO, HACHA;

    }
    private String nombre;
    private tipoArma tipo;
    private Integer golpe;

    public Arma(String nombre, Integer vida, Integer golpe, tipoArma tipo) {
        this.nombre = nombre;
        this.golpe = golpe;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje2{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", golpe=").append(golpe);
        sb.append('}');
        return sb.toString();
    }

    public Arma() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipoArma getTipo() {
        return tipo;
    }

    public void setTipo(tipoArma tipo) {
        this.tipo = tipo;
    }

    public Integer getGolpe() {
        return golpe;
    }

    public void setGolpe(Integer golpe) {
        this.golpe = golpe;
    }

    public void golpear(Personaje pj){
        pj.setVida(pj.getVida() - this.golpe);
    }
}
