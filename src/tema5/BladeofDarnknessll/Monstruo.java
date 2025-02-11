package tema5.BladeofDarnknessll;

public class Monstruo extends Personaje{
    enum Clase{GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA}
    protected Clase clase;
    protected Integer puntosD;

    public Monstruo(String nombre, Integer nivel, Double salud, Clase clase, Integer puntosD) {
        super(nombre, nivel, salud);
        this.clase = clase;
        this.puntosD = puntosD;
    }

    public Monstruo() {
        this.nivel = 1;
        this.salud = 100.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    @Override
    public String toString() {
        return "Monstruo{" +
                "clase=" + clase +
                ", puntosD=" + puntosD +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
    }

    /**
     * El monstruo golpea al jugador y comprueba si esta derrotado
     * @param personaje
     */
    @Override
    public void golpear(Personaje personaje) {
        personaje.reducirVida(getPuntosD());
        if (personaje.getSalud()<=0){
            System.out.println(personaje.getNombre() + " ha muerto");
        }
    }
}
