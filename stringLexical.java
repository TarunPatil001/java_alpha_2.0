public class stringLexical {
    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        // char a = 1;
        // int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;

        System.out.println(largest);
    }
}
