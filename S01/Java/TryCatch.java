import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan NIM       : ");
        String nim = input.next();

        System.out.print("Masukan Nama      : ");
        String namaMhs = input.next();

        System.out.print("Masukan Umur      : ");
        int umur = input.nextInt();

        System.out.print("Masukan Nilai UTS : ");
        int nilaiUts = input.nextInt();

        System.out.print("Masukan Nilai UAS : ");
        int nilaiUas = input.nextInt();

        System.out.println("\n Data yang akan disimpan:");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + namaMhs);
        System.out.println("Umur        : " + umur);
        System.out.println("Nilai UTS   : " + nilaiUts);
        System.out.println("Nilai UAS   : " + nilaiUas);

        System.out.println("Apakah anda ingin menyimpan data? [y/t]: ");
        char konfirmasi = input.next().charAt(0);

        if (konfirmasi == 'y' || konfirmasi == 'Y') {
            writeDataToFiles("data_mahasiswa.txt", nim, namaMhs, umur, nilaiUts, nilaiUas);
            System.out.println("Data telah disimpan dalam file.");
        } else {
            System.out.println("Data gagal tersimpan.");
        }

    }

    public static void writeDataToFiles(String namaFile, String nim, String namaMhs, int umur, int nilaiUts,
            int nilaiUas) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile, true))) {
            writer.println(nim + "\t" + namaMhs + "\t" + umur + "\t" + nilaiUts + "\t" + nilaiUas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
