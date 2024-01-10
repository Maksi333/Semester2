package opgave1;

public class Beer implements Measurable{
    private String name;
    private double alcPercentage;

    public Beer(String name, double alcPercentage){
        this.name = name;
        this.alcPercentage = alcPercentage;
    }

    @Override
    public double getMeasure() {
        return alcPercentage;
    }

    @Override
    public String toString() {
        return "opgave1.Beer{" +
                "name='" + name + '\'' +
                ", alcPercentage=" + alcPercentage +
                '}';
    }
}
