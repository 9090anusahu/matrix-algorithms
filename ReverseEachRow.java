package TwoD_Array;

public class ReverseEachRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        // Print reversed matrix
        System.out.println("Matrix after reversing each row:");
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

// 3 2 1  
// 6 5 4
