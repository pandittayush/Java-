import java.util.Scanner;

public class function1 {
    public static int CalculateSum(int a , int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();

    int sum = CalculateSum(a, b);
    System.out.println("Sum of two number is: "+sum);
    sc.close();
}

}
