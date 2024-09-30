//I Komang Emo Wijaya Kusuma
//2315354082
//1B

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PraktekUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("======Pilih Menu======");
            System.out.println("1. Menulis file\n2. Membaca file\n3. Exit");
            System.out.println("======================");

            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukan Kode Produk: ");
                    String kodeProduk = input.next();
                    System.out.println("Masukan Nama Produk: ");
                    String namaProduk = input.next();
                    System.out.println("Masukan Jumlah Barang: ");
                    int jumlahBarang = input.nextInt();
                    System.out.println("Harga Satuan: ");
                    int hargaSatuan = input.nextInt();

                    System.out.println("\nData yang akan disimpan: ");
                    System.out.println("Kode Produk: " + kodeProduk);
                    System.out.println("Nama Produk: " + namaProduk);
                    System.out.println("Jumlah Barang: " + jumlahBarang);
                    System.out.println("Harga Satuan: " + hargaSatuan);

                    System.out.println("Apakah anda ingin menyimpan data tersebut [y/t]? ");
                    String konfirm = input.next();

                    if (konfirm.equalsIgnoreCase("y")) {
                        createDataToFile("Data_Produk.txt", kodeProduk, namaProduk, jumlahBarang, hargaSatuan);
                        System.out.println("Data Berhasil Disimpan :) ");
                    } else {
                        System.out.println("Data gagal disimpan T_T ");
                    }
                    break;
                case 2:
                    String[] arrayKodeProduk;
                    String[] arrayNamaProduk;
                    int[] arrayJumlahBarang;
                    int[] arrayHargaSatuan;

                    try {
                        int jumlahBaris = hitungJumlahBaris("Data_Produk.txt");

                        arrayKodeProduk = new String[jumlahBaris];
                        arrayNamaProduk = new String[jumlahBaris];
                        arrayJumlahBarang = new int[jumlahBaris];
                        arrayHargaSatuan = new int[jumlahBaris];

                        bacaFile("Data_Produk.txt", arrayKodeProduk, arrayNamaProduk, arrayJumlahBarang,
                                arrayHargaSatuan);

                        int totalsemua = 0;
                        int totaljumlah = 0;

                        for (int i = 0; i < jumlahBaris; i++) {
                            System.out.println(
                                    "Kode Produk: " + arrayKodeProduk[i] + "\t" +
                                            "Nama Produk: " + arrayNamaProduk[i] + "\t" +
                                            "Jumlah Barang: " + arrayJumlahBarang[i] + "\t" +
                                            "Harga Satuan: " + arrayHargaSatuan[i]);
                        }

                        for (int i = 0; i < arrayJumlahBarang.length; i++) {
                            int jumlah = arrayJumlahBarang[i];
                            int harga = arrayHargaSatuan[i];
                            int total = jumlah * harga;
                            totalsemua += total;
                            totaljumlah += jumlah;
                        }

                        System.out.println("Total Jumlah Barang: " + totaljumlah);
                        System.out.println("Total Jumlah Barang * Harga Satuan: " + totalsemua);

                    } catch (IOException e) {
                        System.err.println("Data not found : " + e.getMessage() + "\n");
                    }
                    break;
                case 3:
                    System.out.println("TerimaKasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihlah Menu yang Tertera!");
                    System.out.println("");
                    break;
            }
        } while (true);
    }

    private static void createDataToFile(String fileName, String kodeProduk, String namaProduk, int jumlahBarang,
            int hargaSatuan) {
        try (PrintWriter write = new PrintWriter(new FileWriter(fileName, true))) {
            write.println(kodeProduk + "\t" + namaProduk + "\t" + jumlahBarang + "\t" + hargaSatuan);
        } catch (IOException e) {
            System.err.println("Error adding data : " + e.getMessage());
        }
    }

    private static void bacaFile(String fileName, String[] arrayKodeProduk, String[] arrayNamaProduk,
            int[] arrayJumlahBarang, int[] arrayHargaSatuan) throws IOException {
        String baris;
        int index = 0;

        try (BufferedReader baca = new BufferedReader(new FileReader(fileName))) {
            while ((baris = baca.readLine()) != null) {
                String[] dataProduk = baris.split("\t");

                arrayKodeProduk[index] = dataProduk[0];
                arrayNamaProduk[index] = dataProduk[1];
                arrayJumlahBarang[index] = Integer.parseInt(dataProduk[2]);
                arrayHargaSatuan[index] = Integer.parseInt(dataProduk[3]);

                index++;
            }
        }
    }

    private static int hitungJumlahBaris(String fileName) throws IOException {
        int jumlahBaris = 0;

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            while (read.readLine() != null) {
                jumlahBaris++;
            }
            read.close();
            return jumlahBaris;
        }
    }
}