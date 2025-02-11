package tema5.BladeofDarnknessll;

import java.util.Objects;

public abstract class Personaje {

    protected String nombre;
    protected Integer nivel;
    protected Double salud;

    public Personaje(String nombre, Integer nivel, Double salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public Personaje(){
        this.nivel = 5;
        this.salud = 300.0;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    /**
     * El personaje pierde vida
     * y comprueba que esta muerto
     * @param puntos
     * @return
     */
    public boolean reducirVida(int puntos){
        boolean muerto=false;
        this.salud-=puntos;
        if (this.salud<=0){
            this.salud=0.0;
            muerto=true;
        }
        return muerto;
    }

    /**
     * Comprueba que el nivel es menor que 10
     * y sube un nivel
     */
    public void subirNivel() {
        if(nivel!=10) {
            this.nivel += 1;
            this.salud += Math.pow(2, this.nivel);
        }
    }

    public abstract void golpear(Personaje personaje);

}
