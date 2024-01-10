import java.util.LinkedList;
import java.util.NoSuchElementException;

public class opgaver implements Queue23Y{

    private LinkedList<Object> queue = new LinkedList<Object>();
    @Override
    public void add(Object element) {
        queue.addLast(element);
    }
    /**
     * Remove and return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public Object remove() {
        if(queue.isEmpty() == true){
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }
    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public Object element() {
        if(queue.isEmpty() == true){
            throw new NoSuchElementException();
        }

        return queue.getFirst();
    }
    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        if(queue.isEmpty() == true){
            return true;
        }
        return false;
    }
    /**
     * Remove all elements from the queue.
     */
    @Override
    public void clear() {
        queue.clear();
    }
    /**
     * Return the number of elements in the queue.
     */
    @Override
    public int size() {
        return queue.size();
    }
}
