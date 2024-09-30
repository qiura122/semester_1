import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix 1
        int[][] mat1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element " + (i + 1) + " x " + (j + 1) + ": ");
                mat1[i][j] = sc.nextInt();
            }
        }

        // Matrix 2
        int[][] mat2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element " + (i + 1) + " x " + (j + 1) + ": ");
                mat2[i][j] = sc.nextInt();
            }
        }

        // Add the two matrices
        int[][] result = addMatrices(mat1, mat2);

        // Print the result
        System.out.println("Result:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int m1 = mat1.length;
        int n1 = mat1[0].length;
        int m2 = mat2.length;
        int n2 = mat2[0].length;

        int[][] result = new int[m1 + m2][n1 + n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                int sum = 0;
                for (int k = 0; k < n2; k++) {
                    sum += mat1[i][j] * mat2[i][k];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
}