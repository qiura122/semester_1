import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("");
        int jumlahData = input.nextInt();

        int total = 0;
        int indeks = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Input Data ke-" + (i + 1) + "+");
            int data = input.nextInt();
            total += data;

            if (data < min) {
                min = data;
                indeks = i;
            }
        }
        System.out.println("Jumlah Data: " + total);
        System.out.println("Data Terkecil: " + min);
        System.out.println("Indeks Data: " + indeks);

        input.close();
    }
}