// WAP to print odd numbers from 1 to 50

public class PrintOdd {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
