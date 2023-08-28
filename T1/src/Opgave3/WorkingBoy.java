package Opgave3;

public class WorkingBoy extends Emplyee {
    int timeAntal;

    public WorkingBoy(int timeAntal, String name, String adress, double timeløn){
        super(name, adress, timeløn);
        this.timeAntal = 25;
    }

    @Override
    public double weeklySalary(){
        double salaryPerWeek = 0;
        salaryPerWeek = timeLøn*timeAntal;

        return salaryPerWeek;
    }
}
