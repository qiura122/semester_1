import java.util.Scanner;

public class jumlah_deret {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret: ");
        int N = key.nextInt();
        double total = 0.0;
        int tanda = 1;

        for (int i = 1; i <= N; i++) {
            double bulat = 1.0 / (2 * i - 1) * tanda;
            total += bulat;
            tanda = -tanda;
            System.out.println("Deret ke-" + i + ": " + bulat);
        }
        System.out.println("Jumlah deret: " + total);
    }
}
