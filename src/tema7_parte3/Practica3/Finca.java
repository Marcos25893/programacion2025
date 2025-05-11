package tema7_parte3.Practica3;

import java.util.Objects;

public class Finca {

    private Integer id;
    private String nombre;
    private Double longitud;
    private Double latitud;
    private Double superficie;
    private String localidad;
    private String provincia;

    public Finca(Integer id,String nombre, Double longitud, Double latitud, Double superficie, String localidad, String provincia) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.latitud = latitud;
        this.superficie = superficie;
        this.localidad = localidad;
        this.provincia = provincia;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Finca{" +
                "nombre='" + nombre + '\'' +
                ", longitud=" + longitud +
                ", latitud=" + latitud +
                ", superficie=" + superficie +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Finca finca = (Finca) o;
        return Objects.equals(id, finca.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
