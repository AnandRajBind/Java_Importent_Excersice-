import java.util.Scanner;

public class SumNaturalNumberRecurtion {

    // sum of natural numbers using recurtion
    static int sumRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursion(n - 1);
    }

    public static void main(String args[]) {

   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        //  sumRecursion(n);
        System.out.printf("Sum of %d natural numbers is %d: ",n, sumRecursion(n));
    }
}
