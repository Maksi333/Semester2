package opgave3;

public abstract class Varer {

    public double pris;
    public String name;
    public String beskrivelse;

    public Varer(double pris, String name, String beskrivelse){
        this.pris = pris;
        this.beskrivelse = beskrivelse;
        this.name = name;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
