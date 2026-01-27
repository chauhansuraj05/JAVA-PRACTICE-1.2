// WAP to print Fibonacci series

public class Fibonacci {
    public static void main(String[] args) {
        int num = 5;
        int a = 0, b = 1, c;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
