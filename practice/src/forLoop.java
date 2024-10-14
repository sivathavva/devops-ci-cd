
class Student
{
    int rollno;
    String name;
    int marks;

}
public class forLoop

{

    public static void main(String[] args) {

        Student s1= new Student();
       s1.name="kiran";
        s1.rollno=12;
        s1.marks=88;

        Student s2 = new Student();
        s2.name="shiva";
        s2.rollno=25;
        s2.marks=85;
        Student students[] = new Student[2];
        students[0]=s1;
        students[1]=s2;
       // students[2]=s3;

      for(int i=0;i<students.length;i++)
      {
          System.out.println(students[i].name);
      }

      for (Student stud: students)
      {

          System.out.println(stud.name+"123 "+stud.marks);
      }
    }
}
