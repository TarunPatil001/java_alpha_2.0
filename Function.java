import java.util.*;

class function {

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void PrimeinRange(int n) {

        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal no of " + myNum + " is " + decNum);
    }

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n / 2;

        }

        System.out.println("Binary no of " + myNum + " is " + binNum);
    }

    public static void Avg(int n1, int n2, int n3) {

        int avg = (n1 + n2 + n3) / 3;
        System.out.println(avg);
    }

    public static boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X number: ");
        int x = sc.nextInt();
        System.out.print("Enter Y number: ");
        int y = sc.nextInt();

    
    }
}