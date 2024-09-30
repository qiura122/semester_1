import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {
        String[] nimArray;
        String[] namaMhsArray;
        int[] umurArray;
        int[] nilaiUtsArray;
        int[] nilaiUasArray;

        try {
            int JumlahBaris = hitungJumlahBaris("data_mahasiswa.txt");

            nimArray = new String[JumlahBaris];
            namaMhsArray = new String[JumlahBaris];
            umurArray = new int[JumlahBaris];
            nilaiUtsArray = new int[JumlahBaris];
            nilaiUasArray = new int[JumlahBaris];

            bacaFiles("data_mahasiswa.txt", nimArray, namaMhsArray, umurArray, nilaiUtsArray, nilaiUasArray);

            System.out.println("Data mahasiswa dari file: ");

            for (int i = 0; i < JumlahBaris; i++) {
                System.out.println("NIM     : " + nimArray[i] +
                        ", Nama      : " + namaMhsArray[i] +
                        ", umur      : " + umurArray[i] +
                        ", Nilai UTS : " + nilaiUtsArray[i] +
                        ", Nilai UAS : " + nilaiUasArray[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int hitungJumlahBaris(String namaFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            int JumlahBaris = 0;

            while (reader.readLine() != null) {
                JumlahBaris++;
            }

            return JumlahBaris;
        }
    }

    private static void bacaFiles(String namaFile, String[] nimArray, String[] namaMhsArray, int[] umurArray,
            int[] nilaiUtsArray, int[] nilaiUasArray) throws NumberFormatException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            int index = 0;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");

                nimArray[index] = data[0];
                namaMhsArray[index] = data[1];
                umurArray[index] = Integer.parseInt(data[2]);
                nilaiUtsArray[index] = Integer.parseInt(data[3]);
                nilaiUasArray[index] = Integer.parseInt(data[4]);

                index++;
            }
        }
    }
}
