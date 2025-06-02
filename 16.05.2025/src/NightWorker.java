public class NightWorker extends Worker
{

    public double Bonus;

    public NightWorker(String name, double payment,int hours)
    {

        super(name,payment,hours);

        this.Bonus=(payment*hours)/10;

    }

    public void GetInfo()
    {

        super.GetInfo();

        System.out.print(", night shift, bonus: "+this.Bonus);

    }

}
