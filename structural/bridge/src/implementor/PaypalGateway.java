package implementor;

public class PaypalGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " EUR via PayPal.");
    }
}
