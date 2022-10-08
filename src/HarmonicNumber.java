import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        // INITIALIZATION
        double result = 0, num = 0, j;
        int n;
        Scanner u = new Scanner(System.in);

        // INPUT DATA
        System.out.print("enter the harmonic you want to find: ");
        n = u.nextInt();

        // COMPUTATION
        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("the value of harmonic no. " + n + " is: " + result);

    }

}
