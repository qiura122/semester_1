import java.util.Scanner;

public class Ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean perulangan = true;
        while (perulangan) {
            String pilihan;

            System.out.println("Masukan type kendaraan (Mobil/Sepeda Motor): ");
            String type = input.nextLine();

            double hargaSewa = 0;
            switch (type) {
                case "Mobil":
                    System.out.println("Pilih kendaraan (Avanza, Zenia, Innova): ");
                    pilihan = input.nextLine();
                    if (pilihan.equalsIgnoreCase("avanza")) {
                        hargaSewa = 600000;
                        System.out.println("Biaya sewa adalah Rp. 600.000");
                    } else if (pilihan.equalsIgnoreCase("zenia")) {
                        hargaSewa = 500000;
                        System.out.println("Biaya sewa adalah Rp. 500.000");
                    } else if (pilihan.equalsIgnoreCase("innova")) {
                        hargaSewa = 800000;
                        System.out.println("Biaya sewa adalah Rp. 800.000");
                    } else {
                        System.out.println("Pilihan tidak terdaftar");
                    }
                    break;

                case "Sepeda Motor":
                    System.out.println("Pilih kendaraan (Vario, Supra X125, Fazio, Scoopy): ");
                    pilihan = input.nextLine();
                    if (pilihan.equalsIgnoreCase("vario")) {
                        hargaSewa = 300000;
                        System.out.println("Biaya sewa adalah Rp. 300.000");
                    } else if (pilihan.equalsIgnoreCase("supra x125")) {
                        hargaSewa = 150000;
                        System.out.println("Biaya sewa adalah Rp. 150.000");
                    } else if (pilihan.equalsIgnoreCase("fazio")) {
                        hargaSewa = 200000;
                        System.out.println("Biaya sewa adalah Rp. 200.000");
                    } else if (pilihan.equalsIgnoreCase("scoopy")) {
                        hargaSewa = 100000;
                        System.out.println("Biaya sewa adalah Rp. 100.000");
                    } else {
                        System.out.println("Pilihan tidak terdaftar");
                    }
                    break;

                default:
                    System.out.println("");
                    break;
            }
            System.out.println("Masukan jumlah kendaraan yang akan di sewa: ");
            int jml = input.nextInt();

            input.nextLine();
            double diskon;
            if (jml >= 4) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }
            System.out.println("Masukan jumlah jam sewa: ");
            double jumlahJam = input.nextDouble();

            double hargaSewaPerJam = hargaSewa;
            double totalSewa = hargaSewaPerJam * jumlahJam * jml;
            double totalDiskon = totalSewa * diskon;
            double totalBayar = totalSewa - totalDiskon;

            System.out.println("Harga Sewa per Jam: " + hargaSewaPerJam);
            System.out.println("Total Sewa: " + totalSewa);
            System.out.println("Diskon: " + totalDiskon);
            System.out.println("Total Bayar: " + totalBayar);

            System.out.println("Apakah Anda ingin mengulangi program? [Y/N]");
            String lanjut = input.nextLine();
            if (lanjut.equals("N")) {
                break;
            }
            System.out.println("Anda keluar dari program");
            input.close();
        }

    }
}