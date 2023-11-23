package Opgave3_igen;

public class Mechanic extends Person{
    private int yearOfGraduation;
    public double hourlySalary;

    public Mechanic(String name, String adress, double hourlySalary, int yearOfGraduation) {
        super(name, adress);
        this.hourlySalary = hourlySalary;
        this.yearOfGraduation = yearOfGraduation;
    }

    public double weeklySalary(){
        double weeklySalary = 0;
        weeklySalary = hourlySalary * 37;
        return weeklySalary;
    }
}
