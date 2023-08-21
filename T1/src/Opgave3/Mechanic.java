package Opgave3;

public class Mechanic extends Person {
    private int svendePrøveÅr;
    private double timeLøn;

    public Mechanic(String name, String adress, int svendePrøveÅr, double timeLøn){
        super(name, adress);
        this.timeLøn = timeLøn;
        this.svendePrøveÅr = svendePrøveÅr;
    }
    public double weeklySalary(double timeLøn){
        double salaryPerWeek = 0;
        salaryPerWeek = timeLøn*37;

        System.out.println(salaryPerWeek);
        return salaryPerWeek;
    }

    public double getTimeLøn() {
        return timeLøn;
    }
}
