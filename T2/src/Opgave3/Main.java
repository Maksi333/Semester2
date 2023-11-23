package Opgave3;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Product ost = new Product(1,"Ost", 10);
        Product ko = new Product(2,"Ko", 20);
        Product chokolade = new Product(3, "Choko", 30);
        Product is = new Product(4, "Is", 40);
        Product tartes = new Product(5, "Tarteletter", 50);

        Customer bob = new Customer("Bob", LocalDate.of(1999,01,01));
        Customer dasha = new Customer("Dasha", LocalDate.of(2001,01,01));

        Order order1 = new Order(1);
        Order order2 = new Order(2);

        order1.createOrderLine(1, is);
        order1.createOrderLine(1,chokolade);

        order2.createOrderLine(1,tartes);
        order2.createOrderLine(1,ko);
        order2.createOrderLine(1,ost);

        bob.addOrder(order1);
        dasha.addOrder(order2);
    }
}
