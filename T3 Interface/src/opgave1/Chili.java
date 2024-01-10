package opgave1;

public class Chili implements Mesurable {
    public String name;
    private double Scoville;

    public Chili(String name, double scoville){
        this.name = name;
        this.Scoville = scoville;
    }

    public String getName() {
        return name;
    }

    public double getScoville() {
        return Scoville;
    }

    @Override
    public double getmesurable() {
        return Scoville;
    }

    @Override
    public String toString() {
        return "opgave1.Chili{" +
                "name: " + name + '\'' +
                ", Scoville:" + Scoville +
                '}';
    }


}
