import java.util.*;

class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String num = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(num);
    }
}