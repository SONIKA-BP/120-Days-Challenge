import java.util.Scanner;
public class Day15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age=sc.nextInt();
        if(checkAge(age)){
            System.out.println("Eligible to vote!");
        }
        else{
            System.out.println("NOT eligible to vote!");
        }
    }
    static boolean checkAge(int age){
        return (age>=18)? true: false;
    }
}
