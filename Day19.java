class Addition{
    int Sum(int a, int b){
        int sum=a+b;
        return sum;
    }
}
public class Day19 {
    public static void main(String[] args){
        Addition a1=new Addition();
        System.out.println(a1.Sum(5,3));
        System.out.println(a1.Sum(7,7));
        Addition a2=new Addition();
        System.out.println(a2.Sum(8,5));
    }
}
