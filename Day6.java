import java.util.Scanner;
public class Day6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the number of terms: ");
        num=sc.nextInt();
        int first=0;
        int second=1;
        int next;
        System.out.print(first+" , "+second);
        for(int i=2;i<num;i++){
            next=first+second;
            System.out.print(" , "+next);
            first=second;
            second=next;
        }
    }
}






