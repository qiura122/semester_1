import java.util.Scanner;

public class Menu1 {

    public static String GenapOrGanjil(int bil) {
        int sisa = bil % 2;
        String Ket = "";
        if (sisa == 1) {
            Ket = "Nilai " + bil + " termasuk bilangan ganjil";
        } else {
            Ket = "Nilai " + bil + " termasuk bilangan genap";
        }
        return (Ket);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 1;
        while (pilihan >= 1 && pilihan <= 3) {
            System.out.println("========== M E N U  ============");
            System.out.println("| 1. Cek Bilangan Genap Ganjil |");
            System.out.println("| 2. Penjulahan 2 Bilangan     |");
            System.out.println("| 3. Perkalian 2 Bilangan      |");
            System.out.println("| 4. Exit                      |");
            System.out.println("================================");

            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda Memilih Menu Cek Bilangan Genap Ganjil");
                    Scanner key = new Scanner(System.in);
                    System.out.print("Masukkan nilai : ");
                    int angka = key.nextInt();
                    String output_str = GenapOrGanjil(angka);
                    System.out.println(output_str);
                    break;
                case 2:
                    System.out.println("Anda Memilih Menu Penjumlahan 2 Bilangan");
                    break;
                case 3:
                    System.out.println("Anda Memilih Menu Perkalian 2 Bilangan");
                    break;
                default:
                    System.out.println("Exit");
            }
        }

        // Menutup scanner
        input.close();
    }
}