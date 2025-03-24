import java.util.Scanner;
public class Day29 {
    public static int[] BubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }}}
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        arr=BubbleSort(arr);
        System.out.println("Sorted Array:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }}
