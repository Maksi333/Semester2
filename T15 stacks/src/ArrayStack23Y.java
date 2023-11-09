import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

// OPGAVE 1 med array.
public class ArrayStack23Y<E> implements Stack23Y<E> {
    // top is the index of the top element in the stack,
    // top is -1 if the stack is empty
    private int top = -1;
    // items contains the elements in the stack at index 0..top and null else
    @SuppressWarnings("unchecked")
    private E[] items = (E[]) new Object[4];
    private Stack<E> s = new Stack<>();

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {
        if (top == items.length - 1) {
            items = Arrays.copyOf(items, items.length * 2);
        }
        top++;
        items[top] = entry;

    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {


        return null;
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {

        return null;
    }

    /**
     * Return true, if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        // TODO
        return false;
    }

    /**
     * Remove all elements from this stack.
     */
    @Override
    public void clear() {
        if(top > -1){

        }
    }

    /**
     * Return the number of elements in this stack.
     */
    @Override
    public int size() {

        return items.length;
    }

    public static boolean isPalindrome(String s){
        Deque<Character> stack = new LinkedList<>();

        int i = 0;
        while(i < s.length() / 2){
            stack.push(s.charAt(i));
            i++;
        }
        if(s.length() % 2 == 1){
            i++;
        }
        while (i < s.length()){
            char ch1 = stack.pop();
            char ch2 = s.charAt(i);
            if(ch1 != ch2){
                return false;
            }
            i++;
        }
        return true;
    }
}
