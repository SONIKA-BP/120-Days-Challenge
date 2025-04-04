import java.util.Arrays;

public class Day34 {
    public static int maximumProduct(int[] nums){
        int len=nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[len-1],nums[len-1]*nums[len-2]*nums[len-3]);
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,8};
        System.out.println(maximumProduct(nums));
    }
}
