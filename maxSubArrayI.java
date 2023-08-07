public class maxSubArrayI {

    public static void maxSubArraySum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate prefix array:
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int row = 0; row < numbers.length; row++) {
            int start = row;

            for (int col = row; col < numbers.length; col++) {
                int end = col;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Max sum: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubArraySum(numbers);
    }
}
