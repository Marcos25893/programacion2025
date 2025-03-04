package tema6.AlquilerPeliculas;

public class TestPeliculas {

    public static void main(String[] args) {

        PrimeVideo pv = new PrimeVideo();
        String dni="";

        for (int i=0;i<30;i++){
            Pelicula m1 = new Pelicula("",10,true, 90);
            pv.addMultimedia(m1);
        }

        for (int i=0;i<170;i++){
            Pelicula m1 = new Pelicula("",10,false, 90);
            pv.addMultimedia(m1);
        }

        for (int i=0;i<750;i++){
            dni= String.valueOf(i);
            ClientePrime cp1 = new ClientePrime(dni, "Paco", " ");
            pv.addSuscriptor(cp1);

        }

        for (int i=0;i<250;i++){
            dni=String.valueOf(i);
            ClientePrimePro cp1 = new ClientePrimePro(dni, "Paco", " ");
            pv.addSuscriptor(cp1);
        }
        int x=0;

        for (Cliente c : pv.getSuscriptores()){
            for (int i=0;i<40;i++){
                Multimedia m = pv.getCatalogo(i);
                pv.ver(m,c);

            }

        }

        Serie serie = new Serie(" ",true,10, Genero.Aventuras);

        System.out.println(pv.getGanancias());



    }
}
