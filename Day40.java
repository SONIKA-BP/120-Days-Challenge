public class Day40 {
    public static int removeDuplicates(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[cnt]=nums[i];
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] nums={1,1,2,2,3,4,4,5};
        System.out.println(removeDuplicates(nums));

    }
}