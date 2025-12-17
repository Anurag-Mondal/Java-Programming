import java.util.Scanner;   // For taking inputs
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); // **Scanner sc is made**

        double r, area;
        System.out.print ("Enter radius of the circle: ");
        r = sc.nextDouble();
        area = 3.1415 * r * r;
        System.out.println ("The area of the circle is: " + area);  // ** See the syntax **
    }
}