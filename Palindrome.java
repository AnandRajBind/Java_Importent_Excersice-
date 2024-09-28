import java.util.Scanner;

public class Palindrome {

    // palindrome number is number that are same at the after reverse 121
    public static void main(String[] args) {
        int num, rev = 0, rem = 0, orginal, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value and check the palindrome or not ");
        num = sc.nextInt();
        orginal = num;

        // reverse the digit 
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
            // sum of digit
            sum = sum + rem;
        }
        // Check the your input value is palindrome or not
        if (orginal == rev) {
            System.out.println("This is the palindrome number: " + rev);
        } else {
            System.out.println("It is not Palindrome number: " + rev);
        }


        System.out.println("The sum of your digit is: " + sum);
        sc.close();
    }
}
