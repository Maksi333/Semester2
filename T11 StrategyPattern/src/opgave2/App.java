package opgave2;

public class App {
    public static void main(String[] args) {

        Dog lab = new Labrador();

        lab.performBark();
        lab.performEat();
        lab.performFly();

        lab.setBarkingbehavior(new AggressivBark());
        lab.setEatingBehavior(new ProteinDiet());
        lab.setFlyingBehavior(new FlyingWithMagic());

        lab.performBark();
        lab.performEat();
        lab.performFly();

    }
}
