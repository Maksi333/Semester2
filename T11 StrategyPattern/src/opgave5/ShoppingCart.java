package opgave5;

import java.util.ArrayList;

public class ShoppingCart{
    private PaymentMethod paymentMethod;
    private ArrayList<Item> cart;

    public ShoppingCart(){
        this.cart = new ArrayList<>();

    }

    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    public void pay() {
        int totalAmount = cart.stream().mapToInt(Item::getPrice).sum();
        paymentMethod.pay(totalAmount);
    }

    public void addItem(Item item){
        cart.add(item);
    }
}
