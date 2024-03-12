import java.util.*;

public class first {
    public static void main(String[] args) {
        
        StringBuilder sb =  new StringBuilder("tony");
        System.out.println(sb);
        //for insertion at any position---
        sb.insert(2, 'n');
        System.out.println(sb);
        
        //delete the extra 'n'--
        
        sb.delete(2,4);
        System.out.println(sb);
        
        //append something in given String----

        //replace a particular char----
        // System.out.println(sb.charAt(0));
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);
        // sb.close();
    }
}