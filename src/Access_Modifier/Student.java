package Access_Modifier;

public class Student
{
    public String name;
     int rno;
     double percentage;
     final String schoolname="RKVM";
     private static int numofstudents;

     public Student()
     {

     }
     public Student(String name,int rno,double percentage)
     {
        this.name=name;
        this.rno=rno;
        this.percentage=percentage;
        numofstudents++;
     }
     public static int getNumofstudents()
     {
         return numofstudents;
     }
     public int getRno()
     {
         return rno;
     }
     public void setRno(int rno)
     {
         this.rno=rno;
     }
}
