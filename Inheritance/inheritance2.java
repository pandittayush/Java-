import java.util.*;

class Animal{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("Animals are very sweet");
        this.x=x;
    }
}
class cat extends Animal{
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("Cat is also known as pussy");
        this.y=y;
    }
    public void bark(){
        System.out.println("Dog is  barkinng");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        cat c = new cat();
        c.setY(4);
        c.bark();
        System.out.println(c.getY());
    }
}
