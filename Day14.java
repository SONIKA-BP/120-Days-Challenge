import java.util.Scanner;
public class Day14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double num1;
        double num2;
        String operator="";
        System.out.print("Enter the num1: ");
        num1=sc.nextInt();
        System.out.print("Enter the num2: ");
        num2=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the operator (+ - * / %): ");
        operator=sc.nextLine();
        //Enhanced Switch
        switch(operator){
            case "+" -> System.out.println("Addition: "+(num1+num2));
            case "-" -> System.out.println("Subtraction: "+(num1-num2));
            case "*" -> System.out.println("Multiplication: "+(num1*num2));
            case "/" -> System.out.println("Division: "+(num1/num2));
            case "%" -> System.out.println("Modulous: "+(num1%num2));
            default-> System.out.println("Please enter valid data");
        }
    }
}
