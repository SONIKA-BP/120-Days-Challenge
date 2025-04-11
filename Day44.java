public class Day44 {
    public static int countSymmetricIntegers(int low, int high) {

        int count=0;
        for(int i=low;i<=high;i++){
            String num=Integer.toString(i);
            if(num.length()%2!=0){
                continue;
            }
            int mid=num.length()/2;
            int leftSum=0;
            int rightSum=0;

            for(int j=0;j<mid;j++){
                leftSum+=num.charAt(j);
                rightSum+=num.charAt(j+mid);
            }
            if(leftSum==rightSum){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(countSymmetricIntegers(1,100));
    }
}