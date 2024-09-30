import java.util.Scanner;

public class array2Dimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa: ");
        int jmlMhs = input.nextInt();
        System.out.print("Masukan Jumlah Matkul: ");
        int jmlMK = input.nextInt();
        float[][] nilai = new float[jmlMhs][jmlMK + 1]; // avg
        String[] nama = new String[jmlMhs];

        for (int i = 0; i < nilai.length; i++) {
            float avg = 0; // avg
            System.out.print("Masukan nama ke " + (i + 1) + ": ");
            nama[i] = input.next();
            for (int j = 0; j < nilai[i].length - 1; j++) {
                System.out.print("Masukan nilai " + nama[i] + " untuk mk" + (j + 1) + ": ");
                nilai[i][j] = input.nextFloat();
                avg += nilai[i][j]; // avg
            }
            avg = avg / jmlMK; // avg
            nilai[i][jmlMK] = avg; // avg

        }
        System.out.print(String.format("|%-10s", "Nama"));
        for (int i = 0; i < jmlMK; i++) {
            System.out.printf("|%-10s", "MK" + (i + 1));
        }
        System.out.print(String.format("|%-10s", "Average"));
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("|%-10s", nama[i]);
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf("|%-10s", nilai[i][j]);
            }
            System.out.println();
        }
        input.close();
    }
}