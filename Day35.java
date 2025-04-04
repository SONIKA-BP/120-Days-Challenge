import java.util.Arrays;

public class Day35 {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] arr=new int[2];
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
public static void main(String[] args){
        int[] nums={2,3,4,5,6};
        Day35 data=new Day35();
        int res[]=data.twoSum(nums,9);
    System.out.println(Arrays.toString(res));

}
}