import java.util.Scanner;
public class Day18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double balance=0;
        int choice;
        boolean isRunning=true;
        System.out.println("------------WELCOME TO MY BANKING APPLICATION😍--------------");
        while(isRunning) {
            System.out.println("1. showBalance");
            System.out.println("2. Deposit");
            System.out.println("3. WithDraw");
            System.out.println("4. Exit");
            System.out.print("--------Choose option (1,2,3,4):--------- ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance+=Deposit();
                case 3 -> balance-=WithDraw(balance);
                case 4 -> isRunning=false;
            }
        }
        System.out.println("Thank You!🍻");
    }
    static void showBalance(double balance){
        System.out.println("The current balance: "+balance+" INR");
    }
    static double Deposit(){
        double amt;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amt=sc.nextDouble();
        if(amt<=0){
            System.out.println("Please enter valid amount");
            return 0;
        }
        else{
            return amt;
        }
    }
    static double WithDraw(double balance){
        Scanner sc=new Scanner(System.in);
        double amt;
        System.out.print("Enter the amount to withdraw: ");
        amt=sc.nextDouble();
        if(amt>balance){
            System.out.println("NOT sufficient amount");
            return 0;
        }
        else if(amt<0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amt;
        }
    }
}
