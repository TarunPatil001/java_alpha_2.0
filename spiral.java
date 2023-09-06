public class spiral {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            // right
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(matrix[j][endCol] + " ");
            }

            // bottom
            for (int k = endCol - 1; k >= startCol; k--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][k] + " ");
            }

            // left
            for (int l = endRow - 1; l >= startRow + 1; l--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[l][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        System.out.println();
    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // }

        // else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];

            // sd
            if (i != (matrix.length - 1 - i)) {
                sum += matrix[i][matrix.length - i - 1];
            }

        }

        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(diagonalSum(matrix));

    }
}
