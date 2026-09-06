import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StudentService service=new StudentService();
        while(true)
        {
            System.out.println("\n========= STUDENT MANAGEMENT SYSTEM ========= ");

            System.out.println("1. Add Student ");
            System.out.println("2. View Student ");
            System.out.println("3. Exit");

            System.out.println("Enter Your Choice :");
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter RollNo :");
                    int Rollno=sc.nextInt();

                    System.out.println("Enter Name:");
                    String Name=sc.next();

                    System.out.println("Enter Marks:");
                    double Marks=sc.nextDouble();

                    Student student=new Student(Rollno, Name, Marks);

                    service.addStudent(student);
                    break;
                
                case 2:
                    service.viewStudent();
                    break;
                
                case 3:
                    System.out.println("Thank You !");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            } 

        }
    }
}
