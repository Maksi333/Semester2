package JustDogs;

public interface BarkingBehavior {

    public default void bark() {
        System.out.println();
    }
}
