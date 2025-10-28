import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Banco {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Abel");
        fila.offer("Fany");
        fila.add("Pablo");
        fila.offer("Yo");
        System.out.println(fila);
        System.out.println("Estas por ser atendido: "+fila.peek() );
        System.out.println("Gracias por su visita");
        System.out.println();
        fila.remove();
        System.out.println("Esperando...");
        System.out.println("Estas por ser atendido: "+fila.peek());
        System.out.println("Gracias por su visita");
        System.out.println();
        fila.remove();
        System.out.println("Esperando...");
        System.out.println("Estas por ser atendido: "+fila.peek());
        System.out.println("Gracias por su visita");
        System.out.println();

        fila.remove();
        System.out.println("Esperando...");
        System.out.println("Estas por ser atendido: "+fila.peek());
        System.out.println("Gracias por su visita");
    }
}
