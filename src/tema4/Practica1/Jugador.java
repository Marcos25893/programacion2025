package tema4.Practica1;

public class Jugador {

    enum Clase{MAGO, BRUJO, BARBARO, CABALLERO}
    private String nombre;
    private Clase clase;
    private Integer nivel;
    private Integer experiencia;
    private Double salud;
    private Arma armaDerecha;
    private Arma armaIzquierda;


    public Jugador(String nombre, Clase clase, Integer nivel, Integer experiencia, Double salud, Arma armaDerecha, Arma armaIzquierda) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.salud = salud;
        this.armaDerecha = armaDerecha;
        this.armaIzquierda = armaIzquierda;
    }

    public Jugador() {
        this.nivel = 1;
        this.salud = 200.0;
        this.experiencia = 0;
        this.armaDerecha = null;
        this.armaIzquierda = null;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
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

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();
    }

    public void subirNivelJ(){
        if(this.nivel!=10) {
            this.nivel += 1;
            this.salud += Math.pow(2.5, this.nivel);
        }
    }

    public boolean equipar(Arma arma){
        boolean equipado=false;
        if (this.armaDerecha==null && arma.getDosManos()){
            equipado=true;
            this.armaDerecha=arma;
            this.armaIzquierda=arma;
        } else if (this.armaDerecha==null) {
            equipado=true;
            this.armaDerecha=arma;
        } else if (this.armaIzquierda==null && !arma.getDosManos()) {
            equipado=true;
            this.armaIzquierda=arma;
        }

        return equipado;
    }

    public void tomarPocion(int puntosS){
        this.salud += puntosS;
        if (this.salud>10000){
            this.salud=10000.0;
        }
    }

    public boolean reducirVidaJ(int puntosD){
        boolean muerto=false;
        this.salud-=puntosD;
        if (this.salud<=0){
            this.salud=0.0;
            muerto=true;
        }
        return muerto;
    }

    public void golpear(Monstruo monstruo){
        if (this.getArmaDerecha() != null){
            monstruo.reducirVidaM(this.getArmaDerecha().getPuntosD());
        }
    }
}


