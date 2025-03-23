import java.util.Scanner;
public class Day1 {
    public static void main(String[] args){
        //        Even and Odd Number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is a even number!");
        }
        else{
            System.out.println(num+ " is a odd number!");
        }

    }
}
