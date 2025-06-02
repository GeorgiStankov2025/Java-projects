public class DnevenBachkator extends Bachkator
{

    public DnevenBachkator(String name, double payment,int hours)
    {

        super(name,payment,hours);

    }

    public void GetInfo()
    {

        super.GetInfo();

        System.out.print(", dnevna smqna.");

    }

}
