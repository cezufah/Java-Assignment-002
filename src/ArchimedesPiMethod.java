import java.util.Scanner;
/**Humans think in degrees, mathematicians think in radians - mathematicians not human confirmed
 *
 */

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        System.out.println("Please type the number of sides.");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        double b = 360.0/n;
        double a = b/2;
        double s = 2*Math.sin(Math.toRadians(a));
        double p = n*s;
        double pi = p/2;
        System.out.printf("Our pi estimate is: %f", pi);
    }
}
