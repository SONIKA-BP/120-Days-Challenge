public class Day52 {
    public static int findNumbers(int[] nums) {
        int cnt=0;

        for(int i=0;i<nums.length;i++){
            int numsOfDigits=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                numsOfDigits++;
            }
            if(numsOfDigits%2==0){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] nums={12,234,347,3488};
        System.out.println(findNumbers(nums));
    }
}