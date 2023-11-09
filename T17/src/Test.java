import java.util.List;

public class Test {

    private static Listy<Integer>  list = new Listy<>();
    public static void main(String[] args) {
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(29);

        System.out.println(list);
        list.add(5);

        System.out.println(list);
    }
}
