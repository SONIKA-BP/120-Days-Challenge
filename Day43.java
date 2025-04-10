public class Day43 {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int lastWordLength=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                lastWordLength++;
            }
            else{
                break;
            }
        }
        return lastWordLength;
    }
    public static void main(String[] args){
        String s="Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
