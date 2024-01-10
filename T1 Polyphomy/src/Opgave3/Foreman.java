package Opgave3;

public class Foreman extends Emplyee{
    public double tillæg;
    public int årForUdnævnelse;
    private int svendePrøve;

    public Foreman(String name, String adress, int svendePrøve, double timeløn, double tillæg, int årForUdnævnelse){
        super(name, adress, timeløn);
        this.tillæg = tillæg;
        this.årForUdnævnelse = årForUdnævnelse;
        this.svendePrøve = svendePrøve;
    }
    @Override
    public double weeklySalary(){
        double salaryPerWeek = 0;
        salaryPerWeek = timeLøn*37 + tillæg;

        return salaryPerWeek;
    }

    public double getTillæg() {
        return tillæg;
    }
}
