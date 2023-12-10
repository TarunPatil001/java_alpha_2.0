import java.util.ArrayList;

public class ArrayListCode {

    public static void main(String args[]) {

        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // Adding elements to list - O(1)
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Printing ArrayList
        System.out.println(list);

        // Adding element on specific index - O(n)
        list.add(1, 6);
        System.out.println(list);

        // Get element of the specific index - O(1)
        int element = list.get(3);
        System.out.println(element);

        // Remove element from ArrayList
        list.remove(1);
        System.out.println(list);

        // Set new value to any specific index
        list.set(1, 6);
        System.out.println(list);

        // Whether the given element is present in the List or not
        System.out.println(list.contains(4));
        System.out.println(list.contains(11));

        // Returns size of Element
        System.out.println(list.size());

        // Print elements of the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Print reverse elements of the ArrayList
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}
