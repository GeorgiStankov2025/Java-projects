import java.util.jar.Attributes;

public class DiscountProduct extends Product
{

    private int Discount;

    private double EndPrice;

    public DiscountProduct(String name,double price,int quantity,int discount)
    {

        super(name,price,quantity);

        if(discount>0&&discount<100)
        {



            this.Discount=discount;

            this.EndPrice= price-(price*this.Discount/100);

        }

    }

    public void GetInfo()
    {

        super.GetInfo();

        System.out.print(", Discount on the product: "+this.Discount+"%, End price: "+this.EndPrice+"$");

    }

}
