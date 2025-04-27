abstract class Plane{
    abstract void takeOff();
    abstract void fly();
}
class Cargo extends Plane{
    void takeOff(){
        System.out.println("Cargo took off to low altitude");
    }
    void fly(){
        System.out.println("Cargo is flying with goods");
    }
}
class Passenger extends Plane{
    void takeOff(){
        System.out.println("Passenger took off to medium " +
                "altitude");
    }
    void fly(){
        System.out.println("Passenger is flying with " +
                "people");
    }
}
class Fighter extends Plane{
    void takeOff(){
        System.out.println("Fighter took off to high " +
                "altitude");
    }
    void fly(){
        System.out.println("Fighter is flying with" +
                " weapons"); }
}
class Airport {
    void allowPlane(Plane ref) {
        ref.takeOff();
        ref.fly();
    }
}
public class Day63 {
    public static void main(String[] args){
        Cargo c=new Cargo();
        Passenger p=new Passenger();
        Fighter f=new Fighter();
        Airport a=new Airport();
        a.allowPlane(c);
        a.allowPlane(p);
        a.allowPlane(f);
    }
}
