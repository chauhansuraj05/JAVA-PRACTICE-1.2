public class BuzzNumber {

    public static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }

    public static void main(String[] args) {
        int num = 7;
        if (isBuzz(num))
            System.out.println("Buzz Number");
        else
            System.out.println("Not Buzz Number");
    }
}
