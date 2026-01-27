// WAP to find sum of digits of a given number

public class SumOfDigit {
    public static void main(String[] args) {
        int num = 123, sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println(sum);
    }
}
