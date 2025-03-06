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

    public Multimedia getCatalogo(int numero) {
        return catalogo.get(numero);
    }

    public ArrayList<Multimedia> getCatalogo() {
        return catalogo;
    }

    public ArrayList<Cliente> getSuscriptores() {
        return suscriptores;
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
        if(m.esPlus) {
            if (!c.esPro()) {
                this.ganancias += m.getPrecio();
            }
        }
    }

    public double getGanancias(){
        double tarifa=0;
        for (Cliente c : suscriptores){
            tarifa+=(c.getPrecioMensual()*12);
        }

        return this.ganancias+tarifa;
    }


}
