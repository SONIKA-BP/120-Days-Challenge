import java.util.Scanner;
public class Day5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b=0;
        int num;
        int r;
        System.out.print("Enter the Number: ");
        num=sc.nextInt();
        int original=num;
        while(num!=0){
            r=num%10;
            b=b*10;
            b=b+r;
            num=num/10;
        }
        if(original==b){
            System.out.println("Palindrome");
        } else{
            System.out.println("NOT a palindrome");
        }
    }
}
