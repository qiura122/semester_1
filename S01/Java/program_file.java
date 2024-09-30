import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class program_file {

    private static void createDataToFile(String fileName, String nim, String namaMhs, int umur, int nilaiUts,
            int nilaiUas) {
        try (PrintWriter write = new PrintWriter(new FileWriter(fileName, true))) {
            write.println(nim + "\t" + namaMhs + "\t" + umur + "\t" + nilaiUts + "\t" + nilaiUas);
        } catch (IOException e) {
            System.err.println("Error adding data : " + e.getMessage());
        }
    }

    private static int hitungJumlahBaris(String fileName) throws IOException {
        int jumlahBaris = 0;

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            while (read.readLine() != null) {
                jumlahBaris++;
            }
            return jumlahBaris;
        }
    }

    private static void bacaFile(String fileName, String[] nimArray, String[] namaMhsArray, int[] umurArray,
            int[] nilaiUtsArray, int[] nilaiUasArray) throws IOException {
        String baris;
        int index = 0;

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            while ((baris = read.readLine()) != null) {
                String[] dataMahsiswa = baris.split("\t");

                nimArray[index] = dataMahsiswa[0];
                namaMhsArray[index] = dataMahsiswa[1];
                umurArray[index] = Integer.parseInt(dataMahsiswa[2]);
                nilaiUtsArray[index] = Integer.parseInt(dataMahsiswa[3]);
                nilaiUasArray[index] = Integer.parseInt(dataMahsiswa[4]);

                index++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("================ FILE MAHASISWA ==================");
            System.out.println("1. Menulis File\n2. Membaca File\n3. Exit");
            System.out.print("Pilih Menu : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("");
                    System.out.print("Masukan NIM : ");
                    String nim = input.next();

                    System.out.print("Masukan Nama : ");
                    String namaMhs = input.next();

                    System.out.print("Masukan umur : ");
                    int umur = input.nextInt();

                    System.out.print("Masukan nilai UTS : ");
                    int nilaiUts = input.nextInt();

                    System.out.print("Masukan nilai UAS : ");
                    int nilaiUas = input.nextInt();

                    System.out.println("\nData yang akan disimpan :");
                    System.out.println("NIM : " + nim);
                    System.out.println("Nama : " + namaMhs);
                    System.out.println("Umur : " + umur);
                    System.out.println("Nilai Uts : " + nilaiUts);
                    System.out.println("Nilai Uas : " + nilaiUas);

                    System.out.print("apakah anda ingin menyimpan data? (y/t) : ");
                    String konfirmasi = input.next();

                    if (konfirmasi.equalsIgnoreCase("y")) {
                        createDataToFile("data_mahasiswa2.txt", nim, namaMhs, umur, nilaiUts, nilaiUas);
                        System.out.println("Data Berhasil Disimpan");
                    } else {
                        System.out.println("Data Gagal Disimpan");
                    }
                    break;

                case 2:
                    String[] nimArray;
                    String[] namaMhsArray;
                    int[] umurArray;
                    int[] nilaiUtsArray;
                    int[] nilaiUasArray;

                    try {
                        int jumlahBaris = hitungJumlahBaris("data_mahasiswa2.txt");

                        nimArray = new String[jumlahBaris];
                        namaMhsArray = new String[jumlahBaris];
                        umurArray = new int[jumlahBaris];
                        nilaiUtsArray = new int[jumlahBaris];
                        nilaiUasArray = new int[jumlahBaris];

                        bacaFile("data_mahasiswa2.txt", nimArray, namaMhsArray, umurArray, nilaiUtsArray,
                                nilaiUasArray);

                        for (int i = 0; i < jumlahBaris; i++) {
                            System.out.println(
                                    "NIM : " + nimArray[i] + "\t" +
                                            "Nama : " + namaMhsArray[i] + "\t" +
                                            "Umur : " + umurArray[i] + "\t" +
                                            "Nilai UTS : " + nilaiUtsArray[i] + "\t" +
                                            "Nilai UAS : " + nilaiUasArray[i]);
                        }
                    } catch (IOException e) {
                        System.err.println("Data not found : " + e.getMessage());
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Terima Kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilih menu 1 - 3!!");
                    System.out.println("");
                    break;
            }
        } while (true);

    }
}