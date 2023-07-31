import java.util.*;

public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int i = (true) ? 1 : 0;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {

                System.out.print("*    ");
            }

            for (int col = 1; col <= (n - row) * 2; col++) {

                System.out.print("     ");
            }

            for (int col = 1; col <= row; col++) {

                System.out.print("*    ");
            }
            System.out.println("\n");
        }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {

                System.out.print("*    ");
            }

            for (int col = 1; col <= (row - 1) * 2; col++) {

                System.out.print("     ");
            }

            for (int col = 1; col <= n - row + 1; col++) {

                System.out.print("*    ");
            }
            System.out.println("\n");
        }

    }
}