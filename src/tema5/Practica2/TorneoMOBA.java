package tema5.Practica2;

import java.util.ArrayList;

public class TorneoMOBA extends Torneo{


    public TorneoMOBA(String nombre) {
        super(nombre);
        this.equipos = new ArrayList<>();
    }

    public void inscribirEquipoMoba(Equipo equipo) throws Exception{

        if (equipo instanceof EquipoMOBA){
            this.equipos.add(equipo);
        }else
            throw new Exception("EquipoNoValidoException");
    }


}
