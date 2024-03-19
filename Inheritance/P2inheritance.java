
import java.util.*;

// import javax.swing.text.View;

class Vehicle{
    public void drive(){
        System.out.println("Reparing a vehicle: ");
    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Reparing car");
    }
}
public class P2inheritance {
    public static void main(String[] args) {
        
        Vehicle v = new Vehicle();
        Car c = new Car();
        v.drive();
        c.drive();
    }
}
