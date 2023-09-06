import java.util.*;

public class string01 {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        // int arr[] = { 'a', 'b', 'c', 'd', 'e' };
        // String str = "String A";
        // String str1 = new String("String B");

        // System.out.println(arr);
        // System.out.println(str);
        // System.out.println(str1);

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // String fullname = "Tony Stark";
        // System.out.println(fullname.length());

        // String firstName = "Tony";
        String lastName = "racecar";
        // System.out.println(lastName.indexOf('k'));

        // printLetters(lastName);
        if (palindrome(lastName) == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}

// public class string01 {
// public static boolean printLetters(String str) {
// for (int i = 0; i < str.length() / 2; i++) {
// if (str.charAt(i) == str.charAt(((str.length()) - i) - 1)) {
// return true;
// }
// }
// return false;
// }

// public static void main(String args[]) {
// String str = "Tarun";
// if (printLetters(str) == true) {
// System.out.println("String is palindrome");
// } else {
// System.out.println("String is Npalindrome");
// }
// }
// }
