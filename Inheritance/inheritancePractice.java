import java.util.*;

class Box{
    int a;
    Box(){
        System.out.println("Box is of rectagle shape: ");
    }
    public void show(){
        System.out.println("Destroy this box: ");
    }
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a=a;
    }
}
class subBox extends Box{
    public int y;
    subBox(){
        System.out.println("this is the subBox: ");
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}


public class inheritancePractice {
    public static void main(String[] args) {
        // Box b = new Box();
        // b.setA(4);
        // System.out.println(b.getA());
        // b.show();
        subBox sb = new subBox();
        sb.setY(6);
        System.out.println(sb.getY());
        
    }
    
}
