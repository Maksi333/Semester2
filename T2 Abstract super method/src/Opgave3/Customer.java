package Opgave3;


import java.time.LocalDate;
import java.util.ArrayList;


public class Customer {
    private ArrayList<Order> orders = new ArrayList<>();
    private String name;
    private LocalDate birthday;

    public Customer (String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(Order order){
        orders.remove(order);
    }
}

