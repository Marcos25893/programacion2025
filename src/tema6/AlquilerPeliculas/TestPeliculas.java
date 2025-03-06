package tema6.AlquilerPeliculas;

public class TestPeliculas {

    public static void main(String[] args) {

        PrimeVideo pv = new PrimeVideo();
        String dni="";

        for (int i=0;i<30;i++){
            Pelicula m1 = new Pelicula("",true,20, Genero.Comedia, 90);
            pv.addMultimedia(m1);
        }

        for (int i=0;i<170;i++){
            Pelicula m1 = new Pelicula("",false,10, Genero.Accion,90);
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

        for (Cliente c : pv.getSuscriptores()){
            for (int i=0;i<40;i++){
                Multimedia m = pv.getCatalogo(i);
                pv.ver(m,c);

            }

        }

        for (int x=0;x<10;x++) {
            Serie serie = new Serie("Serie " + (x+1), true, 10, Genero.Aventuras);

            for (int i = 0; i < 10; i++) {
                Temporada t = new Temporada(i+1);
                for (int j = 0; j < 10; j++) {
                    t.addEpisodio(new Episodio("Episodio " + (j+1), 90));
                }
                serie.addTemporada(t);
            }

            pv.addMultimedia(serie);
        }

        for (Multimedia m : pv.getCatalogo()) {
            if (m instanceof Serie){
                for (Cliente c : pv.getSuscriptores()){
                    pv.ver(m,c);
                }
            }
        }

        System.out.println(pv.getGanancias());



    }
}
