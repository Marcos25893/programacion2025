package PrimeraEvaluacion.Clases.tema2.If;

public class EjemploIF3 {
    public static void main(String[] args) {
        //vidaP, magiaP, escudoEspecial (boolean)
        //Si la vida del personaje es menor que 50 y no tiene escudo pinta Toma Pocion
        //Sino Si magiaP es menor que 50 y no tiene escudo Toma Pocion Magia
        //Sino Si vidaP es menor que 50 y magiaP es menor que 50 -> Tomate algo y corre

        int vidaP=40, magiaP=55;
        boolean escudoEspecial = false;

        if (vidaP<50 && escudoEspecial==false){
            System.out.println("Toma Pocion");
        } else if (magiaP<50 && escudoEspecial==false) {
            System.out.println("Toma Pocion Magia");
        } else if (vidaP<50 && magiaP<50) {
            System.out.println("Tomate algo y corre");
        }
    }
}
