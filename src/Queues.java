import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> fila = new PriorityQueue<>();
        fila.add(50);
        fila.offer(55);
        fila.add(60);
        fila.offer(25);
        System.out.println(fila);//[50,55,60,25]
        System.out.println("Estas por ser atendido"+fila.peek());//[50]
        fila.remove();
        System.out.println(fila); //[55,60,25]
        fila.remove();
        System.out.println(fila); //[60,25]
        fila.remove();
        System.out.println(fila); //[25]
        fila.remove();
        System.out.println(fila); //[]
        System.out.println(fila.peek());
        System.out.println(fila.poll());
    }
}
