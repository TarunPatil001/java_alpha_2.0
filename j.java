/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class j {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[][] = new int[t][2];

        if (t >= 1 && t <= 1000) {

            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[0].length; col++) {
                    arr[row][col] = sc.nextInt();
                }
            }

            for (int i = 0; i < t; i++) {
                int x = arr[i][0] * 15;
                int y = arr[i][1] * 2;

                if ((x >= 1 && x <= 1000) && (y >= 1 && y <= 1000)) {
                    if (y <= x) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");

                    }
                }
            }

        }

    }
}
