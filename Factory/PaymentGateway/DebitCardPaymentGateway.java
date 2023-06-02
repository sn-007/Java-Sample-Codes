public class DebitCardPaymentGateway extends PaymentGateway{
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    public DebitCardPaymentGateway(String cardNumber, String cardHolderName, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    void pay(double amount, String beneficiaryAccount){
        // debit card payment logic
    }

    @Override
    boolean validatePayment(double amount, String beneficiaryAccount) {
        // debit card validation logic
        return false;
    }

    @Override
    void processPayment(double amount, String beneficiaryAccount) {
        // debit card processing logic
    }

    @Override
    void confirmPayment(double amount, String beneficiaryAccount) {
        // debit card confirmation logic
    }
}
