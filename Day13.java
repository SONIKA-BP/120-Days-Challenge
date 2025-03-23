import java.util.Scanner;
public class Day13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // if-else conditions
        String name="admin";
        int pin=1234;
        int userPin;
        String userName;
        System.out.println("Enter the UserName and password");
        userName=sc.nextLine();
        userPin=sc.nextInt();
        if(userName.equals(name) && userPin==pin){
            System.out.println("Valid Credentials!");
        }
        else{
            System.out.println("Invalid Credentials!");
        }

    }
}
