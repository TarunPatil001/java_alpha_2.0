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

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;

                if (cs == 0) {
                    cs = Math.max(cs, numbers[i]);
                }
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sum: " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -1, -2, -3, -4 };
        kadanes(numbers);
    }
}
