package Design_Patterns.Adapter;

import java.util.Random;

public class HDFCBankPaymentApi {

    Random R=new Random();

    public double getBalance(){
        System.out.println("Balance is displayed");
        return R.nextInt(2000);
    }

    public boolean transfer(int amount){
        if(amount>0) {
            System.out.println("Transferred "+amount+" Successfully");
            return true;
        }
        else{
            System.out.println("Transfer Failed");
            return false;
        }
    }

    public boolean depositIntoBank(int amount){
        if(amount>0) {
            System.out.println("Deposited "+amount+" Successfully");
            return true;
        }
        else{
            System.out.println("Cant deposit now!! Please check Balance and try again");
            return false;
        }
    }
}
