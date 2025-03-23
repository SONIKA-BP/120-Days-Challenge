abstract class Animal2{
    abstract void makeSound();

    void sleep(){
        System.out.println("Sleeping.....");
    }
}
class Dog1 extends Animal2{
    @Override
    void makeSound(){
        System.out.println("Bark! Bark!");
    }
}
class Cat1 extends Animal2{
    @Override
    void makeSound(){
        System.out.println("Meow! Meow!");
    }
}
public class Day25 {
    public static void main(String[] args){
     Dog1 d1=new Dog1();
     d1.sleep();d1.makeSound();
        System.out.println("---------------------------");
        Cat1 c1=new Cat1();
        c1.sleep();
        c1.makeSound();
    }
}
