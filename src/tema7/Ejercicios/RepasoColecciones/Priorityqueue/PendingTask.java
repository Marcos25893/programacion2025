package tema7.Ejercicios.RepasoColecciones.Priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PendingTask {

    PriorityQueue<Task> tasks;

    public PendingTask() {
        this.tasks = new PriorityQueue<>(Comparator.comparing(Task::getPriority));
    }

    /**
     * Add task to priority ueue
     * @param t
     * @return
     */
    public boolean addTask(Task t){
        return tasks.offer(t);
        //tasks.add(t);
    }

    /**
     * Show task with higher priority
     * @return
     */
    public Task viewHigherPriorityTask(){
        return tasks.peek();
    }

    /**
     * remove and show higher priority task
     * @return
     */
    public Task pollHigherPriorityTask(){
        return tasks.poll();
    }

    public void showPendingTasks(){
        //No las muestra ordenadas por prioridad
        for (Task t : tasks){
            System.out.println(t);
        }
    }
}
