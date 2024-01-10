import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
            // Creating an ArrayList
            ArrayList<String> fruits = new ArrayList<>();

            // Adding elements to the ArrayList
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Orange");
            fruits.add("Grapes");

            // Getting an iterator for the ArrayList
            Iterator<String> iterator = fruits.iterator();

            // Iterating over the elements using the iterator
            while (iterator.hasNext()) {
                String fruit = iterator.next();
                System.out.println(fruit);
            }
        }
    }
}