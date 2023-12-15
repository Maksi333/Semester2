package opgave3;

public class Elartikel extends opgave3.Vare {
    private double avgEnergyPrHour;

    public Elartikel(String navn, String beskrivelse, double priceXmoms, double avgEnergyPrHour) {
        super(navn, beskrivelse, priceXmoms);
        this.avgEnergyPrHour = avgEnergyPrHour;
    }


    @Override
    public double priceAfterTax(double price) {
        double tax = 1.3;
        double fullPrice = 0;

        fullPrice = price * tax;
        if(fullPrice < price +3 ){
            fullPrice = price + 3;
            return fullPrice;
        }else {
            return fullPrice;
        }
    }

}
