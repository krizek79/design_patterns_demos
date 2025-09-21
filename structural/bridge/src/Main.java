import abstraction.OneTimePayment;
import abstraction.Payment;
import abstraction.RecurringPayment;
import implementor.PaymentGateway;
import implementor.PaypalGateway;
import implementor.StripeGateway;

public class Main {

    public static void main(String[] args) {
        PaymentGateway stripePaymentGateway = new StripeGateway();
        PaymentGateway paypalPaymentGateway = new PaypalGateway();

        Payment oneTimePaymentViaStripe =  new OneTimePayment(stripePaymentGateway);
        Payment recurringPaymentViaPaypal =  new RecurringPayment(paypalPaymentGateway);

        oneTimePaymentViaStripe.pay(9.99);
        recurringPaymentViaPaypal.pay(4.99);
    }
}