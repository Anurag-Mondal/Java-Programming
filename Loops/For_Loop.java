import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of first natural numbers to be printed: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}