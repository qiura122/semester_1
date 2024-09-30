import java.util.Scanner;

public class pengurangan2bil {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input
        Scanner a = new Scanner(System.in);

        // Meminta pengguna memasukan 2 bilangan integer
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = a.nextInt();

        System.out.print("Masukkan bilangan Kedua: ");
        int bilangan2 = a.nextInt();

        // Melakukan operasi pengurangan
        int hasil = bilangan1 - bilangan2;

        // Menampilkan hasil pegurangan ke layar monitor
        System.out.println("Hasil dari " + bilangan1 + " - " + bilangan2 + " = " + hasil);

        //Menutup scanner
        a.close();
    }
}