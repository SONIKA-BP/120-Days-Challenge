public class Day55 {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }

    }
}
