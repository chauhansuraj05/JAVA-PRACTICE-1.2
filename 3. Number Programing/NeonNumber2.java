import java.util.Scanner;

public class NeonNumber2 {

    // Method to check Neon Number
    static void checkNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }

        if (sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        checkNeon(num); // method call
    }
}
