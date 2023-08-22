package Opgave3;

public class Survoyer extends Mechanic {
    private int antalSyn;


    public Survoyer(String name, String adress, int svendePrøveÅr, double timeLøn, int antalSyn){
        super(name, adress, svendePrøveÅr, timeLøn);
        antalSyn = antalSyn;
    }

    @Override
    public double weeklySalary(double timeLøn){
        double salaryPerWeek = 0;
        salaryPerWeek = (timeLøn*37) + antalSyn*29;

        System.out.println(salaryPerWeek);
        return salaryPerWeek;
    }
}
