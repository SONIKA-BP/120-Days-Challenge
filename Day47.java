public class Day47{
    public static int SingleValue(int[] arr){
        int res=0;
        for(int num:arr){
            res=res^num;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={1,2,2,3,3,4,4,1,5};
        System.out.println(SingleValue(arr));
    }
}
