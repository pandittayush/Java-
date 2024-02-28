import java.util.Scanner;

public class evenOdd {
    public static void Printeven(int n){
            if(n%2==0){
                System.out.println("number is even");
            }else{
                System.out.println("number is odd.");
            }
        }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Printeven(n);
    }
    
}
