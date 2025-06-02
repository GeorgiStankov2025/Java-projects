public class NoshtenBachkator extends Bachkator
{

    public double Bonus;

    public NoshtenBachkator(String name, double payment,int hours)
    {

        super(name,payment,hours);

        this.Bonus=(payment*hours)/10;

    }

    public void GetInfo()
    {

        super.GetInfo();

        System.out.print(", noshtna smqna, bonus: "+this.Bonus);

    }

}
