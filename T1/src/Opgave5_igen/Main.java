package Opgave5_igen;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {
        Vehicle bike = new Motorcycle("Harley", "Cool", 1999, 100, 1000);
        Vehicle truck = new Truck("Mercedes", "Benz", 1111, 0, 5000);
        Vehicle car = new Car("BMW", "A8", 2000, 10, 4);
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(bike);

        doStuff();

    }

    public static void doStuff(){
        for(int i = 0; i < vehicles.size(); i++){
            vehicles.get(i).start();
            vehicles.get(i).performAction();
            vehicles.get(i).stop();
            System.out.println(" ");
        }
    }
}
