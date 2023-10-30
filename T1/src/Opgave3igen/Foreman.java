package Opgave3igen;

public class Foreman extends Mechanic{
    public int yearOfAppointment;
    public float bonus;

    public Foreman(String name, String adress, float salaryPrHour, int yearOfGraduation, int yearOfAppointment, float bonus) {
        super(name, adress, salaryPrHour, yearOfGraduation);
        this.yearOfAppointment = yearOfAppointment;
        this.bonus = bonus;
    }

    @Override
    public double weeklySalary(){
        float totalSalary = (37*salaryPrHour + bonus);
        return totalSalary;
    }
}
