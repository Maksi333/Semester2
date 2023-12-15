package opgave3;

public abstract class Vare {

    private String navn;
    private String beskrivelse;
    private double price;


    public Vare(String navn, String beskrivelse, double priceXmoms) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.price = priceXmoms;
    }


    public abstract double priceAfterTax(double price);

    public double getPrice() {
        return price;
    }

    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    @Override
    public String toString() {
        return "Vare " + navn;
    }
}



