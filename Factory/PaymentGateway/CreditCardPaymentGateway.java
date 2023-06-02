public class CreditCardPaymentGateway extends PaymentGateway{

    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    public CreditCardPaymentGateway(String cardNumber, String cardHolderName, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    void pay(double amount, String beneficiaryAccount){
        // credit card payment logic
    }

    @Override
    boolean validatePayment(double amount, String beneficiaryAccount) {
        // credit card validation logic
        return false;
    }

    @Override
    void processPayment(double amount, String beneficiaryAccount) {
        // credit card processing logic
    }

    @Override
    void confirmPayment(double amount, String beneficiaryAccount) {
        // credit card confirmation logic
    }
}
