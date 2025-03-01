package tema6.AlquilerPeliculas;

import java.util.ArrayList;

public class PrimeVideo {

    private ArrayList<Multimedia> catalogo;
    private ArrayList<Cliente> suscriptores;
    private double ganancias;

    public PrimeVideo() {
        this.catalogo = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
        this.ganancias = 0;
    }

    public void addSuscriptor(Cliente cliente){
        boolean sus=false;
        for (Cliente c : suscriptores) {
            if (c.equals(cliente)){
                sus=true;
            }
        }
        if (!sus){
            this.suscriptores.add(cliente);
        }
    }

    public void addMultimedia(Multimedia multimedia){
        boolean peli=false;
        for (Multimedia m : catalogo) {
            if (m.equals(multimedia)){
                peli=true;
            }
        }
        if (!peli) {
            this.catalogo.add(multimedia);
        }
    }

    public void ver(Multimedia m, Cliente c){
        if (!c.esPro()){
            this.ganancias+= m.getPrecio();
        }
    }

    public double getGanancias(){
        for (Cliente c : suscriptores){
            this.ganancias+=(c.getPrecioMensual()*12);
        }


        return this.ganancias;
    }

}
