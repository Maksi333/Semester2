package observer_ex3student;

import java.util.ArrayList;

public class Book {

    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<BookObserver> bookObservers = new ArrayList<>();
    private final String title; // not empty
    private int count;

    public Book(String title) {
        this.title = title;
        this.count = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void incCount(int amount) {
        count += amount;
    }

    public void decCount(int amount) {
        count -= amount;
        bookObservers.forEach(observers -> observers.update(this));
    }

    public void add(Customer c){
        customers.add(c);
    }

    @Override
    public String toString() {
        return title + "(" + count + ")";
    }
}
