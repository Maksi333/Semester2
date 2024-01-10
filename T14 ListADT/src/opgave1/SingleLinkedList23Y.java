package opgave1;

import java.util.Iterator;

/** A single-linked nodes based implementation of the List ADT. */
public class SingleLinkedList23Y<E> implements List23Y<E> {
    private Node<E> head = null;
    private int size = 0;

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        if (head == null) {
            head = new Node<>(e);
            size++;
            return;
        }

        Node<E> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(e);
        size++;
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        if(head == null){
            return false;
        }
        if(head.element.equals(e)){
            head = head.next;
            size--;
            return true;
        }
        Node<E> current = head;
        while(current.next != null && !current.element.equals(e)){
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
            size--;
            return true;
        }
        return false;
    }

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        if(head == null){
            return false;
        }
        if(head.element.equals(e)){
            return true;
        }
        Node<E> current = head;
        while(current.next != null && !current.element.equals(e)){
            current = current.next;
        }
        if(current.next.element.equals(e)){
            return true;
        }
        return false;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        head = null;
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
        if(head == null){
            return true;
        }
        return false;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        Node<E> current = head;
        int counter = 0;
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
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            Node<E> newNode = new Node<>(e);
            newNode.next = head;
            head = newNode;
        }else{
            Node<E> current = head;
            for(int i = 0; i < index-1; i++){
                current = current.next;
            }
            Node<E> newNode = new Node<>(e);
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        E removedItem = null;
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }if(index == 0){
            head = head.next;
        }else{
            Node<E> current = head;
            for(int i = 0; i < index-1; i++){
                current = current.next;
            }
            removedItem = current.next.element;
            current.next = current.next.next;
        }
        size--;
        return removedItem;
    }

    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {

        Node<E> current = head;
        if(head == null) {
            return -1;
        }

        for(int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return i;
            }
            current = current.next;
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

        Iterator<E> iterator = new Iterator<E>() {
            Node<E> current = head;
            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
        return iterator;
    }

    //-------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;

        public Node(T t) {
            this.element = t;
            this.next = null;
        }
    }

    //-------------------------------------------

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;

        while(current != null){
            result.append(current.element);
            if(current.next != null){
                result.append(", ");
            }
            current = current.next;
        }
       result.append("]");
        return result.toString();
    }
}
