class Animal{
    boolean isAlive=true;
    void eat(){
        System.out.println("Eating.........");
    }
    void sleep(){
        System.out.println("The animal is sleeping.........");
    }}
class Cat extends Animal{
    void sound(){
        System.out.println("Meowwww..........");
    }
}
class BabyCat  extends Cat{
    void babyCatSound(){
        System.out.println("I don't know😁");
    }
}
public class Day22 {
    public static void main(String[] args){
        BabyCat b=new BabyCat();
        b.eat();
        b.sleep();
        b.sound();
        System.out.println(b.isAlive);
        b.babyCatSound();
    }}
