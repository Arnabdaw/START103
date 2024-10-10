package Access_Modifier;

class A
{
    public static void main(String[] args)
    {
        System.out.println(Student.getNumofstudents());
//        Student.numofstudents=100;
//        Student s1=new Student();
//        s1.name="Arnab";
//        s1.percentage=93.6;
//        s1.rno=191;
//        s1.setRno(200);
//
//
//        System.out.println(s1.name);
//        System.out.println(s1.getRno());
//        System.out.println(s1.percentage);
//        System.out.println(s1.schoolname);
//        System.out.println();

        Student s2;
        s2=new Student("Dishari",101,90.5);
//        System.out.println(s2.name);
//        System.out.println(s2.rno);
//        System.out.println(s2.percentage);
//        System.out.println(s2.schoolname);
        System.out.println(s2.getNumofstudents());
        System.out.println();

        Student s3=new Student("Dishari",101,90.5);
        System.out.println(s3.getNumofstudents());
        System.out.println();

        Student s4=new Student("Dishari",101,90.5);
        System.out.println(s4.getNumofstudents());
        System.out.println();


    }
}
