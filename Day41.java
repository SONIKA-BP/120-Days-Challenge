public class Day41 {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums={3,2,2,3,1,2,3,4,5,6};
        System.out.println(removeElement(nums,2));
    }
}
