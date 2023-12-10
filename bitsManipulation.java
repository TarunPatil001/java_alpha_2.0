public class bitsManipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;

        return n | bitMask;
    }

    public static void main(String args[]) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        // System.out.println(~0);
        // System.out.println(5 << 2);
        // System.out.println(5 * (int) (Math.pow(2, 2)));
        // System.out.println(6 >> 1);
        // System.out.println(6 / (int) (Math.pow(2, 1)));

        // oddOrEven(8);

        // System.out.println(getIthBit(10, 3));
        // System.out.println(setIthBit(10, 2));
    }
}
