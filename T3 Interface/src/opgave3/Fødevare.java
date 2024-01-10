package opgave3;

public class Fødevare extends Varer {

    private int holdbarhed;

    public Fødevare (int holdbarhed, double pris, String name, String beskrivelse){
        super(pris, name, beskrivelse);
        this.holdbarhed = holdbarhed;
    }

    public int getHoldbarhed() {
        return holdbarhed;
    }

    @Override
    public String toString() {
        return "Fødevare{" +
                "holdbarhed=" + holdbarhed +
                ", pris=" + pris +
                ", name='" + name + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                '}';
    }

}
