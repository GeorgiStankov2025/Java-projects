public class KategoriqC extends MPS
{

    private int TovarenKapacitet;

    public KategoriqC(String brand,String nomer,int probeg,double konsumaciq,int kapacitet)
    {

        super(brand,nomer,probeg,konsumaciq);

        if(kapacitet>0)
        {
            this.TovarenKapacitet = kapacitet;
        }
    }

    public int GetTovar()
    {

        return this.TovarenKapacitet;

    }

    public void SetTovar(int value)
    {

        this.TovarenKapacitet=value;

    }

    public void GetInfo()
    {

        super.GetInfo();

        System.out.print(", Tovaren kapacitet: "+this.TovarenKapacitet+" tona, kamion!");

    }

}
