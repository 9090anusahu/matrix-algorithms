package TwoD_Array;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // Matrix A: 2x3
        int[][] A = {
            {1, 4, 2},
            {3, 5, 7}
        };

        // Matrix B: 3x2
        int[][] B = {
            {2, 3},
            {1, 5},
            {6, 4}
        };

        // Rows in A
        int m = A.length;

        // Columns in A = Rows in B
        int n = A[0].length;

        // Columns in B
        int p = B[0].length;

        // Resultant matrix C will be of size m x p
        int[][] C = new int[m][p];

        // Matrix multiplication logic
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Printing the result matrix C
        System.out.println("Resultant Matrix C:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// output:-  // 18 31
             // 53 62


