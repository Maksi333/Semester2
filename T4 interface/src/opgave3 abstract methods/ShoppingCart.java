package opgave3;
import java.util.ArrayList;


public class ShoppingCart {
    public ArrayList<opgave3.Vare> shoppingCart = new ArrayList<>();

    public ShoppingCart() {

    }

    public void addItemToCart(opgave3.Vare vare){
        shoppingCart.add(vare);
    }

    public double totalCartprice(){
        double totalPrice = 0;
        for(int i = 0; i < shoppingCart.size(); i++){
            totalPrice += shoppingCart.get(i).priceAfterTax(shoppingCart.get(i).getPrice());
        }
        return totalPrice;
    }
    public double totalCartpriceReciept(){
        double totalPrice = 0;
        for(int i = 0; i < shoppingCart.size(); i++){
            System.out.println(shoppingCart.get(i));
            totalPrice += shoppingCart.get(i).priceAfterTax(shoppingCart.get(i).getPrice());
        }
        System.out.println("your total will be " + totalPrice);
        return totalPrice;
    }
}
