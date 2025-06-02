import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BachkatoriMain {
    public static void main(String[] args)
    {

        ArrayList<Bachkator> list =new ArrayList<Bachkator>();

        list.add(new DnevenBachkator("Georgi",100,100));

        list.add(new NoshtenBachkator("Angel",150,90));

        for(int i=0;i<list.size();i++)
        {

            list.get(i).GetInfo();

            System.out.println();

        }

    }
}