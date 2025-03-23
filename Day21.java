class Car{
    String model;
    String color;
    double price;
    Car(String model, String color, double price){
        this.model=model;
        this.color=color;
        this.price=price;
    }
    void info(){
        System.out.println(this.color+" color "+this.model);
    }
    double price(){
        return this.price;
    }}
public class Day21 {
    public static void main(String[] args){
        //Array of objects
        Car[] cars={
                new Car("Lamborgini","Black",1847184),
                new Car("Ferrari","Red",8235285)
        };
        for(Car eachCar:cars){ //foreach loop
            eachCar.color="Yellow";
            eachCar.info();
            System.out.println(eachCar.price());
        }}}
