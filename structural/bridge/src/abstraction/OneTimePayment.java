package abstraction;

import implementor.PaymentGateway;

public class OneTimePayment extends Payment {

    public OneTimePayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Initiating one-time payment...");
        paymentGateway.processPayment(amount);
    }
}
