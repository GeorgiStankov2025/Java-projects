public class Bachkator
{

    protected String BachkatorName;

    protected double PayPerHour;

    protected int HoursWorked;


    public Bachkator(String name,double pay,int hours)
    {

        this.BachkatorName=name;

        if(pay>0&&hours>0)
        {

            this.HoursWorked=hours;

            this.PayPerHour=pay;

        }

    }

    public int GetHours()
    {

        return this.HoursWorked;

    }

    public void SetHours(int value)
    {

        this.HoursWorked=value;

    }

    public double GetPaid()
    {

        return this.PayPerHour;

    }

    public void SetPaid(double value)
    {

        this.PayPerHour=value;

    }


    public void GetInfo()
    {

        System.out.print(this.BachkatorName+", hours worked: "+this.HoursWorked+", per hour payment: "+this.PayPerHour+", End salary: "+this.PayPerHour*this.HoursWorked);

    }

}
