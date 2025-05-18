package TwoD_Array;

public class ExitPointMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 1},
            {1, 0, 0},
            {0, 0, 0}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0, j = 0;
        int dir = 0; // 0=→, 1=↓, 2=←, 3=↑

        while (i >= 0 && i < rows && j >= 0 && j < cols) {
            dir = (dir + matrix[i][j]) % 4;

            if (dir == 0) {        // → Right
                j++;
            } else if (dir == 1) { // ↓ Down
                i++;
            } else if (dir == 2) { // ← Left
                j--;
            } else if (dir == 3) { // ↑ Up
                i--;
            }
        }

        // Out of bounds → fix the position
        if (dir == 0) j--;
        else if (dir == 1) i--;
        else if (dir == 2) j++;
        else if (dir == 3) i++;

        System.out.println("Exit Point: " + i + " " + j);
    }
}


// Exit Point: 1 2

