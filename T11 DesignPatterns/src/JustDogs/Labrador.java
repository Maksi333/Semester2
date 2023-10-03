package JustDogs;

public class Labrador extends Dog{

    public Labrador(){
        eatingBehavior = new NormalDiet();
        barkingBehavior = new PlayfullWoof();
    }
}
