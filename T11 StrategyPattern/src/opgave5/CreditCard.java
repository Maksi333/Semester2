package opgave5;

import javax.swing.undo.CannotRedoException;

public class CreditCard implements PaymentMethod {

    String name;
    String cardNumber;

    public CreditCard(String name, String cardNumber){
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount){
        System.out.println(name + " " + cardNumber + " amount payed " + amount);
    }
}
