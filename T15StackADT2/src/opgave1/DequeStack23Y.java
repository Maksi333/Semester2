package opgave1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DequeStack23Y<E> implements Stack23Y<E> {
    // Implements a stack by adapting a deque (implemented with a LinkedList).
    // The top of the stack is at the beginning of the LinkedList.

    // deque contains the elements in the stack.
    private final Deque<E> deque = new LinkedList<>();

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {
        deque.addFirst(entry);
    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {
        if(deque.isEmpty()){
            throw new NoSuchElementException();
        }
        E removedItem = deque.getFirst();
        deque.removeFirst();
        return removedItem;
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {
        if(deque.isEmpty()){
            throw new NoSuchElementException();
        }
        return deque.peekFirst();
    }

    /**
     * Return true, if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        if(deque.isEmpty()){
            return true;
        }
        return false;
    }

    /**
     * Remove all elements from this stack.
     */
    @Override
    public void clear() {
        deque.clear();
    }

    /**
     * Return the number of elements in this stack.
     */
    @Override
    public int size() {
       return deque.size();
    }
}
