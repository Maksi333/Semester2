package Opgave5_igen;

public class Truck extends Vehicle{
    private double loadCapacity;


    public Truck(String brand, String model, int year, double milage, double loadCapacity) {
        super(brand, model, year, milage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo(){
        String info = (brand + " " + model + " " + year + " " + milage + " " + loadCapacity);
        System.out.println(info);
    }
    @Override
    public void start(){
        System.out.println("Truck Starting!");
    }
    @Override
    public void stop(){
        System.out.println("Truck Stopping!");
    }
    @Override
    public void performAction(){
        System.out.println("Truck Lifting the world with hydraulics");
    }
}
