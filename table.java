import java.util.Scanner;

public class table {
    public static void PrintTable(int n){
        int table=0;
        System.out.println("table of given number: ");
        for(int i = 1; i<11;i++){
            table = n*i;
            System.out.println(table);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        PrintTable(n);
    }
}
