package tema4.EjerciciosClase;

public class Satelite {

    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    public Satelite (double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }
    public Satelite () {
        meridiano=paralelo=distancia_tierra=0;
    }
    public void setPosicion(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }
//    public void printPosicion() {
//        System.out.print("El satélite se encuentra en ");
//        System.out.print("el paralelo "+paralelo+" meridiano "+meridiano);
//        System.out.print(" a una distancia de la Tierra de"+distancia_tierra+" kms.");
//    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Satelite{");
        sb.append("meridiano=").append(meridiano);
        sb.append(", paralelo=").append(paralelo);
        sb.append(", distancia_tierra=").append(distancia_tierra);
        sb.append('}');
        return sb.toString();
    }

    public void variaAltura(double desplazamiento){
        this.distancia_tierra+=desplazamiento;
    }

    public boolean enOrbita(){
        boolean Orbita =false;
            if (this.distancia_tierra!=0){
                Orbita = true;
            }
        return Orbita;
    }

    public void variaPosicion(double variap, double variam){
        this.paralelo+=variap;
        this.meridiano+=variam;
    }
}
