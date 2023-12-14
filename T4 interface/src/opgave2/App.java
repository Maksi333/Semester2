package opgave2;

public class App {
    public static void main(String[] args) {
        Customer paul = new Customer("Poul", "Hansen", 10);
        Customer ole = new Customer("Ole", "Olesen", 12);
        Customer adam = new Customer("Adam", "Olesen", 12);

        System.out.println(ole.compareTo(adam));
    }
}
