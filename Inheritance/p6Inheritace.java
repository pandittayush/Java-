import java.util.*;

class Bicycle{
    int gear;
    int speed;

    Bicycle(int gear , int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBreak(int decrement){
        speed-=decrement;
    }
    public void applyGear(int increment){
        speed+=increment;
    }
}
class MountainBike extends Bicycle{
    public int setHeigth;
    public MountainBike(int gear,int speed,int startHeight){
        super(gear, speed);
        setHeight=startHeight;
    }
    
    public void setHeigth(){

    }
}

public class p6Inheritace {
    public static void main(String[] args) {
        
    }
}
