package opgave3;

public class Fødevare extends opgave3.Vare {

    private int holdbarhed;

    public Fødevare (int holdbarhed, String navn, String beskrivelse, double priceXmoms){
        super(navn,beskrivelse, priceXmoms);
        this.holdbarhed = holdbarhed;
    }


    @Override
    public double priceAfterTax(double price) {
        double tax = 1.05;
        double fullPrice = 0;

        fullPrice = price * tax;
        return fullPrice;
    }
}
