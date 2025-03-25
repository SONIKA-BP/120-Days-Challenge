public class Day30 {
    public static void main(String[] args){
        int[] arr={23,45,12,11,22};
        int len=arr.length;
        System.out.println("---------Unsorted array--------");
        for(int a:arr){
            System.out.print(a+" ");
        }
        for(int i=0;i<len-1;i++){
            int min_index=i;
            for(int j=i+1;j<len;j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
                }

        System.out.println();
        System.out.println("-------sorted array-----------");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        }
    }

