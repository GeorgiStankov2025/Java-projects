import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WorkersMain {
    public static void main(String[] args)
    {

        ArrayList<Worker> list =new ArrayList<Worker>();

        list.add(new DayWorker("George",100,100));

        list.add(new NoshtenBachkator("Peter",150,90));

        for(int i=0;i<list.size();i++)
        {

            list.get(i).GetInfo();

            System.out.println();

        }

    }
}
