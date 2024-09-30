import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pilihan;
        do {
            System.out.print("Input Gaji Pokok: ");
            int gaji = input.nextInt();
            System.out.print("Input Jumlah Hari Kerja: ");
            int jumhKerja = input.nextInt();
            System.out.print("Input Jumlah Anak: ");
            int anak = input.nextInt();
            System.out.print("input Uang Makan per Hari: ");
            int uang = input.nextInt();

            double totalUangMakan = uang * jumhKerja;
            double tunAnak;
            if (anak > 3) {
                tunAnak = 0.1 * gaji * 3;
            } else {
                tunAnak = 0.1 * gaji * anak;
            }
            double gajiPegawai = gaji + tunAnak + totalUangMakan;
            System.out.println("Total Uang Makan: " + totalUangMakan);
            System.out.println("Tunjangan Anak: " + tunAnak);
            System.out.println("Gaji Pegawai: " + gajiPegawai);

            System.out.println("Apakah ingin mengulangi program? [Y/T]");
            pilihan = input.next();
            System.out.println("");
        } while (pilihan.equalsIgnoreCase("y"));

        System.out.println("Anda keluar dari program");
        input.close();
    }
}
