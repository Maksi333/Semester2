import java.util.Objects;

public class Listy<E extends Comparable<E>> implements SortedList23Y<E>{

    private Node head = null;


    @Override
    public void add(E element) {
        Node<E> newNode = new Node<E>(element);
        Node<E> indexNode = head;
        if (Objects.isNull(indexNode)) {
            head = new Node<>(element);
        } else if (indexNode.element.compareTo(element) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            while(indexNode.next != null && indexNode.next.element.compareTo(element) > 0){
                indexNode = indexNode.next;
            }
            newNode.next = indexNode.next;
            indexNode.next = newNode;
        }
    }

    @Override
    public boolean removeFirst() {
        if(head == null){
            return false;
        }else{

        }
        return false;
    }

    @Override
    public boolean removeLast() {
        return false;
    }

    @Override
    public boolean remove(E element) {
        return false;
    }


    @Override
    public int size() {
        return 0;
    }

}
