
// WAP to find whether a number is a Neon Number or not.
import java.util.Scanner;

public class NeonNUmber {

    public static int squareDigit(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum = sum + square % 10;
            square = square / 10;
        }
        return sum;
    }

    public static boolean isNeon(int num) {
        return squareDigit(num) == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isNeon(num))
            System.out.println("Neon NUmber");
        else
            System.out.println("not neon no");
    }
}
