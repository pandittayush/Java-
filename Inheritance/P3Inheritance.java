import java.util.*;

class Shape{
    int x;
    int l,b;
    public double getArea(){
        return 0.0;
    }
}
class Rectangle extends Shape{
    private double l;
    private double b;

    public Rectangle(double l,double b){
        this.l=l;
        this.b=b;

    }
    public double getArea(){
        return l*b;
    }
}
public class P3Inheritance {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(3,5);
        r.getArea();
        System.out.println(r.getArea());
        r.getArea();
        // System.out.println(r.getArea());
    }
    
}
