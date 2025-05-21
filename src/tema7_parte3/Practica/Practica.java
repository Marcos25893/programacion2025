package tema7_parte3.Practica;

import tema7_parte3.Examen2024.models.EstadoTicket;
import tema7_parte3.Examen2024.models.Tecnico;
import tema7_parte3.Examen2024.models.TicketSoporte;
import tema7_parte3.Examen2024.models.Usuario;
import tema7_parte3.Examen2024.services.ServicioSoporte;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Practica {

    /**
     * Añade todos los archivos csv tanto a usuarios, tecnicos y tickets
     */
    public static void cargarCSV(){

        ServicioSoporte ss = new ServicioSoporte();

        try {
            Files.lines(Paths.get("resource/examen2024/usuarios.csv"))
                    .forEach(u -> {
                        List<String> tokens = Arrays.asList(u.split(","));
                        Usuario user = new Usuario(
                                Long.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                LocalDate.parse(tokens.get(5))
                        );
                        ss.addUsuario(user);
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            Files.lines(Paths.get("resources/examen2024/tecnico.csv"))
                    .forEach(t -> {
                        List<String> tokens = Arrays.asList(t.split(","));
                        Tecnico tec = new Tecnico(
                                Long.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                Tecnico.Especialidad.valueOf(tokens.get(5)),
                                Double.valueOf(tokens.get(6))
                        );
                        ss.addTecnico(tec);
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.lines(Paths.get("resource/examen2024/tickets"))
                    .forEach(t -> {
                        List<String> tokens = Arrays.asList(t.split(","));
                        LocalDate fechaFin = null;
                        if(EstadoTicket.RESUELTO.equals(EstadoTicket.valueOf(tokens.get(3)))){
                            fechaFin = LocalDate.parse(tokens.get(2));
                        }
                        TicketSoporte ts = new TicketSoporte(
                                Long.valueOf(tokens.get(0)),
                                LocalDate.parse(tokens.get(1)),
                                fechaFin,
                                EstadoTicket.valueOf(tokens.get(3)),
                                Integer.valueOf(tokens.get(4)),
                                ss.findUsuarioById(Long.valueOf(tokens.get(5))),
                                ss.findTecnicoById(Long.valueOf(tokens.get(6))),
                                tokens.get(7)
                        );
                        ss.addTicketSoporte(ts);
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    /**
     * Sobreescribe los archivos csv
     * @param ss Es el ServicioSoporte que le pasamos y a partir de unas modificaciones
     */
    public static void grabarCSV(ServicioSoporte ss){

        try {
            Files.write(Paths.get("resource/usuarios.csv"),
                    ss.getUsuarios().stream()
                            .map(u -> {
                                StringBuffer sb = new StringBuffer();
                                sb.append(u.getId()).append(",");
                                sb.append(u.getNombre()).append(",");
                                sb.append(u.getApellidos()).append(",");
                                sb.append(u.getEmail()).append(",");
                                sb.append(u.getMovil()).append(",");
                                sb.append(u.getFechaAlta());
                                return sb.toString();
                            })
                            .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.write(Paths.get("resource/examen2024/tecnico.csv"),
                    ss.getTecnicos().stream()
                            .map(t -> {
                                StringBuffer sb = new StringBuffer();
                                sb.append(t.getId()).append(",");
                                sb.append(t.getNombre()).append(",");
                                sb.append(t.getApellidos()).append(",");
                                sb.append(t.getEmail()).append(",");
                                sb.append(t.getMovil()).append(",");
                                sb.append(t.getEspecialidad()).append(",");
                                sb.append(t.getValoracion());
                                return sb.toString();
                            }).toList(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.write(Paths.get("resource/examen2024/tickets.csv"),
                    ss.getTickets().stream()
                            .map(t -> {
                                StringBuffer sb = new StringBuffer();
                                sb.append(t.getId()).append(",");
                                sb.append(t.getFechaCreacion()).append(",");
                                if (t.getFechaFinalizacion()!= null)
                                    sb.append(t.getFechaFinalizacion()).append(",");
                                else
                                    sb.append(",");
                                sb.append(t.getEstado()).append(",");
                                sb.append(t.getPrioridad()).append(",");
                                sb.append(t.getUsuario().getId()).append(",");
                                sb.append(t.getTecnico().getId()).append(",");
                                sb.append(t.getComentarios()).append(",");
                                return sb.toString();
                            })
                            .toList(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}

