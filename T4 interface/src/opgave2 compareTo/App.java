package opgave2;

public class App {

    private static opgave2.Customer[] customers = new opgave2.Customer[4];
    public static void main(String[] args) {
        opgave2.Customer paul = new opgave2.Customer("Poul", "Hansen", 10);
        opgave2.Customer ole = new opgave2.Customer("Ole", "Olesen", 12);
        opgave2.Customer adam = new opgave2.Customer("Adam", "Olesen", 12);
        opgave2.Customer adam1 = new opgave2.Customer("Adam", "Olesen", 30);

       customers[0] = paul;
       customers[1] = ole;
       customers[2] = adam;
       customers[3] = adam1;

    }
}
