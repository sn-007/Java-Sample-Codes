public class PaymentGatewayFactory {
    public static PaymentGateway startPayment(String paymentMethod, String cardNumber, String cardHolderName, String expirationDate, String cvv, String upiId, String bankAccountNumber, String ifscCode){
        return switch (paymentMethod) {
            case "creditcard" -> new CreditCardPaymentGateway(cardNumber, cardHolderName, expirationDate, cvv);
            case "debitcard" -> new DebitCardPaymentGateway(cardNumber, cardHolderName, expirationDate, cvv);
            case "upi" -> new UPIPaymentGateway(upiId);
            case "neft" -> new NEFTPaymentGateway(bankAccountNumber, ifscCode);
            default -> null;
        };
    }
}
