package Opgave5;

public class Motercycle extends Vehicle{
    private int engineSize;

    public Motercycle(String maker, String model, int year, double milage, int engineSize) {
        super(maker, model, year, milage);
        this.engineSize = engineSize;
    }
}
