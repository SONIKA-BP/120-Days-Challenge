class Company{
    private String EName;
    private String eId;
    private String designation;
    private double salary;
    public void setEName(String name){
        EName=name;
    }
    public void setId(String id){
        eId=id;
    }
    public void setDesignation(String job){
        designation=job;
    }

    public void setSalary(double sal){
        salary=sal;
    }
    public String getName(){
        return EName;
    }
    public String getId(){
        return eId;
    }
    public String getJob(){
        return designation;
    }
    public double getSalary(){
        return salary;
    }
}
public class Day68 {
    public static void main(String[] args){
        Company c=new Company();
        c.setEName("Sonika B P");
        c.setId("MICRO050");
        c.setDesignation("FullStack Developer");
        c.setSalary(6900000.00);
        System.out.println("-------------Employee Details-----------");
        System.out.println("Name: "+c.getName());
        System.out.println("EId: "+c.getId());
        System.out.println("JobRole: "+c.getJob());
        System.out.println("Salary: "+c.getSalary());


    }
}
