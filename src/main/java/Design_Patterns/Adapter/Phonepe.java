package Design_Patterns.Adapter;

public class Phonepe {
    public static void main(String[] args) {
        PaymentGateway pg=new PaymentGatewayAdapter(new HDFCBankPaymentApi());
        pg.checkBalance();
        pg.transfer(500);
        pg.deposit(100);
    }

}
