package tema5.EjerciciosPracticarPOO.Ejercicio6;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Agenda{");
        sb.append("contactos=").append(contactos);
        sb.append('}');
        return sb.toString();
    }

    public boolean existeContacto(Contacto c){
        boolean existe=false;
        for (Contacto contacto : contactos){
            if (contacto.getNombre().equalsIgnoreCase(c.getNombre())){
                existe= true;
            }
        }
        return existe;
    }

    public void anadirContacto(Contacto c){
        if (!existeContacto(c)){
            this.contactos.add(c);
        }else System.out.println("Ya existe el conctacto");
    }

    public void eliminarContacto(Contacto c){
        if (existeContacto(c)){
            this.contactos.remove(c);
            System.out.println("Se ha eliminado el contacto");
        }else System.out.println("No se ha podido eliminar");
    }

    public void listarContactos(){
        System.out.println(toString());
    }

    public String buscarContacto(String nombre){
        String numero="";
        for (Contacto con : contactos){
            if (con.getNombre().equalsIgnoreCase(nombre)){
                numero=con.getTelefono();
            }
        }
        return numero;
    }

}
