package JustDogs;

public class Barking implements BarkingBehavior{
    @Override
    public void bark() {
        System.out.println("Bark Bark");
    }
}
