package tema6.ReservaVuelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Atrapame {

    private ArrayList<Vuelo> vuelos;
    private ArrayList<ReservaVuelo> reservas;

    public Atrapame() {
        this.vuelos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public ArrayList<ReservaVuelo> getReservas() {
        return reservas;
    }

    public void addVuelo(Vuelo vuelo){
        this.vuelos.add(vuelo);
    }

    public void addReservas(ReservaVuelo reservas){
        this.reservas.add(reservas);
    }

    public boolean crearReserva(Vuelo vuelo, ArrayList<Pasajero> pasajeros, TipoTarifa tTarifa, TipoAsiento tAsiento){
        if (vuelo.getAsientosDisponibles()>pasajeros.size()){
            ReservaVuelo rv = new ReservaVuelo(vuelo,tTarifa,tAsiento);

            for (int i=0;i< pasajeros.size();i++) {
                rv.addPasajero(pasajeros.get(i));
                rv.reservaAsiento(pasajeros.get(i));
            }
            addReservas(rv);
            return true;
        }else
            return false;
    }

//    public boolean cancelarReserva(long id){
//        for (ReservaVuelo rv : reservas){
//            if (rv.equals(id)){
//
//                rv.getVuelo().liberarAsiento(rv.getVuelo().getAsientos().get(1));
//            }
//        }
//    }

    public ArrayList<Vuelo> buscarVuelos(String destino){
        ArrayList<Vuelo> vuelosDestino = new ArrayList<>();
        for (Vuelo v : vuelos){
            if (v.getDestino().equals(destino)){
                vuelosDestino.add(v);
            }
        }
        return vuelosDestino;

    }

    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha){
        ArrayList<Vuelo> vuelosDestino = new ArrayList<>();
        for (Vuelo v : vuelos){
            if (v.getFecha().isEqual(fecha)){
                vuelosDestino.add(v);
            }
        }
        return vuelosDestino;
    }

    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha, String destino){
        ArrayList<Vuelo> vuelosDestino = new ArrayList<>();
        for (Vuelo v : vuelos){
            if (v.getFecha().isEqual(fecha) && v.getDestino().equals(destino)){
                vuelosDestino.add(v);
            }
        }
        return vuelosDestino;
    }

    public ArrayList<ReservaVuelo> buscarReservas(String dni){
        ArrayList<Pasajero> pasajeros = new ArrayList<>();
        ArrayList<ReservaVuelo> reservaVuelos = new ArrayList<>();

        for (ReservaVuelo rv : reservas){
            for (Pasajero pj : rv.getPasajeros()){
                if (pj.getDniPasaporte().equals(dni)){
                    pasajeros.add(pj);
                    reservaVuelos.add(rv);
                }
            }
        }

        return reservaVuelos;
    }
}
