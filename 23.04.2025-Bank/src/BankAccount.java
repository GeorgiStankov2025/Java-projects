public class BankAccount
{

    protected String AccountOwnerName;

    protected String AccountIBAN;

    protected double AccountBalance;

    public BankAccount(String ownername, double balance)
    {

        this.AccountOwnerName= ownername;

        if(balance>0.01)
        {

            this.AccountBalance = balance;
        }

        else
        {

            this.AccountBalance=0;

        }

    }

    public double GetBalance()
    {

        return this.AccountBalance;

    }

    public void SetBalance(double balance)
    {

        if(balance>0.01)
        {

            this.AccountBalance = balance;

        }
    }

    public void Info()
    {

        System.out.println("Owner: "+ this.AccountOwnerName+" Balance: "+this.AccountBalance+" euros.");

    }

    public void Deposit(double inputMoney)
    {

        if(inputMoney>0)
        {

            this.AccountBalance+=inputMoney;

            System.out.println("BalanceUpdate: "+this.AccountBalance+" euros.");

        }

    }

    public void Withdraw(double moneygoingout)
    {

        if(moneygoingout>0)
        {

            this.AccountBalance-=moneygoingout;

            System.out.println("BalanceUpdate: "+this.AccountBalance+" euros.");

        }

    }

}
