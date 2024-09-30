import java.util.Scanner;

public class AlgoArray4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int harga_jual[] = new int[100];
        double harga_jualdis[] = new double[100];
        int N = 1;
        int i = 1;
        while (i <= N) {
            harga_jual[i] = key.nextInt();
            i++;
        }
        i = 1;
        while (i <= N) {
            harga_jualdis[i] = harga_jual[i] - (15 % harga_jual[i]);
            i++;
        }
        i = 1;
        while (i <= N) {
            System.out.print(harga_jualdis[i]);
            i++;
        }

    }

}
