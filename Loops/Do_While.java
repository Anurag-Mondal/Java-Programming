import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of first natural numbers to be printed: ");
        n = sc.nextInt();

        int i = 1;
        do {
            System.out.print(i + " ");   // runs at least once
            i++;
        } while (i <= 0);
    }
}