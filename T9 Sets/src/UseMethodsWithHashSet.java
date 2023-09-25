import java.util.*;

public class UseMethodsWithHashSet {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 34, 12, 23, 45, 67, 34, 98);
        System.out.println(set1);
        set1.add(23);
        System.out.println(set1);
        set1.remove(67);
        System.out.println(set1);
        System.out.println("Contains 23?: " + set1.contains(23));
        System.out.println(set1.size());

    }

}
