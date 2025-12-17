import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        int[][] arr = new int[5][6];
        Scanner sc = new Scanner(System.in);

        // Input elements
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 6; c++) {
                System.out.print("Enter the (" + r + "," + c + ") term: ");
                arr[r][c] = sc.nextInt();
            }
        }

        // Output elements
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 6; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}

