import java.util.Objects;

public class Listy<E extends Comparable<E>> implements SortedList23Y<E>{

    public Node<E> head = null;



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

        return false;
    }

    @Override
    public boolean removeLast() {
        return false;
    }

    @Override
    public boolean remove(E element) {
        if(head == null){
            return false;
        }else if(element.equals(head.element)){
            head = head.next;
            return true;
        }else{
            Node<E> current = head;
            while(current.next != null && !element.equals(current.next.element)){
                current = current.next;
            }

            if(current.next != null){
                current.next = current.next.next;
                return true;
            }
        }
        return false;
    }


    @Override
    public int size() {
        int count = 0;
        Node<E> current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //Size recursion
    public int sizeUsingRecursion(){
        return recursiveSize(head);
    }

    private int recursiveSize(Node<E> head){
        if(head == null){
            return 0;
        }
        return 1 + recursiveSize(head.next);
    }

    //AddAll // virker ikke
    public void addAll(Listy<E> list){
        Node<E> currentThisList = head;
        Node<E> currentOtherList = list.head;

        while(currentOtherList != null && currentOtherList != null){
            E elementToAdd = currentOtherList.next.element;

            //find the correct position to insert element into the list
            while(currentThisList.next != null && elementToAdd.compareTo(currentThisList.next.element) < 0){
                currentThisList = currentThisList.next;
            }

            //Insert element in the correct position
            Node<E> newNode = new Node<>(elementToAdd);
            newNode.next = currentThisList.next;
            currentThisList.next = newNode;

            //Moce to the next elemet in the other list
            currentOtherList = currentOtherList.next;
        }
    }

    public Node getHead() {
        return head;
    }

}
