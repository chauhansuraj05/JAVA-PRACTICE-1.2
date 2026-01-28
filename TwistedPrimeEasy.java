import java.util.Scanner;

public class TwistedPrimeEasy {

    // method to reverse number
    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    // method to check prime
    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        return count == 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = reverse(num);

        if (isPrime(num) && isPrime(rev))
            System.out.println("Twisted Prime Number");
        else
            System.out.println("Not a Twisted Prime Number");
    }
}
