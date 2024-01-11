public class Main {
    public static void main(String[] args) {
        System.out.println("Vi er i gang");

        ThreadClass t1 = new ThreadClass("Muuh");
        ThreadClass t2 = new ThreadClass("Muuuh 2");
        ThreadClass t3 = new ThreadClass("Muhhhh 3");
        t1.start();
        t2.start();
        t3.start();
    }
}