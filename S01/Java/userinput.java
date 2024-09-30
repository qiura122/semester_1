import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Masukan pengguna memasukan data
        System.out.print("Nama      : ");
        String nama = input.nextLine();

        System.out.print("NIM       : ");
        String nim = input.nextLine();

        System.out.print("Nilai UTS : ");
        float nilaiuts = input.nextFloat();

        System.out.print("Nilai UAS : ");
        float nilaiuas = input.nextFloat();

        // Menghitung nilai akhir
        float nilaiakhir = (0.4f * nilaiuts) + (0.6f * nilaiuas);

        // Menampilkan semua variabel ke layar monitor
        System.out.println("=========================");
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Nilai UTS   : " + nilaiuts);
        System.out.println("Nilai UAS   : " + nilaiuas);
        System.out.println("Nilai Akhir : " + nilaiakhir);

        // Menutup scanner
        input.close();

    }
}