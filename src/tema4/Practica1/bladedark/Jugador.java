package tema4.Practica1.bladedark;

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

    /**
     * Comprueba que el nivel del jugador es menor que 10
     * y sube un nivel al personaje
     */
    public void subirNivelJ(){
        if(this.nivel!=10) {
            this.nivel += 1;
            this.salud += Math.pow(2.5, this.nivel);
        }
    }

    /**
     * Comprueba si puede equipar el arma
     * y si se puede se la equipa
     * @param arma
     * @return
     */
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

    /**
     * El jugador se quita el arma que le pasemos
     * @param arma
     */
    public void dejarArma(Arma arma){
        if (this.armaDerecha==arma && this.armaIzquierda==arma){
            this.armaDerecha=null;
            this.armaIzquierda=null;
        } else if (this.armaDerecha==arma) {
            this.armaDerecha=null;
        } else if (this.armaIzquierda==arma) {
            this.armaIzquierda=null;
        }else System.out.println("No llevas equipada ese arma");
    }

    /**
     * Si el personaje todavia tiene salud
     * Aumenta su salud dependiendo del parametro que le pasemos
     * hasta 10000 de vida
     * @param puntosS
     */
    public void tomarPocion(int puntosS){
        if (this.salud==0){
            System.out.println("No puedes tomar pociones, tu personaje esta muerto");
        }else {
            this.salud += puntosS;
            if (this.salud > 10000) {
                System.out.println("La salud esta al maximo");
                this.salud = 10000.0;
            }
        }
    }

    /**
     * El jugador pierde vida
     * y comprueba que esta muerto
     * @param puntosD
     * @return
     */
    public boolean reducirVidaJ(int puntosD){
        boolean muerto=false;
        this.salud-=puntosD;
        if (this.salud<=0){
            this.salud=0.0;
            muerto=true;
        }
        return muerto;
    }

    /**
     * El monstruo recibe daño dependiedo de si estamos usando dos armas o un mandoble
     *Luego comprueba si el monstruo sigue con vida
     * Si el mosntruo muero el jugador recibe la experiencia correspondiente
     * Si llega 100 la experiencia sube de nivel
     * @param monstruo
     */
    public void golpearJ(Monstruo monstruo){
        if (this.getArmaDerecha() != null){
            monstruo.reducirVidaM(this.getArmaDerecha().getPuntosD());
            if (!this.armaDerecha.getDosManos()){
                if (this.getArmaIzquierda() != null){
                    monstruo.reducirVidaM(this.getArmaIzquierda().getPuntosD());
                }
            }
        }
        if (monstruo.getSalud()<=0){
            System.out.println("El monstruo a sido derrotado");
            this.experiencia+=10*monstruo.getNivel();
            if (this.experiencia>=100){
                this.experiencia-=100;
                subirNivelJ();
            }
        }

    }
}


