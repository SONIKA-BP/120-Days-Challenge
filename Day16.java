import java.util.Scanner;
public class Day16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        printName("Sonika","Java");
        printName("Emil","Python");

    }
    static void printName(String... names){
        for(String name:names){
            System.out.print(name+" ");
        }
        System.out.println();
    }
}
