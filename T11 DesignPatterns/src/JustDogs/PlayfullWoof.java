package JustDogs;

import JustDogs.BarkingBehavior;

public class PlayfullWoof implements BarkingBehavior {
    @Override
    public void bark() {
        System.out.println("Woof Woof");
    }
}
