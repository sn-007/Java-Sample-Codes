public class Main {
    public static void main(String[] args) {
        PaymentGateway creditCardPayment = PaymentGatewayFactory.startPayment("creditcard","1234","John Doe", "12/3/26","123", null,null,null);
        PaymentGateway upiPayment = PaymentGatewayFactory.startPayment("upi", null, null, null,  null,"1234@sbi", null, null);


    }
}