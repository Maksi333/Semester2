package Opgave3;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /** Create a bag with the given capacity. */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /** Create a bag with capacity 10. */
    public ArrayBag() {
		this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if(isFull()){
            return false;
        }else{
            items[size] = newEntry;
            size++;
            return true;
        }
    }

    @Override
    public E remove() {
        E removedItem;
        if (isEmpty()) {
            return null;
        } else {
            removedItem = items[size - 1];
            items[size - 1] = null;
            size--;
        }
        return removedItem;
    }

    @Override
    public boolean remove(E anEntry) {
        if(isEmpty()){
            return false;
        }else{
            for(int i = 0; i < items.length-1; i++){
                if(items[i] == anEntry){
                    items[i] = null;
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for(int i = 0; i < items.length - 1; i++){
            items[i] = null;
            size = 0;
        }
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int counter = 0;
        for(int i = 0; i < items.length-1; i++){
            if(items[i] == anEntry){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean contains(E anEntry) {
        for(int i = 0; i < items.length-1; i++){
            if(items[i] == anEntry){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public E[] toArray() {
        E[] resultArray = (E[]) new Object[items.length];
        for(int i = 0; i < items.length-1; i++){
            resultArray[i] = items[i];
        }
        return resultArray;
    }
}
