package Design_Patterns.Adapter;

public class PaymentGatewayAdapter implements PaymentGateway{
    private HDFCBankPaymentApi bpa;

    PaymentGatewayAdapter(HDFCBankPaymentApi bpa){
        this.bpa=bpa;
    }
    @Override
    public double checkBalance() {
        System.out.println("Your Balance: "+bpa.getBalance());
        return bpa.getBalance();
    }

    @Override
    public double deposit(int amount) {
        boolean status=bpa.depositIntoBank(amount);
        if(status)
            return amount;
        else
            return 0;
    }

    @Override
    public double transfer(int amount) {
        boolean status=bpa.transfer(amount);
        if(status)
            return amount;
        else
            return 0;
    }
}
