package opgave1;

public class Beer implements Mesurable{
    private String name;
    private double alcoholPercentage;

    public Beer(String name, double alcoholPercentage){
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
    }



    @Override
    public double getmesurable() {
        return alcoholPercentage;
    }

    @Override
    public String toString() {
        return "opgave1.Beer{" +
                "name='" + name + '\'' +
                ", alcoholPercentage=" + alcoholPercentage +
                '}';
    }
}
