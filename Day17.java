import java.util.Random;
import java.util.Scanner;
public class Day17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String userGuess="";
        String computerGuess="";
        String playAgain="";
        String[] choices={"rock","paper","scissor"};
        System.out.println("-----------------------------------------");
        System.out.println("Welcome to Rock-Paper-Scissor Game🍻");
        System.out.println("-----------------------------------------");
        do{
            System.out.print("Enter the choice (rock-paper-scissor): ");
            userGuess=sc.nextLine().toLowerCase();
            if(!userGuess.equals("rock") && !userGuess.equals("paper")
                    && !userGuess.equals("scissor"))
            {
                System.out.println("Invalid Choice");
                continue;
            }
            computerGuess=choices[rand.nextInt(3)];
            System.out.println("Computer choice: "+computerGuess);
            if(userGuess.equals(computerGuess)){
                System.out.println("It's Tie!");
            }            else if((userGuess.equals("rock") && computerGuess.equals("paper"))
            || (userGuess.equals("scissor") && userGuess.equals("paper"))
            || (userGuess.equals("paper") && userGuess.equals("rock"))){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
            System.out.print("Wanna play again(yes/no): ");
            playAgain=sc.nextLine();

        }while(playAgain.equals("yes"));
        System.out.println("Thank You!");
        }
        }
