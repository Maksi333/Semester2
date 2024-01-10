package Opgave2;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {

        HashSet<String> dogs = new HashSet<>();
        HashSet<String> cats = new HashSet<>();
        HashSet<String> birds = new HashSet<>();
        HashSet<Integer> numbers1 = new HashSet<>();
        HashSet<Integer> numbers2 = new HashSet<>();

        dogs.add("Dogoo");
        dogs.add("Golden");
        dogs.add("Purly");
        cats.add("Purly");
        cats.add("Redhead");
        cats.add("Goldens");
        birds.add("Spurv");
        birds.add("Solsort");
        birds.add("Hest");

        numbers1.add(2);
        numbers1.add(1);
        numbers1.add(5);
        numbers2.add(1);
        numbers2.add(6);
        numbers2.add(10);

        Test<String, String> tester = new Test<>();
        Test<Integer, Integer> testerInt = new Test<>();

        System.out.println(tester.union(dogs,cats));
        System.out.println(tester.difference(dogs, cats));
        System.out.println(tester.intersect(dogs,cats));

        System.out.println(testerInt.union(numbers1, numbers2));
        System.out.println(testerInt.difference(numbers1, numbers2));
        System.out.println(testerInt.intersect(numbers1, numbers2));

        System.out.println(tester.union3(dogs, cats, birds));

    }
}
