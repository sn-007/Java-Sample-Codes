public class UPIPaymentGateway extends PaymentGateway{
    private String upiId;

    public UPIPaymentGateway(String upiId){
        this.upiId = upiId;
    }

    @Override
    void pay(double amount, String beneficiaryAccount){
        // UPI payment logic
    }

    @Override
    boolean validatePayment(double amount, String beneficiaryAccount) {
        // UPI validation logic
        return false;
    }

    @Override
    void processPayment(double amount, String beneficiaryAccount) {
        // UPI processing logic
    }

    @Override
    void confirmPayment(double amount, String beneficiaryAccount) {
        // UPI confirmation logic
    }
}
