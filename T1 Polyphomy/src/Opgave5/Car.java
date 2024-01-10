package Opgave5;

import java.util.ArrayList;

public class Car extends Vehicle {
    private int numDoors;


    public Car(String maker, String model, int year, double milage, int numDoors) {
        super(maker, model, year, milage);
        this.numDoors = numDoors;
    }

}
