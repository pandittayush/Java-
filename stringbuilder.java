import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int a = Integer.parseInt(str1,10);
        int b = Integer.parseInt(str2,10);
        System.out.println(a^b);
        sc.close();

    }
}
