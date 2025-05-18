package TwoD_Array;

public class DiagonalTraversal {

    public static void diagonalTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Traverse from first row
        for (int colStart = 0; colStart < cols; colStart++) {
            int r = 0;
            int c = colStart;

            while (r < rows && c >= 0) {
                System.out.print(matrix[r][c] + " ");
                r++;
                c--;
            }
            System.out.println();
        }

        // Traverse from last column (except first row)
        for (int rowStart = 1; rowStart < rows; rowStart++) {
            int r = rowStart;
            int c = cols - 1;

            while (r < rows && c >= 0) {
                System.out.print(matrix[r][c] + " ");
                r++;
                c--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        diagonalTraversal(matrix);
    }
}

// output
// 1 
// 2 4 
// 3 5 7 
// 6 8 
// 9 
