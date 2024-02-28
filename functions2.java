import java.util.Scanner;

public class functions2 {
    public static int multipleOfTwo(int a , int b){
        int mul = a*b;
        return mul;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second numbers");
        int b = sc.nextInt();

        int mul = multipleOfTwo(a,b);
        System.out.println("mul of two numbers: "+mul);
        sc.close();
    }
}
