package Opgave3;

public abstract class Emplyee {
    private String name;
    public String adress;
    public double timeLøn;

    public Emplyee(String name, String adress, double timeLøn) {
        this.name = name;
        this.adress = adress;
        this.timeLøn = timeLøn;
    }
    public double weeklySalary(){
        double salaryPerWeek = 0;
        salaryPerWeek = timeLøn*37;

        return salaryPerWeek;
    }
}
