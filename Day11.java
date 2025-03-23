import java.util.Scanner;
import java.util.Random;
public class Day11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String response="";
        while(!response.equals("Q")){
            System.out.println("Welcome to virtual game🚀");
            System.out.print("Press Q to quit: ");
            response=sc.nextLine().toUpperCase();

        }
        System.out.println("Thank you!");

    }
}
