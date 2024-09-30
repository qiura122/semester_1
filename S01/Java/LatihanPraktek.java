import java.util.Scanner;

public class LatihanPraktek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean perulangan = true;
        while (perulangan) {
            System.out.println("========== SELAMAT DATANG ==========");
            System.out.println("|          KASIR VERSI 01          |");
            System.out.println("====================================");
            System.out.println(" ");
            System.out.print("Kode Produk         : ");
            String kodeProduk = input.nextLine();

            System.out.print("Tipe Produk         : ");
            String tipeProduk = input.nextLine();

            System.out.print("Harga Produk        : ");
            double hargaProduk = input.nextDouble();

            System.out.print("Jumalah Produk      : ");
            int jumlahProduk = input.nextInt();

            input.nextLine();
            double diskon = 0.0;
            if (tipeProduk.equalsIgnoreCase("A")) {
                diskon = 0.1;
            } else if (tipeProduk.equalsIgnoreCase("B")) {
                diskon = 0.2;
            } else if (tipeProduk.equalsIgnoreCase("C")) {
                diskon = 0.25;
            } else {
                System.out.println("Type Produk Salah, diskon 0%");
            }
            double tot = jumlahProduk * hargaProduk;
            double totdisc = tot * diskon;
            double tsdisc = tot - totdisc;

            System.out.println("Total Harga         : " + tot);
            System.out.println("Total Diskon        : " + totdisc);
            System.out.println("Total Setelah Diskon: " + tsdisc);

            System.out.print("Apakah Anda ingin input data lagi(Y/T): ");
            String lanjut = input.nextLine();
            if (lanjut.equals("T")) {
                break;
            }
        }
        System.out.println("Terimakasih");
        input.close();
    }
}