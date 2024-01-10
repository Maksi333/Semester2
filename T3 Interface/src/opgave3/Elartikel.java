package opgave3;

import java.time.format.SignStyle;

public class Elartikel extends Varer{

    public double gnsEnergiForbrug;


    public Elartikel(double pris, String name, String beskrivelse, double gnsEnergiForbrug) {
        super(pris, name, beskrivelse);
        this.gnsEnergiForbrug = gnsEnergiForbrug;
    }

    public double getGnsEnergiForbrug() {
        return gnsEnergiForbrug;
    }

    @Override
    public String toString() {
        return "Elartikel{" +
                "gnsEnergiForbrug=" + gnsEnergiForbrug +
                ", pris=" + pris +
                ", name='" + name + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                '}';
    }
}
