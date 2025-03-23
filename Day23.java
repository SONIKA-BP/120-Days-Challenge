class Person{
    String fname;
    String lname;
    Person(String fname, String lname){
        this.fname=fname;
        this.lname=lname;
    }
    void FullName(){
        System.out.println(fname+" "+lname);
    }}
class Emp extends Person{
    float salary;
    Emp(String fname,String lname,float salary){
        super(fname, lname);
        this.salary=salary;
    }
    void display(){
        super.FullName();
        System.out.println("MySalary: "+this.salary);
    }}
public class Day23 {
    public static void main(String[] args){
        Emp e1=new Emp("Sonika", "B P",6900000);
        Emp e2=new Emp("Emil","Gowda",3274189);
        e1.display();
        e1.FullName();
        e2.FullName();e2.display();
    }
}
