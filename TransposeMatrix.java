package TwoD_Array;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        // Transpose logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print transpose
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// Input:


// 1 2 3
// 4 5 6

// Transpose:

// Row 0 becomes Col 0 → 1 4

// Row 1 becomes Col 1 → 2 5

// Row 2 becomes Col 2 → 3 6

// ✅ Output:

// 1 4  
// 2 5  
// 3 6
