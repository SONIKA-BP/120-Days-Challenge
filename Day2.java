import java.util.Scanner;
public class Day2 {
    public static void main(String[] args){
        //Reverse a number
        Scanner sc=new Scanner(System.in);
        int b=0;
        int r;
        int num;
        System.out.print("Enter number: ");
        num=sc.nextInt();
        while(num!=0){
            r=num%10;
            b=b*10;
            b=b+r;//reversed value stored in b
            num=num/10;
        }
        System.out.println("Reversed number: "+b);
    }
}
