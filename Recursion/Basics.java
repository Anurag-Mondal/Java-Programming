import java.util.Scanner;

public class Basics {

    static void greet(int n) {
        if (n == 0)
            return;

        System.out.println(n);   // before recursive call
        greet(n - 1);            // recursion
        System.out.println(n);   // after recursive call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();

        greet(n);
    }
}

