import java.util.*;

class Base{
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am setter X now");
        this.x=x;
    }
    public void Printme(){
        System.out.println("Hello bro");
    }
}
class Derived extends Base{
    public int y;
    public int  getY(){
        System.out.println("Acha ji: ");
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class inheritance{
    public static void main(String[] args){
        Base b = new Base();
        b.setX(1);
        System.out.println(b.getX());
        // b.getX();

        //Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}
