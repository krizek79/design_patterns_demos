package abstraction;

import implementor.PaymentGateway;

public class RecurringPayment extends Payment {

    public RecurringPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Initiating recurring payment...");
        paymentGateway.processPayment(amount);
    }
}
