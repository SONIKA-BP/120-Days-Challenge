import java.util.Scanner;
class ALessThanBException extends Exception{
    public String getMessage(){
        return "a-b is negative, sorry no subtarction is possible";
    }
}
public class Day64 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        try{
            if(a<b){
                ALessThanBException e=new ALessThanBException();
                throw e;
            }
            else{
                int c=a-b;
                System.out.println("Result= "+c);
            }}
        catch(ALessThanBException e){
            System.out.println(e.getMessage());
        }
    }
}
