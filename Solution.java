class Solution {
    public static int singleNumber(int nums[]) {
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }

        return 0;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 1, 2, 1, 2 };
        // singleNumber(nums);
    }
}