package opgave2;

public class Labrador extends Dog{


    public Labrador() {
        eatingBehavior = new NormalDiet();
        barkingbehavior  = new PlayFullBark();
        flyingBehavior = new FlyWithWings();
    }
}
