public class Day9 {
    public static void main(String[] args) {
        int arr[][] = {
                {10, 20, 30},
                {40, 50},
                {7, 8, 9,70}
        };
        System.out.println(arr[1][1]); //access the elements using index
        System.out.println("----------using nested for loop--------------");
        //access the 2D array elements using nested for loop
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------using Enhanced for loop-----------");
        //access the 2D array elements using Enhanced for loop
        for(int[] elements:arr){
            for(int item:elements){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}
