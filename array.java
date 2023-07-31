import java.util.*;

public class array {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest No.: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 7, 9, 6, 3, 5 };
        System.out.println("Largest No.: " + getLargest(numbers));

    }
}
