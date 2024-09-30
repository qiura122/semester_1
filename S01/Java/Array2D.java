public class Array2D {
    public static void main(String[] args) {

        int[][] matriks = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriks[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}