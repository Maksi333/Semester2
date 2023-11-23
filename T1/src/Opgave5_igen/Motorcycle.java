package Opgave5_igen;

public class Motorcycle extends Vehicle{
    private int engineSize;

    public Motorcycle(String brand, String model, int year, double milage, int engineSize) {
        super(brand, model, year, milage);
        this.engineSize = engineSize;
    }
    @Override
    public void displayInfo(){
        String info = (brand + " " + model + " " + year + " " + milage + " " + engineSize);
        System.out.println(info);
    }
    @Override
    public void start(){
        System.out.println("Bike Starting!");
    }
    @Override
    public void stop(){
        System.out.println("Bike Stopping!");
    }
    @Override
    public void performAction(){
        System.out.println("Bike Revving");
    }
}
