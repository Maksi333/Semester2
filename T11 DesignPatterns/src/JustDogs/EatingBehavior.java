package JustDogs;

public interface EatingBehavior {

    public default void eat() {
        System.out.println();
    }
}
