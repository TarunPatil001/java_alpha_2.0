public class printSubArrays {

    public static void subArrays(int numbers[]) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = row; col < numbers.length; col++) {
                for (int k = row; k <= col; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArrays(numbers);
    }
}
