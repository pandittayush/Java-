import java.util.*;

class EkCLASS{
    int a;
    public  int getA(){
        return a;
    }
    // public void setY(int a){
    //     this.a=a;
    // }
    EkCLASS(int a){
        this.a=a;
        System.out.println("oo chore bkl");
    }
    public int returnOne(){
        return 1;
    }
}

public class inhertanceThis {
        public static void main(String[] args) {
        EkCLASS e = new EkCLASS(5);
        System.out.println(e.getA());
    }    
}
