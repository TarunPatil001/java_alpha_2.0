public class stairMatrix {

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("Found key at: (" + row + ", " + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            }

            else {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 10, 20 },
                { 15, 25 },
                { 27, 29 },
                { 32, 33 },
                { 35, 45 },
                { 37, 48 },
                { 39, 50 } };

        int key = 39;
        staircaseSearch(matrix, key);
    }
}
