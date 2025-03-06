package tema6.ReservaVuelos;

public class Pasajero extends Persona{

    private String preferenciasComida;
    private String restriccionesMedicas;
    private Asiento asiento;

    public Pasajero(String nombre, String apellidos, String dniPasaporte, String email, String direccion, String ciudad,
                    String pais, String telefono, String preferenciasComida, String restriccionesMedicas, Asiento asiento) {
        super(nombre, apellidos, dniPasaporte, email, direccion, ciudad, pais, telefono);
        this.preferenciasComida = preferenciasComida;
        this.restriccionesMedicas = restriccionesMedicas;
        this.asiento = asiento;
    }

    public Pasajero(Pasajero p){
        super(p.nombre, p.apellidos, p.dniPasaporte, p.email, p.direccion, p.ciudad, p.pais, p.telefono);
        this.preferenciasComida = p.preferenciasComida;
        this.restriccionesMedicas = p.restriccionesMedicas;
        this.asiento = p.asiento;
    }

    public String getPreferenciasComida() {
        return preferenciasComida;
    }

    public void setPreferenciasComida(String preferenciasComida) {
        this.preferenciasComida = preferenciasComida;
    }

    public String getRestriccionesMedicas() {
        return restriccionesMedicas;
    }

    public void setRestriccionesMedicas(String restriccionesMedicas) {
        this.restriccionesMedicas = restriccionesMedicas;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pasajero{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dniPasaporte='").append(dniPasaporte).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", preferenciasComida='").append(preferenciasComida).append('\'');
        sb.append(", restriccionesMedicas='").append(restriccionesMedicas).append('\'');
        sb.append(", asiento=").append(asiento);
        sb.append('}');
        return sb.toString();
    }


}
