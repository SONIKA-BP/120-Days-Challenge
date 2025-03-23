public class Day28 {

    static int binarySearch(int[] arr, int key){
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<=high){
            mid=low+high;
            if(key==arr[mid]){
                return mid;
            }
            else if(key<arr[mid]){
                  high=mid-1;
//                low=low;
            }
            else{
                low=mid+1;
//              high=high;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,79,80};
        int key=3;
        int res=binarySearch(arr,key);
        if(res!=-1){
            System.out.println("Element found at index "+res);
        }
        else{
            System.out.println("Element NOT found!");
        }
    }
}
