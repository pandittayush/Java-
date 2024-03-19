import java.util.*;
public class Printdigits {
    public static void main(String[] args) {
    //user se input for random number 

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int randomNumber = sc.nextInt();

    //convert kiya ranodom int to string
    
    String numAsString = Integer.toString(randomNumber);

    //extract kr lete h ab first ur last ko
    char firstDigit = numAsString.charAt(0);
    char lastDigit = numAsString.charAt(numAsString.length()-1);

    int firstmulOftwo =Character.getNumericValue(firstDigit)*2;
    int lastmulOftwo = Character.getNumericValue(lastDigit)*2;

    //print kar de number ko
    System.out.println("Random number: "+randomNumber);
    System.out.println("First digit: "+firstDigit);
    System.out.println("Last digit: "+lastDigit);
    System.out.println("First Digit*2: "+firstmulOftwo);
    System.out.println("Last Digit*2: "+lastmulOftwo);
    sc.close();
 }   
}
