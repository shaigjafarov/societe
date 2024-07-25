package algoritm.hafiz;

public class Spiralmatrix {


    public static void spiralmatrix(int m, int n, int[][] matrix) {

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.println(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.println(matrix[i][right]);
            }
            right--;

            for (int i = right; i >= left; i--) {
                System.out.println(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                System.out.println(matrix[i][left]);
            }
            left++;

        }


    }

}
