package opgave5;

public class Paypal implements PaymentMethod{

    private String eMail;
    private String passWord;

    public Paypal(String eMail, String passWord){
        this.eMail = eMail;
        this.passWord = passWord;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paypal: " + amount);
    }
}
