//  WAP to check whether a given number is a Perfect Square

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 25;
        boolean flag = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");
    }
}

// Start

// Declare integer variables num and i

// Assign num = 25

// Loop i from 1 to num

// If i * i == num, then number is Perfect Square

// If loop ends without match, number is not Perfect Square

// Stop