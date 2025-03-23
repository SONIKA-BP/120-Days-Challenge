public class Day27 {

     public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,23,4,8,9,10};
        int target=18;
        int res=linearSearch(arr,target);
        if(res!=-1) {
            System.out.println("Element found at index: " + res);
        }
        else{
            System.out.println("Element NOT found!");
        }

    }
}
