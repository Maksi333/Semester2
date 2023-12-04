import java.util.Random;

public class Chili implements Measurable{

    private String name;
    private int scoville;

    public Chili(String name, int styrke){
        this.name = name;
        this.scoville = styrke;
    }

    @Override
    public double getMeasure() {
        return scoville;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScoville() {
        return scoville;
    }

    public void setScoville(int scoville) {
        this.scoville = scoville;
    }

    @Override
    public String toString() {
        return "Chili{" +
                "name='" + name + '\'' +
                ", scoville=" + scoville +
                '}';
    }
}
