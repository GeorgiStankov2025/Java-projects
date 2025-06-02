public class MPS
{

    public String Brand;

    public String RegNomer;

    public int Probeg;

    public double Konsumaciq;

    public MPS(String brand,String nomer,int probeg,double konsumaciq)
    {

        if(konsumaciq>0&&probeg>0)
        {

            this.Brand = brand;

            this.RegNomer = nomer;

            this.Probeg = probeg;

            this.Konsumaciq = konsumaciq;
        }
    }

    public int GetRun()
    {

        return this.Probeg;

    }

    public void SetRun(int value)
    {

        if(value>0)
        {

            this.Probeg = value;

        }
    }

    public double GetKon()
    {

        return this.Konsumaciq;

    }

    public void SetKon(double value)
    {

        if(value>0)
        {

            this.Konsumaciq = value;

        }
    }

    public void GetInfo()
    {

        System.out.print(this.Brand+", "+this.RegNomer+", Probeg: "+this.Probeg+"km, konsumaciq: "+this.Konsumaciq+"/100");

    }

}
