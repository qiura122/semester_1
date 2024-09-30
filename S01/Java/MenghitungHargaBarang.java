import java.util.Scanner;

public class MenghitungHargaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input kuatitas barang
        System.out.print("Masukan jumlah barang: ");
        int Qty = input.nextInt();

        // Input tipe pembeli
        System.out.print("Masukan tipe pembeli(Umum/Member/Owner): ");
        String tipePembeli = input.next();

        // Menentukan persentase diskon berdasarkan tipe pembeli
        double diskon = 0.0;
        if (tipePembeli.equalsIgnoreCase("Member")) {
            diskon = 10.0; // Diskon 10% untuk Member
        } else if (tipePembeli.equalsIgnoreCase("Owner")) {
            diskon = 20.0; // Diskon 20% untuk Owner
        }

        // Menghitung jumlah bayar
        double hargPerBarang = 100;
        double totalHarga = Qty * hargPerBarang;
        double jumlahDiskon = (diskon / 100) * totalHarga;
        double jumlahBayar = totalHarga - jumlahDiskon;

        // Menampilkan Hasil
        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Diskon (" + tipePembeli + "); Rp " + jumlahDiskon);
        System.out.println("Jumlah Bayar: " + jumlahBayar);

        input.close();
    }
}