
public class BankAccountMain
{
    public static void main(String[] args)
    {

        BankAccount goshov= new BankAccount("Georgi Stankov", 4000);

        goshov.Info();

        goshov.Deposit(300);

        goshov.Withdraw(100);

    }
}