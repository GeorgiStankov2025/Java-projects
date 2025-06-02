import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AutoParkMain {
    public static void main(String[] args)
    {

        ArrayList<MPS>listmps=new ArrayList<MPS>();

        listmps.add(new KategoriqB("Mercedes","PB4547CB",300,80));

        listmps.add(new KategoriqC("WolksWagen","CB9876AP",1000,90,10));

        for(int i=0;i<listmps.size();i++)
        {

            listmps.get(i).GetInfo();

            System.out.println();

        }

    }

}