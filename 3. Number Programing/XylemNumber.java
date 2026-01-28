// WAP to check whether number is xylem or not

import java.util.Scanner;

public class XylemNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;

        // Extract last digit
        int last = num % 10;

        // used to remove the last digit of a number
        num = num / 10;

        int meanSum = 0;

        // Extract middle digits and sum them
        while (num > 9) {
            meanSum += num % 10;
            num = num / 10;
        }

        // Remaining digit is the first digit
        int first = num;

        // Check xylem condition
        if (first + last == meanSum) {
            System.out.println(temp + " is a Xylem Number");
        } else {
            System.out.println(temp + " is NOT a Xylem Number");
        }
    }
}
