

public class Student {
     private int Rollno;
    private String Name;
    private double Marks;

     public Student(int Rollno,String Name,double Marks)
     {
        this.Rollno=Rollno;
        this.Name=Name;
        this.Marks=Marks;
     }

     public int getRollno()
     {
        return Rollno;
     } 
     public String getName()
     {
        return Name;
     }
     public double getMarks()
     {
        return Marks;
     }
     public void setName()
     {
       this.Name=Name;
     }
     public void setMarks()
     {
        this.Marks=Marks;
     }
    
}
