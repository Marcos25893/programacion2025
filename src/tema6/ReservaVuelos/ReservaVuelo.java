package tema6.ReservaVuelos;

import java.util.ArrayList;

public class ReservaVuelo {

    private static long id;
    private Vuelo vuelo;
    private ArrayList<Pasajero> pasajeros;
    private TipoTarifa tipoT;
    private TipoAsiento tipoA;

    public ReservaVuelo(Vuelo vuelo, TipoTarifa tipoT, TipoAsiento tipoA) {
        id = 1;
        this.vuelo = vuelo;
        this.pasajeros = new ArrayList<>();
        this.tipoT = tipoT;
        this.tipoA = tipoA;
        id++;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
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

    public void addPasajero(Pasajero p){
        this.pasajeros.add(p);
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

       if (vuelo.verificarDisponibilidad(pasajero.getAsiento().getTipoAsiento())!=0){

           Pasajero p1 = new Pasajero(pasajero);
           pasajeros.add(p1);

           Asiento a1 = vuelo.buscarAsientoDisponible(pasajero.getAsiento().getTipoAsiento());

           vuelo.ocuparAsiento(p1,a1);
           return true;
       }else
           return false;
    }

    public Double calcularPrecioTotal(){
        double precio=0.0;
        precio=vuelo.getPrecioBase();

        if (tipoT.equals(TipoTarifa.OPTIMA)){
            precio*=1.1;
        }else if (tipoT.equals(TipoTarifa.CONFORT)){
            precio*=1.15;
        } else if (tipoT.equals(TipoTarifa.FLEXIFLE)) {
            precio*=1.3;
        }

        return precio;
    }

    public String imprimirBilletes(){
        StringBuffer sb = new StringBuffer("Billetes{");
        for (Pasajero p : pasajeros) {
            sb.append("ID= ").append(p.getId());
            sb.append(", Asiento= ").append(p.getAsiento());
            sb.append(", PrecioTotal= ").append(calcularPrecioTotal());
            sb.append("\n");
        }
        return toString();
    }


}
