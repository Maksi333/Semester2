package Opgave3;

public class Survoyer extends Mechanic {
    private int antalSyn;


    public Survoyer(String name, String adress, int svendePrøveÅr, double timeLøn, int antalSyn){
        super(name, adress, svendePrøveÅr, timeLøn);
        antalSyn = antalSyn;
    }

    @Override
    public double weeklySalary(){
        double salaryPerWeek = 0;
        salaryPerWeek = super.weeklySalary() + antalSyn*29;

        return salaryPerWeek;
    }
}
