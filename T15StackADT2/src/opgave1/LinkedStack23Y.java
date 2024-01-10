package opgave1;

import java.util.NoSuchElementException;

// OPGAVE 1 med single-linked liste.
public class LinkedStack23Y<E> implements Stack23Y<E> {
    // top of stack is at head of list
    private Node<E> head = null;
    // the number of element in the stack
    int size = 0;

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {
        Node<E> newNode = new Node<>(entry);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {
        if(head == null){
            throw new NoSuchElementException();
        }
        Node<E> poppedElement = head;
        head = head.next;

        return poppedElement.element;
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {
        if(head == null){
            throw new NoSuchElementException();
        }
        return head.element;
    }

    /**
     * Return true, if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    /**
     * Removes all elements from this stack.
     */
    @Override
    public void clear() {
        while(head != null){
            Node<E> current = head.next;
            head.next = null;
            head = current;
        }
        size = 0;
    }

    /**
     * Return the number of elements in the stack.
     */
    @Override
    public int size() {
        Node<E> current = head;
        int counter = 1;
        while(current.next != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    //-------------------------------------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }
}
