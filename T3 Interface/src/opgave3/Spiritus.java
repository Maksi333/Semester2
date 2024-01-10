package opgave3;

public class Spiritus extends Varer {
    private double alkoprocent;

    public Spiritus(double alkoprocent, double pris,String name, String beskrivelse){
        super(pris,name,beskrivelse);
        this.alkoprocent = alkoprocent;
    }

    public double getAlkoprocent() {
        return alkoprocent;
    }

    @Override
    public String toString() {
        return "Spiritus{" +
                "alkoprocent=" + alkoprocent +
                ", pris=" + pris +
                ", name='" + name + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                '}';
    }
}
