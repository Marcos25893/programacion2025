package tema4.EjerciciosClase;

public class Coche {
    private int velocidad;

    public Coche(int velocidad) {
        this.velocidad = velocidad;
    }

    public Coche() {
        this.velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelera(int mas){
        this.velocidad+=mas;
    }
    public void frena(int menos){
        this.velocidad-=menos;
        if (this.velocidad<0){
            this.velocidad=0;
        }
    }
}
