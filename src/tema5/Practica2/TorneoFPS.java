package tema5.Practica2;

import java.util.ArrayList;

public class TorneoFPS extends Torneo{

    public TorneoFPS(String nombre) {
        super(nombre);
        this.equipos = new ArrayList<>();
    }

    public void inscribirEquipoFPS(Equipo equipo) throws Exception{

        if (equipo instanceof EquipoFPS){
            this.equipos.add(equipo);
        }else
            throw new Exception("EquipoNoValidoException");
    }
}
