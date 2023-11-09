import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


/** A single-linked nodes based implementation of the List ADT. */
public class SingleLinkedList23Y<E> implements List23Y<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    private E[] data = (E[]) new Object[4];

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
        //Avoid nullpointer exception
        if(head == null){
            return false;
        }
        //Check first element
        if(head.element.equals(e)){
            head = head.next;
            size--;
            return true;
        }
        //Check the rest
        Node<E> node = head;
        while(node.next != null && !node.next.element.equals(e)){
            node = node.next;
        }
        if(node.next != null) {
            node.next = node.next.next;
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
        Node<E> node = head;
        while(node != null){
            if(node.element.equals(e)){
                return true;
            }
            node = node.next;
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
        Node<E> node = head;
        int currentIndex = 0;
        E element = null;

        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException(index + "Is not inside array size");
        }
        while(node != null){
            if(currentIndex == index){
                element = node.element;
            }else{
                currentIndex++;
                index = currentIndex;
            }
        }
        return element;
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */


    @Override
    public void add(int index, E e) {
        Node<E> node = head;

        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException(index + "Is not inside array size");
        }
        if(index == 0){
            addFirst(e);
        }else if(index == size){
            addLast(e);
        }else{
            Node<E> current = head;
            for(int i = 0; i <= size; i++){
                current = current.next;
                Node<E> temp = new Node<E>(e);
                (current.next).next = temp;
                size++;
            }
        }
    }


    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if(size == 1){
            tail = head;
        }
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if(tail == null){
            head = tail;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        E element = null;
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException(index + " Index is not withing bounds");
        }else if(index == 0){
            removeFirst();
        }else if(index == size -1){
            removeLast();
        }else{
            Node<E> previous = head;

            for(int i = 0; i < size; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            element = current.element;
        }

        return element;
    }

    public E removeFirst(){
        E element = null;
        if(size() == 0){
            return null;
        }else{
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head == null){
                tail = null;
                element = temp.element;
            }
        }
        return element;
    }

    public E removeLast(){
        E element = null;
        if(size() == 0 || size == 1){
            removeFirst();
        }
        else{
            Node<E> current = head;
            for(int i = 0; i < size(); i++){
                current = current.next;
            }
            E temp = tail.element;
            tail = current;
            tail.next = null;
            size--;
            element = temp;
        }
        return element;
    }

    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        int indexLocation = -1;
        Node<E> node = head;
        int currentIndex = 0;
        while(node != null){
            if(node.element.equals(e)){
                indexLocation = currentIndex;
            }
            node = node.next;
            currentIndex ++;
        }
        return indexLocation;
    }

    /**
     * Return an iterator over this list.
     * Note: While the list is traversed by this iterator,
     * adding or removing an element is not allowed.
     */
    @Override
    public Iterator<E> iterator() {
        Iterator<E> IT = new Iterator<E>() {
            int i = 0;
            E[] data2 = Arrays.copyOf(data, data.length);

            @Override
            public boolean hasNext() {
                return i < size;
            }
            @Override
            public E next() {
                if(!hasNext()) throw new NoSuchElementException();
                E ele = data2[i];
                i++;
                return ele;
            }
        };
        return IT;
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
        String result = "";
        for(int i = 0; i < size; i++){
            result += data[i].toString() + (i == size - 1 ? "" : ", ");
        }
        return "[" + result + "]";
    }
}
