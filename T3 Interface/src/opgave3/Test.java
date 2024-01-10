package opgave3;

public class Test {

    public static void main(String[] args) {

        Indkøbsvogn indkøbsvogn1 = new Indkøbsvogn();

        Varer vodka = new Spiritus(38,80,"Vodka", "Stærk");
        Varer varmer = new Elartikel(100, "Varmer", "Den varmer", 60);
        Varer is = new Fødevare(5,50,"Is", "Den er kold");


        indkøbsvogn1.lægIVognen(vodka);
        indkøbsvogn1.lægIVognen(varmer);
        indkøbsvogn1.lægIVognen(is);


       // System.out.println(indkøbsvogn1);
        System.out.println("Total price is: " + indkøbsvogn1.totalPris(indkøbsvogn1.vareIVognen));

    }
}
