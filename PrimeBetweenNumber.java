import java.util.Scanner;

// prime number are a natural number that are divisible by only 1 and itself.
public class PrimeBetweenNumber {

    public void numPrime(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (Prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public boolean Prime(int num) {
        int prime = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                prime++;
            }
        }
        if (prime == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int start = sc.nextInt();
        System.out.println("Enter second number");
        int end = sc.nextInt();
        PrimeBetweenNumber obj = new PrimeBetweenNumber();
        obj.numPrime(start, end);
    }
}
