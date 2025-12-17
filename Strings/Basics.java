import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        String s2 = "My name is Anurag";   // String declaration in Java
        System.out.println(s2);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s3 = sc.nextLine();         // takes full line input

        System.out.println(s3);
    }
}

