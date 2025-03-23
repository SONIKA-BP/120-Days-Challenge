import java.util.Scanner;
public class Day7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the numbers: ");
        num=sc.nextInt();
        int save=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println("The sum of "+save+" is: "+sum);
    }
}
