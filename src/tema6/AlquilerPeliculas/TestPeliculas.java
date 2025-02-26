package tema6.AlquilerPeliculas;

public class TestPeliculas {

    public static void main(String[] args) {

        PrimeVideo pv = new PrimeVideo();

        for (int i=0;i<30;i++){
            Pelicula m1 = new Pelicula("",10,true, 90);
            pv.addMultimedia(m1);
        }

        for (int i=0;i<270;i++){
            Pelicula m1 = new Pelicula("",10,true, 90);
            pv.addMultimedia(m1);
        }

        for (int i=0;i<750;i++){
            ClientePrime cp1 = new ClientePrime(" ", "Paco", " ");
            pv.addSuscriptor(cp1);
        }


        for (int i=0;i<250;i++){
            ClientePrimePro cp1 = new ClientePrimePro(" ", "Paco", " ");
            pv.addSuscriptor(cp1);
        }

    }
}
