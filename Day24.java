//Method Overloading
class MathOperation{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    double sum(double a,double b){
        return a+b;
    }
    double sum(double a, double b, double c){
        return a+b+c;
    }
}
public class Day24 {
    public static void main(String[] args){
        MathOperation m=new MathOperation();
        System.out.println(m.sum(2,3));
        System.out.println(m.sum(2,3,4));
        System.out.println(m.sum(2.3,5));
        System.out.println(m.sum(3.4,4,5.6));


    }
}
