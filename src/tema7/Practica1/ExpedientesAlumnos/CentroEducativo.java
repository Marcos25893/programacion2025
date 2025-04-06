package tema7.Practica1.ExpedientesAlumnos;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class CentroEducativo {

    private TreeSet<Expediente> expedientes;
    private String nombreCentro;
    private String direccion;
    private String localidad;
    private String telefono;
    private String email;

    public CentroEducativo(String nombreCentro, String direccion, String localidad, String telefono, String email) {
        this.expedientes = new TreeSet<>();
        this.nombreCentro = nombreCentro;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.email = email;
    }

    public TreeSet<Expediente> getExpedientes() {
        return expedientes;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "expedientes=" + expedientes +
                ", nombreCentro='" + nombreCentro + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CentroEducativo that = (CentroEducativo) o;
        return Objects.equals(nombreCentro, that.nombreCentro);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreCentro);
    }

    public void addExpediente(Expediente e){
        this.expedientes.add(e);
    }

    public String buscarExpediente(String dni){
        for (Expediente e : expedientes){
            if (e.getEstudiante().getDni().equals(dni)){
                return pintarExpediente(e);
            }
        }
        return "";
    }

    private String pintarExpediente(Expediente e){
        StringBuffer sb = new StringBuffer();

        sb.append(e.getEstudiante()).append("{");
        sb.append("\n");
        for (NotasCurso nc : e.getNotas()){
            sb.append("\t").append(nc).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
