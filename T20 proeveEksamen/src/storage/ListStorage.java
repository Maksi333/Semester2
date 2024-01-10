package storage;

import model.Pizza;

import java.util.ArrayList;

public class ListStorage {

    private static final ArrayList<Pizza> pizzaStorage = new ArrayList<>();

    public void storePizza(Pizza pizza){
        pizzaStorage.add(pizza);
    }

}
