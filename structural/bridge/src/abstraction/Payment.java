package abstraction;

import implementor.PaymentGateway;

public abstract class Payment {

    protected PaymentGateway paymentGateway;

    public Payment(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public abstract void pay(double amount);
}
