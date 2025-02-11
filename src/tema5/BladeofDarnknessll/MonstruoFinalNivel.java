package tema5.BladeofDarnknessll;

public class MonstruoFinalNivel extends Monstruo{

    private Integer golpeEspecial;
    private Integer usosGolpesEspecial;

    public MonstruoFinalNivel(String nombre, Integer nivel, Double salud, Clase clase, Integer puntosD, Integer golpeEspecial) {
        super(nombre, nivel, salud, clase, puntosD);
        this.golpeEspecial = golpeEspecial;
        this.usosGolpesEspecial = 3;
    }

    public Integer getGolpeEspecial() {
        return golpeEspecial;
    }

    public void setGolpeEspecial(Integer golpeEspecial) {
        this.golpeEspecial = golpeEspecial;
    }

    private Integer getUsosGolpesEspecial() {
        return usosGolpesEspecial;
    }

    private void setUsosGolpesEspecial(Integer usosGolpesEspecial) {
        this.usosGolpesEspecial = usosGolpesEspecial;
    }

    @Override
    public String toString() {
        return "MonstruoFinalNivel{" +
                "golpeEspecial=" + golpeEspecial +
                ", usosGolpesEspecial=" + usosGolpesEspecial +
                ", clase=" + clase +
                ", puntosD=" + puntosD +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
    }

    @Override
    public void golpear(Personaje personaje) {
        if (getUsosGolpesEspecial()!=0) {
            personaje.reducirVida(getGolpeEspecial());
            setUsosGolpesEspecial(this.usosGolpesEspecial-1);
            if (personaje.getSalud() <= 0) {
                System.out.println("El jugador a sido derrotado");
            }
        }
    }
}
