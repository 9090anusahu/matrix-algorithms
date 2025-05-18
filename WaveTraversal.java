package TwoD_Array;

public class WaveTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Wave Traversal of the matrix:");
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                // Top to Bottom
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                // Bottom to Top
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }
}


// output: 1 4 7 8 5 2 3 6 9

