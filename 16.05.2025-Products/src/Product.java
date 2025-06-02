public class Product
{

    private String ProductName;

    private double ProductPrice;

    private int AvailableQuantity;

    public Product(String name, double price, int quantity)
    {

        this.ProductName=name;

        this.ProductPrice=price;

        this.AvailableQuantity=quantity;

    }

    public double GetPrice()
    {

        return this.ProductPrice;

    }

    public void SetPrice(double value)
    {

        if(value>0)
        {

            this.ProductPrice = value;
        }
    }

    public int GetQuantity()
    {

        return this.AvailableQuantity;

    }

    public void SetQuantity(int value)
    {

        if(value>0)
        {

            this.AvailableQuantity = value;

        }

    }

    public void GetInfo()
    {

        System.out.print(this.ProductName+", price: "+this.ProductPrice+"$, brojki: "+this.AvailableQuantity);

    }

}
