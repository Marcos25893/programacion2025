package tema4.Practica1.bladedark;

public class Monstruo {

    enum Clase{GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA}
    private String nombre;
    private Clase clase;
    private Integer nivel;
    private Double salud;
    private Integer puntosD;

    public Monstruo(String nombre, Clase clase, Double salud, Integer nivel, Integer puntosD) {
        this.nombre = nombre;
        this.clase = clase;
        this.salud = salud;
        this.nivel = nivel;
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
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }

    /**
     * El monstruo sube de nivel hasta un maximo de 10
     */
    public void subirNivelM(){
        if(this.nivel!=10) {
            this.nivel += 1;
            this.salud += Math.pow(2, this.nivel);
        }
    }

    /**
     * El monstruo pierde salud tanto como le pasemos por parametro
     * @param puntosD
     * @return
     */
    public boolean reducirVidaM(int puntosD){
        boolean muerto=false;
        this.salud-=puntosD;
        if (this.salud<=0){
            this.salud=0.0;
            muerto=true;
        }
        return muerto;
    }

    /**
     * El monstruo golpea al jugador y comprueba si esta derrotado
     * @param jugador
     */
    public void golpearM(Jugador jugador){
        jugador.reducirVidaJ(getPuntosD());
        if (jugador.getSalud()<=0){
            System.out.println("El jugador a sido derrotado");
        }

    }

}
