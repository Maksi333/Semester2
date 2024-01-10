package opgave5;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("mayo", 40));
        cart.addItem(new Item("Ketter", 10));

        cart.setPaymentMethod(new CreditCard("John", "123456789"));
        cart.pay();

        cart.setPaymentMethod(new Paypal("John@live.dk", "987654321"));
        cart.pay();
    }
}
