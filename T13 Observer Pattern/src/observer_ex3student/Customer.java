package observer_ex3student;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Book> books = new ArrayList<>();
    private final String name; // not empty

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void add(Book b){
        books.add(b);
    }
}
