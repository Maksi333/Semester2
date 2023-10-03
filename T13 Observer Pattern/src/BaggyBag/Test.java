package BaggyBag;

public class Test {
    public static void main(String[] args) {
        ObserveableBag bag1 = new ObserveableBag();
        bag1.add("Item1");
        bag1.add("Item2");
        bag1.add("Item3");

        bag1.getCount("Hello");
        System.out.println(bag1);

    }
}
