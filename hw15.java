public class hw15 {

    public static void countSeven(int array[][], int key) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }

    public static void sumofSecondRow(int array[][], int row) {
        int sum = 0;

        for (int j = 0; j < array[0].length; j++) {
            sum += array[row - 1][j];
        }

        System.out.print(sum);
    }

    public static void transpose(int array2[][]) {

        for (int j = 0; j < array2[0].length; j++) {
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int array[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };

        // int key = 11;
        // countSeven(array, key);
        // int row = 2;
        // sumofSecondRow(array, row);

        int array2[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 } };

        transpose(array2);
    }
}
