package Opgave3_igen;

import java.time.Year;

public class Foreman extends Mechanic{
    private double bonus;


    public Foreman(String name, String adress, double hourlySalary, double bonus, int yearOfGraduation) {
        super(name, adress, hourlySalary, yearOfGraduation);
        this.bonus = bonus;
    }

    @Override
    public double weeklySalary(){
        double weeklySalary = 0;
        weeklySalary = hourlySalary * 37;
        return weeklySalary + bonus;
    }
}
