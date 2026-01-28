// WAP to Check Whether a Number is a Twisted Prime or Not (Java)

import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num, rev = 0;

        // reverse number
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        int c1 = 0, c2 = 0;

        // prime check for original number
        for (int i = 1; i <= temp; i++) {
            if (temp % i == 0)
                c1++;
        }

        // prime check for reversed number
        for (int i = 1; i <= rev; i++) {
            if (rev % i == 0)
                c2++;
        }

        if (c1 == 2 && c2 == 2)
            System.out.println("Twisted Prime Number");
        else
            System.out.println("Not a Twisted Prime Number");
    }
}
