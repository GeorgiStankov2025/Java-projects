
public class StudentMain {
    public static void main(String[] args) {


      Student stu1=new Student("Georgi Stankov","2401561053");

        stu1.AddGrade(3);

        stu1.AddGrade(4);

        stu1.AddGrade(2);

        stu1.AddGrade(2);

        stu1.AverageGrade();

        Student stu2=new Student("Ani Genova","2401561043");

        stu2.AddGrade(5);

        stu2.AddGrade(5);

        stu2.AddGrade(4);

        stu2.AddGrade(3);

        stu2.AverageGrade();

    }
}