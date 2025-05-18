package TwoD_Array;

public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate90Clockwise(matrix);

        System.out.println("Rotated Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Rotate matrix 90 degrees clockwise
    static void rotate90Clockwise(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}


// Step 1: Transpose (Swap matrix[i][j] with matrix[j][i])

// 1 4 7
// 2 5 8
// 3 6 9

// Step 2: Reverse each row:

// 7 4 1
// 8 5 2
// 9 6 3

// ✅ Final Output:


// 7 4 1
// 8 5 2
// 9 6 3
