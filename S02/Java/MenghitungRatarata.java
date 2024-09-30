import java.util.Scanner;

public class MenghitungRatarata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        
        double totalNilai = 0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Rata-rata nilai ujian adalah: " + rataRata);
        
        input.close();
    }
}