/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class j {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        for (int i = 0; i < A.length() - 1 / 2; i++) {
            if (A.charAt(i) == A.charAt(i - 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
