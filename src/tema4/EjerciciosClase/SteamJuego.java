package tema4.EjerciciosClase;

public class SteamJuego {

    private String nombre;
    private String descripcionCorta;
    private Integer mediaJugadoresDiarios;
    private Integer diasDesdeSalida;
    private Double precio;
    private Integer puestoMasVendidos;

    public SteamJuego(String nombre, String descripcionCorta, Integer mediaJugadoresDiarios, Double precio, Integer diasDesdeSalida, Integer puestoMasVendidos) {
        this.nombre = nombre;
        this.descripcionCorta = descripcionCorta;
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
        this.precio = precio;
        this.diasDesdeSalida = diasDesdeSalida;
        this.puestoMasVendidos = puestoMasVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public Integer getMediaJugadoresDiarios() {
        return mediaJugadoresDiarios;
    }

    public void setMediaJugadoresDiarios(Integer mediaJugadoresDiarios) {
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getPuestoMasVendidos() {
        return puestoMasVendidos;
    }

    public void setPuestoMasVendidos(Integer puestoMasVendidos) {
        this.puestoMasVendidos = puestoMasVendidos;
    }

    public Integer getDiasDesdeSalida() {
        return diasDesdeSalida;
    }

    public void setDiasDesdeSalida(Integer diasDesdeSalida) {
        this.diasDesdeSalida = diasDesdeSalida;
    }

    public void jugadoresDia(int jugadoresHoy){
        this.mediaJugadoresDiarios=((mediaJugadoresDiarios*diasDesdeSalida)+jugadoresHoy)/(diasDesdeSalida+1);
    }
}
