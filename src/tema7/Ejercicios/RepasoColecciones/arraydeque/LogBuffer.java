package tema7.Ejercicios.RepasoColecciones.arraydeque;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * Vamos guardando mensajes de log en el buffer
 * cuando superamos la capacidad borramos el
 * primer log que se le inserto, Asi siempre
 * tenemos un buffer del tamño elegido con
 * los últimos logs
 */
public class LogBuffer {

    private ArrayDeque<String> logs; //Se puede hacer igual con LinkedList(//private LinkedList<String> buffer2;)
    private Integer capacity;

    public LogBuffer(Integer capacity) {
        this.capacity = capacity;
        this.logs = new ArrayDeque<>(capacity);
    }

    public Integer getCapacity(){
        return this.capacity; //Tamaño maximo del buffer
    }

    public Integer getLogSize(){
        return this.logs.size(); //Tamaño actual del buffer
    }

    /**
     * Si el tamaño actual es menor que la capacidad, se añade el log nuevo
     * Si el tamaño actual es igual que la capacidad, se borra el log más antiguo
     * y se añade el nuevo
     * @param log
     */
    public void addLog(String log){
        if (this.capacity > this.getLogSize()){
            this.logs.add(log);
        }else {
            this.logs.removeFirst();
            this.logs.add(log);
        }
    }

    public void showLogs(){
        for(String s: logs){
            System.out.println(s);
        }
    }

}
