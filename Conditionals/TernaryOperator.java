import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        n = sc.nextInt();

        System.out.println(
            (n % 2 == 0) ? "This is divisible by 2" : "This is not divisible by 2"
        );
    }
}
