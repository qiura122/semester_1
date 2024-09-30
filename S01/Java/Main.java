import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        // Deklarasi array untuk menyimpan data
        int[] data = new int[jumlahData];

        // Input data
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        // Menghitung jumlah seluruh data
        int total = 0;
        for (int i = 0; i < jumlahData; i++) {
            total += data[i];
        }

        // Menentukan nilai terbesar dan indeksnya
        int nilaiTerbesar = data[0];
        int indeksTerbesar = 0;
        for (int i = 1; i < jumlahData; i++) {
            if (data[i] > nilaiTerbesar) {
                nilaiTerbesar = data[i];
                indeksTerbesar = i;
            }
        }

        // Menampilkan hasil
        System.out.println("Jumlah seluruh data: " + total);
        System.out.println("Nilai terbesar adalah " + nilaiTerbesar + " pada indeks " + indeksTerbesar);
    }
}
