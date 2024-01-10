package opgave3;

import java.util.ArrayList;

public class App {
    private ArrayList<opgave3.Vare> shoppingCart = new ArrayList<>();
    public static void main(String[] args) {
        opgave3.ShoppingCart shoppingCart1 = new opgave3.ShoppingCart();

        opgave3.Vare øl = new opgave3.Spiritus("Øl","øl", 10, 15);
        opgave3.Vare køleSkab = new opgave3.Elartikel("Køler", "Køler", 500, 50);
        opgave3.Vare æble = new opgave3.Fødevare(5,"æble", "æble", 5);

        shoppingCart1.addItemToCart(øl);
        shoppingCart1.addItemToCart(æble);
        shoppingCart1.addItemToCart(køleSkab);

        shoppingCart1.totalCartpriceReciept();
        System.out.println(shoppingCart1.totalCartprice());
    }
}
