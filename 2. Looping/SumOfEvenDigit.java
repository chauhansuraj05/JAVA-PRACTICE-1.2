//WAP to find the sum of even digits of a number

public class SumOfEvenDigit {
    public static void main(String[] args) {
        int num = 1234, sum = 0, digit;

        while (num > 0) {
            digit = num % 10;
            if (digit % 2 == 0)
                sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
