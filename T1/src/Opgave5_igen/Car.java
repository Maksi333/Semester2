package Opgave5_igen;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, String model, int year, double milage, int numberOfDoors) {
        super(brand, model, year, milage);
        this.numberOfDoors = numberOfDoors;

    }
    @Override
    public void displayInfo(){
        String info = (brand + " " + model + " " + year + " " + milage + " " + numberOfDoors);
        System.out.println(info);
    }
    @Override
    public void start(){
        System.out.println("Car Starting!");
    }
    @Override
    public void stop(){
        System.out.println("Car Stopping!");
    }
    @Override
    public void performAction(){
        System.out.println("Car Drifting");
    }
}
