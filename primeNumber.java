import java.util.Scanner;

public class primeNumber { 
    static boolean isPrime(int n) { 
        if (n <= 1) 
            return false; 
  
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
  
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();
        
        if (isPrime(number)) 
            System.out.println(number + " is prime."); 
        else
            System.out.println(number + " is not prime."); 
        
        sc.close();
    } 
}
