public class Day39 {
    public static boolean isPalindrome(int x) {
        int original=x;
        int r,b=0;
        while(x>0){
            r=x%10;
            b=b*10;
            b=b+r;
            x=x/10;
        }
        return original==b;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}
