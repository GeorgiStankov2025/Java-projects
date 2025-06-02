import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Student {

    private String StudentName;

    protected String FacultuNumber;

    private List<Double> Grades=new ArrayList<>();


    public Student(String studentName, String facultynumber)
    {

        this.StudentName=studentName;

        this.FacultuNumber=facultynumber;

    }


    public void AddGrade(double grade)
    {



        if(grade>=2&&grade<=6)
        {

            Grades.add(grade);

        }

    }

    public void AverageGrade()
    {

        double sum=0;

        for(int i=0;i< Grades.size();i++)
        {

            sum+=Grades.get(i);

        }

        sum/=Grades.size();

        System.out.println(StudentName+", "+ FacultuNumber);

        System.out.println("Average grade is: "+sum+".");

        HasPassed(sum);

    }

    public void HasPassed(double average)
    {

        if(average>3)
        {

            System.out.println("Честито, завърши!");

        }

        else
        {

            System.out.println("Ликвидация!");

        }

    }

}