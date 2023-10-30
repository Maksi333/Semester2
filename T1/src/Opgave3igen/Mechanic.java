package Opgave3igen;

import java.lang.foreign.SegmentAllocator;
import java.time.Year;

public class Mechanic extends Person{
    public static float salaryPrHour;
    public int yearOfGraduation;


    public Mechanic(String name, String adress, float salaryPrHour, int yearOfGraduation) {
        super(name, adress);
        this.salaryPrHour = salaryPrHour;
        this.yearOfGraduation = yearOfGraduation;
    }

    public double weeklySalary() {
        float totalSalary = 37 * salaryPrHour;
        return totalSalary;
    }
}
