package JustDucks;

public interface QuackBehavior {
    public default void quack(){
        System.out.println();
    }
}
