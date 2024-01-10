package controller;

import model.Pizza;
import storage.ListStorage;

import java.util.ArrayList;

public abstract class Controller {
    private ListStorage storage = new ListStorage();

    public Pizza createPizza(String name, double price){
        Pizza pizza = new Pizza(name,price);
        storage.storePizza(pizza);
        return pizza;
    }

}
