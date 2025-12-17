import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of first natural numbers to be printed: ");
        n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}

