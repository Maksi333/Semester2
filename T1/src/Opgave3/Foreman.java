package Opgave3;

public class Foreman extends Mechanic{
    public double tillæg;
    public int årForUdnævnelse;

    public Foreman(String name, String adress, int svendePrøve, double timeløn, double tillæg, int årForUdnævnelse){
        super(name, adress, svendePrøve, timeløn);
        this.tillæg = tillæg;
        this.årForUdnævnelse = årForUdnævnelse;
    }
    @Override
    public double weeklySalary(double timeLøn){
        double salaryPerWeek = 0;
        salaryPerWeek = (timeLøn*37) + tillæg;

        System.out.println(salaryPerWeek);
        return salaryPerWeek;
    }

    public double getTillæg() {
        return tillæg;
    }
}
