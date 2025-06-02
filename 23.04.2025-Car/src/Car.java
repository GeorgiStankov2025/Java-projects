public class Car
{

    protected String Brand;

    protected String Model;

    protected int YearManifactured;

    public Car(String brand,String Model, int yearmanifac)
    {

        this.Brand=brand;

        this.Model=Model;

        this.YearManifactured=yearmanifac;

    }

    public int GetYear()
    {

        return this.YearManifactured;

    }

    public void SetYear(int yearvalue)
    {
        if(this.YearManifactured>1900)
        {

            this.YearManifactured = yearvalue;

        }
    }

    public boolean Isclassic()
    {

        if(this.YearManifactured>1999)
        {

            System.out.println("You drive a non-retro car");

            return false;

        }

        else
        {

            System.out.println("You drive an absolute classic!");

            return true;

        }

    }

    public void GetInfo()
    {

        System.out.println("Brand: "+this.Brand+" Model: "+this.Model+" Year manifactured: "+ this.YearManifactured+".");

    }

}
