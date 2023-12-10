import java.util.*;

public class ArrayListProgram02 {

    public static void program01() {

        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Orange");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Blue");
        list2.add("Green");

        // ArrayList<String> c3 = new ArrayList<>();
        System.out.println("Before Swap: ");
        for (String e : list) {
            System.out.println(e);
        }

        Collections.swap(list, 0, 3);
        System.out.println("After Swap: ");
        for (String f : list) {
            System.out.println(f);
        }
        // System.out.println(c3);

        // System.out.println(list);

        // Collections.shuffle(list);
        // Collections.reverse(list2);

        // List<String> list3 = list.subList(0, 1);
        // System.out.println(list3);

        // Collections.copy(list2, list);

        // list.add(0, "pink");

        System.out.println(list2);
        // System.out.println(list2);

        // list.set(1, "Orange");
        // System.out.println(list);

        // list.remove(2);
        // System.out.println(list);

        // System.out.println(list.contains("Green"));
        // Collections.sort(list);
        // System.out.println(list);

    }

    public static void main(String args[]) {
        program01();
    }
}
