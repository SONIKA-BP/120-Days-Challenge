public class Demo1 {
    public static void main(String[] args){
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=rows+1-i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for(int i=1;i<=rows;i++){
            for(int j=rows+1-i;j<=rows;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for(int i=1;i<=rows;i++){
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
