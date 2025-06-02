import java.math.RoundingMode;

public class Product
{

    protected String ProductName;

    protected int Quantity;

    protected double ProductPrice;

    public Product(String productname,int quantity, double pricing)
    {

        this.ProductName=productname;

        this.Quantity=quantity;

        this.ProductPrice=pricing;

    }

    public double GetPrice()
    {

        return this.ProductPrice;

    }

    public void SetPrice(double pricevalue)
    {

        if(pricevalue>0.01)
        {

            this.ProductPrice=pricevalue;

        }

    }

    public void TotalPrice()
    {

        this.ProductPrice *= this.Quantity;

        System.out.println("Total price: "+this.ProductPrice +" euros!");

    }

    public void Discount()
    {

        this.ProductPrice=this.ProductPrice-0.10*this.ProductPrice;

        System.out.println("Total price with discount: "+this.ProductPrice+" euros!");

    }

}
