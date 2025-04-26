class OS{
        OS(){
            System.out.println("OS has been installed");
        }
        void checkOS(){
            System.out.println("OS is working.....");
        }
    }
class Charger{
    Charger(){
        System.out.println("Charger is ready for charging");
    }
    void checkCharger(){
        System.out.println("Charger is working");
    }
}
class Mobile{
    OS s=new OS();
    Mobile(){
        System.out.println("Mobile ready for use");
    }
    void checkMobile(){
        System.out.println("Mobile is working");
    }
    void hasA(Charger c)
    {

        System.out.println("Charger is connect to mobile");
    }
}
public class Day62{
    public static void main(String[] args){
        Mobile m=new Mobile();
        Charger c=new Charger();
        m.hasA(c);
        m.checkMobile();
        m.s.checkOS();
        c.checkCharger();
        m=null;
        System.out.println("After main object Destroy");
        c.checkCharger();
        System.out.println("If main object(Mobile) destroyed, composed object(OS) also destroyed");
//        m.checkMobile();
//        m.s.checkOS();
    }
}
