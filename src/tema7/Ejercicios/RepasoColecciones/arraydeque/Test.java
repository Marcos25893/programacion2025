package tema7.Ejercicios.RepasoColecciones.arraydeque;

public class Test {

    public static void main(String[] args) {

        LogBuffer lg = new LogBuffer(10);

        for (int i=1; i <= 15; i++) {
            lg.addLog("Mensaje " + i);
        }
        lg.showLogs();
    }
}
