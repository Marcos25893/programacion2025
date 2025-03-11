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
        if (vuelo.verificarDisponibilidad(tAsiento)>pasajeros.size()){
            ReservaVuelo rv = new ReservaVuelo(vuelo,tTarifa,tAsiento);

            for (Pasajero p : pasajeros) {
                rv.reservaAsiento(p);
            }
            addReservas(rv);
            return true;
        }else
            return false;
    }

    public boolean cancelarReserva(long id){
        for (ReservaVuelo rv : reservas){
            if (rv.equals(id)){
                for(Asiento a : rv.getAsiento()){
                    rv.getVuelo().liberarAsiento(a);
                }
                reservas.remove(rv);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Vuelo> buscarVuelos(String destino){
        ArrayList<Vuelo> vuelosDestino = new ArrayList<>();
        for (Vuelo v : vuelos){
            if (v.getDestino().equalsIgnoreCase(destino)){
                vuelosDestino.add(v);
            }
        }
        return vuelosDestino;

    }

    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha){
        ArrayList<Vuelo> vuelosDestino = new ArrayList<>();
        for (Vuelo v : vuelos){
            if (v.getFecha().equals(fecha)){
                vuelosDestino.add(v);
            }
        }
        return vuelosDestino;
    }

    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha, String destino){
        ArrayList<Vuelo> vuelosDestino = new ArrayList<>();
        for (Vuelo v : vuelos){
            if (v.getFecha().isEqual(fecha) && v.getDestino().equalsIgnoreCase(destino)){
                vuelosDestino.add(v);
            }
        }
        return vuelosDestino;
    }

    public ArrayList<ReservaVuelo> buscarReservas(String dni){
        ArrayList<ReservaVuelo> reservaVuelos = new ArrayList<>();

        for (ReservaVuelo rv : reservas){
            for (Pasajero pj : rv.getPasajeros()){
                if (pj.getDniPasaporte().equals(dni)){
                    reservaVuelos.add(rv);
                }
            }
        }

        return reservaVuelos;
    }
}
