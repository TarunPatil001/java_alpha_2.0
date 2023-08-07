public class maxSubArrayI {

    public static void maxSubArraySum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < numbers.length; row++) {

            for (int col = row; col < numbers.length; col++) {

                currentSum = 0;
                for (int k = row; k <= col; k++) {
                    currentSum += numbers[k];
                }
                System.out.print(currentSum + "\t");
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }

        System.out.println("Max sum: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubArraySum(numbers);
    }
}
