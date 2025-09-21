package implementor;

public class StripeGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " EUR via Stripe.");
    }
}
