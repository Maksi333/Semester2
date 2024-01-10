package Opgave1;

import java.util.HashSet;

public class useMethodsWithHashSetAgain {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<>();

        intSet.add(34);
        intSet.add(12);
        intSet.add(23);
        intSet.add(45);
        intSet.add(67);
        intSet.add(34);
        intSet.add(98);

        System.out.println(intSet);

        intSet.add(23);
        System.out.println(intSet);
        intSet.remove(67);
        System.out.println(intSet);

        System.out.println(intSet.contains(23));
    }
}
