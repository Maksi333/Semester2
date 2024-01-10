package Opgave3;

import java.util.ArrayList;

public class Product {

    private int number;
    private String name;
    private double unitPrice;
    private ArrayList<Orderline> orderlines = new ArrayList<>();

    public Product(int number, String name, double unitPrice){
        this.number = number;
        this.name = name;
        this.unitPrice = unitPrice;
    }


    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
