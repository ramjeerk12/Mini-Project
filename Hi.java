public class Hi {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Apna");
        Student s3 = new Student("3");
       
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }

}
class Student{
    String name ;
    int roll;
   
 }