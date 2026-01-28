import java.util.Scanner;

public class SunnyNumber2 {

    // Method to check Sunny Number
    static void checkSunny(int num) {
        int next = num + 1;
        boolean flag = false;

        for (int i = 1; i * i <= next; i++) {
            if (i * i == next) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("Sunny Number");
        else
            System.out.println("Not a Sunny Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        checkSunny(num); // method call
    }
}
