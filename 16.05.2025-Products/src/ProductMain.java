import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args)
    {

       ArrayList<Product> list =new ArrayList<Product>();

       list.add(new NoDiscountProduct("Milk",3.50,3));

       list.add(new DiscountProduct("Cheese",5,4,10));

       for(int i=0;i< list.size();i++)
       {

           list.get(i).GetInfo();

           System.out.println();

       }
    }
}
