import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gabungan {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] dataMahasiswa = new int[0];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Sorting Data Mahasiswa");
            System.out.println("3. Searching Data Mahasiswa");
            System.out.println("4. Simpan Data Mahasiswa ke File");
            System.out.println("5. Baca Data Mahasiswa dari File");
            System.out.println("6. Reset Data Mahasiswa");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");

            int choice = key.nextInt();
            key.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    dataMahasiswa = inputDataMahasiswa(key, dataMahasiswa);
                    break;
                case 2:
                    bubbleSort(dataMahasiswa);
                    System.out.println("Data Mahasiswa setelah sorting:");
                    displayDataMahasiswa(dataMahasiswa);
                    break;
                case 3:
                    searchDataMahasiswa(dataMahasiswa, key);
                    break;
                case 4:
                    simpanDataKeFile("data_mahasiswa.txt", dataMahasiswa);
                    System.out.println("Data Mahasiswa telah disimpan dalam file.");
                    break;
                case 5:
                    bacaDataDariFile("data_mahasiswa.txt");
                    break;
                case 6:
                    dataMahasiswa = resetDataMahasiswa();
                    System.out.println("Data Mahasiswa berhasil di-reset.");
                    break;
                case 7:
                    System.out.println("Terima kasih, program selesai.");
                    key.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    private static int[] resetDataMahasiswa() {
        return new int[0];
    }

    private static int[] inputDataMahasiswa(Scanner scanner, int[] data) {
        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlahData = scanner.nextInt();
        int[] newData = new int[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            newData[i] = scanner.nextInt();
        }

        System.out.println("Data Mahasiswa berhasil diinput.");
        return newData;
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void displayDataMahasiswa(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void searchDataMahasiswa(int[] data, Scanner scanner) {
        if (data.length == 0) {
            System.out.println("Data Mahasiswa belum diinput. Silakan input data terlebih dahulu.");
            return;
        }

        System.out.print("Masukkan nilai Mahasiswa yang ingin dicari: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                found = true;
                System.out.println("Nilai " + target + " ditemukan pada indeks " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Nilai " + target + " tidak ditemukan.");
        }
    }

    private static void simpanDataKeFile(String namaFile, int[] data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            for (int i = 0; i < data.length; i++) {
                writer.println(data[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bacaDataDariFile(String namaFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            System.out.println("Data Mahasiswa dari File: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
