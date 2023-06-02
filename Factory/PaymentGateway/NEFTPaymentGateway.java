public class NEFTPaymentGateway extends PaymentGateway{
    private String bankAccountNumber;
    private String ifscCode;

    public NEFTPaymentGateway(String bankAccountNumber, String ifscCode) {
        this.bankAccountNumber = bankAccountNumber;
        this.ifscCode = ifscCode;
    }

    @Override
    void pay(double amount, String beneficiaryAccount){
        // NEFT payment logic
    }

    @Override
    boolean validatePayment(double amount, String beneficiaryAccount) {
        // NEFT validation logic
        return false;
    }

    @Override
    void processPayment(double amount, String beneficiaryAccount) {
        // NEFT processing logic
    }

    @Override
    void confirmPayment(double amount, String beneficiaryAccount) {
        // NEFT confirmation logic
    }
}
