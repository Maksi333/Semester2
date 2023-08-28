package Opgave3;

public class Mechanic extends Emplyee {
    private int svendePrøveÅr;

    public Mechanic(String name, String adress, int svendePrøveÅr, double timeLøn){
        super(name, adress, timeLøn);
        this.svendePrøveÅr = svendePrøveÅr;
    }

    @Override
    public double weeklySalary(){
        double salaryPerWeek = 0;
        salaryPerWeek = timeLøn*37;

        return salaryPerWeek;
    }
}
