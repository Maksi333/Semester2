package Opgave5;

import java.util.ArrayList;

public class Vehicle {
    public String maker;
    public String model;
    public int year;
    public double milage;
    public static ArrayList<Vehicle> vehicles = new ArrayList<>();


    public Vehicle(String maker, String model, int year, double milage){
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.milage = milage;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMilage() {
        return milage;
    }
}
