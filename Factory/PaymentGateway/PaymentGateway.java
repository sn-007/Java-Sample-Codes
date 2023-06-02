public abstract class PaymentGateway {
    abstract void pay(double amount, String beneficiaryAccount);
    abstract boolean validatePayment(double amount, String beneficiaryAccount);
    abstract void processPayment(double amount, String beneficiaryAccount);
    abstract void confirmPayment(double amount, String beneficiaryAccount);
}
