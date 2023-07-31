import java.util.*;

public class array {

    public static int LinearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static String LinearMenu(String menu[], String key) {

        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return String.valueOf(i);
            }
        }
        return String.valueOf(-1);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 20;

        int index = LinearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key NOT found");
        } else {
            System.out.println("Key found at index: " + index);
        }

        String menu[] = { "Dosa", "Kachori", "Samosa", "Fafda" };
        String key = "Samosa";

        String index = LinearMenu(menu, key);
        if (index.equals(String.valueOf(-1))) {
            System.out.println("Menu NOT found.");
        } else {
            System.out.println("Menu found at index: " + index);
        }

    }
}
