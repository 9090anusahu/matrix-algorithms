package TwoD_Array;

public class ReverseEachColumn {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            int top = 0, bottom = rows - 1;
            while (top < bottom) {
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
                top++;
                bottom--;
            }
        }

        // Print reversed matrix
        System.out.println("Matrix after reversing each column:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}


// 📘 Input:

// 1 2 3  
// 4 5 6

// ✅ Output:

// 4 5 6  
// 1 2 3
