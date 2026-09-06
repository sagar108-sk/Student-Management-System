
import java.util.ArrayList;

public class StudentService {
 
    private ArrayList<Student> obj=new ArrayList<>();

    // Add student 
    public void addStudent(Student student)
    {
        obj.add(student);
        System.out.println("Student Addded Successfully");
    }

    //view student 
    public void viewStudent()
    {
        if(obj.isEmpty())
        {
            System.out.println("No Student Found !");
            return ;
        }

        for (Student student  : obj)
        {
            System.out.println(
             "RollNo :" + student.getRollno() +
             "Name :"+student.getName()+
             "Marks :"+student.getMarks());   
        }
    }
}
