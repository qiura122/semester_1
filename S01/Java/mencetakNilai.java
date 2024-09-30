import java.util.Scanner;

public class mencetakNilai {
    public static void main(String[] args) {
        // Membuat Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Memulai awalan
        System.out.println("Menginput Nilai Mahasiswa");

        // Meminta pengguna memasukkan jumlah mahasiswa dan kolom
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan Jumlah Kolom : ");
        int jumlahKolom = scanner.nextInt();

        // Membuat array untuk menyimpan data
        String[] nama = new String[jumlahMahasiswa];
        int[][] nilai = new int[jumlahMahasiswa][jumlahKolom];

        // Meminta pengguna memasukkan nama dan nilai untuk setiap mahasiswa dan kolom
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = scanner.next();

            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Masukkan nilai untuk " + nama[i] + " Kolom " + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan data dalam bentuk tabel
        System.out.println("No\t|Nama\t|" + generateHeader(jumlahKolom));
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print((i + 1) + "\t|" + nama[i] + "\t|");
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }

        // Menutup Scanner
        scanner.close();
    }

    private static String generateHeader(int jumlahKolom) {
        StringBuilder header = new StringBuilder();
        for (int i = 0; i < jumlahKolom; i++) {
            header.append("Nilai").append(i + 1).append("\t|");
        }
        return header.toString();
    }

}