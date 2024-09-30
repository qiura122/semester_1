import java.util.Scanner;

public class PembacaanKataSandi {
    public static void main(String[] args) {
        // Tentukan kata sandi
        final String KATA_SANDI = "password";

        // Inisialisasi scanner
        Scanner input = new Scanner(System.in);
        int kesempatan = 3;

        while (kesempatan > 0) {
            System.out.print("Masukkan kata sandi: ");
            String masukan = input.nextLine();

            if (masukan.equals(KATA_SANDI)) {
                System.out.println("Selamat! Kata sandi benar.");
                break;
            } else {
                kesempatan--;
                if (kesempatan > 0) {
                    System.out.println("Kata sandi salah. Kesempatan tersisa: " + kesempatan);
                } else {
                    System.out.println("Anda telah melebihi batas percobaan. Aplikasi ditutup.");
                }
            }
        }

        // Tutup scanner
        input.close();
    }
}