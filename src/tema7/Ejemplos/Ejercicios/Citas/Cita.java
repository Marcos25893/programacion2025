package tema7.Ejemplos.Ejercicios.Citas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {

    enum Tipo{PRIMERA, REVISION, CONSULTA}

    private Paciente paciente;
    private LocalDate fecha;
    private LocalTime hora;
    private Tipo tipo;

    public Cita(Paciente paciente, LocalDate fecha, LocalTime hora, Tipo tipo) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo = tipo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cita{");
        sb.append("paciente=").append(paciente);
        sb.append(", fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
}
