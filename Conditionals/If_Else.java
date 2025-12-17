import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        n = sc.nextInt();

        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println("This is divisible by 6");
        } else {
            System.out.println("This is not divisible by 6");
        }
    }
}