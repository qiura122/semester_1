import java.util.Scanner;

//Menghitung nilai mahasiswa
public class ContohAlgoritma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMahasiswa = 0;

        // Memanggil subprogram pemilihan
        pemilihanStatusKelulusan();

        // Memanggil subprogram array
        double[] nilaiMahasiswa = inputNilaiMahasiswa(input, jumlahMahasiswa);

        // Memanggil subprogram array 2 dimensi
        int jumlahData = 3; // Misalnya terdapat 3 data mahasiswa
        String[][] dataMahasiswa = inputDataMahasiswa(input, jumlahData);

        // Menampilkan nilai mahasiswa dan total nilai
        for (int i = 0; i < jumlahMahasiswa; i++) {
            double totalNilai = hitungTotalNilai(nilaiMahasiswa[i]);
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + totalNilai);
        }

        // Menampilkan data mahasiswa
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + dataMahasiswa[i][0]);
            System.out.println("Nilai: " + dataMahasiswa[i][1]);
        }
    }

    // Subprogram pemilihan
    public static void pemilihanStatusKelulusan() {
        // Tambahkan logika untuk menentukan status kelulusan di sini
        // Contoh:
        System.out.println("Subprogram pemilihan - Menentukan Status Kelulusan");
        // Logika pemilihan status kelulusan
    }

    // Subprogram array
    public static double[] inputNilaiMahasiswa(Scanner input, int jumlahMahasiswa) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();
        double[] nilaiMahasiswa = new double[jumlahMahasiswa];

        // Input nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nilai Mahasiswa: ");
            nilaiMahasiswa[i] = input.nextDouble();
        }
        return nilaiMahasiswa;
    }

    // Subprogram array 2 dimensi
    public static String[][] inputDataMahasiswa(Scanner input, int jumlahData) {
        String[][] dataMahasiswa = new String[jumlahData][2];

        // Input data mahasiswa
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            dataMahasiswa[i][0] = input.next();
            System.out.print("Nilai: ");
            dataMahasiswa[i][1] = input.next();
        }
        return dataMahasiswa;
    }

    // Menghitung total nilai mahasiswa
    public static double hitungTotalNilai(double nilai) {
        return nilai; // Perhitungan total nilai disesuaikan dengan kebutuhan
    }
}
