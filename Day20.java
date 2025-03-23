class Student{
    String name;
    String email;
    int phone;

    Student(){
        this.name="Unknown";
        this.email="someone@gmail.com";
        this.phone=123457589;
    }
    Student(String name){
        this.name=name;
    }
    Student(String name, String email){
        this.name=name;
        this.email=email;
    }
    Student(String name, String email, int phone){
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
}
public class Day20{
    public static void main(String[] args){
        Student s1=new Student();
        System.out.println(s1.name);
        System.out.println(s1.email);
        System.out.println(s1.phone);
        System.out.println("-----------------------------");
        Student s2=new Student("Sonika B P");
        System.out.println(s2.name);
        System.out.println(s2.email);
        System.out.println(s2.phone);
        System.out.println("------------------------------");
        Student s3=new Student("Ram","ram123@gmail.com");
        System.out.println(s3.name);
        System.out.println(s3.email);
        System.out.println(s3.phone);
        System.out.println("-------------------------------");
        Student s4=new Student("Sita","sita123@gmail.com",
                283428483);
        System.out.println(s4.name);
        System.out.println(s4.email);
        System.out.println(s4.phone);
        //String default->null
        //integer default->0
        }
}