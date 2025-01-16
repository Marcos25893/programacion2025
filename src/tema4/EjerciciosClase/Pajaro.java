package tema4.EjerciciosClase;

public class Pajaro {

    private int edad;
    private char color;

    public Pajaro(int edad, char color) {
        this.edad = edad;
        this.color = color;
    }

    public void setedad(int e) {
        this.edad=e;
    }
    public int getedad() {
        return this.edad;
    }
    public void setcolor(char c) {
        this.color=c;
    }
    public char getcolor(){
        return this.color;
    }

    public static void main(String[] args) {
        Pajaro paj = new Pajaro(7,'a');
        System.out.println(paj.getedad());
        paj.setedad(9);
        System.out.println(paj.getedad());
        System.out.println(paj.getcolor());
        paj.setcolor('r');
        System.out.println(paj.getcolor());
    }

}
