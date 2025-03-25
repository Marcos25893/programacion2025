package tema7.Ejemplos.Ejercicios.Citas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class CitasConsulta {

    private ArrayList<Cita> citas;

    public CitasConsulta() {
        this.citas = new ArrayList<>();
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    public void addCita(Cita cita){
        if (!citas.contains(cita)){
            this.citas.add(cita);
        }
    }

    public void removeCita(Cita cita){
        this.citas.remove(cita);
    }

    public String listarCitas(ArrayList<Cita> citasOrdenadas) {
        final StringBuffer sb = new StringBuffer("CitasConsulta{");
        sb.append("citas{");
        for (Cita c : citasOrdenadas){
            sb.append("\n").append(c);
        }
        sb.append('}');
        return sb.toString();
    }

    public void listarCitasPorNombre(){
        ArrayList<Cita> citasNombre = new ArrayList<>(citas);
        citasNombre.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPaciente().getNombre().compareToIgnoreCase(o2.getPaciente().getNombre());
            }
        });
        System.out.println(listarCitas(citasNombre));
    }

    public void listarCitasPorApellido(){
        ArrayList<Cita> citasApellido = new ArrayList<>(citas);
        citasApellido.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPaciente().getApellidos().compareToIgnoreCase(o2.getPaciente().getApellidos());
            }
        });
        System.out.println(listarCitas(citasApellido));
    }


    public void listarCitasPorFechaYApellido(){
        ArrayList<Cita> citasFechaApellido = new ArrayList<>(citas);
        citasFechaApellido.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                if (o1.getFecha().compareTo(o2.getFecha())==0){
                   return o1.getPaciente().getApellidos().compareToIgnoreCase(o2.getPaciente().getApellidos());
                }else
                    return o1.getFecha().compareTo(o2.getFecha());
            }
        });
        System.out.println(listarCitas(citasFechaApellido));
    }

    public void listarCitasPorHora(LocalDate fecha){
        ArrayList<Cita> citasHora = new ArrayList<>();
        for (Cita c : citas){
            if (c.getFecha().isEqual(fecha)){
                citasHora.add(c);
            }
        }

        citasHora.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getHora().compareTo(o2.getHora());
            }
        });
        System.out.println(listarCitas(citasHora));
    }

    public void listarCitasFuturas(String email){
        ArrayList<Cita> citasFuturo = new ArrayList<>();
        for (Cita c : citas){
            if (c.getPaciente().getEmail().equalsIgnoreCase(email) && c.getFecha().isAfter(LocalDate.now())){
                citasFuturo.add(c);
            }
        }

        citasFuturo.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                if (o1.getFecha().compareTo(o2.getFecha())==0){
                    return o1.getHora().compareTo(o2.getHora());
                }else
                    return o1.getFecha().compareTo(o2.getFecha());
            }
        });
        System.out.println(listarCitas(citasFuturo));
    }
}
