package Access_Modifier1;

import java.util.Arrays;

class A
{

    public static void main(String[] args)
    {
//        Student[] obj=new Student[5];
        Student s1=new Student();
        Student s2=new Student();
//        System.out.println(Arrays.toString(obj));
        s1.name="Dipra";
        s1.marks=98.2f;
        s1.rno=193;
        Student random=new Student(s1);
        System.out.println(random.name);
        System.out.println(random.rno);
        System.out.println(random.marks);
        System.out.println();
        System.out.println();

        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.marks);
//        System.out.println(arnab.marks);

    }
}
class Student
{
    int rno;
    String name;
    float marks;
    Student()
    {
        this(10,"Paglu",70.3f);
    }
    Student(Student other)
    {
        this.name=other.name;
        this.marks=other.marks;
        this.rno=other.rno;
    }
    Student(int rno,String name ,float marks)
    {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}