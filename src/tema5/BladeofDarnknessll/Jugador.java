package tema5.BladeofDarnknessll;

public class Jugador extends Personaje{
    enum Clase{MAGO, BRUJO, BARBARO, CABALLERO}
    private Clase clase;
    private Integer experiencia;
    private Arma armaDerecha;
    private Arma armaIzquierda;


    public Jugador(String nombre, Integer nivel, Double salud, Clase clase, Integer experiencia, Arma armaDerecha, Arma armaIzquierda) {
        super(nombre, nivel, salud);
        this.clase = clase;
        this.experiencia = experiencia;
        this.armaDerecha = armaDerecha;
        this.armaIzquierda = armaIzquierda;
    }

    public Jugador(String nombre, Integer nivel, Double salud, Clase clase, Integer experiencia) {
        super(nombre, nivel, salud);
        this.clase = clase;
        this.experiencia = experiencia;
    }

    public Jugador() {
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

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "clase=" + clase +
                ", experiencia=" + experiencia +
                ", armaDerecha=" + armaDerecha +
                ", armaIzquierda=" + armaIzquierda +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
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
     * El monstruo recibe daño dependiedo de si estamos usando dos armas o un mandoble
     *Luego comprueba si el monstruo sigue con vida
     * Si el mosntruo muero el jugador recibe la experiencia correspondiente
     * Si llega 100 la experiencia sube de nivel
     * @param personaje
     */
    @Override
    public void golpear(Personaje personaje) {
        if (this.getArmaDerecha() != null){
            personaje.reducirVida(this.getArmaDerecha().getPuntosD());
            if (!this.armaDerecha.getDosManos()){
                if (this.getArmaIzquierda() != null){
                    personaje.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }
        if (personaje.getSalud()<=0){
            System.out.println(personaje.getNombre() + " ha sido derrotado");
            this.experiencia+=10*personaje.getNivel();
            if (this.experiencia>=100){
                this.experiencia-=100;
                subirNivel();
            }
        }
    }
}
