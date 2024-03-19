import java.util.*;

class myBase{
    // costructor ka naam class k naam se easy h be bahut
    myBase(){
        System.out.println("M connstructor hun beta");
    }
    myBase(int x){
        System.out.println("I  am a overloaded contructor with value x as: "+x);
    }//agar yeah overladed wala print karna h nah toh super keyword ka use karna pdega  
}
class myDerived extends myBase{
    myDerived(){
        super(0); // use liya overload constructor ko print karne k liye
        System.out.println("M derived class wala hun: ");
    }
    myDerived(int x, int y){
        super(x);//x ko dhudhte hue uppr jayega base class m usse print karega..
        System.out.println("I am a constructor of derived class with value of y as: "+y);
    }
}
class ChildOfDerived extends myDerived{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor: ");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I  am a overloaded contructor with value z as: "+z);
    }

}

public class inheritanceConst3 {
    public static void main(String[] args) {
        // myBase b = new myBase();    //(ek baar base ka constructor)
        // myDerived d = new myDerived(); // --------// pehle base fir derived dono ka constructor call hoga
        
        
        //3 baar constructor print hoga iska matlb...
        
        
        // myDerived d = new myDerived(14,12);

        ChildOfDerived cd = new ChildOfDerived(12,14,15);
    }
} 
