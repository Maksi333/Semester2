import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("Sanne");
        queue.add("Hanne");
        queue.add("pioioadjf");

        System.out.println(queue);
        //poll removes and returns the head of the queue
        queue.poll();
        //returns but not removes head of queue, samme som peek, men kaster exception hvis tom
        System.out.println(queue.element());
        //
        queue.offer("hej");

    }
}
