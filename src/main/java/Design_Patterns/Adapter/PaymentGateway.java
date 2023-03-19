package Design_Patterns.Adapter;

public interface PaymentGateway {
    public double checkBalance();

    public double deposit(int amount);

    public double transfer(int amount);
}
