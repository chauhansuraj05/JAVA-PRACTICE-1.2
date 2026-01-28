import java.util.Scanner;

public class NeonNO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int square = num * num;
        int sum = 0;

        // sum of digits of square
        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }

        if (sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }
}
