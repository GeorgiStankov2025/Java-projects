
public class BankAccountMain
{
    public static void main(String[] args)
    {

        BankAccount goshov= new BankAccount("Jon Adams", 4000);

        goshov.Info();

        goshov.Deposit(300);

        goshov.Withdraw(100);

    }
}
