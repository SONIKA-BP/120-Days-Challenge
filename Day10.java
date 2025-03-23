import java.util.ArrayList;
public class Day10 {
    public static void main(String[] args){
        ArrayList<Integer> intList=new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        for(int item:intList){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println("The size of the ArrayList: "+intList.size());
        intList.set(1,200); //update the element based on index
        for(int item:intList){
            System.out.print(item+" "); //after update
        }
        System.out.println();
        System.out.println("Is 40 present?: "+intList.contains(40));
        System.out.println("Removed element: "+intList.remove(1));
        for(int item:intList){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println("The size of the ArrayList: "+intList.size());
        intList.clear();
        System.out.println("The size of the ArrayList: "+intList.size());
    }
}
