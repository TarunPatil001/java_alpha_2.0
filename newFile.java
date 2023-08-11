import java.io.*;
import java.util.*;

public class newFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        String a = s.getClass().getSimpleName();

        if (s instanceof String) {
            System.out.println("Good job");
        }

    }
}