package Opgave3;

import java.util.ArrayList;

public class Order {
    private int number;
    private Customer customer;
    private ArrayList<Orderline> orderlines = new ArrayList<>();

    public Order(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    //todo
    public void createOrderLine(int count, Product product){
        Orderline orderline = new Orderline(orderlines.size(), count, product);
        orderlines.add(orderline);
    }

    public ArrayList<Orderline> getOrderlines() {
        return orderlines;
    }
}
