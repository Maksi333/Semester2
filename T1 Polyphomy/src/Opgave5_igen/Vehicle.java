package Opgave5_igen;

public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public double milage;

    public Vehicle(String brand, String model, int year, double milage){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.milage = milage;
    }

    public void displayInfo(){
        String info = (brand + " " + model + " " + year + " " + milage);
        System.out.println(info);
    }
    public void start(){
        System.out.println("Vehicle Starting!");
    }
    public void stop(){
        System.out.println("Vehicle Stopping!");
    }
    public void performAction(){
        System.out.println("Vehicle Performing action");
    }

}
