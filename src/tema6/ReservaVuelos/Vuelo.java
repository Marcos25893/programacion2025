package tema6.ReservaVuelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Vuelo {

    private UUID codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private Double precioBase;
    private Integer asientosDisponibles;
    private ArrayList<Asiento> asientos;


    public Vuelo(String origen, String destino, LocalDate fecha, LocalTime hora, Double precioBase, Integer asientosDisponibles) {
        this.codigo = UUID.randomUUID();
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precioBase = precioBase;
        this.asientosDisponibles = asientosDisponibles;
        this.asientos = new ArrayList<>();

        this.asientos=crearAsientos();

    }

    public ArrayList<Asiento> crearAsientos(){

        int numeroFila=1;
        int sumaletra=1;
        String letra="1";
        boolean variable =false;
        double asientosTurista=this.asientosDisponibles*0.7;

        for (int i=0;i<this.asientosDisponibles;i++){

            if (letra.equals("1") || letra.equals("10")){
                variable =true;
            }else{
                variable =false;
            }

            if (i<asientosTurista){

                Asiento at1 = new AsientoTurista(this.precioBase,numeroFila,letra, variable);
                asientos.add(at1);
            }else {

                Asiento ab1 = new AsientoBusiness(this.precioBase,numeroFila,letra, variable);
                asientos.add(ab1);
            }

            sumaletra++;
            if (sumaletra>10){
                sumaletra=1;
            }
            letra= String.valueOf(sumaletra);
            if (letra.equals("1")){
                numeroFila++;
            }
        }

        return asientos;
    }

    public void addAsiento(Asiento a){
        this.asientos.add(a);
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(Integer asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "codigo='" + codigo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", precioBase=" + precioBase +
                ", asientosDisponibles=" + asientosDisponibles +
                ", asientos=" + asientos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(codigo, vuelo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    public int verificarDisponibilidad(TipoAsiento tipoAsiento){
        int cantidadAsientos=0;

        for (Asiento a : asientos){
            if (a.getTipoAsiento().equals(tipoAsiento) && a.getPasajero()==null){
                cantidadAsientos++;
            }
        }

        return cantidadAsientos;
    }

    public Asiento buscarAsientoDisponible(TipoAsiento tipoAsiento){

        for (Asiento a : asientos){
            if(a.getTipoAsiento().equals(tipoAsiento) && a.getPasajero()==null){
                return a;
            }
        }

        return null;
    }

    public boolean ocuparAsiento(Pasajero p, Asiento a){
        if (a.getPasajero()==null){
            a.setPasajero(p);
            p.setAsiento(a);
            return true;
        }else
            return false;
    }

    public void liberarAsiento(Asiento a){
        if (a.getPasajero()!=null){
            a.getPasajero().setAsiento(null);
            a.setPasajero(null);
        }
    }

    public long diasFaltanVuelo(){
        return ChronoUnit.DAYS.between(LocalDate.now(),fecha);
    }

    public ArrayList<Pasajero> getPasajero(){
        ArrayList<Pasajero> pasajeros = new ArrayList<>();

        for (Asiento a : asientos){
            if (a.getPasajero()!=null){
                pasajeros.add(a.getPasajero());
            }
        }

        return pasajeros;
    }

}
