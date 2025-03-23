import java.util.Arrays;
import java.util.Scanner;
public class Day8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//       int[] arr={10,20,30,40,50};
//       for(int i=0;i<arr.length;i++){
//           System.out.print(arr[i]+" ");
//       }
//        System.out.println();
//        System.out.println("---------------------------");
//       for(int ele:arr){
//           System.out.print(ele+" "); //Enhanced for loop
//       }

//        System.out.println(Arrays.toString(arr));

        String[] str=new String[4];
        System.out.println("Enter the string");
        for(int i=0;i<str.length;i++){

            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
