package JustDogs;

public class test {
    public static void main(String[] args) {
        Labrador l = new Labrador();

        l.performEating();
        l.perfromBark();

        l.setEatingBehavior(new ProteinDiet());
        l.setBarkingBehavior(new Snarring());

        l.perfromBark();
        l.performEating();
    }
}
