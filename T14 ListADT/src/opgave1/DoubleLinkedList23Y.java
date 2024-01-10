package opgave1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/** A double-linked nodes based implementation of the List ADT. */
public class DoubleLinkedList23Y<E> implements List23Y<E> {
    private final Node<E> header = new Node<>(null);
    private final Node<E> trailer = new Node<>(null);
    private int size = 0;

    public DoubleLinkedList23Y() {
        header.next = trailer;
        trailer.prev = header;
    }

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        // insert newNode between trailer.prev and trailer
        newNode.prev = trailer.prev;
        newNode.next = trailer;
        trailer.prev.next = newNode;
        trailer.prev = newNode;
        size++;
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        Node<E> current = header.next;

        while(current != null && !current.element.equals(e)){
            current = current.next;
        }
        if(current == null) {
            return false;
        }
        if(current.prev != null){
            current.prev.next = current.next;
        }else{
            header.next = current.next;
        }
        if(current.next != null){
            current.next.prev = current.prev;
        }
        size--;
        return true;
    }

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        Node<E> current = header.next;
        while(current != null){
            if(current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        header.next = trailer;
        trailer.prev = header;

        size = 0;
    }

    /**
     * Return the size of this list.
     */
    public int size() {
        return size;
    }

    /**
     * Return true, if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return header.next == trailer;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        int counter = 0;
        Node<E> current = header.next;
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        while(counter < index){
            current = current.next;
            counter++;
        }

        return current.element;
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {
        Node<E> current = header;

        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        for(int counter = 0; counter < index; counter++){
            current = current.next;
        }

        Node<E> newNode = new Node<E>(e);
        current.next = newNode;

        if(current.next != null){
            current.next.prev = newNode;
        }
        newNode.prev = current;
        current.next = newNode;

        size++;
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        Node<E> current = header.next;
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        for(int counter = 0; counter < index; counter++){
            current = current.next;
        }
        Node<E> removedNode = current;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;

        return removedNode.element;
    }

    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        int index = 0;
        Node<E> current = header;

        while(current != null){
            if(current.element.equals(e)){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    /**
     * Return an iterator over this list.
     * Note: While the list is traversed by this iterator,
     * adding or removing an element is not allowed.
     */
    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = header.next;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            E element = current.element;
            current = current.next;
            return element;
        }
    }

    //-------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;
        private Node<T> prev;

        public Node(T t) {
            this.element = t;
            this.next = null;
            this.prev = null;
        }
    }

    //-------------------------------------------

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = header.next;

        while (current != trailer) {
            result.append(current.element);
            if (current.next != trailer) {
                result.append(", ");
            }
            current = current.next;
        }

        result.append("]");
        return result.toString();
    }
}
