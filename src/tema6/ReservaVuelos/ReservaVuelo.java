package tema6.ReservaVuelos;

import java.util.ArrayList;

public class ReservaVuelo {

    private static long id;
    private Vuelo vuelo;
    private ArrayList<Pasajero> pasajeros;
    private TipoTarifa tipoT;
    private TipoAsiento tipoA;

    int valor=1;

    public ReservaVuelo(Vuelo vuelo, TipoTarifa tipoT, TipoAsiento tipoA) {
        this.id = valor;
        this.vuelo = vuelo;
        this.pasajeros = new ArrayList<>();
        this.tipoT = tipoT;
        this.tipoA = tipoA;
        valor++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        ReservaVuelo.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public TipoTarifa getTipoT() {
        return tipoT;
    }

    public void setTipoT(TipoTarifa tipoT) {
        this.tipoT = tipoT;
    }

    public TipoAsiento getTipoA() {
        return tipoA;
    }

    public void setTipoA(TipoAsiento tipoA) {
        this.tipoA = tipoA;
    }

    private void addPasajero(Pasajero p){
        if (!this.pasajeros.contains(p)) {
            this.pasajeros.add(p);
        }
    }

    public void removePasajero(Pasajero p){
        this.pasajeros.remove(p);
    }

    @Override
    public String toString() {
        return "ReservaVuelo{" +
                "id=" + id +
                ", CodigoVuelo=" + vuelo.getCodigo() +
                ", DiasParaVuelo=" + vuelo.diasFaltanVuelo() +
                ", imprimir billetes=" + imprimirBilletes() +
                '}';
    }



    public ArrayList<Asiento> getAsiento(){
        ArrayList<Asiento> asientos = new ArrayList<>();

        for (Asiento a : vuelo.getAsientos()){
            if (a.getPasajero()!=null){
                asientos.add(a);
            }
        }
        return asientos;
    }


    public boolean reservaAsiento(Pasajero pasajero){

       if (vuelo.verificarDisponibilidad(pasajero.getAsiento().getTipoAsiento())>0){

           Asiento a1 = vuelo.buscarAsientoDisponible(pasajero.getAsiento().getTipoAsiento());

           Pasajero p1 = new Pasajero(pasajero);
           addPasajero(p1);
           vuelo.ocuparAsiento(p1,a1);
           return true;

       }

       return false;
    }

    public Double calcularPrecioTotal(){
        double precio=0.0;
        precio=vuelo.getPrecioBase();

        for (Asiento a : getAsiento()){
            if (tipoT.equals(TipoTarifa.OPTIMA)){
                precio+=1.1*a.getPrecioBase();
            }else if (tipoT.equals(TipoTarifa.CONFORT)){
                precio+=1.15*a.getPrecioBase();
            } else if (tipoT.equals(TipoTarifa.FLEXIFLE)) {
                precio+=1.3*a.getPrecioBase();
            }
        }

        return precio;
    }

    public String imprimirBilletes(){
        StringBuffer sb = new StringBuffer("Billetes{");
        for (Pasajero p : pasajeros) {
            sb.append("DNI= ").append(p.getDniPasaporte());
            sb.append(", Asiento= ").append(p.getAsiento());
            sb.append("\n");
        }
        sb.append(", PrecioTotal= ").append(calcularPrecioTotal());
        return toString();
    }


}
