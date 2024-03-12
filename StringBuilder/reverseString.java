import java.util.*;
// package StringBuilder;
public class reverseString {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("panda");
        sc.append(" ");
        sc.append("hello");  //append
        sc.append(" ");
        sc.append("world!");
        sc.insert(5, "ji"); //insert
        // for(int i=0;i<sc.length()/2;i++){
        //     int front = i;
        //     int back = sc.length()-1-i; //5-1-0 => 4
        //     char frontChar = sc.charAt(front);
        //     char backChar = sc.charAt(back);
        //     sc.setCharAt(front,backChar);
        //     sc.setCharAt(back,frontChar);
        // }
        // sc.reverse();   //reverse a string
        System.out.println(sc);
        
    }
}
