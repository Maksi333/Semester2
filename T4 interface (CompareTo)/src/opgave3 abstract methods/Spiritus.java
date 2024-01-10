package opgave3;

public class Spiritus extends opgave3.Vare {
    private double alcPercent;


    public Spiritus(String navn, String beskrivelse, double priceXmoms, double alcPercent) {
        super(navn, beskrivelse, priceXmoms);
        this.alcPercent = alcPercent;
    }


    @Override
    public double priceAfterTax(double price) {
        double fullPrice = 0;

        if(price <= 90){
            fullPrice = price * 1.8;
            return fullPrice;
        }else{
            fullPrice = price * 2.2;
            return fullPrice;
        }
    }


}
