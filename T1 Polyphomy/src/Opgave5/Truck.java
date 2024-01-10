package Opgave5;

public class Truck extends Vehicle{

    private double loadCapacity;
    public Truck(String maker, String model, int year, double milage, double loadCapacity ) {
        super(maker, model, year, milage);
        this.loadCapacity = loadCapacity;
    }


}
